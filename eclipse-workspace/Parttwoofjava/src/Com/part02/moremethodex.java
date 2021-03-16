package Com.part02;

public class moremethodex {
	
	
	/*create a method that dosen't take any values and 
	 * and always return string Hi.
	 */
	
 String printthe() {
 return "hi";
	}
/*
 *  create  a method to that takes a number and returns the double of that number 
 */
	double  doubletheValue(double input) {
	return input *2;
	}

/*  Create method that will tack boolean as input
 *  if the value is true i ant say take the umbrella 
 *  and if the value is false  print please for a walk
 */

void  isRraining(boolean isRain) {
	if (isRain) {
		System.out.println("Please take the Umberalla");
	}else{
		System.out.println("please go for walk");
	}
}
	 /*
	  *  create a method to print batch 9 is great 5times
	  */
	  void print5Times() {
		  for(int i=0; i<5; i++) {
	  
		 System.out.println("Batch 9 is great");
		  }
	 /*
	  * 
	  */
}
		  double retrunGreater(double num1, double num2) {
		  if(num1>num2) {
			  return num1;		 
		  
		  }else{
			  return num2;
			 
		  }}
		  /* create  the method  that return  number is even and number odd
		   */
		  
		  void printEvenOdd(int num) {
				if(num%2==0) {
					System.out.println("Number "+num+" is Even");
				}else {
					System.out.println("Number "+num+" is Odd");
				}
				}
				
				double returnthearrySum(double []arr) {
					double sum=0;
					for (double  elements :arr) {
						sum=sum+elements;
				}
				return sum;
				}
	
		  /*
		   * create mothod that returns true if a string is a mirror or it self other wise it 
		   * aba yes bbb yes bba no
		   * 
		   */
				boolean isMirror(String str) {
					String  newStr="";
					for (int i =str.length()-1;i>=0; i--) {
						System.out.println(i+""+str.charAt(i));
						newStr+=str.charAt(i);
					}
					return true;
					}
				}
	
















