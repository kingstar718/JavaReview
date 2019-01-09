package top.wujinxing.Stack;

/**
 * @author: wujinxing
 * @date: 2019/1/9 11:31
 * @description:
 */
public class Test {
    @org.junit.Test
    public void test(){
        StackInterface<String> stack = new LinkedStack<String>();
        stack.push("Jim");
        stack.push("Jill");
        System.out.println(stack.peeK());
    }
}
