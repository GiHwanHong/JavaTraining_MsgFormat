import java.util.*;
import java.text.*;

public class MessageFormateEx3 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String[] data = {
				"INSERT INTO CUST_INFO VALUES ('홍길동','02-123-1234',27,'07-23');",
				"INSERT INTO CUST_INFO VALUES ('이서방','032-333-1234',33,'07-25');"
		};
		
		String pattern = "INSERT INTO CUST_INFO VALUES ({0},{1},{2},{3});";
		MessageFormat mf = new MessageFormat(pattern);
		
		for (int i = 0; i < data.length; i++) {
			Object[] objs = mf.parse(data[i]);
			for (int j = 0; j < objs.length; j++) {
				System.out.print(objs[j] + ",");
			}
			System.out.println();
		}
	}

}
