public class Car
{
      
              String Brand;
             
              String Model;
             
              String RegNo;
             
              String Color;

              String T1,T2,T3,T4;

       public void PrintDetails()
       {
              
              System.out.println("CAR BRAND IS : " +this.Brand);
              
              System.out.println("CAR MODEL IS : " +this.Model);
              
              System.out.println("CAR REGISTERED AS : " +this.RegNo);
              
              System.out.println("COLOR OF THE CAR IS : " +this.Color);
              
              Tyre t1 =new Tyre();
              
              T1 = t1.possition="FRONT_LEFT_TYRE";

              T1 = t1.tyreType="Flat";
              
              T1 = t1.Brand="MRF";
              
              T1 = t1.Radius="3.75";
              
              Tyre t2 =new Tyre();

              T2 = t2.possition="FRONT_RIGHT_TYRE";
              
              T2 = t2.tyreType="Flat";
              
              T2 = t2.Brand="MRF";
              
              T2 = t2.Radius="3.75";
              
              Tyre t3 =new Tyre();

              T3 = t3.possition="BACK_RIGHT_TYRE";

              T3 = t3.tyreType="Flat";
              
              T3 = t3.Brand="MRF";
              
              T3 = t3.Radius="3.75";
              
              Tyre t4 =new Tyre();

              T4 = t4.possition="BACK_LEFT_TYRE";

              T4 = t4.tyreType="Flat";
              
              T4 = t4.Brand="MRF";
              
              T4 = t4.Radius="3.75";
              
              t1.PrintDetails();
              t2.PrintDetails();
              t3.PrintDetails();
              t4.PrintDetails();
             
      
       }
}