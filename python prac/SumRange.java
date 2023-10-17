import java.util.*;
public class SumRange {
    public static void main(String args[] ){
    Scanner sc=new Scanner(System.in);
    int sumRange=0;
    System.out.println("Enter a number: ");
    int n=sc.nextInt();
    for(int i=0; i<=n;i++){
        if(i<=20 && i>=10){
            sumRange += i;
        }
        
    }
    System.out.println("Sum is :"+sumRange);
    }
}