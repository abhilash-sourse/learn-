import java.lang.reflect.Array;
import java.util.*;
public class vector {
    public static void main(String[] args) {
        Vector v1 = new Vector();
        v1.add("abhi");
        v1.add("abilh");
        v1.add("ilash");

        Vector v2 = new Vector();
        v2.add("sdvsddsvddsvsdabhi");
        v2.add("abcvsdilh");
        v2.add("ilsdvdsash");

        // for(int i =0;i<v2.size();i++){
        //     v1.add(v1.get(i));
        // }
        // System.out.println(v1);


        // v1.addAll(v2);

        // System.out.println(v1.get(2));

        // v1.remove(0);
        // v1.remove("abhi");

        // v1.removeAll(v2);

        // v1.clear();

        // System.out.println(v1.contains("abhi"));
        // System.out.println(v1.containsAll(v2));

        // v1.set(1,"assdsa");


        // System.out.println(v1.indexOf("abhi"));
        // System.out.println(v1.lastIndexOf("abhi"));


        // v1.isEmpty();
        Object[] arr = v1.toArray();
        System.out.println(Array.toString(arr));



        // System.out.println("size "+v1.size());
        // System.out.println("capacity " +v1.capacity());
        System.out.println(v1);


    }

    
}
