package dfs;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q15649 {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int count;
    static int[] checked;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        checked = new int[n+1];

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        for(int i = 1; i <= n; i++) {
            Collections.sort(graph.get(i));
        }

        count = 1;
        dfs(r);
        for(int i = 1; i <= n; i++) {
            sb.append(checked[i]).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
    }

    private static void dfs(int node) {
        checked[node] = count;
        for(int i = 0; i < graph.get(node).size(); i++) {
            int newNode = graph.get(node).get(i);
            if(checked[newNode] == 0) {
                count++;
                dfs(newNode);
            }
        }
    }
}
