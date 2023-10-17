import java.util.Scanner;
public class reverseNumber {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=m;
        int rem,reve=0;
        while(n != 0){
            rem=n%10;
            reve=reve*10 + rem;
            n=n/10;
        }
        System.out.println(reve);
        if(m==reve){
            System.out.println("Given number is Palindrome");

        }else{
            System.out.println("Given number is not Palindrome"); 
        }
}
}
