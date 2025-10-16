package oops_java;
// 2
public class person {

    String first;
    String last;

    person(String first, String last){
        this.first = first;
        this.last = last;
    }
    void showName(){
        System.out.println(this.first + " " + this.last);
    }
    
}
