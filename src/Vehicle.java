import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vehicle {
    private String carNumber;
    private LocalDateTime entryTime;

    public Vehicle(String carNumber){
        this.carNumber=carNumber;
        entryTime=LocalDateTime.now();
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public String getCarNumber() {
        return carNumber;
    }

    @Override
    public String toString() {
        String timeformated=entryTime.format(DateTimeFormatter.ofPattern("HH:mm"));
        return "Check in slip       " + entryTime.format(DateTimeFormatter.ofPattern("d:MMM:yyyy"))+"\n"+
                "   carNumber  =  " + carNumber + '\n' +
                "   entryTime  =  " + timeformated ;
    }
}
