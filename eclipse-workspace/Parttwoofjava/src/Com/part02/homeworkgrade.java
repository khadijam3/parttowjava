package Com.part02;

public class homeworkgrade {
	
			
char printGrade(int num1) {
	
	if(num1<90 ) {
		return 'A';
	}else if(num1>90 &&num1>=80) {
		return 'B';
	}else if(num1>80 &&num1>=70) {
		return 'C';
}else if(num1>70 &&num1>=50) {
	return 'B';
}
	return 'F';
	}
public static void main(String[] args) {
	
	homeworkgrade myObj=new homeworkgrade();
	myObj.printGrade((90));
			
}}
