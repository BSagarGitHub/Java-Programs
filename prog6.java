//JAVA BLOCKS
/*basicaly block are the area which starts from the {amd en dat the }.
 * java provide two types of block 
 *              1.static 
 *              2.non static
 */
class test{
    test(){
        System.out.println("object is declared");
    }
    static{
        System.out.println("inside static block");
    }
    {
        System.out.println("inside non static");
    }
}
public class prog6 {
 public static void main(String[] args) {
    test obj = new test();
    /*when the object is declared these three are invoked automaticaly.like above example..
      but the order is 1.static
                       2.nonstatic
                       3.constrocter.
    */
 }                          
}
