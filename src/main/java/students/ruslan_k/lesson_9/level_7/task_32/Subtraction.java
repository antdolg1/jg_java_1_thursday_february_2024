package students.ruslan_k.lesson_9.level_7.task_32;

//package teacher.lesson_9.homework.level_7_senior.task_32;

class Subtraction extends TwoArgumentMathOperation {

	public Subtraction(MathOperation leftArgument,
					   MathOperation rightArgument) {
		super(leftArgument, rightArgument);
	}

	@Override
	public double calculate() {
		return calculateLeftSide() - calculateRightSide();
	}
}

