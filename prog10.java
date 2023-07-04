/*WORKING WITH INHERITANCE
 * 
 */

class base{
void display(){
    System.out.println("hello world ");
    System.out.println("single inheritance");
}}
//single inheritance.
class child extends base{
     void show(){
        System.out.println("inside derive class");
    }
}
//multilevel inheritance
class derive extends child{
    void  print(){
        System.out.println("inside multiple inheritance");
    }
}
 public class prog10 {
    public static void main(String[] args) {
       //single inheritance
        child obj =new child();
       obj.display();
       obj.show();
       //multiple inheritance.
       derive obj1=new derive();
       obj1.show();
       obj1.display();
       obj1.print();
    }
}
