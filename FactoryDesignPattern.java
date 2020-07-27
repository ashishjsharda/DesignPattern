package CompleteReference;

/**
 * Student Interface
 * @author ashis 
 */
interface Student{
    public void getGrade();
}

class John implements Student{

    @Override
    public void getGrade() {
        System.out.println("Grade A");
    }
}

class Rick implements Student{

    @Override
    public void getGrade() {
        System.out.println("Grade B");
    }
}

class Aaron implements Student{

    @Override
    public void getGrade() {
        System.out.println("Grade C");
    }
}

class StudentFactory{
    public static Student getStudent(String name) throws Exception {
        if (name==null)
        {
            throw new Exception("Name cannot be Null");
        }
        else {
            if (name.equalsIgnoreCase("John"))
            {
                return new John();
            }

            if (name.equalsIgnoreCase("Rick"))
            {
                return new Rick();
            }

            if (name.equalsIgnoreCase("Aaron"))
            {
                return new Aaron();
            }
        }
        return null;
    }

}
public class FactoryDesignPattern {
    public static void main(String[] args) throws Exception {
        Student student=StudentFactory.getStudent("John");
        student.getGrade();

    }
}
