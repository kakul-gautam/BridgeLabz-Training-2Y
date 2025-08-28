import java.util.*;
public class Discount {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int fee=sc.nextInt();
        int discountPercent=sc.nextInt();
        double discount =((double)discountPercent/100)*fee;
        double f=fee-discount;
        System.out.println("The dicount amount is INR "+discount+" and final discounted fee is INR "+f);
        sc.close();
    }
}