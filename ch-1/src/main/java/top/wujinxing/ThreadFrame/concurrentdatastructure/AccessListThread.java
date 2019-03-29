package top.wujinxing.ThreadFrame.concurrentdatastructure;

import java.util.Random;

/**
 * @author: wujinxing
 * @date: 2019/3/27 10:41
 * @description: 以一个多线程对List的访问为例, 比较Vector与CopyOnWriteArrayList的性能差异
 */
public class AccessListThread implements Runnable {

    protected String name;
    java.util.Random ran = new java.util.Random();
    public AccessListThread(){}
    public AccessListThread(String name){
        this.name = name;
    }

    @Override
    public void run() {

    }
    public Object getList(int index){
        return null;
    }
}
