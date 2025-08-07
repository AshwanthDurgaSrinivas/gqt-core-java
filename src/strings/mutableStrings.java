package strings;

public class mutableStrings {
public static void main(String[] args) {
	//stringbuilder
	StringBuilder sb1 = new StringBuilder("Ramayana. ");
	StringBuilder sb2 = new StringBuilder("is the best mythological Story ");
	sb1.append(sb2);
	System.out.println(sb1);
	sb1.codePointBefore(3);
	System.out.println(sb1.codePointBefore(2));
	System.out.println(sb1.repeat(sb2, 3));
	System.out.println(sb1.charAt(3));
	System.out.println(sb1.compareTo(sb2));
	System.out.println(sb1.indexOf("S"));
	System.out.println(sb1.isEmpty());
	System.out.println(sb1.length());
	System.out.println(sb1.deleteCharAt(3));
	System.out.println(sb1.insert(3, '@'));
	System.out.println(sb1.replace(3, 10, "%"));
	//stringBuffer
	StringBuffer sb3 = new StringBuffer("Mahabharath. ");
	StringBuffer sb4 = new StringBuffer("is the best mythological History ");
	sb3.append(sb4);
	System.out.println(sb3);
}
}
