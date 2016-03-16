package pragmatic.javaIO.homework;

import java.io.*;
import java.util.*;

public class SerializeClient {

	public static void main(String[] args) {

		try (FileOutputStream output = new FileOutputStream("file/client");
				ObjectOutputStream objectOutput = new ObjectOutputStream(output)) {

			Client client1 = new Client(1, 2, 111, "something@.abv.bg", "lulin");
			objectOutput.writeObject(client1);

		} catch (IOException e) {
			System.out.println("Error");
		}

		try (FileInputStream inputStream = new FileInputStream("file/client");
				 ObjectInputStream objectInputStream = new ObjectInputStream(inputStream)) {
				
			Client client1 = (Client)objectInputStream.readObject();
			System.out.println(client1);
				
				
				
			} catch (IOException | ClassNotFoundException e) {
				
				System.out.println("Error");
				e.printStackTrace();
			}
		
		
	}
}
