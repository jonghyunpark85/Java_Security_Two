import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUserSandD {
	public static void main(String args[]) {
		
		UserSandD usd = null;

		try {
			FileInputStream fis = new FileInputStream("usersandd.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			usd = (UserSandD) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Name: " + usd.getUsername());
		System.out.println("Password: " + usd.getPassword());

	}
}
