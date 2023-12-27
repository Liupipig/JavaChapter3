
public class Var{
	public static void main(String[] args){
		//声明变量年龄
		int age = 20;
		//声明变量成绩
		double score = 89.9;
		//声明变量性别
		char gender = '男';
		//声明变量姓名
		String name = "King";
		//打印
		System.out.println(age);
		System.out.println(score);
		System.out.println(gender);
		System.out.println(name);

		//加法的运算
		System.out.println("100" + 98);
		System.out.println(100 +3+"hello"  );
		/*  整数类型Byte short
			byte a = 127;
			short a = 32768;
			整数类型int和long
			int a = 1L;
			long a = 1l;
			浮点类型float和double
			float a = 1.1f;
			double a = 1.1F;
		*/
		double a = .1215;
		System.out.println(5.12e2);
		System.out.println(5.12E-2);

		double num9 = 2.1234567851;
		float num10 = 2.1234567851F;
		System.out.println(num9);
		System.out.println(num10);
		//字符类型char 2个字节
		char c1 = '刘';
		char c2 = 97;	
		System.out.println((int)c1);
		System.out.println(c2);//ASCII码
	}
}
