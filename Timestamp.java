import java.text.SimpleDateFormat;
import java.util.Date;

public class Timestamp {
    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String timestamp = sdf.format(new Date());
        System.out.println("Current Timestamp: " + timestamp);
        System.out.println("Kunal Puri -WLBatchB029 ");
    }
}
