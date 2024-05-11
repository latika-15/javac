import java.util.Scanner;
public class arithmetic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("my calc\n");
        System.out.println("please enter first no.: ");
        int a=input.nextInt();
        System.out.println("please enter second no.: ");
        int b=input.nextInt();

        int add= a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("addition is: "+add);
        System.out.println("subtraction is: "+sub);
        System.out.println("multiplication is: "+mul);
        System.out.println("division is: "+div);
        System.out.println("remainder is: "+mod);

        System.out.println("product of float-point no.: ");
        System.out.println("enter first no: ");
        float c=input.nextFloat();
        System.out.println("enter second no.: ");
        double d=input.nextDouble();
        double prd=d/c;
        System.out.println("answer is: "+prd);

    }
}
