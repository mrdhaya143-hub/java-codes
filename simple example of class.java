class student{
    int rollno;
    String name;
    String dept;
    String section;
    int year;
    int cgpa;
    //constructors
    student(int rollno,String name,String dept,String selection,int year){
        this.rollno=rollno;
        this.name=name;
        this.dept=dept;
        this.section=section;
        this.year=year;
        this.cgpa=cgpa;
    }
    void display(){
        System.out.println("Roll NO="+rollno);
        System.out.println("Name="+name);
        System.out.println("Department="+dept);
        System.out.println("section="+section);
        System.out.println("Year="+year);
        System.out.println("Cgpa"+cgpa);
    }
}
public class Main{
    public static void main(String[] args){
        student[]students=new student[3];
        student s1=new student(101,"kowsika","micro bio","A",1);
        students[0]=s1;
        student s2=new student(201,"dhaya","ECE","A",3);
        students[1]=s2;
        student s3=new student(303,"dinesh","EEE","C",1);
        students[2]=s3;
        for(int i=0;i<students.length;i++){
            students[i].display();
        }
    }
}
       
    
    
