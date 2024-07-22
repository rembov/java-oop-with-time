import java.time.LocalDateTime;

public class Vremya {
    LocalDateTime today = LocalDateTime.now();

    public void dengoda() {
        System.out.println(today.getDayOfYear());
    }

    public void year() {
        System.out.println(today.getYear());
    }
    public void getDatatoday(){
       System.out.println(String.format("%s,%s,%s",today.getYear(),today.getMonth(),today.getMonthValue()));
    }
    public void DenNedeli(){
       System.out.println(today.getDayOfWeek());
    }
      public void timeoclock(){
       System.out.println(String.format("%s:%s:%s",today.getHour(),today.getMinute(),today.getSecond()));
    }

}
