import java.util.Scanner;

import javax.net.ssl.SSLPeerUnverifiedException;

/*multidimantional array
 */
public class prog9 {
    public static void main(String[] args) {
        int a[][]=new int [3][3];
        Scanner obj=new Scanner(System.in);
        System.out.println("neter data to the array");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=obj.nextInt();
            }
        }System.out.println("print");
        //displsy
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]);
            }
            System.out.println();        }


    }
    
}
