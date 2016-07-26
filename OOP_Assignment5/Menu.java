package OOP_Assignment5;

// abstract class for Menu implementing ActionMenu interface
public abstract class Menu implements ActionMenu{	
	protected String name;	
	public Menu(String name){		
		this.name = name;
	}	
	public String getName(){		
		return name;
	}
	// abstract method to addMenu
	public abstract void addMenu(Menu menu);
	// abstract method to getSize
	public abstract int getSize();
	public abstract void actionPerformed(int index);
	// abstract method to getObject of Menu
	public abstract Menu getObject(int index);
}