import java.util.Scanner;

public class deductToZero {
    public static void main(String arbs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  n value");
        int n = sc.nextInt();
        int count=0;
        while(n != 0){
            //cond for even --> divide by 2
            if(n%2==0){
                n=n/2;
                count++;
                // if(n<0){
                //     n=n-(-1);
                // }
            }else{
                n=n-1;
                count++;
            }
        }
        System.out.println("The Number of steps to reduce to Zero is: "+count);
}
}
