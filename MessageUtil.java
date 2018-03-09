public class MessageUtil {
private String hii;
//Constructor
//@param message to be printed
public MessageUtil (String message) {
	this.hii = message;
}
//prints the message
public String printMessage() {
	System.out.println(hii);
	return hii;
}
}
