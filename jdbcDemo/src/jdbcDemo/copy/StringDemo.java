package jdbcDemo.copy;

public class StringDemo {
	public static void main(String args[]) {
		String s1="saikiran";
		String s2=new String("saikiran");
		String s3=s1;
		String s4="saikiran";
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s2==s3);
	}

}
