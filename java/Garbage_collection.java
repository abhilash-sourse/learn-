public class Garbage_collection {
    public void finalize(){
        System.out.println("Finalize method is called");
    }
    public static void main(String[] args) {
        Garbage_collection gcp1 = new Garbage_collection();
        Garbage_collection gcp2 = new Garbage_collection();
        Garbage_collection gcp3 = new Garbage_collection();
        new Garbage_collection();

        gcp1 = null;
        gcp2 = gcp3;

        System.gc();
    }
}
