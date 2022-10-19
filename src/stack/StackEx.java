package stack;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackEx {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	private static Stack<Integer> stack = new Stack<>();
	private static StringTokenizer st;
	
	private static int count;
	private static String commandLine;
	
	private static final String PUSH = "push";
	private static final String POP = "pop";
	private static final String SIZE = "size";
	private static final String EMPTY = "empty";
	private static final String TOP = "top";
	
	public static void main(String[] args) throws IOException {
		getCount();
		if(count >= 1 && count <= 10000) {
			for(int i=0; i<count; i++) {
				commandLine = br.readLine();
				st = new StringTokenizer(commandLine, " ");
				command();
			}
		}
		bw.flush();
		bw.close();
		br.close();
	}
	private static void getCount() throws IOException {
		count = Integer.parseInt(br.readLine());
	}
	private static void command() throws IOException {
		switch (st.nextToken()) {
		case PUSH:
			int value = Integer.parseInt(st.nextToken());
			if(value >= 1 && value <= 100000) stack.push(value);
			break;
			
		case POP:
			bw.write(stack.empty() ? "-1\n" : stack.pop() + "\n");
			break;
			
		case SIZE:
			bw.write(stack.size() + "\n");
			break;
			
		case EMPTY:
			bw.write(stack.empty() ? "1\n" : "0\n");
			break;
			
		case TOP:
			bw.write(stack.empty() ? "-1\n" : stack.peek() + "\n");
			break;
		}
	}
}
