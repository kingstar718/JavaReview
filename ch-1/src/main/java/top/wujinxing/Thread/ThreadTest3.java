package top.wujinxing.Thread;

import sun.awt.windows.ThemeReader;

/**
 * @author: wujinxing
 * @date: 2019/2/20 15:16
 * @description:
 */
public class ThreadTest3 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 55; i++){
            System.out.println(Thread.currentThread().getName()+"正在运行...");
        }
    }

    public static void main(String[] args){
        ThreadTest3 threadTest1 = new ThreadTest3();
        ThreadTest3 threadTest2 = new ThreadTest3();
        ThreadTest3 threadTest3 = new ThreadTest3();
        //CPU执行哪个线程的代码具有不确定性
        threadTest1.start();
        threadTest2.start();
        threadTest3.start();
        for (int i = 0; i < 55; i++){
            System.out.println(Thread.currentThread().getName()+"在运行...");
        }
    }
}

