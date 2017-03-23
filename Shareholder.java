
public class Shareholder
{
    String name;
    int shares;
    int total_shares;
    
    // Constructor
    Shareholder(String name, int shares, int total_shares)
    {
        this.name = name;
        this.shares = shares;
        this.total_shares = total_shares;
    }
    
    // Get and set methods
    String getName() { return name; }
    void setName(String name) { this.name = name; }
    int getShares() { return shares; }
    void setShares(int shares) { this.shares = shares; }
    void setTotalShares(int total_shares) { this.total_shares = total_shares;}
    
    // Convert the class to output as a string
    public String toString()
    {
        return name + ": " + shares + " shares (" + String.format("%.2f", (100.0*shares)/total_shares) + "%)";
    }
}
