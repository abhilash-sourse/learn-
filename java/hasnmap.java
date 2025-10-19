import java.util.HashMap;

import org.xml.sax.HandlerBase;

public class hasnmap {
    public static void main(String[] args) {
        
        HashMap<String , Double> map = new HashMap();

        map.put("apple",0.99);
        map.put("dsv",0.49);
        map.put("asase",4.99);
        map.put("affle",2.99);
        map.put("fffle",2.99);

        // map.remove("apple");
        // System.out.println(map.get("coconut"));
        //  System.out.println(map.containsKey("dsv"));
        //  System.out.println(map.containsValue(2.99));
        //  System.out.println(map.size());

        for(String key : map.keySet()){
            System.out.println(key +": $" + map.get(key));
        }

        System.out.println(map);
    }
    
}
