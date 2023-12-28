
public class Sum {
    public static int sum(int[][] array) {
        int sum = 0;
        for (int[] row : array) {
            for (int number : row) {
                sum += number;
            }
        }
        return sum;
    }

}


