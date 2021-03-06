import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserialUserSandDSerialPersistFields {
	public static void main(String args[]) {
		
		UserSandDSerialPersistentFields usdspf = null;

		try {
			FileInputStream fis = new FileInputStream("usersanddserialpersistfields.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			usdspf = (UserSandDSerialPersistentFields) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Name: " + usdspf.getUsername());
		System.out.println("Password: " + usdspf.getPassword());
	}
}
