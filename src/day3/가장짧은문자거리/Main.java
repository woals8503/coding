package day3.가장짧은문자거리;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String str = st.nextToken();
        char x = st.nextToken().charAt(0);
        int[] answer = new int[str.length()];

        int p = 1000;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == x) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = p;
            }
        }

        p = 1000;
        for(int i=str.length()-1; i>=0; i--) {
            if(str.charAt(i) == x) {
                p = 0;
                answer[i] = p;
            } else {
                p++;
                answer[i] = Math.min(answer[i], p);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int a : answer) {
            sb.append(a + " ");
        }
        System.out.println(sb.toString());
    }
}
