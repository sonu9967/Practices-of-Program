import java.util.*;

public class factorK {
    public static void main(String arbs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  n value");
        int n = sc.nextInt();
        // int[] arr =new int[n];
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }

        }
        System.out.println("The List of factor is:" + list);
        System.out.println("Enter the place/index at which you want to access: ");
        int ind = sc.nextInt();
        int ele=list.get(ind-1);
        System.out.println("factor at index is: " + ele);

    }
}
