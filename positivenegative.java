import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String str = (n > 0)?"positive":((n < 0)?"negative":"zero");
        System.out.println(str);
    }
}