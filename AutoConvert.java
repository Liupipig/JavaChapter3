public class AutoConvert{
	public static void main(String[] args){
		//�Զ�ת��
		int a = 'c';
		double b = 80;
		System.out.println(a);//char����ת��Ϊint
		System.out.println(b);//int����ת��Ϊdouble

		byte b2 = 1;
		short s1 = 2;
		int c = b2 + s1;
		System.out.println(c);
	}
}