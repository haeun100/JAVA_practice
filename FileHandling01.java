import java.io.*;
public class FileHandling01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("Ewha_����Ʈ��Ʈ��.txt");
		try {
			if(!file.exists()) {
				System.out.println("���� ����");
				System.exit(0);
			}
			
			FileInputStream fis=new FileInputStream(file);
			System.out.println("Ewha_����Ʈ��Ʈ��.txt ���Ͽ��� �б⸦ �����մϴ�.");
			int i=0;
			while((i=fis.read())!=-1) {
				System.out.print((char)i);
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
