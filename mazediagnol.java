import java.nio.file.Path;
import java.util.Scanner;

public class mazediagnol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        path(n, m, 0, 0, "");
        System.out.println();
        System.out.println(c);
    }

    static int c = 0;

    public static void path(int row, int col, int cr, int cc, String ans) {
        if (cr == row - 1 && cc == col - 1) {
            System.out.print(ans + " ");
            c++;
            return;
        }
        if (cr > row - 1 || cc > col - 1) {
            return;
        }
        path(row, col, cr + 1, cc, ans + "V");
        path(row, col, cr, cc + 1, ans + "H");
        path(row, col, cr + 1, cc + 1, ans + "D");

    }

}
