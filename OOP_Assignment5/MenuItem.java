package OOP_Assignment5;

import java.util.ArrayList;
import java.util.List;

public class MenuItem extends Menu{
	private List<Menu> menuList = new ArrayList<Menu>();	
	// constructor to set menu name in super class
	public MenuItem(String name){		
		super(name);
	}
	// adding menu in menuList 
	@Override
	public void addMenu(Menu menu){	
		menuList.add(menu);
	}
	// to return object of current menuItem
	@Override
	public Menu getObject(int index){	
		return (menuList.get(index));
	}
	// method to print whole menu list
	public void action(){
		for (Menu menu : menuList) {
			int i = 1;
			System.out.println(i + ": " + menu.getName());
			i++;
		}
	}
	// to get size of menu list
	@Override
	public int getSize(){	
		return menuList.size();
	}
	// calling action method to print list
	@Override
	public void actionPerformed(int index){	
		(menuList.get(index)).action();
	}
}