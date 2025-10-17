import java.util.ArrayList;
import java.util.Collections;

public class DoubleListExample {
    public static void main(String[] args) {
                    //int
        ArrayList<String> list = new ArrayList<>();

        list.add("abhi");
        list.add("abhi");
        list.add("asbhi");

        // list.remove(1);
        // list.set(2,"aaaa");

        // System.out.println(list);
        // System.out.println(list.get(2));
        // System.out.println(list.size());
        Collections.sort(list);
        for(String lists : list){
            System.out.println(lists);
        }


                 //double
        // ArrayList<Double> list = new ArrayList<>();

        // list.add(3.14);
        // list.add(1.99);
        // list.add(2.55);

        // System.out.println(list);
    }
}
