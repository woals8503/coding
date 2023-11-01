package day3.숫자만추출;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        String result = "";
        for(char x : str.toCharArray()) {
            if(!Character.isAlphabetic(x)) {
                result += x;
            }
        }
        System.out.println(Integer.parseInt(result));
    }
}
