package dfs;

import java.util.Scanner;

public class BOJ24479 {

    public static int[] arr;
    public static boolean[] visited;

    public static void dfs(int n, int m, int k) {
        //1.탈출조건
        if(k == m) {
            for (int i = 0; i < arr.length; i++) {

            }
            System.out.println();
            return;
        }
        //2.수행조건
        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                visited[i] = true;
                arr[k] = i + 1;
                dfs(n, m, k + 1);
                visited[i] = false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int r = sc.nextInt();

        arr = new int[m];
        visited = new boolean[n];
        dfs(n,m,r);
    }
}
