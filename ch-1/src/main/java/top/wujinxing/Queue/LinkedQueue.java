package top.wujinxing.Queue;

import org.junit.Test;

/**
 * @author: wujinxing
 * @date: 2019/1/10 16:30
 * @description: 链表实现队列
 */
public class LinkedQueue<T> implements QueueInterface<T> {

    private Node firstNode;
    private Node lastNode;

    public LinkedQueue(){
        firstNode = null;
        lastNode = null;
    }


    private class Node{
        private T data;
        private Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }

        public Node getNextNode() {
            return next;
        }

        public void setNextNode(Node next) {
            this.next = next;
        }
    }

    @Override
    public void enqueue(T newEntry) {
        Node newNode = new Node(newEntry,null);
        if (isEmpty()){
            firstNode = newNode;    //链表为空，直接将firstNode等于新的元素建立的节点
        }else {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
    }

    @Override
    public T dequeue() {
        T front = null;
        if (!isEmpty()){
            front = firstNode.getData();
            firstNode = firstNode.getNextNode();    //引用链表中的第二个节点来移除第一个节点
            if (firstNode == null){
                lastNode = null;
            }
        }
        return front;
    }

    @Override
    public T getFront() {
        T front = null;
        if (!isEmpty()){
            front = firstNode.getData();
        }
        return front;
    }

    @Override
    public boolean isEmpty() {
        return (firstNode == null)&&(lastNode == null);
    }

    @Override
    public void clear() {
        firstNode = null;
        lastNode = null;
    }


    @Test
    public void test(){
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
