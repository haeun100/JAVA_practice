import java.io.*;
public class FileHandling02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File file=new File("Ewha_���ڽ�Ʈ��.txt");
		try {
			if(!file.exists()) {
				System.out.println("���� ����");
				System.exit(0);
			}
			
			System.out.println("Ewha_���ڽ�Ʈ��.txt ���Ͽ��� �б⸦ �����մϴ�.");
			FileReader fis=new FileReader(file);
			BufferedReader br=new BufferedReader(fis);
			
			String str;
			while((str=br.readLine())!=null) {
				System.out.println(str);
			}
			fis.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
