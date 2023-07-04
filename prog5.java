/*STATIC MEMBER FUNCTION
 * Here like static data member the static member function also called directly 
 * through the name of the class or through the object.
 * a static member function cant access the nonstatic member ,
 * without declaring the object,within same class aloso.
 */
class test{
    int a=10;
    static void show(){
        test obj = new test();
        System.out.println(obj.a);
    }
}
public class prog5 {
    public static void main(String[] args) {
        test obj1 =new test();
        obj1.show();
    }
    
}
//NOTE-Normal member function are known as instance variable .
/*Here we are going to knw about the objects.
 * when an object is declared 2 task are perform
 * 1.jvm load the respective class file to the jvm memory space.
 * 2.and create the object,in this stape also the constructor alocatge memory space to the object
 */
