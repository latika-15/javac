import java.util.*;

public class triarea {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter base: ");
        int b=sc.nextInt();
        System.out.println("enter height: ");
        int h=sc.nextInt();
        double tri=0.5*b*h;
        System.out.println("area od triangle is: "+tri);
    }
}
