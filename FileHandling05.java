import java.io.*;
public class FileHandling05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("member.txt");
		
		try {
			if(!file.exists()) {
				System.out.println("���� ����");
				System.exit(0);
			}
			FileReader fr=new FileReader(file);
			int i=0;
			while((i=fr.read())!=-1) {
				System.out.print((char)i);
			}
			fr.close();
			System.out.println("���� �б� ����");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
