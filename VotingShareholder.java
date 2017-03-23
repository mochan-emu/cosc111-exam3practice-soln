
public class VotingShareholder extends Shareholder 
{
	// Number of votes the shareholder has
	int votes;
	
	VotingShareholder(String name, int shares, int total_shares, int votes)
	{
		super(name, shares, total_shares);
		this.votes = votes;
	}
	
    // Convert the class to output as a string
    @Override
    public String toString()
    {
        return super.toString() + " " + votes + " votes.";
    }	
}
