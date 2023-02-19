import java.lang.annotation.Target;
import java.util.Scanner;

public class subset {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int target1 = sc.nextInt();
        int amount = 0;
        String ans = "";
        subset(arr, 0, ans, 0, 0, target1);
    }

    public static void subset(int arr[], int target, String ans, int count, int amount, int target1) {
        if (amount == target1) {
            for (int j = 0; j < ans.length(); j++)
                System.out.print(ans.charAt(j) + " ");
            System.out.print("  ");
            return;
        }
        if (count > arr.length - 1) {
            return;
        }
        target = arr[count];

        subset(arr, target, ans + target, count + 1, amount + target, target1);
        subset(arr, target, ans, count + 1, amount, target1);

    }

}