package day2.중복문자제거;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        String result = "";

        for(int i=0; i<N.length(); i++) {
            if(N.indexOf(N.charAt(i)) == i) {
                result += N.charAt(i);
            }
        }

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
