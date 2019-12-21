
/**
 * Car Interface
 * @author ashish
 *
 */
interface Car
{
	public void drive();
}

/**
 * Toyota Car
 * @author ashish
 *
 */
class Toyota implements Car{

	public void drive() {
		System.out.println("I am in Toyota");
	}

}
/**
 * Audi Car
 * @author ashish
 *
 */

class Audi implements Car{

	public void drive() {
		System.out.println("I am in Audi");
	}

}

/**
 * Tesla Car
 * @author ashish
 *
 */

class Tesla implements Car{

	public void drive() {
		System.out.println("I am in Tesla");
	}

}

/**
 * Car Factory 
 * @author ashish
 *
 */

class CarFactory {

	public Car getCar(String type)
	{
		if(type.equalsIgnoreCase("Toyota"))
		{
			return new Toyota();
		}
		else if(type.equalsIgnoreCase("Tesla"))
		{
			return new Tesla();
		}
		else if(type.equalsIgnoreCase("Audi"))
		{
			return new Audi();
		}

		return null;
	}
}
public class FactoryPattern {

	public static void main(String[] args) {

		CarFactory factory=new CarFactory();
		Car car=factory.getCar("Tesla");
		car.drive();
		factory.getCar("Toyota").drive();
		factory.getCar("Audi").drive();


	}

}
