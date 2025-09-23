package string_java;

public class StringTest {
	
	public static void main(String[] args) {
		
		// ==== (1) creating string === //
//		String name = "Mg Mg";
//		String job = new String("Teacher");
//		
//		System.out.format("Length of %s is %d", 
//				name,
//				name.length()); //space also calculated when using string
		
		// ==== (1) creating string === //
		
		
		// ==== (2)Converting String to Number ===== //
		
		// String to integer
//		int data1 = Integer.valueOf("1234");
//		
//		// string to double
//		double data2 = Double.valueOf("234.567");
//		
//		
//		// float to String
//		Float data3 = 1234.56f;
//		String str1 = data3.toString();
//		
//		// short to String
//		Short data4 = 890;
//		String str2 = String.valueOf(data4);
//		
//		System.out.println(data1);
//		System.out.println(str1);
//		System.out.println(str2);
//		
//		float f = 1234.56f;
//		String str3 = Float.toString(f); // static method
//		String str4 = String.valueOf(f); // another option
//		
//		System.out.println(f);
//		System.out.println(str3);
//		System.out.println(str4);
//		
//		float f1 = 1234.56f;
//		Float data6 = f; // auto-boxing: primitive → wrapper
//		
//		System.out.println(f1);
//		System.out.println(data6);
			
		// ==== (2)Converting String to Number ===== //
		
		// ==== (3) Multi Line String === //
//		var sql = """
//				SELECT * FROM users
//				where name like ? AND age > 20 OR age < 30; 
//				""";
//		System.out.println(sql);
		// ==== (3) Multi Line String === //
		
		// == (4) Character by index == //
//		String name = "Hsu Myat Htike";
//		System.out.println(name.charAt(0));
//		System.out.println(name.charAt(name.length() - 1));
		// == (4) Character by index == //
		
		//=== (5) Sub String ===// 
//		String p = "Hello World";
//		System.out.println(p.substring(1, 5));
//		System.out.println(p.substring(1));
//		System.out.println(p.subSequence(1,5));
		//=== (5) Sub String ===// 
		
		// === (6) Trim the string === //
//		String str = " Hello World ";
//		System.out.println(str.trim());
//		System.out.println(str.trim().toUpperCase());
//		System.out.println(str.trim().toLowerCase());
		// === (6) Trim the string === //
		
		// === (7) Concat === //
		// System.out.println("Java is ".concat("the best programming"));
		// === (7) Concat === //
		
		// sub-string //
		var str = "Hello World";
		System.out.println(str.substring(1)); //begin
		
		System.out.println(str.substring(1, 5)); // start 1 ma shi , end - 1
		
		// separating comma operator //
		var info = "AungAung, 18, 12/AuKaTa(N)123456, 0998765434, 11 Ward SO Township, Yangon";
		String res[] = info.split(",",6);
		for(String s : res) {
			System.out.println(s.trim());
		}
		
		// replace //
		var s1 = "I like pizza";
		var s2 = "love";
		System.out.println(s1.replace("like", s2));
		
		var info1 = "123aaa, ** 456 - asdf78 -- 500";
		var reg = info1.replaceAll("[^0-9]", " "); // any character that is NOT a digit
		
		var reg2 = info1.replaceAll("\\d[3]", "\\$\\$\\$");
		System.out.println(reg);
		System.out.println(reg2);
		
		CharSequence s3 = "Char Sequence"; //interface
		String s4 = "String value"; //concrete
		s3 = s4;
		s4 = (String) s3;
		System.out.println(s3 + " || " + s4);
		
			var s5 = "hello";
			var s6 = "hello";
			var s7 = "hey";
			
			/*
			 if s1 > s2, +ve value.
			 if s1 < s2, -ve value.
			 if s1 == s2, zero
			 in case, compare with ascii code
			 */
			System.out.println(s5.compareTo(s6)); // 0
			System.out.println(s5.compareTo(s7)); // -13
			System.out.println(s7.compareTo(s5)); //  13
			
			System.out.println("10".compareTo("5")); // -4
			System.out.println("5".compareTo("300")); // 2
			System.out.println("hello".compareToIgnoreCase("HELLO"));
		
			var str1 = "Hello.txt";
			var str2 = "Hello.java";
			System.out.println(str1.startsWith("Hello"));
			System.out.println(str2.endsWith(".java"));
			
			var st = "Java is amazing.";
			System.out.println(st.startsWith("is", 5));
			System.out.println(st.contains("is"));
			System.out.println(str1.equals(str2));
			System.out.println("hello".equalsIgnoreCase("HELLO"));
			
			var empty = "";
			var blank = " "; // white space
			/*
			 if(username != null && username.isEmpty() && usename.trim().isEmpty()){
			 	// not login
			 }
			 
			 if(username != null && username.isEmpty() && usename.isBlank()){
			 	// not login
			 }
			 */
			
			System.out.println(empty.isBlank() + " || " + empty.isEmpty());
			System.out.println(blank.isBlank() + " || " + blank.isEmpty());
			System.out.println(blank.length() + " || "+ empty.length());
			System.out.println(" Java is OOP ".trim());
			
			var a = "Hello, bro. Are you ok.";
			var b = "No, I am not ok. HELLO.";
			
			var res1 = a.regionMatches(0, b, 17, 5);
			var res2 = a.regionMatches(true, 0, b, 17, 5);
			System.out.println(res1);
			System.out.println(res2);
			
			var st6 = "Java is amazing.";
			System.out.println(st.indexOf('i')); // 5
			System.out.println(st.lastIndexOf('i')); // 12
			
			System.out.println(st.indexOf("is")); // 5
			System.out.println(st.indexOf("ing")); // 12
			
			System.out.println(st.indexOf('i', 5)); // 5
			System.out.println(st.indexOf("ama", 0)); // 8
			
			var s71 = "Mg Mg";
			var s72 = new String("Student");
			
			var s73 = "Mg Mg";
			System.out.println(s71.equals(s72));
			System.out.println("Hey " + s71.equals(s73));
			System.out.println("Hello " + s71 == s73);

			System.out.println(s71.hashCode() + " || " + s72.hashCode());
			
			var res11 = s71 + " is a Student";
			var res12 = s71.concat(" is a Student");
			
			System.out.println(res11);
			System.out.println(res12);
			
			
			int d1 = Integer.valueOf('a'); // 10430505090
			System.out.println(Integer.MAX_VALUE);
			System.out.println(d1);
			
			int d2 = Integer.valueOf("147"); // 10430505090
			System.out.println(Integer.MAX_VALUE);
			System.out.println(d2);
			
			
			
	}

}
