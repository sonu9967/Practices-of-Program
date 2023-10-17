import java.util.Scanner;
public class Prime {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        boolean nu=true;

        for(int i=2;i<n;i++){
            if(n%i==0){
                //count +=1;
                nu=false;
            }
        }
        //if(count<3){
        if(nu==true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
           // System.out.println(count);
        }
    }
}
