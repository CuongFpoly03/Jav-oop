package generics.stance2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class test3 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "hehehe");
        map.put(2, "hahaha");
        map.put(3, "hihihi");


        Set<Map.Entry<Integer, String>> set = map.entrySet();
        Iterator<Map.Entry<Integer,String>> itr=set.iterator();
        while(itr.hasNext()){  
            @SuppressWarnings("rawtypes")
            Map.Entry e=itr.next();//no need to typecast  
            System.out.println(e.getKey()+" "+e.getValue());  
            }  
    }

}
