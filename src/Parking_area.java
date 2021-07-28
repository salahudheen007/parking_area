import java.util.ArrayList;

public class Parking_area {
    private int slots;
    private  ArrayList vehicles=new ArrayList();




    public Parking_area(int slots){
        this.slots=slots;
    }
    public Vehicle checkin(String carNumber){
            Vehicle slip = new Vehicle(carNumber);
            vehicles.add(slip);
            slots--;
            return slip;
    }



    public Bill checkout(String carNumber)  {
        for(int i=0;i<vehicles.size();i++){
            Vehicle chsl= (Vehicle) vehicles.get(i);
            String carnum=chsl.getCar_number();
            if(carNumber.contains(carnum)){
                Bill bill=new Bill(carNumber,chsl.getTime());
                return bill;
            }else{
                return null;
            }
        }
        return null;
    }



    public  int getSlots() {
        return slots;
    }



    public ArrayList getSlips() {
        return vehicles;
    }
}
