package sakshi.com;

public class NumberPattern {

    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 5) {
                System.out.print("1 2 5 4 3");
            } else {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
