
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill {
    String car_number,hhmm1,hhmm2,ddmmyyyy;
    LocalDateTime entry;
    LocalDateTime exit;
    double duration;
    double amount;

    public Bill(String car_number, LocalDateTime time)  {
        this.car_number=car_number;
        entry=time;
        exit=LocalDateTime.now();
        hhmm1=entry.format(DateTimeFormatter.ofPattern("HH:mm"));
        hhmm2=exit.format(DateTimeFormatter.ofPattern("HH:mm"));
        ddmmyyyy=exit.format(DateTimeFormatter.ofPattern("DD:MMM:YYYY"));
        duration= Duration.between(entry,exit).toSeconds();
        amount=duration*150/60;

    }

    @Override
    public String toString() {
        return "Bill      " +ddmmyyyy+
                "   car_number='" + car_number + "\n" +
                "   Entry time ="+hhmm1+ "Exit time ="+hhmm2+
                "   duration=" + duration +"\n"+
                "   amount=" + amount ;
    }
}
