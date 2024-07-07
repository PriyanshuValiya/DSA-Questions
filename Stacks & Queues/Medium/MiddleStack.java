// https://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation
// Not Completed.

import java.util.*;

public class MiddleStack {
	public static int popMid(Stack<Integer> s) {
		System.out.println("\nPopped Element : " + s.pop());
		System.out.println("Popped Element : " + s.pop());

		int cnt = 0;
		int size = s.size();
		System.out.println(s + " @");

		while(cnt < size/2) {
			if(cnt == size/2) {
				System.out.println(s.peek());
			} else {
				System.out.println(cnt);
			}
			cnt++;
		}

		return 126;
	}

	public static void main(String[] args) {
		Stack<Integer> s = new Stack<>();
		
		s.push(11);
		s.push(22);
		s.push(33);
		s.push(44);
		s.push(55);
		s.push(66);
		s.push(77);
		s.push(88);
		s.push(99);

		// System.out.println(s);
		// System.out.println("\nMiddle Element : " + s.get(s.size()/2));
		System.out.println("Popped Element : " + popMid(s));
		System.out.println(s);
	}
}