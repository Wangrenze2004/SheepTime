import java.text.SimpleDateFormat;
import java.util.Date;

public class Time extends Thread {
    Time() {
    }
    public static void Time() {
        SimpleDateFormat Time = new SimpleDateFormat();
        Time.applyPattern("yyyy-MM-dd HH:mm:ss ");
        Date date = new Date();
        System.out.println("现在时间：" + Time .format(date)); 
    }
    @Override
    public void run() {
        while (true) {
            try {
                
                Thread.sleep(1000);
                Time();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
