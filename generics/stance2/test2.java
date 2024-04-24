package generics.stance2;

import java.util.ArrayList;
import java.util.Iterator;

public class test2 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("xin chao toi la cuong ne !");
        list.add("cho toi bao la ban dang lam gi ?");

        String s = list.get(0);
        String e = list.get(1);
        System.out.println("element :" + s + e);
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
