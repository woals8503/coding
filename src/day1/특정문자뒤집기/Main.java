package day1.특정문자뒤집기;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] x = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while(lt < rt) {
            if(!Character.isAlphabetic(x[lt])) lt++;
            else if(!Character.isAlphabetic(x[rt])) rt--;
            else {
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(x));
    }
}
