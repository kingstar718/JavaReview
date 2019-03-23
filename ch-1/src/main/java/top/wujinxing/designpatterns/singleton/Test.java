package top.wujinxing.designpatterns.singleton;

/**
 * @author: wujinxing
 * @date: 2019/3/23 22:22
 * @description:
 */
public class Test {
    public static void main(String[] args){
        Singleton.createString();
        //Singleton is create
        //createString in Singleton
        //此时没有使用单例类,但还是被创建出来,需要引入延迟加载机制
    }
}
