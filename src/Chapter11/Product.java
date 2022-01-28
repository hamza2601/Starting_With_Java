package Chapter11;

public interface Product {
    double getPrice();
    void setPrice(double price);

    String getName();
    void setName(String name);
    String getColour();
    void setColour(String colour);
    // serves merely as a template
    //we only provide methods
    default String barCode()
    {
        return "barcode does not exist"; // by setting it to default, there's no issue even if the child class didn't declare it
    }
    //all mothods are public by default
    //single class can implement multiple interfaces
}
