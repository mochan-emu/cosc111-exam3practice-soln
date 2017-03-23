

public class Exam3ReviewApp
{
    public static void main(String[] args)
    {
        // Shareholder names and shares
        String[] shareholder_names = {"Adam", "Beth", "Chris", "Don", "Elliot", "Frank", "George"};
        int[] shares = { 1000, 2500, 500, 2000, 800, 250, 400 };
        
        // Total shares in the company
        int total_shares = 0;
        for (int i=0; i<shares.length; i++)
        {
        	total_shares += shares[i];
        }
        System.out.println("The total shares in the company is " + total_shares + ".");
        
        // An array of shareholder classes
        Shareholder[] shareholders;
        shareholders = new Shareholder[shareholder_names.length];
        for (int i=0; i<shareholders.length; i++)
        {
        	shareholders[i] = new Shareholder(shareholder_names[i], shares[i], total_shares);
        }
        
        // Print out the shareholder array
        for (int i=0; i<shareholders.length; i++)
        {
        	System.out.println(shareholders[i].toString());
        }
        System.out.println("");
        
        // Flag for if they are special or not
        int[] votes = {10, 25, 0, 0, 0, 0, 4};
        
        // Create an array of voting shareholders and print them out
        for (int i=0; i<shareholders.length; i++)
        {
        	shareholders[i] = new VotingShareholder(shareholder_names[i], shares[i], total_shares, votes[i]);
        	System.out.println(shareholders[i].toString());
        }
    }
}
