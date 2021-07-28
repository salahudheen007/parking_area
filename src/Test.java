
import java.util.Scanner;

public class Test {
    public static void main(String[] args)  {
        Parking_area myarea=new Parking_area(20);
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<=100;i++){
        System.out.println("check in or check out");
        String status=sc.nextLine();
        if(status.equals("checkin")){
            if (myarea.getSlots()>=0){
                System.out.println("enter the number");
                String number=sc.nextLine();
                Vehicle slot=myarea.checkin(number);
                System.out.println(slot);
            }else{
                System.out.println("no free slots");
            }

        }if(status.equals("checkout")){
            if(myarea.getSlots()==20){
                System.out.println("no vehicle parked");
            }else {
                System.out.println("enter the number");
                String number = sc.nextLine();
                System.out.printf(String.valueOf(myarea.getSlips().size()));
                Bill bill=myarea.checkout(number);
                if(bill!=null){
                    System.out.println(bill);
                    System.out.println("thank you");
                }else {
                    System.out.println("wrong car number");
                }

            }
        }
    }}
}
