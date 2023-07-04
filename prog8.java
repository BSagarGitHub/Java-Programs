
//DYNAMIC ARRAY
/*here we take a variable as the index of the array
 * through the variable we declare the array index dinamicaly .
 */
import java.util.*;
public class prog8 {
    public static void main(String[] args) {
        int n;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the index of the array");
        n=obj.nextInt();
        int a[] = new int [n];
        System.out.println("enter data to the array");
        for(int i=0;i<n;i++){
            a[i]=obj.nextInt();}
        //display
        for(int i=0;i<n;i++){
            System.out.println(a[i]);}
        //shorting
        for(int k=0;k<n;k++)
        {
            for(int l=k+1;l<n;l++){
                if(a[k]>a[l])
                {
                    a[k]=a[k]+a[l];
                    a[l]=a[k]-a[l];
                    a[k]=a[k]-a[l];
                }
            }

        }
        System.out.println("after swap");
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
        }





    }
    
}
