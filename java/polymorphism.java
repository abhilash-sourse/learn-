class polymorphism{
    public void add(int a , int b){
        
    }
    public void add(double a ,double b){

    }
    public static void main(String args[]){
        polymorphism c = new polymorphism();
        c.add(2,3);
        c.add( 2.333,3.44);

    }
}