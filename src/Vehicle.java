import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    private String  car_number;
    private LocalDateTime time;
    String ddmmyyyy,hhmm;

    public Vehicle(String car_number){
        this.car_number=car_number;
        time = LocalDateTime.now();
        hhmm=time.format(DateTimeFormatter.ofPattern("HH:mm"));
        ddmmyyyy=time.format(DateTimeFormatter.ofPattern("dd:MMM:YYYY"));

    }

    @Override
    public String toString() {
        return "Checkin Slip         " + ddmmyyyy+"\n"+
                "   car_number='" + car_number + "\n" +
                "   time='" + hhmm ;
    }

    public String getCar_number() {
        return car_number;
    }

    public LocalDateTime getTime() {
        return time;
    }
}
