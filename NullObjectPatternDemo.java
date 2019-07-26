package Java12;

/**
 * Null Object Design Pattern Demo
 * @author asharda
 *
 */

/**
 * Abstract Base Class
 * @author asharda
 *
 */
abstract class AbstractConsumer
{
    public String name;
    public abstract String getName();
    public abstract boolean isNil();

}

/**
 * Class with Real Consumers
 * @author asharda
 *
 */
class RealConsumer extends AbstractConsumer{

    public RealConsumer(String name)
    {
        this.name=name;
    }
    @Override
    public String getName() {

        return name;
    }

    @Override
    public boolean isNil() {

        return false;
    }

}

/**
 * Class with Nil Consumers
 * @author asharda
 *
 */
class NilComsumer extends AbstractConsumer
{

    public String name="";

    public NilComsumer(String name)
    {
        this.name=name;
    }
    @Override
    public String getName() {
        return "No available Consumers";
    }

    @Override
    public boolean isNil() {

        return true;
    }

}

class CustomerFactory
{

    public AbstractConsumer getCustomer(String name)
    {
        String names[]= {"Rob","Amy","Jackson"};
        for(String s:names)
        {
            if(s.contains(name))
            {
                return new RealConsumer(name);
            }
        }

        return new NilComsumer(name);
    }
}
public class NullObjectPatternDemo {

    public static void main(String[] args) {

        System.out.println(new  CustomerFactory().getCustomer("Rob1").getName());
        System.out.println(new  CustomerFactory().getCustomer("Rob").getName());
    }

}
