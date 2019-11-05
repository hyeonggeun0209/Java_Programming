
public class MyIntStack implements MyStack {
	private final int MAX = 3;
	private int[] stack = new int[MAX];
	private int index = -1;
	
	
	@Override
	public void push(int n) {
		// TODO Auto-generated method stub
		if (index == MAX-1)
			System.out.println("Stack is full!");
		else {
			stack[++index] = n;
		}
	}

	@Override
	public int pop() {
		// TODO Auto-generated method stub
		if (index < 0)	{	
			System.out.println("Stack is empty!");
			return 0;
		} else
			return stack[index--];
	}

}
