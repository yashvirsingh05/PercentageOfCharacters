import java.util.Scanner;

public class Precentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();
        int c = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == 'c' || s.charAt(i) == 'g') {
                c++;
            } else {
                continue;
            }
        }
        double result = (double) c * 100 / n;
        System.out.println(result);
    }
}
