package Chapter6;

public class PhoneBillOOP {
    String ID;
     double baseCost;
    double allottedMinutes;
    double usedMinutes;
    public PhoneBillOOP()
    {
        baseCost=0;
        allottedMinutes=0;
        usedMinutes=0;
        ID = null;
    }
    public PhoneBillOOP(String ID, double b_cost, double a_minutes, double u_min)
    {
        this.baseCost = b_cost;
        this.allottedMinutes = a_minutes;
        this.usedMinutes = u_min;
        this.ID = ID;

    }
    public PhoneBillOOP(String ID)
    {
        this.ID = ID;
        baseCost = allottedMinutes = usedMinutes =0;
    }
    public  double overage()
    {
        if(usedMinutes > allottedMinutes)
        {
            return ((usedMinutes-allottedMinutes)*0.25);
        }
        else
            return 0;
    }
    public double tax()
    {
        return this.baseCost*0.015;
    }

    public double totalCost()
    {
        return this.baseCost + this.overage()+ this.tax();
    }



}
