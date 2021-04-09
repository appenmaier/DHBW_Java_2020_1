package chapter02.exercises.exercise05;

public class Exercise0205 {

	public static void main(String[] args) {

		int a = 0, b = 0, c = 0;
		int d = 5, e = 3, f = 4;
		int g = 2, h = 0, i = 0;

		a = 3 * ++b;
		c = 3 * a++;

		d *= 6 + ++e;
		e = --f - 5 - f--;
		f = f + d % (e * 2);

		h = g - 5 + ++g;
		i = (g-- + 2) * (1 + --g);

		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
		System.out.println("d: " + d);
		System.out.println("e: " + e);
		System.out.println("f: " + f);
		System.out.println("g: " + g);
		System.out.println("h: " + h);
		System.out.println("i: " + i);

	}

}
