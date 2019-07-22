
class Singleton{
	
	public static Singleton instance=new Singleton();
	private  Singleton()
	{
		
	}
	
	public static Singleton getInstance()
	{
		return instance;
	}
	
	public void showMessage()
	{
		System.out.println("Hello Singleton");
	}
}
/**
 * Singleton Design Pattern
 * @author asharda
 *
 */
public class SingletonDemo {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Singleton s=Singleton.getInstance();
		s.showMessage();

	}

}
