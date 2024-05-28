package students.ruslan_k.lesson_9.level_7.task_32;

//package teacher.lesson_9.homework.level_7_senior.task_32;
//
class MAthOperationDemo {

	public static void main(String[] args) {

		/*
		Goal to calculate example (10 - 5) * (20 / 5)
		expect value is  20
		*/

		double expectValue = 20.;
        MathOperation arg1 = new Argument(10);
		MathOperation arg2 = new Argument(5);
		MathOperation arg3 = new Argument(20);
		MathOperation subtraction = new Subtraction(arg1, arg2);
		MathOperation divide = new Divide(arg3, arg2);
		MathOperation multiply = new Multiply(subtraction,divide);
		System.out.println("Test MathOperation was " + (expectValue==multiply.calculate()? "Passed" : "Failed"));

		System.out.println("Final Multiply result = " + multiply.calculate());
	}

}
