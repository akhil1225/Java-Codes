public class ReversePyramid {
    public static void main(String[] args) {
        int rows = 5;
        int spaces = 0;

        for (int i = rows; i > 0; i--) {
            for (int j = 0; j < spaces; j++) {
                System.out.print("  ");
            }
            spaces++;

            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
