
import java.util.*;
public class perirect {
    public static void main(String[] args) {
        System.out.println("enter all four sides of rectangle: ");
        Scanner s=new Scanner(System.in);
        // int a=s.nextInt();
        // int b=s.nextInt();
        // int c=s.nextInt();
        // int d=s.nextInt();
        int l=s.nextInt();
        int b=s.nextInt();
        System.out.println("perimeter of rectangle is: ");
        //int res =a+b+c+d;
        int peri=2*(l+b);
        //System.out.println(res);
        System.out.println(peri);

    }
}
