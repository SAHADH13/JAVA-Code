import java.util.Scanner;
public class TDD
{
       public static void main(String[] ar)
       {
              String Brand,Model,RegNo,Color ;

              Scanner data = new Scanner(System.in);
              
              System.out.println("WELCOME TO THE WORLD OF CARS");      

              System.out.println("********CAR-1************"); 
              
              System.out.println("Mention the Brand of your car" );
              
              Brand = data.nextLine();
              
              System.out.println("Which model is you want ?");
              
              Model = data.nextLine();
              
              System.out.println("please Enter your registration number: ");
              
              RegNo = data.nextLine();
              
              System.out.println("which color varient is preffering!");
              
              Color = data.nextLine();
              
              Car c1 = new Car();
              
              c1.Brand=Brand;
              
              c1.Model=Model;
              
              c1.RegNo=RegNo;
              
              c1.Color=Color;

              System.out.println("**********CAR-2************");      
              
              System.out.println("Mention the Brand of your car" );
              
              Brand = data.nextLine();
              
              System.out.println("Which model is you want ?");
              
              Model = data.nextLine();
              
              System.out.println("please Enter your registration number: ");
              
              RegNo = data.nextLine();
              
              System.out.println("which color varient is preffering!");
              
              Color = data.nextLine();
              
              Car c2 = new Car();
              
              c2.Brand=Brand;
              
              c2.Model=Model;
              
              c2.RegNo=RegNo;
              
              c2.Color=Color;

              System.out.println("*********CAR-3************");      
              
              System.out.println("Mention the Brand of your car" );
              
              Brand = data.nextLine();
              
              System.out.println("Which model is you want ?");
              
              Model = data.nextLine();
              
              System.out.println("please Enter your registration number: ");
              
              RegNo = data.nextLine();
              
              System.out.println("which color varient is preffering!");
              
              Color = data.nextLine();

              Car c3 = new Car();
              
              c3.Brand=Brand;
              
              c3.Model=Model;
              
              c3.RegNo=RegNo;
              
              c3.Color=Color;

              System.out.println("/*/*/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*");

              System.out.println("THE DETAILS OF FIRST CAR IS:");
              
              c1.PrintDetails();
              
              System.out.println("/*/*/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*");

              System.out.println("THE DETAILS OF SECOUND CAR IS:");
              
              c2.PrintDetails();
              
              System.out.println("/*/*/*/*/*/*/*/*/*/*//*/*/*/*/*/*/*/*/*/*");

              System.out.println("THE DETAILS OF THIRD CAR IS:");
              
              c3.PrintDetails();
              
            
       }
       
}

