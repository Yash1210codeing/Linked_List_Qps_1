package Linked_List_Qps_1;
public class StringBuilder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb2=new StringBuilder();//16
		StringBuilder sb=new StringBuilder("Hello");//16
		StringBuilder sb1=new StringBuilder(0);//16
		System.out.println(sb.capacity());
		sb.append("they");
		sb.append('a');
		System.out.println(sb.capacity());	
		System.out.println(sb.length());
		System.out.println(sb);
		sb.append("hellohelloee");
		System.out.println(sb.length);
		System.out.println(sb);
		sb.append("i");
		System.out.println(sb.capacity()); // new capacity=oldcapacity*2+-2
		System.out.println(sb.reverse());
		System.out.println(sb.delete(1,2));
		String s=sb.toString(); // builder to String
		StringBuilder sb1=new StringBuilder(s); // String to builder
		for(int i=0;i<sb.length();i++) {
			System.out.println(sb.charAt(i));
		}
		System.out.println();
	}
}