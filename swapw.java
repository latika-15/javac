
public class swapw {
    public static void main(String[] args) {
        int a=14;
        int b=22;
        System.out.println("before swapping: a="+a+" b="+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("after swapping: a="+a+" b="+b);
    }
    
}
