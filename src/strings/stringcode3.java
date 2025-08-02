package strings;

public class stringcode3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1= new String("RAMA");
		 String s2= new String("RAMA");
		 String s3= new String("rama");
		 String s4= new String("SITA");
		 System.out.println("case-1 same strings");
		 if(s1.equals(s2)) {
		
			 System.out.println("strings are equal");
		 }
		 else {
			 System.out.println("sting not equal");
		 }
		 if(s1==s2) {
				
			 System.out.println("references are equal");
		 }
		 else {
			 System.out.println("references not equal");
		 }
		 System.out.println("-------------------------------------");
		 System.out.println("case-2 different strings");
		 if(s1.equals(s4)) {
		
			 System.out.println("strings are equal");
		 }
		 else {
			 System.out.println("sting not equal");
		 }
		 if(s1==s4) {
				
			 System.out.println("references are equal");
		 }
		 else {
			 System.out.println("references not equal");
		 }
		 System.out.println("-------------------------------------");
		 System.out.println("case-3 same strings but different case");
		 if(s1.equals(s3)) {
		
			 System.out.println("strings are equal");
		 }
		 else {
			 System.out.println("sting not equal");
		 }
		 if(s1==s3) {
				
			 System.out.println("references are equal");
		 }
		 else {
			 System.out.println("references not equal");
		 }
		 System.out.println("-------------------------------------");
	}

}
