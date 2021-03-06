import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUserSandD {
	public static void main(String args[]) {
		
		UserSandD usd = new UserSandD("joseph", "pass");

		try {
			FileOutputStream fos = new FileOutputStream("usersandd.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(usd);
			oos.close();
			fos.close();
			System.out.println("UserSandD object has written to usersandd.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
