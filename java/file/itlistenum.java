import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Properties;
import java.util.Vector;

public class itlistenum {
    public static void main(String[] args) {
        //Enumeration - interface
        // introduced for iteratind the legacy collection objects
        //legacy classes - v1.0 -
        //Hashtable stack vector dictionary and properties
        //new classes - v1.2


        // Vector<String> v = new Vector<>();
        // v.add("banaan");
        // v.add("aan");
        // v.add("ban");
        // v.add("bana");
        // Enumeration<String> e = v.elements();

        // while(e.hasMoreElements()){
        //     System.out.println(e.nextElement());
        // }

        // Hashtable<String,Integer> ages = new Hashtable<>();
        // ages.put("india",11);
        // ages.put("india",112);
        // ages.put("india",114);
        // ages.put("india",115);
        // ages.put("india",116);

        // Enumeration<Integer> e = ages.elements();
        // while(e.hasMoreElements()){
        //     System.out.println(e.nextElement());
        // }



        // Properties prop = new Properties();
        // prop.setProperty("dsd", "asdull");
        // prop.setProperty("ssdwe","wefwe");
        //  Enumeration<Object> e = prop.elements();
        // while(e.hasMoreElements()){
        //     System.out.println(e.nextElement());
        // }













        //iterator - interface
        // introduced for iteratind the all collection objects
        //legacy classes - v1.0 + new class - v1.2
        //one direction , read-only with special pernission for removing the elements


        // ArrayList<Integer> al = new ArrayList<>();
        // al.add(5);
        // al.add(5222);
        // al.add(533);
        // Iterator<Integer> i = al.iterator();
        // while(i.hasNext()){
        //     // System.out.println(i.next());

        //     // remove
        //     i.next();
        //     i.remove();
        // }
        // System.err.println(al);



        // Vector<Integer> al = new Vector<>();
        // al.add(5);
        // al.add(5222);
        // al.add(533);
        // Iterator<Integer> i = al.iterator();
        // while(i.hasNext()){
        //     // System.out.println(i.next());

        //     // remove
        //     System.out.println(i.next());
        //     i.remove();
        // }
        // System.err.println(al);


        // not using hashmap


        // HashMap<String,Integer> hm = new HashMap<>();
        // hm.put("anbss",3223);
        // hm.put("ansaabss",322443);
        // hm.put("anbsASASs",322332);

        // hm.keySet().iterator();
        // hm.values().iterator();
        // hm.entrySet().iterator();




        // prop.elements().asIterator();








         //Listinterator - interface
        // introduced for iteratind the only list type collection objects
        //legacy classes - v1.0 + new class - v1.2
        //Bi direction , read and write

        ArrayList<Integer> al = new ArrayList<>();
        al.add(3);
        al.add(775);
        al.add(7665);

        ListIterator<Integer> li = al.listIterator();
        while(li.hasNext()){
            System.out.println(li.next());;

        }li.add(45);
        System.out.println();

        while(li.hasPrevious()){
            System.out.println(li.previous());
        }
        li.remove();

        System.out.println(al);



    }
    
}
