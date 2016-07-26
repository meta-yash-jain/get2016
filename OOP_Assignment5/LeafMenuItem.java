package OOP_Assignment5;

public class LeafMenuItem extends Menu{
	// constructor to name menu item calling base class constructor method
	public LeafMenuItem(String name){
		super(name);
	}
	@Override
	public void addMenu(Menu menu){
		// nothing to do
	}
	// to print name of menu selected
	public void action(){
		System.out.println(getName()+" is Selected");
	}
	@Override
	public int getSize() {	
		// nothing to do
		return 0;
	}
	@Override
	public void actionPerformed(int index) {	
		// nothing to do	
	}
	@Override
	public Menu getObject(int index) {	
		// nothing to do
		return null;
	}
}