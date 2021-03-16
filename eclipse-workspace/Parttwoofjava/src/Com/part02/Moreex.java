package Com.part02;

public class Moreex {

	public static void main(String[] args) {
		
		moremethodex obj1=new  moremethodex();
		System.out.println(obj1.printthe());
		System.out.println(obj1.doubletheValue(10));
		obj1.isRraining(true);
		//System.out.println(obj1.isRaining(true));
		obj1.print5Times();
		System.out.println(obj1.retrunGreater(122,56)); 
		obj1.printEvenOdd(5);
		double [] arr= {12,30,40};
		obj1.returnthearrySum(arr);
		System.out.println(obj1.returnthearrySum(arr)); 
		obj1.isMirror("aba ");
		obj1.isMirror("abadef ");
		System.out.println(obj1.isMirror("aba"));
		System.out.println(obj1.isMirror("abadef"));
	}

}
