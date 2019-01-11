package top.wujinxing.List;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wujinxing
 * @date: 2019/1/11 11:34
 * @description:
 */
public class Test {

    @org.junit.Test
    public void ArrayListTest(){
        ListInterface<Integer> list = new Array_List<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(23);
        list.add(22);
        list.add(5,33);
        list.remove(2);
        list.remove(3);
        list.clear();
        System.out.println(list.getLength());
        for (int i = 0; i < list.getLength(); i++){
            System.out.print(list.getEntry(i)+" ");
        }
        System.out.println(list.contains(3));
        System.out.println(list.isEmpty());
        System.out.println();

        List<Integer> list1 =  new ArrayList<>();
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(23);
        list1.add(22);
        list1.add(1,44);
        for (int i: list1
             ) {
            System.out.print(i + " ");
        }
    }

    @org.junit.Test
    public void VectorListTest(){
        ListInterface<Integer> list = new Array_List<Integer>();
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(23);
        list.add(22);
        /*

        list.remove(3);
        list.clear();
        System.out.println(list.getLength());
        */
        //list.add(2,33);
        list.replace(2,55);
        //list.remove(0);
        for (int i = 0; i < list.getLength(); i++){
            System.out.print(list.getEntry(i)+" ");
        }
        System.out.println();
        /*
        System.out.println(list.contains(3));
        System.out.println(list.isEmpty());
        */
        System.out.println(list.toArray());

    }
}
