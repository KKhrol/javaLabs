import java.util.Scanner;

public class PrimProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int[] visited = new int[n];
        int min;
        int u = 0, v = 0, total = 0;

        for (int i = 0; i < n; i ++) {
            visited[i] = 0;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
                if (matrix[i][j] == 0) {
                    matrix[i][j] = 999;
                }
            }
        }
        visited[0] = 1;
        for (int counter = 0; counter < n-1; counter++) {
            min = 999;

            for(int i = 0; i < n; i++) {
                if(visited[i]==1) {
                    for(int j = 0; j < n; j++) {
                        if(visited[j]!=1) {
                            if(min > matrix[i][j]) {
                                min = matrix[i][j];
                                u = i;
                                v = j;
                            }
                        }
                    }
                }
            }
            visited[v] = 1;
            total += min;
            System.out.println("Edge found: " + u + "->" + v + ": Weight: " + min);
        }

        System.out.println("The weight of the minimum spanning tree is: " + total);
    }


}
