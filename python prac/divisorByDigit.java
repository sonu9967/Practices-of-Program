import java.util.Scanner;

public class divisorByDigit {
    public static void main(String arbs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  n value");
        int n = sc.nextInt();
        int rem,count=0;
        while( n != 0){
            rem=n%10;
            if(rem != 0){
                if(n%rem==0){
                count++;
                }
            }
            n=n/10;

        }
        System.out.println(count);
}
}

