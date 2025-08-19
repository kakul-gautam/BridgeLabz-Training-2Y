import java.util.*;
public class hcylinder {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int radius=sc.nextInt();
        int height=sc.nextInt();
        double volume=3.14*radius*radius*height;
        System.out.println("VOLUME OF THE CYLINDER="+volume);
}
}