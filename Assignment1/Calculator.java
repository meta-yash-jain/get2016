package Assignment1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener{
	private Buttons[] button;
	private Operator[] operator;
	private Layout layout;
	private Display display;
	
	public Calculator(){
		//constructor
	}
	public Calculator(int digit, int operator) {
		//initialize all the objects
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//logic for action when the buttons are clicked
	}
	public Buttons[] getButton() {
		//sending the reference for buttons 
		return button;
	}
}