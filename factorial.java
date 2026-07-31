import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number you want");
        int A=sc.nextInt();
        int factorial=1;
        for(int i=1;i<=A;i++)
        factorial=factorial*i;
        System.out.println("Factorial of the given number is:"+factorial);
    }
}
