
import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class time {
    public static void main(String[] args) {
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            int count = 9;
            @Override
            public void run(){
                System.out.println("hello");;
                count--;
                if(count <=0 ){
                    System.out.println("Task complete!");
                    timer.cancel();
                }
            }
        };
        timer.schedule(task,9000,5000);
    }
}
