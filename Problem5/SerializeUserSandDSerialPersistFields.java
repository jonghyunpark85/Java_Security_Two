import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUserSandDSerialPersistFields {
	public static void main(String args[]) {

		UserSandDSerialPersistentFields usdspf = new UserSandDSerialPersistentFields("joseph", "pass");

		try {
			FileOutputStream fos = new FileOutputStream("usersanddserialpersistfields.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(usdspf);
			oos.close();
			fos.close();
			System.out
					.println("UserSandDSerialPersistentFields object has written to usersanddserialpersistfields.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
