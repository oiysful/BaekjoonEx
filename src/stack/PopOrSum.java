package stack;

import java.io.*;
import java.util.Stack;

public class PopOrSum {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> stack = new Stack<>();
        int count = Integer.parseInt(br.readLine());
        int input;
        for(int i=0; i<count; i++) {
            input = Integer.parseInt(br.readLine());
            if(input == 0) stack.pop();
            else stack.push(input);
        }
        Integer result = stack.stream()
        					  .parallel()
        					  .reduce(0, Integer::sum);
        bw.write(result.toString());
        bw.flush();
    }
}
