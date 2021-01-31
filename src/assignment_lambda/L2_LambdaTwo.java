package assignment_lambda;

@FunctionalInterface
interface Mail {
	String sendMailTo(String str);
}

public class L2_LambdaTwo {

	public static void main(String[] args) {
		Mail conferenceMail = (name) -> "You've been invited to Conference, " + name + "!";
		System.out.println(conferenceMail.sendMailTo("Htet Phyo"));
		
		Mail meetingMail = (name) -> "You 've been invited to Meeting, " + name + "!";
		System.out.println(meetingMail.sendMailTo("Naing"));
	}

}
