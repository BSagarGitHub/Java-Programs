/*PARAMETERISED CONSTRUCTER*/
class test{
    int b,l;
    test(int l1,int b1){
        l=l1;
        b=b1;
    }
    //Area of a trangleS
    void area()
    {
       int a=l*b;//here "a" is is the "local variable" because it is declared inside a memnber fuction.
                //if we dont assign a value to the local variable and try to use it then it throw an error. 
                //because java dosenot add the concept of the garbage value. 
        System.out.println(a);
    }
}
public class prog3 {
    public static void main(String[] args) {
        test obj=new test(5,5);//here we pass two arguments in the parameterised constructer.
        obj.area();
    }
    
}
