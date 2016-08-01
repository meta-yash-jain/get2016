package DS_Assignment2.assignment_1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Operations {
	BufferedReader bufferedReader;
	public Operations(){
		bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	public static void main(String[] args) {
		Operations operations = new Operations();
		String userInput = "";
		try{
			do{
				userInput = operations.getUserInput("Please enter infix notation: ");
				System.out.println("Postfix notation is: " + operations.infixToPostFix(userInput));
				userInput = operations.getUserInput("press Y or y to continue else press any other key to exit");
			}while(userInput.equals("y") || userInput.equals("Y"));
			System.out.println("Program Ends");
		}catch(Exception ex){
			System.out.println("Something went wrong: " + ex.getMessage());
		}finally{
			try{
				operations.bufferedReader.close();
			}catch(Exception ex){
				System.out.println("Something went wrong: " + ex.getMessage());
			}
		}
	}
	public String infixToPostFix(String infixString){
		String postfixString = "";
		Stack<Character> tempStack = new Stack<Character>();
		for(int i = 0; i < infixString.length(); ++i){
			char currentChar = infixString.charAt(i);
			if( (currentChar >= 65 && currentChar <= 90) ||	currentChar >= 97 && currentChar <= 122  ){
				postfixString += currentChar;
			}else if( currentChar >= 48 && currentChar <= 56 ){
				postfixString += currentChar;
			}else if(currentChar == 40){
				tempStack.push(currentChar);
			}else if(currentChar == 41){
				while(tempStack.getTop() != 40){
					postfixString += tempStack.pop();
				}
				tempStack.pop();
			}else{
				if(currentChar == 37 || currentChar == 42 || currentChar == 43 || currentChar == 45 || currentChar == 47 || currentChar == 94){
					boolean operatorFlag = false;
					if(tempStack.isEmpty()){
						tempStack.push(currentChar);
					}else{
						for(int j = tempStack.getSize() - 1; j >= 0; --j){
							char stackChar = tempStack.get(j);
							if(stackChar == 37 || stackChar == 42 || stackChar == 43|| stackChar == 45 || stackChar == 47 || stackChar == 94){
								operatorFlag = true;
								break;
							}else{
								if(stackChar == 40){
									break;
								}
							}
						}
						if(operatorFlag){
							if(precedence(currentChar) > precedence(tempStack.getTop())){
								tempStack.push(currentChar);
							}else{
								postfixString += currentChar ;
								postfixString += tempStack.pop();
							}
						}else{
							tempStack.push(currentChar);
						}
					}
				}
			}
		}
		while(! tempStack.isEmpty()){
			postfixString += tempStack.pop();
		}
		return postfixString;
	}
	public int precedence(char operator){
		switch(operator){
		case '+': case '-':
			return 0;
		case '*':case '/':case '%':
			return 1;
		case '^':
			return 2;
		default:
			throw new IllegalArgumentException("Operator is unknown: "+operator);
		}
	}
	public String getUserInput(String message){
		String userInput = "";
		try{
			System.out.println(message);
			userInput = bufferedReader.readLine();
		}catch(Exception ex){
			System.out.println("Something went wrong: "+ex.getMessage());
			getUserInput(message);
		}
		return userInput;
	}
}