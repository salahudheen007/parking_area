import java.util.ArrayList;

public class PaerkingArea {
    private int slots;
    private ArrayList vehicles=new ArrayList();


    public PaerkingArea(int slots){
        this.slots=slots;
    }
    public Vehicle checkin(String carNumber){
            Vehicle vehicle=new Vehicle(carNumber);
            vehicles.add(vehicle);
            slots--;
            return  vehicle;
    }
    public Bill checkout(String carNumber){
        for (int i=0;i<vehicles.size();i++){
            Vehicle car= (Vehicle) vehicles.get(i);
            if(carNumber.equals(car.getCarNumber())){
                Bill myBill=new Bill(car);
                slots++;
                vehicles.remove(i);
                return myBill;
            }
        }
        return null;
    }
    public boolean isAvailable(){
        return(slots>0);
    }
    public int getBookedslots(){
        return vehicles.size();
    }
}
