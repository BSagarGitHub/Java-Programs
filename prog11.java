/*supper key word
 * 1.if a data member having same name present  in boht in the derive and base class 
 *    then we have to use the supper keyword to acess the base class data member.
 * 2.if a  member  function having same name present in boht in the derive and base class 
 *   then we have to use the supper keyword to acess the base class member function.
 * 3.if we want to access the constructer of base calass in the derive class we use the supper().
*/
class base{
    base(){
        System.out.println("supper()keyword for the condtructer");
    }
    int a=10;
    void show(){
        System.out.println(" supper keyword for member function");
    }
}
class derive extends base{
    derive(){
        supper();
        System.out.println("hello world");
    }
    int a=20;
    void show(){
        System.out.println("supper keyword for the data member");
    }
}
public class prog11 {
    public static void main(String[] args) {
        
       

    }
    
}
