package CodeChef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        if (str.charAt(0) == str.charAt(2) && str.charAt(1) == 'w') {
            System.out.println("Cute");
        } else {
            System.out.println("No");
        }
    }
}
