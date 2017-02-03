package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class test
{
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{	
		String animalnameAndActhion1="cat_sleep";
		String animalnameAndActhion2="dog_WatchTheDoor";
		animalaction(animalnameAndActhion1);
		animalaction(animalnameAndActhion2);
	}
	public static void animalaction(String animalnameAndActhion) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		String[] arg=new String[2];
		arg=animalnameAndActhion.split("_");
		//loadClass
		Class Clazz=getClass(arg[0]);
		suckler secretSuckler=(suckler) Clazz.newInstance();
		try {
			Method method =secretSuckler.getClass().getMethod(arg[1], null);
			method.invoke(secretSuckler);
		} catch (NoSuchMethodException | SecurityException e) {
			System.out.println(arg[1]+"方法加载错误");
			e.printStackTrace();
		}
		
	}
	
	private static Class getClass(String Classname) {
		ClassLoader cl=ClassLoader.getSystemClassLoader();
		Class Clazz = null;
		try {
			Clazz = cl.loadClass("test."+Classname);
		} catch (ClassNotFoundException e) {
			System.out.println(Classname+"类加载错误");
			e.printStackTrace();
		}
		return Clazz;
	}
	
}
