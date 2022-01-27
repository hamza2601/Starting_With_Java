package Chapter9;

public class Square extends  Rectangle{
    //we want to override the perimeter method from the parent class
    //e3xact same signature , change implementation
    @Override  // not necessary, but highly encouraged, especially in case of mistyping
    public double calculatePerimter() //this was protected in parent class, hence we can make it public here
                                      //however, it is worth noting here that we cannot make it priavte,
                                      // i.e. we cannot have weaker access privileges for an overridden function
    {
        return sides * length  ;
        //if we make sides private in rectangle class, we will not be able to inherit it
    }
    public void print(String what)
    {
        System.out.println("I am a " + what);
    }
}
