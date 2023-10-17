import java.util.Scanner;
// import java.lang.Math.*;
public class Armstrong {
    public static void main(String args[] ){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,rem=0,m=n;
        for(int i=1;i<=m;i++){
            while(i!=0){
            rem=i%10;
            sum +=rem*rem*rem;
            i=i/10;
        }
        if(m==sum){
            System.out.println("yes");
            System.out.println(sum);
        }else{
            System.out.println("No");
            System.out.println(sum);

        }
        }
        
}
}
