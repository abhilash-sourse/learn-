public class learn {
    int rollNumber;
    String name;
    boolean isAttended;

    public learn(int rollNumber){
        this.rollNumber = rollNumber;
    }
    public void setStudentAtt(boolean flag){
        if(!isAttended)
            isAttended = flag;
        System.out.println("teacher assigned attendence to student");
    }

    public boolean get(){
        System.err.println("Teacher accessed student attendence");
        return isAttended;
    }

}
