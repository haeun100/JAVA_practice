import java.io.File;
public class FileHandling01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File finfo=new File("src\\Example01.java");
		
		if(finfo.exists()) {
			System.out.println("������ �̸�: "+finfo.getName());
			System.out.println("������ ���: "+finfo.getAbsolutePath());
			System.out.println("���� ���Ⱑ �����Ѱ�?: "+finfo.canWrite());
			System.out.println("���� �бⰡ �����Ѱ�?: "+finfo.canRead());
			System.out.println("������ ũ��: "+finfo.length());
		}
		else {
			System.out.println("�����ϴ� ������ �ƴմϴ�.");
		}

	}

}
