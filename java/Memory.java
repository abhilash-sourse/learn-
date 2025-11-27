public class Memory {
    int orgID = 4552;
    String orgName = "abhi";
    String ceo="djbjkdsb";
    int no =2;
    static double net = 500.00;
    public static void main(String[] args) throws InterruptedException {
        int eid = 101;
        String empName = "abhi";
        double salary = 500.00;

        Memory e1 = new Memory();
        e1.getOrgID();
        System.out.println(Memory.net);

        Thread.sleep(5000);


        
    }

    public  int getOrgID(){
        return orgID;

    }
    public static double getnet(){
        return net;
    }
    public void del(int empID){

    }
    
    
}
