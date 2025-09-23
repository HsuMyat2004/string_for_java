package string_java;

import java.util.Date;

public class StringBuilderTest {
	public static void main(String[] args) {
		test1();
		test2();
		test3();
		test4();
		test5();
	}

	static void test1() {
		var st = "Hello Java";
		var result = "";
		for (int i = st.length() - 1; i >= 0; i--) {
			result += st.charAt(i);
		}
		System.out.println(result);
	}

	static void test2() {
		StringBuilder st = new StringBuilder("Hello Java");
		System.out.println(st.reverse());
	}

	// using a formula (append) ==> if l > c = (c * 2) + 2
	static void test3() {
		StringBuilder sb1 = new StringBuilder();
		display(sb1);
		StringBuilder sb2 = new StringBuilder("ABCDE");
		display(sb2);
		StringBuilder sb3 = new StringBuilder(10);
		display(sb3);

		System.out.println("After update of String Builder");
		sb1.append("Hello");
		display(sb1);
		sb2.append("ABCDEFGHIJKLMNO");
		display(sb2);
		sb3.append("AAAAAAAAAAAAAAAAAAAAAAAAA");
		display(sb3);

	}

	static void display(StringBuilder sb) {
		System.out.println("Length : " + sb.length() + " || " + "Capacity : " + sb.capacity());
	}

	static void test4() {
		var sb = new StringBuilder();

		int[] arr = { 1, 2, 3, 4, 5 };
		char[] ch = { 'a', 'e', 'i', 'o', 'u' };

		sb.append("Hello");
		sb.append("Java");
		sb.append(false);
		sb.append('$');
		sb.append(arr); // array object can be added in string builder object
		sb.append(ch, 1, 3);

		System.out.println(sb);

		sb.delete(4, 7); // start , end - 1
		System.out.println(sb);

		sb.deleteCharAt(4);
		System.out.println(sb);

		sb.insert(1, "Hello Kitty");
		System.out.println(sb);

		sb.insert(1, new Date());
		System.out.println(sb);

		sb.reverse();
		System.out.println(sb);

		sb.insert(4, 12.09f);
		System.out.println(sb);

		StringBuilder parellel = sb.reverse().append(true).insert(1, 77777); // immutable
		String st = parellel.toString(); // mutable
		System.out.println(parellel);
		System.out.println(st.toUpperCase());

	}

	// newCapacity = (oldCapacity * 2) + 2
	static void test5() {
		var sb = new StringBuilder(10);
		display(sb);

		sb.ensureCapacity(20);
		display(sb);

		sb.ensureCapacity(20);
		display(sb);

		sb.ensureCapacity(25);
		display(sb);

	}
}
