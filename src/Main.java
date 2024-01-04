import models.Order;
import models.Tshirt;

public class Main {
    public static void main(String[] args) {

        String[] firstsize= {"S","M","L"};
        String[] secondsize= {"XL","M","L"};

        Tshirt firstcustomer = new Tshirt("Deena",2008, 1800, "nobrand","Pink shirt please", firstsize);
        Tshirt secondcustomer = new Tshirt("Simple",2009, 2112, "yesbrand","White shirt with cute flower in the middle", secondsize);
        firstcustomer.tshirt_display();
        secondcustomer.tshirt_display();


        int[] firstprice = {2234,1000,1200};
        int[] secondprice = {1330,3450,1234};



        Order firstorder = new Order("jorpati", 9803547495L,"2233", firstprice);
        Order secondorder = new Order("kapan", 9849087316L,"8888", secondprice);

        firstorder.billdisplayer();
        secondorder.billdisplayer();

    }
}