package top.wujinxing.Queue;

/**
 * @author: wujinxing
 * @date: 2019/1/10 22:08
 * @description:
 */
public class Test {

    @org.junit.Test
    public void test1(){
        QueueInterface<String> queue = new ArrayQueue<String>();
        queue.enqueue("Jim");
        queue.enqueue("Kim");
        queue.enqueue("Lim");
        queue.enqueue("Mim");
        queue.enqueue("Nim");
        for (int i = 0; i<5; i++){
            System.out.print(queue.dequeue());
        }
        System.out.println();
        System.out.print(queue.isEmpty());
    }

    @org.junit.Test
    public void test2(){
        QueueInterface<String> queue = new LinkedQueue<String>();
        queue.enqueue("Jim");
        queue.enqueue("Kim");
        queue.enqueue("Lim");
        queue.enqueue("Mim");
        queue.enqueue("Nim");
        for (int i = 0; i<5; i++){
            System.out.print(queue.dequeue());
        }
        System.out.println();
        System.out.print(queue.isEmpty());
    }
}
