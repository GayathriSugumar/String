package String;

public class Validation {
	public String userLogin(String name, String city, String phoneNo, String pincode, String email) {
		
		if(name.isBlank() || name.length()<4) {
		return "Enter valid name";
	}	
	else if(city.isEmpty() || city.length()<4) {
		return "Enter valid city name";
	}
	else if(phoneNo.isBlank() || phoneNo.length()!=10 ||(!(phoneNo.startsWith("9")||phoneNo.startsWith("8")||phoneNo.startsWith("7")||phoneNo.startsWith("6")))){
		return "Invalid Phone number";
	}
	else if(pincode.isBlank() || pincode.length()!=6) {
		return "Enter valid pincode";
	}
	else if(email.isBlank()==false && email.contains("@") && email.endsWith(".com")) {
		return "Registration successful";
	}
	else return "Enter valid emailId";
	}

}
