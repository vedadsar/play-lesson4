package helpers;

import play.libs.mailer.Email;
import play.libs.mailer.MailerPlugin;

public class MailHelper {
	
	public static void send(String email, String message){
		
		Email mail = new Email();
		mail.setSubject("Contact request Bitter");
		mail.setFrom("Bitter Contact <bit.play.test@gmail.com>");
		mail.addTo("Bitter Contact <bit.play.test@gmail.com>");
		mail.addTo(email);
		
		// sends text, HTML or both...
		mail.setBodyText(message);
		mail.setBodyHtml(String.format("<html><body><strong> %s </strong> <p>%s</p></body></html>", email, message));
		MailerPlugin.send(mail);
	}

}
