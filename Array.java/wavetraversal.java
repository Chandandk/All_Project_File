public class wavetraversal {
    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 } };

        wave(arr);
    }

    public static void wave(int arr[][]) {

        boolean down = true;
        for (int c = 0; c < arr[0].length; c++) {

            // Travers Row in Normal or Incresing fashion
            if (down) {
                System.out.println();
                for (int r = 0; r < arr.length; r++) {
                    System.out.print(arr[r][c] + "  ");

                }
                // updated the flag
                down = false;
            } else {
                System.out.println();
                // Travers Row in Reverse direction
                for (int r = arr.length - 1; r >= 0; r--)
                /* Same thing for (int r = 4; r >= 0; r--) */
                {
                    System.out.print(arr[r][c] + "  ");
                }
                // updated the flag
                down = true;
            }
        }
    }
}
