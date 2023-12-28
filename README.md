public static int sum(int[][] array) {
int sum = 0;
for (int[] row : array) {
for (int number : row) {
sum += number;
}
}
return sum;
}

int[][] array = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};

int sum = sum(array);

System.out.println(sum); // 45