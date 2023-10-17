import java.util.Scanner;

public class noBtwRange {
    public static void main(String arbs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  n value(starting Value): ");
        int n = sc.nextInt();
        System.out.println("enter the  m value(Last Value): ");
        int m = sc.nextInt();
        int sum=0;
        for(int i=n;i<=m;i++){
            if(i%3==0 && i%5==0){
                sum=sum+i;
            }
        }
        System.out.println("The Sum of divisible of 3 and 5 between "+n+" and "+m+" is: "+sum);
}
}
