package qa.com.calc;

public class OperatorsExams {

	public static int physics;
	public static int chemistry;
	public static int biology;
	public static int total;
	public static double percentage;
	
	public static void main(String[] args) {
		method1(145, 128, 132);
		method2();
	}
	public static void method1(int physicsGrade, int chemistryGrade, int biologyGrade) {
	    physics = physicsGrade;
	    chemistry = chemistryGrade;
	    biology = biologyGrade;
	    total = physics + chemistry + biology;
	    System.out.println("Your physics grade is: " + physics);
	    System.out.println("Your chemistry grade is: " + chemistry);
	    System.out.println("Your biology grade is: " + biology);
	    System.out.println("Your total grade is: " + total);
	}
   
    public static void method2() {
    	percentage = (total * 100) / 450;
    	System.out.println("Your percentage is: " + percentage +"%");
     }
}
