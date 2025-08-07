package strings;

public class BuidInMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="hi this is srinivas";
		
		//length()
		int len=str.length();
		System.out.println("length of str:"+len);
		
		//charat()
		char s= str.charAt(0);
		System.out.println("char at 0 position:"+s);
		
		//concat()
		String str1=str.concat("hello");
		System.out.println(str1);
		
		//contains() 
		boolean b=str.contains("hi");
		System.out.println(b);
		b=str.contains("hii");
		System.out.println(b);
		
		//endsWith()
		boolean e= str.endsWith("srinivas");
		System.out.println(e);
	
		e= str.endsWith("srinu");
		System.out.println(e);
		
		//startWith()
		boolean s1= str.startsWith("hi");
		System.out.println(s1);
		s1= str.startsWith("srinivas");
		System.out.println(s1);
		
		
		//getClass()
		Class cl= str.getClass();
		System.out.println(cl);
		
		
		//hashcode()
		int hash= str.hashCode();
		System.out.println(hash);
		
		
		//indexOf()
		int i =str.indexOf('a');
		System.out.println(i);
		
		
		//isBlank()
		boolean b1 =str.isBlank();
		System.out.println(b1);
		String str2 = "                 ";
		b1 =str2.isBlank();
		System.out.println(b1);
		String str3="";
		b1 =str3.isBlank();
		System.out.println(b1);
		
		//isEmpty()
		boolean e1 =str.isEmpty();
		System.out.println(e1);
		e1 =str2.isEmpty();
		System.out.println(e1);
		e1 =str3.isEmpty();
		System.out.println(e1);
		
		
		//lastIndexOf()
		int last=str.lastIndexOf('s');
		System.out.println(last);
		
		
		//replace()
		String rep=str.replace('s','$');
		System.out.println(rep);
		
		//substring(int start)
		String sub1=str.substring(4);
		System.out.println(sub1);
		
		//substring(int start,int end)
		String sub2=str.substring(4,8);
		System.out.println(sub2);
		
		//toupperCase()
		String up=str.toUpperCase();
		System.out.println(up);
		
		//toLowerCase()
		String lo=str.toLowerCase();
		System.out.println(lo);
		
		}

}
