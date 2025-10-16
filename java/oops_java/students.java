package oops_java;

public class students extends person{

    double sgp;
    students(String first, String last, double sgp) {
        super(first, last);
        this.first = first;
        this.last = last;
        this.sgp = sgp;
    }
    void showsgp(){
        System.out.println(this.first + this.last + " 's sgp is " + this.sgp);
    }
    
    
}
