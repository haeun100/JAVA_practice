package chap2;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����(���� int, �Ǽ� double)
		//����(���� char, ���ڿ� String)
		
		int iNum;
		double dNum;
		char cNum;
		String sData;
		
		//�����͸� ������ ���� �� =
		iNum=789;
		dNum=89.654;
		cNum='��';
		sData="��ȭ���ڴ��б�";
		
		cNum='\uC774';  //"��"
		char cNum2;
		cNum2='\uD654'; //"ȭ"
		
		char ����;
		����='��';
		System.out.println("���� : "+����);
		System.out.println("cNum+cNum2 : "+cNum+cNum2);
		//ȭ�� ���
		System.out.println("iNum = "+iNum);
		System.out.println("dNum = "+dNum);
		System.out.println("cNum = "+cNum);
		System.out.println("sData = "+sData);
		
		//���� int, short, long, byte
		System.out.println("int : "+Integer.BYTES);
		System.out.println("short : "+Short.BYTES);
		System.out.println("long : "+Long.BYTES);
		System.out.println("byte : "+Byte.BYTES);
		
		//�Ǽ� float, double
		System.out.println();
		System.out.println("float : "+Float.BYTES);
		System.out.println("double : "+Double.BYTES);
		
		//���� char
		System.out.println();
		System.out.println("char : "+Character.BYTES);
		
		byte bNum;
		//bNum=128; ���� ���̶� ����
		bNum=127;
		
		long lNum;
		lNum=128L;
		
		float fData;
		fData=89.76F;
		
		boolean bData;
		//bData=1;
		bData=true;
		bData=false;
		
		System.out.println();
		char name1,name2,name3;
		name1='\uBC31';
		name2='\uD558';
		name3='\uC740';
		System.out.println("�̸�: "+name1+name2+name3);
	}

}
