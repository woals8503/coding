package day1.문장속단어;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        String result = "";
        while(st.hasMoreTokens()) {
            String str = st.nextToken();

            if(result.length() < str.length()) {
                result = str;
            }
        }
        System.out.println(result);
    }
}
