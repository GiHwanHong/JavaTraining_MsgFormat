import java.text.*;
import java.util.*;

public class MessageFormateEx2 {
	public static void main(String[] args) {
		String tableName = "CUST_INFO";
		String msg = "INSERT INTO" + tableName
								   + " VALUES (''{0}'',''{1}'',{2},''{3}'');";
		
		Object[][] arguments ={
				{"홍길동","02-123-1234","15","07-23"},
				{"최박성","032-333-1234","23","07-23"},
		};
		
		for (int i = 0; i < arguments.length; i++) {
			String result = MessageFormat.format(msg, arguments[i]);
			System.out.println(result);
		}
	}

}
