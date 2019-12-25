
import java.util.ArrayList;
import java.util.List;

interface Order
{
	public void execute();
}

class Stock
{
	String name;
	int number;
	public Stock(String name,int number)
	{
		this.name=name;
		this.number=number;
	}
	
	//Buy Stock
	public void buy()
	{
		System.out.println("Bought " + number + "stocks of " + name);
	}
	
	//Sell Stock
	public void sell()
	{
		System.out.println("Sold " + number + "stocks of " + name);
	}
	
}

class BuyStock implements Order
{
	Stock stock;
    public BuyStock(String name,int count)
    {
    	stock=new Stock(name,count);
    }
	@Override
	public void execute() {
		stock.buy();
		
	}
	
}

class SellStock implements Order
{
	Stock stock;
    public SellStock(String name,int count)
    {
    	stock=new Stock(name,count);
    }
	@Override
	public void execute() {
		stock.sell();
		
	}
	
}


class Broker
{
	List<Order> orders=new ArrayList<Order>();
	/**
	 * Place Order
	 * @param order
	 */
	public void placeOrder(Order order) {
		orders.add(order);
	}
	
	public void executeOrder()
	{
		for(Order o:orders)
		{
			o.execute();
		}
	}
}
/**
 * Implement Stock Market Trading using Command Design Pattern 
 * @author ashish
 *
 */
public class StockMarket {

	public static void main(String[] args) {

		BuyStock buy=new BuyStock("Apple",10);
		SellStock sell=new SellStock("Apple",10);
		Broker broker=new Broker();
		broker.placeOrder(buy);
		broker.placeOrder(sell);
		broker.executeOrder();
		
	}

}
