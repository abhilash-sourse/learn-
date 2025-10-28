import java.util.ArrayDeque;
import java.util.Deque;

public class learn {
    public static void main(String args[]){
        
       Deque <String> a = new ArrayDeque<>();
       a.addFirst("asd");
       a.add("wedd");
       a.add("wedddd");
       a.add("weddaa");
       System.out.println(a.pop());
       System.out.println(a);
        
        
    }
}
