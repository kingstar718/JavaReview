package top.wujinxing.Thread;

/**
 * @author: wujinxing
 * @date: 2019/2/20 17:48
 * @description:
 */
public class ThreadTest9 {
    public static void main(String[] args){
        for (int i = 0; i < 5; i++){
            MyThread3 mt0 = new MyThread3();
            mt0.setPriority(5);
            mt0.start();
            MyThread4 mt1 = new MyThread4();
            mt1.setPriority(4);
            mt1.start();
        }
    }
}
class MyThread3 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++){}
        long endTime = System.currentTimeMillis();
        System.out.println("◆◆◆◆◆ thread3 use time = " + (endTime - beginTime));
    }
}

class MyThread4 extends Thread{
    @Override
    public void run() {
        long beginTime = System.currentTimeMillis();
        for (int j = 0; j < 100000; j++){}
        long endTime = System.currentTimeMillis();
        System.out.println("◇◇◇◇◇ thread4 use time = " +(endTime - beginTime));
    }
}