import java.lang.*;

public class Operation {
	public static void main(String[] args) {
		int var1 = 5, var2 = 2;

		// Arithmetic
		System.out.println("var1 + var2 = " + (var1 + var2));	// Sum
		System.out.println("var1 - var2 = " + (var1 - var2));	// Sub
		System.out.println("var1 * var2 = " + (var1 * var2));	// Mul
		System.out.println("var1 / var2 = " + (var1 / var2));	// Div
		System.out.println("var1 % var2 = " + (var1 % var2));	// Mod
		System.out.println("5.0 / 2.0 =" + (5.0 / 2.0));		// Float Div

		// Unary operations
		System.out.println("Negate = " + (-var1));
		System.out.println("Increment = " + (var1++));
		System.out.println("Increment = " + (++var1));
		System.out.println("Decrement = " + (var2--));
		System.out.println("Decrement = " + (--var2));

		// Boolean
		boolean var3 = true;
		System.out.println("Inverse 0f var3 is: " + (!var3));
		System.out.println("!(var1 > var2) = " + !(var1 > var2));
		System.out.println("!(var1 < var2) = " + !(var1 < var2));

		// Relational
		int var4 = 5, var5 = 10, var6 = 5;
		System.out.println("var4 == var5: " + (var4 == var5));
		System.out.println("var4 == var6: " + (var4 == var6));
		System.out.println("var4 == var5: " + (var4 != var5));
		System.out.println("var4 == var6: " + (var4 != var6));
		System.out.println("var4 > var5: " + (var4 > var5));
		System.out.println("var6 > var4: " + (var6 >= var4));
		System.out.println("var4 < var5: " + (var4 < var5));
		System.out.println("var5 < var6: " + (var5 <= var6));

		// If-Else
		int a = 10, b = 20, c = 20, d = 0;
		if ((a < b) && (b == c)) {
			d = a + b + c;
			System.out.println("The sum is: " + d);
		} else {
			System.out.println("False condition.");
		}

		if ((a < c) && (++b > c)) {
			System.out.println("Inside of block.");
		} else {
			System.out.println("The value of b is: " + b);
		}

		int max = (var1 > var2) ? var1 : var2;
		System.out.println("Maximum is: " + max);

		// Switch-case
		int num = 3;
		switch(num) {
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			default:
				System.out.println("other");
		}

		// Bitwise operation
		int x = 5, y = 7;
		System.out.println("x & y = " + (x & y));	// AND
		System.out.println("x | y = " + (x | y));	// OR
		System.out.println("x ^ y = " + (x ^ y));	// XOR
		System.out.println("~x = " + (~x));			// NOT

		x &= y;
		System.out.println("x = " + x);
	}
}
