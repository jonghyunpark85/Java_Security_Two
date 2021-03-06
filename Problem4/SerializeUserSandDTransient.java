import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializeUserSandDTransient {
	public static void main(String args[]) {
		UserSandDTransient usdt = new UserSandDTransient("joseph", "pass");

		try {
			FileOutputStream fos = new FileOutputStream("usersandtransient.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(usdt);
			oos.close();
			fos.close();
			System.out.println("UserSandDTransient has object written to usersandtransient.ser");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
