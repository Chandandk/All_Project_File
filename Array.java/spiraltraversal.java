public class spiraltraversal {

    public static void main(String[] args) {

        int arr[][] = { { 1, 2, 3, 4,}, {5,6, 7, 8}, { 9,10,11,12}, { 13,14,15,16}};

        spiral(arr);
    }

    public static void spiral(int arr[][]) {
        int sr = 0, er = arr.length - 1, sc = 0, ec = arr.length - 1;

        while (true) {
            // print the top wall
            for (int c = sc; c <= ec; c++) {
                System.out.println(arr[sr][c]+" ");
            }

            // updated the wall
            sr++;

            // print the rigth wall
            for (int r = sr; r <= er; r++) {
                System.out.println(arr[r][ec]+" ");
                // update the wall
                ec--;
            }
 // print the bottom wall
            for (int c =ec ; c>= sc; c--) {
                System.out.println(arr[er][c]+" ");
                // update the endrow
                er--;
            }
            // print the left wall
            for (int r =er; r>= sr; r--) {
                System.out.println(arr[r][sc]+" ");
                // update the wall
                sc++;
            }
        }
    }
}
