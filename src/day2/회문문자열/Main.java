package day2.회문문자열;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();

        String tmp = "";
        for(int i=N.length()-1; i>=0; i--) {
            tmp += N.charAt(i);
        }

        if(N.equalsIgnoreCase(tmp)) {
            bw.write("YES");
        } else {
            bw.write("NO");
        }
        bw.flush();
        bw.close();
    }
}
