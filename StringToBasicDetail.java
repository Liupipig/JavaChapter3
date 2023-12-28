public class StringToBasicDetail{
	public static void main(String[] args){
		int n1 = 100;
		float f1 = 1.1F;
		double d1 = 4.5;
		boolean b1 = true;
		String s1 = n1 + "";
		String s2 = f1 + "";
		String s3 = d1 + "";
		String s4 = b1 + "";
		System.out.println(n1 + "" + f1 + "" +d1 + "" + b1 + "");		
		String s5 = "123";
		int num1 = Integer.parseInt(s5);
		double num2 = Double.parseDouble(s5);
		System.out.println(num1);
		System.out.println(num2);
	}
}