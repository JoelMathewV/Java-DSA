public class Hollowsquare {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n-1) {
                for (int j = 0; j < 5; j++) {
                    System.out.print("* ");
                }
                System.out.println("");
            } else {
                System.out.println("*       *");
            }
        }
    }
}