import java.util.*;
import java.text.*;

public class MessageFormateEx {

	public static void main(String[] args) {
		String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";
		
		Object[] arguments = {
				"ȫ�浿","02-123-1234", "27", "07-09"
		};
		String result = 
				MessageFormat.format(msg, arguments);
		System.out.println(result);

	}

}
