class mygrandpa{
    void display(){
        System.out.println("my grandpa is a farmer");
    }
}
class mydaddy extends mygrandpa{
    void display1(){
        System.out.println("my father is a buisnessman");
    }
}
class me extends mydaddy{
    void show(){
        System.out.println("i am a student");
    }
}
public class Main{
    public static void main(String[] args){
        me obj=new me();
        obj.display();
        obj.show();
        obj.display1();
    } }
