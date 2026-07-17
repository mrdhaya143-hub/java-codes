import java.util.*;
class Mainlargestnumbers{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number 1:");
    int a=sc.nextInt();
    System.out.println("enter the number 2:");
    int b=sc.nextInt();
    System.out.println("enter the number 3:");
    int c=sc.nextInt();
    if(a>b&&a>c){
        System.out.println("number one is the biggest number:"+a);
    }
    else if(b>a&&b>c){
        System.out.println("number second is the biggest number:"+b);
    }
    else{
        System.out.println("number third is the biggest number:"+c);
    }
    
    
    }
}
