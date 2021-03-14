package Com.part02;

public class withmuthoed {
	
	
	public static void main(String[] args) {
	
		int num1=10;
		int num2=-1;
		int num3=0;
		int num4=0;
		checkNumber(num1);
		checkNumber(num2);
		checkNumber(num3);
		checkNumber(num4);
	}
		public static void checkNumber(int num) {
			if(num<0) {
				System.out.println(num+" id greater then 0");
			}else if(num>0) {
				System.out.println(num+" less then 0");
			}else {	
			    System.out.println(num+" is zero");
				}
	}
			
		}

	


