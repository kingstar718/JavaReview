package top.wujinxing.designpatterns.singleton;

/**
 * @author: wujinxing
 * @date: 2019/3/23 22:18
 * @description: 单例模式
 */
public class Singleton {
    private Singleton(){
        System.out.println("Singleton is create");  //创济南单例的过程可能会比较慢
    }
    private static Singleton singleton = new Singleton();
    public static Singleton getInstance(){
        return singleton;
    }
    public static void createString(){
        System.out.println("createString in Singleton");//这是模拟单例类扮演其他角色
    }
}
