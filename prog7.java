import java.util.Scanner;

//WORKING WITH AN ARRAY
 public class prog7 {
    public static void main(String[] args) {
        //initialisation at time od declaration
        int a[]={5,10,15};
        int i;
        System.out.println(a[0]);
        System.out.println(a[2]);
        //initialise the value to the array at run time
        int b[]=new int[10];
        System.out.println("enter  the data");
        Scanner obj=new Scanner(System.in);
        for(i=0;i<10;i++)
        {
            b[i]=obj.nextInt();
        }
        //display
        for(i=0;i<10;i++){
            System.out.println(b[i]);

        }
    }
    
}
