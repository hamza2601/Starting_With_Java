package Chapter9;

public class Employee extends Person {     //extends is the keyword for inheritance in Java

private String EmployeeID;
private String title;

public Employee()
{
    super("Hamza"); //mow what we did here basically, is that using the argument list  of the second constructor
                          //we insinuate that that's the constructor we wanna call.
                          //Super must be first line in the constructor
    System.out.println("In Employee default constructor");
}

    public String getEmployeeID() {
        return EmployeeID;
    }

    public void setEmployeeID(String employeeID) {
        EmployeeID = employeeID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

