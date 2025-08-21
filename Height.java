import java.util.*;
public class Height {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int height=sc.nextInt();
        double inch=((double)height)/2.54;
        double foot=inch/12;
        System.out.println("Your height in cm is " +height+ " while in feet is "+String.format("%.2f", foot)+" and in inches is "+String.format("%.2f", inch) );
        sc.close();
    }
}