package javac;
public class tc{
    public static void main(String[] args) {

        //implicit
        int a=24;
        float b=a;
        System.out.println("IMPLICIT");
        System.out.println(a);
        System.out.println(b);

        //explicit
        double pi=3.14159;;
        int rev=(int) pi;
        System.out.println("EXPLICIT");
        System.out.println(pi);
        System.out.println(rev);
    }
}