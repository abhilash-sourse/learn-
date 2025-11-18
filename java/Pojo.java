public class Pojo {
    private int id;
    public String name;
    protected double salary;

    public Pojo(){
        System.out.println("i am abhi");
    }
    
    public Pojo(int id){
        this.id=id;
    }

    public void setID(int id){
        this.id=id;
    }

    public int getID(){
        return id;
    }
    
}
