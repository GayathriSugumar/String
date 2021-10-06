package String;

public class Index {
	
	public static void main(String []args) {
		String t1="Welcome to Thanjavur";
		String t2="Big Temple is popular tourist place in Thanjavur";
		
			System.out.println(t1.indexOf('c'));
			System.out.println(t1.indexOf("Thanjavur"));
			System.out.println(t1.indexOf('j', 3));
			System.out.println(t1.indexOf("to",15));
			System.out.println(t2.lastIndexOf('B'));
			System.out.println(t2.lastIndexOf("tourist"));
			System.out.println(t2.lastIndexOf('p', 21));
			System.out.println(t2.lastIndexOf("popular", 23));
			System.out.println(t2.indent(12));
	}
}
