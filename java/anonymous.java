public class anonymous {
    String name = "abhi";

    public void greet(){
        System.out.println("Hi "+name);
    }
    public static void main(String[] args) {
        int i=10;
        anonymous s1;
        s1 = new anonymous();

        // anonymous s1 = new anonymous();
        s1.greet();
    
        
    }
    
}
