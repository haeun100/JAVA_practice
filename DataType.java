package chap2;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자(정수 int, 실수 double)
		//문자(문자 char, 문자열 String)
		
		int iNum;
		double dNum;
		char cNum;
		String sData;
		
		//데이터를 변수에 넣을 때 =
		iNum=789;
		dNum=89.654;
		cNum='백';
		sData="이화여자대학교";
		
		cNum='\uC774';  //"이"
		char cNum2;
		cNum2='\uD654'; //"화"
		
		char 성별;
		성별='여';
		System.out.println("성별 : "+성별);
		System.out.println("cNum+cNum2 : "+cNum+cNum2);
		//화면 출력
		System.out.println("iNum = "+iNum);
		System.out.println("dNum = "+dNum);
		System.out.println("cNum = "+cNum);
		System.out.println("sData = "+sData);
		
		//정수 int, short, long, byte
		System.out.println("int : "+Integer.BYTES);
		System.out.println("short : "+Short.BYTES);
		System.out.println("long : "+Long.BYTES);
		System.out.println("byte : "+Byte.BYTES);
		
		//실수 float, double
		System.out.println();
		System.out.println("float : "+Float.BYTES);
		System.out.println("double : "+Double.BYTES);
		
		//문자 char
		System.out.println();
		System.out.println("char : "+Character.BYTES);
		
		byte bNum;
		//bNum=128; 범위 밖이라서 에러
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
		System.out.println("이름: "+name1+name2+name3);
	}

}
