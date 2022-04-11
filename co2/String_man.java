package co2;

public class String_man {
	public static void main(String[] args){
		String str1="oops";
		String str2="Programming Lab";
		System.out.println("String 1="+str1);
		System.out.println("String 2="+str2);
		String str3=str1.concat(str2);
		System.out.println("After concatenation of str1&str2 ="+str3);
	System.out.println("Length of String1 =" +str1.length());
	System.out.println("Length of String2 =" +str2.length());
    System.out.println("Character at First Position =" +str1.charAt(1));
    System.out.println("Index of character 'o' =" +str2.indexOf('o'));
    System.out.println("String Contains 'gram' sequence :"+str2.contains("gram"));
    System.out.println("String ends with s : "+str1.endsWith("s"));
    System.out.println("Replace 'Lab' with 'Exam' : "+str2.replaceAll("Lab","Exam"));
    System.out.println("LOWERCASE : "+str3.toLowerCase());
    System.out.println("UPPERCASE : "+str3.toUpperCase());
   
}
}