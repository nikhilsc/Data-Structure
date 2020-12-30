public class Stack {

	private int s[], maxSize, tos;

	Stack(int size) {
		maxSize = size;
		s = new int[maxSize];
		tos = -1;
	}

	public void push(int e) {
		tos++;
		s[tos] = e;
	}

	public boolean isFull() {
		if (tos == maxSize - 1) {
			return true;
		} else
			return false;
	}

	public int pop() {
		int temp;
		temp = s[tos];
		tos--;
		return (temp);
	}

	public boolean isEmpty() {
		if (tos == -1) {
			return true;
		} else
			return false;
	}

	public void printStack() {
		for (int i = tos; i > -1; i--) {
			System.out.println(s[i]);
		}
	}

	public int atPeak() {
		return (s[tos]);
	}
}
