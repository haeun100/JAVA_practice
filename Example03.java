import java.io.File;
import java.io.FileWriter;
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("example03.txt");
		
		try {
			if(!file.exists())
				file.createNewFile();
			
			FileWriter fw=new FileWriter(file);
			fw.write("Hello!!\n");
			fw.write("Java Programming\n");
			fw.close();
			System.out.println("���� ���� ����");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
