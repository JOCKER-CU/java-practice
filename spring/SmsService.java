
public class SmsService implements MessageService {

	@Override
	public void send(String  email, String  message){

		System.out.println("%s is sent with %s .".formatted(email, message));
	}
}