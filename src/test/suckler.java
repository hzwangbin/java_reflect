package test;

public class suckler implements animal{

	@Override
	public void sleep() {
		System.out.println("the "+this.getClass().getSimpleName()+" is sleeping");
		
	}

	@Override
	public void eat() {
		System.out.println("the "+this.getClass().getSimpleName()+" is eating");
		
	}

	@Override
	public void action() {
		System.out.println("the "+this.getClass().getSimpleName()+" is moving");
		
	}



}
