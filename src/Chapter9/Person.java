package Chapter9;

public class Person {

    public Person ()
    {
        System.out.println("In person default constructor");
    }
    public Person(String Name)
    {
        setName(Name);
        System.out.println("In 2nd constructor. Name is set");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    private String name;
    private int age;
    private String gender;


}
