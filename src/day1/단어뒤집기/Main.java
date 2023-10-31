package day1.단어뒤집기;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String str = "";
        for(int i=0; i<N; i++) {
            str = br.readLine();

            int lt = 0;
            int rt = str.length()-1;
            char[] x = str.toCharArray();

            while(lt < rt) {
                char tmp = x[lt];
                x[lt] = x[rt];
                x[rt] = tmp;
                lt++;
                rt--;
            }

            String answer = String.valueOf(x);
            bw.write(answer.toString() + "\n");
        }
        bw.flush();
        bw.close();
    }
}
