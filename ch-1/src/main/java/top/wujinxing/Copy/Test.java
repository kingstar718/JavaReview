package top.wujinxing.Copy;

/**
 * @author: wujinxing
 * @date: 2019/1/14 14:32
 * @description:
 */

class Student{
    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
public class Test {
    public static void main(String[] args){
        Student stu1 = new Student();
        stu1.setNumber(12345);
        Student stu2 = stu1;    //将stu1的引用赋值给stu2，这样，stu1，stu2指向堆内存的同一个对象s
        stu1.setNumber(54321);
        System.out.println("Student1：" + stu1.getNumber());
        System.out.println("Student1：" + stu2.getNumber());

        //如何干干净净的复制一个对象
        //1.将A对象的值通过set方法加入到B中

        //2.通过重写java.lang.object中的clone()方法；
        //3.通过org.apache.commons中的工具类BeanUtils和PropertyUtils进行对象复制
        //4.通过序列化实现兑现的复制
    }
}
