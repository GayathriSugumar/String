package String;

public class StringExamples {
	
	
	public static void main(String []args) {
		String userName="Bangton boys";
		String name="Kpop band";
		
		int indexOf=userName.indexOf('B');
		System.out.println(indexOf);
		
		int lengthOfString=userName.length();
		System.out.println(lengthOfString);
		
		char charAt=userName.charAt(6);
		System.out.println(charAt);
		
		boolean contains=userName.contains("boys");
		System.out.println(contains);
		
		boolean startsWith=name.startsWith("Kpop");
		System.out.println(startsWith);
		
		boolean endsWith=name.endsWith("band");
		System.out.println(endsWith);
		
		if(userName.equals(name)) {
			System.out.println("strings are equal");
			}else {
				System.out.println("string are not equal");
			}
	}

}
