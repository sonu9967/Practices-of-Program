import java.util.*;
public class OneToNRev{
    public static void main(String args[] ){
    Scanner sc=new Scanner(System.in);
    int sum=0;
    int n=sc.nextInt();
    for(int i=n; i>=0;i--){
        System.out.println(i+" ");//first n rev number
        sum += i;
    }
    System.out.println("Sum is :"+sum);
    }
}