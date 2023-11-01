package day3.문자열압축;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine() + " ";

        int cnt = 1;
        String result = "";
        for(int i=0; i<str.length()-1; i++) {
            if(str.charAt(i) == str.charAt(i+1)) {
                cnt++;
            } else {
                result += str.charAt(i);
                if(cnt > 1) result += String.valueOf(cnt);
                cnt = 1;
            }
        }
        System.out.println(result);
    }
}
