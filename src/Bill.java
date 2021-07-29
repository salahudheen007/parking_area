import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Bill {
    private LocalDateTime entryTime,exitTime;
    private String carNumber;

    public Bill(Vehicle vehicle){
        this.carNumber= vehicle.getCarNumber();
        this.entryTime=vehicle.getEntryTime();
        exitTime=LocalDateTime.now();
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("HH:mm");
        long duration= Duration.between(entryTime,exitTime).toSeconds();
        long amount=duration*150/(60);
        return "Bill      " +exitTime.format(DateTimeFormatter.ofPattern("DD:MMM:YYYY"))+"\n"+
                "   carNumber  = " + carNumber+"\n"+
                "   entryTime  = " + entryTime.format(formatter) +"\n"+
                "   exitTime   = " + exitTime.format(formatter)+"\n"+
                "   amount     = "+ amount+"RS";

    }
}
