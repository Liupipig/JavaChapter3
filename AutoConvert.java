public class AutoConvert{
	public static void main(String[] args){
		//自动转化
		int a = 'c';
		double b = 80;
		System.out.println(a);//char可以转化为int
		System.out.println(b);//int可以转化为double

		byte b2 = 1;
		short s1 = 2;
		int c = b2 + s1;
		System.out.println(c);
	}
}