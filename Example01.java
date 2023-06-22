import java.io.*;
public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File fileObj=new File("example01.txt");
		try {
			boolean success=fileObj.createNewFile();
			if(success) {
				System.out.println("颇老 积己 己傍");
			}
			else {
				System.out.println("颇老 积己 角菩");
			}
		}catch(IOException e) {
			System.out.println(e);
		}
		
	}

}
