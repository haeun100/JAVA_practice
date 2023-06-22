
public class Ch05 {
	public static void calculate(char op,int x,int y) {
		if(op=='+')
			System.out.println(x+""+op+""+y+"="+(x+y));
		else if(op=='-')
			System.out.println(x+""+op+""+y+"="+(x-y));
		else if(op=='*')
			System.out.println(x+""+op+""+y+"="+(x*y));
		else
			System.out.println(x+""+op+""+y+"="+(x/y));
	}
	public static void calculate(char op,int x,double y) {
		if(op=='+')
			System.out.println(x+""+op+""+y+"="+(x+y));
		else if(op=='-')
			System.out.println(x+""+op+""+y+"="+(x-y));
		else if(op=='*')
			System.out.println(x+""+op+""+y+"="+(x*y));
		else
			System.out.println(x+""+op+""+y+"="+(x/y));
	}
	public static void calculate(char op,int x) {
		if(op=='+')
			System.out.println(x+""+op+""+x+"="+(x+x));
		else if(op=='-')
			System.out.println(x+""+op+""+x+"="+(x-x));
		else if(op=='*')
			System.out.println(x+""+op+""+x+"="+(x*x));
		else
			System.out.println(x+""+op+""+x+"="+(x/x));
	}
	public static void calculate(char op,double x) {
		if(op=='+')
			System.out.println(x+""+op+""+x+"="+(x+x));
		else if(op=='-')
			System.out.println(x+""+op+""+x+"="+(x-x));
		else if(op=='*')
			System.out.println(x+""+op+""+x+"="+(x*x));
		else
			System.out.println(x+""+op+""+x+"="+(x/x));
	}


	
	public static void sum(int x,int y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
	public static void sum(double x,double y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}
	public static void sum(int x,int y,double z) {
		System.out.println(x+"+"+y+"+"+"="+(x+y+z));
	}
	public static void sum(double x,int y,double z) {
		System.out.println(x+"+"+y+"+"+"="+(x+y+z));
	}
	public static void sum(String x,String y) {
		System.out.println(x+"+"+y+"="+(x+y));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calculate('+',2,3);
		calculate('*',2,3.14);
		calculate('-',2);
		calculate('/',2.5);
		
		sum(10,20);
		sum(10.5,20.5);
		sum(10,50,4.5);
		sum(5.6,10,3.7);
		sum("Ewha","Java");
		
	}

}

