package OOP_Assignment5;

import java.io.IOException;
import java.util.Scanner;

public class MainMenu {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		MainMenu mainMenu = new MainMenu();
		MenuItem menuItem = new MenuItem("Main");
		ActionableMenuItem actionableMenuItem = new ActionableMenuItem("Main");
		menuItem = mainMenu.makeMenu("Main", menuItem, actionableMenuItem);
		System.out.println("The main menu is: ");
		menuItem.action();
		System.out.println("Please enter your choice");
		int userInput = scanner.nextInt();
		menuItem.actionPerformed(userInput-1);
	}
	public MenuItem makeMenu(String menuName, MenuItem menuItem, ActionableMenuItem actionableMenuItem){
		char isComposite = '\0';
		int totalChoices = 0;
		System.out.println("Please enter total number of choices in "+menuName +" menu");
		totalChoices = scanner.nextInt();
		for(int i = 0; i < totalChoices; ++i){
			System.out.println("Please enter menu name ");
			menuName = scanner.next();
			System.out.println("Press y or Y if menu is composite or press any key");
			isComposite = (char)scanner.next().charAt(0);
			if(isComposite != 'Y' && isComposite != 'y'){
				actionableMenuItem = new ActionableMenuItem(menuName);
				menuItem.addMenu(actionableMenuItem);
			} else {
				menuItem = new MenuItem(menuName);
				menuItem.addMenu(menuItem);
				makeMenu(menuName,menuItem , actionableMenuItem);
			}
		}
		return menuItem;
	}
}