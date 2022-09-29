import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Test {
	
	public static void main(String args[]) {
		
		//1
		Test testObjUsingNew = new Test();
		
		//2
		try {
			Test testObjUsingClass = (Test) Class.forName("Test").newInstance();
		} catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//3
		try {
			Test testObjUsingClone = (Test) testObjUsingNew.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//4
		FileInputStream file;
		ObjectInputStream in;
		try {
			file = new FileInputStream("file");
			in = new ObjectInputStream(file);
			Object testObjUsingDeserialization = in.readObject();
			in.close();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		ArrayList list = new ArrayList<>();

	}

}
