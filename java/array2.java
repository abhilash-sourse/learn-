
import java.lang.reflect.Array;
import java.util.Vector;
import java.util.Arrays;

public class array2 {
    public static void main(String[] args) {
        Integer[]arr  = new Integer[]{1,2,3,4,5};
        Vector<Integer>v1 = new Vector<>(Arrays.asList(arr));          //   <>===<data type>
        
        v1.add(66);
        v1.add(109);
        v1.add(null);

        v1.add(5);
        v1.remove(5);


        System.out.println(v1);
        System.out.println(v1.size());
        System.out.println(v1.capacity());

    }
    
}
