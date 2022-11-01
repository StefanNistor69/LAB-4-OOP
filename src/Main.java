import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Gaming_PC_1 Gaming_PC_1 = new Gaming_PC_1();
        Gaming_PC_2 Gaming_PC_2 = new Gaming_PC_2();
        Gaming_PC_3 Gaming_PC_3 = new Gaming_PC_3();
        Office_PC_1 Office_PC_1 = new Office_PC_1();
        Office_PC_2 Office_PC_2 = new Office_PC_2();
        Office_PC_3 Office_PC_3 = new Office_PC_3();
        Gaming_Customer gamer = new Gaming_Customer(true);
        Office_Customer office = new Office_Customer(false);



        Random rand = new Random();

        int profit = 0;
        int workHours = 480;
        int hour = 0;


        Worker waiter = new Worker(10 * workHours, workHours);
        int randomCustomer = rand.nextInt(2);


        while (hour < workHours) {

            int randomPC = rand.nextInt(6) + 1;
            int randomDiscountCard = rand.nextInt(2)+1;


            int randomTimeTakeCustomer = rand.nextInt(20) + 1;
            hour += randomTimeTakeCustomer;
            if (randomTimeTakeCustomer >= 20) {
                System.out.println("Customer was too indecisive and left");
                System.out.println(randomTimeTakeCustomer + " minutes waisted");
            } else if(randomCustomer == 1) {

                switch (randomPC) {
                    case 1:
                        gamer.GamingCustomer();
                        System.out.println("Customer chose the first model of the gaming collection");
                        Gaming_PC_1.AssemblePC();
                        System.out.println("The check price was: " + Gaming_PC_1.getPrice() );
                        profit += Gaming_PC_1.getPrice() ;
                        if (randomDiscountCard == 2) {
                            System.out.println("Discount!");
                            profit += Gaming_PC_1.getPrice() * 0.75 ;
                        }
                        break;
                    case 2:
                        gamer.GamingCustomer();
                        System.out.println("Customer chose the second model of the gaming collection");
                        Gaming_PC_2.AssemblePC();
                        System.out.println("The check price was: " + Gaming_PC_2.getPrice());
                        profit += Gaming_PC_2.getPrice();
                        if (randomDiscountCard == 2) {
                            System.out.println("Discount!");
                            profit += Gaming_PC_2.getPrice() * 0.75 ;
                        }
                        break;
                    case 3:
                        gamer.GamingCustomer();
                        System.out.println("Customer chose the third model of the gaming collection");
                        Gaming_PC_3.AssemblePC();
                        System.out.println("The check price was: " + Gaming_PC_3.getPrice() );
                        profit += Gaming_PC_3.getPrice() ;
                        if (randomDiscountCard == 2) {

                            profit += Gaming_PC_3.getPrice() * 0.75 ;
                        }
                        break;
                    case 4:
                        office.OfficeCustomer();
                        System.out.println("Customer chose the first model of the office collection");
                        Office_PC_1.AssemblePC();
                        System.out.println("The check price was: " + Office_PC_1.getPrice() );
                        profit += Office_PC_1.getPrice() ;
                        if (randomDiscountCard == 2) {
                            profit += Office_PC_1.getPrice() * 0.75 ;
                        }
                        break;
                    case 5:
                        office.OfficeCustomer();
                        System.out.println("Customer chose the second model of the office collection");
                        Office_PC_2.AssemblePC();
                        System.out.println("The check price was: " + Office_PC_2.getPrice() );
                        profit += Office_PC_2.getPrice() ;
                        if (randomDiscountCard == 2) {
                            profit += Office_PC_2.getPrice() * 0.75 ;
                        }
                        break;
                    case 6:
                        office.OfficeCustomer();
                        System.out.println("Customer chose the third model of the office collection");
                        Office_PC_3.AssemblePC();
                        System.out.println("The check price was: " + Office_PC_3.getPrice() );
                        profit += Office_PC_3.getPrice() ;
                        if (randomDiscountCard == 2) {
                            profit += Office_PC_3.getPrice() * 0.75 ;
                        }
                        break;

                }
                hour += 15;
            }
            System.out.println("    ");
        }
        System.out.println("Work day ended");

        System.out.println("Final profit : " + profit);
    }
}