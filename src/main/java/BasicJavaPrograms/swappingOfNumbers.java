package BasicJavaPrograms;

public class swappingOfNumbers {

    public static void main(String[]args)
    {
        int a=10, b=20, c;
        System.out.println("Before swapping a= " +a);
        System.out.println("Before swapping b= " +b);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping a= " +a);
        System.out.println("After swapping b= " +b);
        withoutThirdVariable(a,b);
    }
    public static void withoutThirdVariable(int a, int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a= " +a);
        System.out.println("After swapping b= " +b);
    }
}
