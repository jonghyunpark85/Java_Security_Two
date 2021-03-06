import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeUserSandDTransient {
	public static void main(String args[]) {
		UserSandDTransient usdt = null;

		try {
			FileInputStream fis = new FileInputStream("usersandtransient.ser");
			ObjectInputStream ois = new ObjectInputStream(fis);
			usdt = (UserSandDTransient) ois.readObject();
			ois.close();
			fis.close();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Name: " + usdt.getUsername());
		System.out.println("Password: " + usdt.getPassword());
	}
}
