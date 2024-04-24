package collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class test1 {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        ArrayList<String> list = new ArrayList<String>();
        stack.push("one");
        stack.push("one");
        stack.push("one");
        stack.push("one");
        list.add("two");
        stack.pop();
        Iterator<String> itr = stack.iterator();
        Iterator<String> itrs = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        while (itrs.hasNext()){
            System.out.println(itrs.next());
        }
    }
}
