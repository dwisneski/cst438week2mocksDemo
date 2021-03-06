package cst438;
/*
 * This class is a multiplication problem.
 * The 2 numbers are generated by the MultiplyService
 * The user can enter an answer.
 * The MultiplyService checks the answer and sets true or false.
 */

public class MultiplyProblem {
	int operand1;
	int operand2;
	int answer;
	boolean correct;
	
	public MultiplyProblem(int op1, int op2) {
		operand1=op1;
		operand2=op2;
	}
	
	public MultiplyProblem(int op1, int op2, int answer) {
		operand1=op1;
		operand2=op2;
		this.answer = answer;
	}
	
	public MultiplyProblem(int op1, int op2, int answer, boolean correct) {
		operand1=op1;
		operand2=op2;
		this.answer = answer;
		this.correct = correct;
	}
	

	@Override
	public String toString() {
		return "MultiplyProblem [operand1=" + operand1 + ", operand2=" + operand2 + ", answer=" + answer + ", correct="
				+ correct + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MultiplyProblem other = (MultiplyProblem) obj;
		if (answer != other.answer)
			return false;
		if (correct != other.correct)
			return false;
		if (operand1 != other.operand1)
			return false;
		if (operand2 != other.operand2)
			return false;
		return true;
	}
	
	


}
