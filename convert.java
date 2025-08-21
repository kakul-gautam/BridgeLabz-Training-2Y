import java.util.*;
public class convert {
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("KM");
     double km=sc.nextDouble();
     // 1 mile=1.6 km 
     double mile=km/1.6;
     System.out.println("the total miles is "+mile+" mile for the given km is "+km);
     sc.close();
   }

    }