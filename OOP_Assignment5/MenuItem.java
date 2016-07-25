package OOP_Assignment5;

import java.util.ArrayList;
import java.util.List;

public class MenuItem extends Menu{
	private List<Menu> menuList = new ArrayList<Menu>();
	public MenuItem(String name){
		super(name);
	}
	@Override
	public void addMenu(Menu menu){	
		menuList.add(menu);
	}
	public void action(){
		for (Menu menu : menuList) {
			System.out.println(menu.getName());
		}
	}
	public void actionPerformed(int index){	
		(menuList.get(index)).action();
	}	
}