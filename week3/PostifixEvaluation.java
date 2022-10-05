class PostifixEvaluation {
	
	public int evaluate(char[] input) {
		int num1, num2;
		MyStack2 stack = new MyStack2();

		for(char op:input) {
			if (Character.isDigit(op)) stack.push(Character.getNumericValue(op));
            else {
				num2 = stack.pop();
				num1 = stack.pop();
				switch(op) {
					case '+': 
						stack.push(num1 + num2);
						continue;
					case '-':
						stack.push(num1 - num2);
						continue;
					case '*':
						stack.push(num1 * num2);
						continue;
					case '/':
						stack.push(num1 / num2);
                        continue;
					case '%':
						stack.push(num1 % num2);
                        continue;
				}
			}
		}
        return stack.top();
	}
	
	public static void main(String[] args) {
		PostifixEvaluation pe = new PostifixEvaluation();
		
		System.out.println(pe.evaluate("234*+".toCharArray()));
		System.out.println(pe.evaluate("23*4+".toCharArray()));
		System.out.println(pe.evaluate("12+7*".toCharArray()));
		System.out.println(pe.evaluate("68*2/".toCharArray()));
		System.out.println(pe.evaluate("123-4+*51-*3*".toCharArray()));
		System.out.println(pe.evaluate("42/3-4+5*13*-".toCharArray()));
	}
}
	
