import java.util.Scanner;

public class twin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        twin(s, 0);
        System.out.println(count);

    }

    static int count = 0;

    public static void twin(String s, int i) {
        if (i == s.length() - 2) {
            return;
        }
        if (s.charAt(i) == s.charAt(i + 2)) {
            count++;
        }
        twin(s, i + 1);

    }

}
