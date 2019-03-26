package top.wujinxing.ThreadFrame.threadpool;

/**
 * @author: wujinxing
 * @date: 2019/3/26 22:57
 * @description: 一个永不退出的线程与线程池配合
 */
public class PThread extends Thread{

    //线程池
    private ThreadPool pool;

    //任务
    private Runnable target;
    private boolean isShutDown = false;
    private boolean isIdle = false;

    //构造函数
    public PThread(Runnable target, String name, ThreadPool pool){
        super(name);
        this.pool = pool;
        this.target = target;
    }
    public Runnable getTarget(){
        return target;
    }

    public boolean isIdle() {
        return isIdle;
    }

    @Override
    public void run() {
        //只要没有关闭,则一直不结束该线程
        while (!isShutDown){
            isIdle = false;
            if (target!=null){
                //运行任务
                target.run();
            }
            //任务结束了,到闲置状态
            isIdle = true;
            try {
                //该任务结束后,不结束线程,而是放入线程池空闲队列
                pool.repool(this);
                synchronized (this){
                    //线程空闲,等待新的任务到来
                    wait();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            isIdle = false;
        }
    }

    public synchronized void setTarget(java.lang.Runnable newTarget){
        target = newTarget;
        //设置了任务之后,通知run方法,开始执行这个任务
        notifyAll();
    }
    //关闭线程
    public synchronized void shutDown(){
        isShutDown = true;
        notifyAll();
    }
}
