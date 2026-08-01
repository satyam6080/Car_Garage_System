import java.util.Scanner;

public class App {
    public  static void main(String... args){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Welcome  to Car Garage -----");
            //customer detail
            System.out.println("Enter customer name :");
            String name = sc.nextLine();
            System.out.println("Enter car number :");
            String carNo = sc.nextLine();
            System.out.println("Enter the car type :");
            String carType = sc.nextLine();

            Customer customer = new Customer(name,carNo,carType);

            Service[] service={
                new Service(0,"Billing ->",0),
                new Service(1,"Car Wash -> ",300),
                new Service(2,"Break Change ->",500),
                new Service(3,"oil change->",300),
                new Service(4,"Polish ->",700),
                new Service(5,"Full Service ->",2500)
            };

            boolean[] selected = new boolean[service.length];

            while(true){
                System.out.println("Availble Service");
                for(Service s : service){
                    System.out.println(s.getId()+" "+s.getNameOfService()+" $"+s.getPrice());
                }
                System.out.println("Select Services");
                int choice = sc.nextInt();

                if(choice==0){
                    int total = BillCalculator.calculate(service,selected);
                    System.out.println("Billing--->");
                    System.out.println("Customer Name :"+customer.name);
                    System.out.println("Car Type :"+customer.carType);
                    System.out.println("car No :"+customer.carNumber);

                    for(int i=0;i<service.length;i++){
                        if(selected[i]){
                            System.out.println(service[i].getNameOfService() +"--> "+service[i].getPrice());
                        }
                    }

                    System.out.println("Total Bill ---> "+total);
                    break;
                }
                if(choice <0 || choice>= service.length){
                    throw new Exception("Invalid");
                }
                selected[choice]= true;
                System.out.println("Service Added "+service[choice].getNameOfService());

            }
        }
        catch (Exception e){
            System.out.println("Error "+e);
        }
    }
}
