public class Earth {
    public static void main(String args[]) {
        int r = 6378;
        double v = (4.0 / 3.0) * Math.PI * Math.pow(r, 3);
        double c = v / Math.pow(1.6, 3);
        System.out.println("The volume of the earth in cublic kilometres is " + v + " and in cubic miles is " + c);
    }
}