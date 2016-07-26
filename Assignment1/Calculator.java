package Assignment1;

public class Calculator{
	private Buttons[] button;
	private Operator[] operator;
	private Layout layout;
	private Display display;
	public Calculator(){
		//reset the result
	}
	public void setButtons(){
		//set the values of the buttons
		button.setValueOfButton(operator);
	}
	public double calculations(){
		//perform calculations
		operator.getResult(operator.getOperand1,operator.getOperand2,button.getValueOfButton);
	}
	public void printResult(){
		//call the display function
		display.setDisplay(result);
	}
}
