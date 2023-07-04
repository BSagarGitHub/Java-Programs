/*STATIC DATA MEMBER 
 * here by using static key word we declared a static data member.
 * if no value is assign to it then it store the default value of the data type.
*/
class test{
    int a;
    static int b;
    test(){
        a=0;
    }
    void incriment(){
        a++;
        b++;
    }
    void show(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class prog4 {
    public static void main(String[] args) {
        test obj1=new test();
        test obj2=new test();
        test obj3=new test();
        obj1.incriment();
        obj2.incriment();
        obj3.incriment();
        obj1.show();
        obj2.show();
        obj3.show();
        System.out.println(test.b);//here by using only the name of the class we  call the static data member
                                    //so here no need ot declare the instance to acces the static datamember.

    }
    
}
