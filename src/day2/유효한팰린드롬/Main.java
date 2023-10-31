package day2.유효한팰린드롬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        N = N.toUpperCase().replaceAll("[^A-Z]", "");
        String tmp = new StringBuilder(N).reverse().toString();
        if(N.equalsIgnoreCase(tmp)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
