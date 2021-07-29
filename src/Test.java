import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String check;
        PaerkingArea myArea=new PaerkingArea(20);
        Scanner sc=new Scanner(System.in);

        for (int i=0;i<50;i++){
            System.out.println("checkin or checkout");
            check=sc.nextLine();
            if(check.equals("checkin")){
                if(myArea.isAvailable()){
                    System.out.println("enter car number");
                    String carNumber=sc.nextLine();
                    Vehicle myvehicle=myArea.checkin(carNumber);
                    System.out.println(myvehicle);
                }else{
                    System.out.println("no free slots");
                }
            }else {
                if(myArea.getBookedslots()==0){
                    System.out.println("no vehicle parked");
                }else{
                    System.out.println("enter car number");
                    String carNumber=sc.nextLine();
                    Bill myBill=myArea.checkout(carNumber);
                    if(myBill==null){
                        System.out.println("wrong car number");
                    }else{
                    System.out.println(myBill);
                    }
                }
            }
        }

    }
}
