package ch02;

public class CastingTest {
	public static void main(String[] args){
		int i=12356;
		byte b=(byte)i;		//采用截取的方式转换，这是由二进制表示方法决定的
		System.out.println("强制转换后byte型变量b的值为："+b);
		double d=12.8456;
		i=(int)d;
		System.out.println("强制转换后int型变量i的值为："+i);
	}
}
