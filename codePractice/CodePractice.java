package codePractice;


public class CodePractice {
	
	public static boolean palindrome(String str) {
		 String rev = "";
		 boolean ans = false;
		 
		 for (int i = str.length() -1; i>=0 ;i-- ) {
			 rev= rev +str.charAt(i);
		 }
		 if (str.equals(rev)) {
			 ans = true;
			 
		 }
		 return ans;
		
	}
	
	
	
	public static String testing(String test){
		
       test = test.replaceAll("[^b]", "");
	   if( test.equals("")){
		
       return "1";}
	   
//	   int count =0;
//	char bb = 'b' ;
//	for (int i=1; i<test.length(); i++) {
////    			test = test.replaceAll("[^b]", "");
//		char ch = test.charAt(i);
//		if (ch==bb) {
//			count++;
//    			}
//    			
//    		}
//	System.out.println( "bb"+count);
//	   String f = test.length
	return test;
   }
	public static void testingcount(String test, String str) {
	int count=0;
	char bb = 'b' ;
	for (int i=1; i<test.length(); i++) {
//		test = test.replaceAll("[^b]", "");
		char ch = test.charAt(i);
		if (ch==bb) {
			count++;
		}
		
	}
	System.out.println(bb+":"+count);
	}
//   

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = "tesT";
//		str = str.toLowerCase();
//		boolean a = palindrome(str);
//		System.out.println(a);
		
		
//	 Triangle 
		int r = 6;
//		
//		for (int i=0; i<=r; i++) {
//			for (int j = 0; j<=i;j++) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
//		
//// up side down triangele
//		for (int i=0; i<=r; i++) {
//			for (int j = r; j>=i;j--) {
//				System.out.print("* ");
//			}
//			System.out.println("");
//		}
		
		for (int i=1; i<=r; i++) {
			for (int j = 5; j>=i;j--) {
				System.out.print(" ");
			}
			for (int k=1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println("");
	}
		int alpha = 65;
		for (int i=1; i<=r; i++) {
			for (int j = 0; j<=i;j++) {
				System.out.print((char)(alpha+j)+"");
			}
			System.out.println("");
		}
		
//		if(System.out.print.append == null)
		
		
		 String test = "aabbccaabbccaabbcc";
	       String  str ="aa";		
	      
	       
	   
	    
	        // System.out.println("Hello, World!");
	       String k = testing(test);
	       
	       System.out.println(testing(test)+":"+k.length());
	       testingcount(test,str);
		
		
		
		
		
		
		
		
		
		
		
	}
}
