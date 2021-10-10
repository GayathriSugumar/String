package String;

public class EMail {
	
	String mail="gayathrixworkz@gmail.com";
	
	public String gmail() {
		if (mail.contains("@") && mail.endsWith(".com")) {
			return "Email ID is valid";
		}
		return "Invalid Email ID";
	}
	public String yahoo() {
		if (mail.contains("yahoo") && mail.endsWith(".com")) {
			return "Email ID is valid";
		}
		return "Invalid Email ID";
	}
	public String hotMail() {
		if (mail.contains("@hoymail") && mail.endsWith(".com")) {
			return "Email ID is valid";
		}
		return "Invalid Email ID";
	}
	public String org() {
		if (mail.contains("@") && mail.endsWith(".org")) {
			return "Email ID is valid";
		}
		return "Invalid Email ID";
	}
	public String edu()
	{
		if (mail.contains("@") && mail.endsWith(".edu")) {
			return "Email ID is valid";
		}
		return "Invalid Email ID";
	}
	public static void main(String[] args) {

		EMail email = new EMail();
		String gmail = email.gmail();
		System.out.println(gmail);
	}

}
