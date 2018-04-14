import java.util.Scanner;

/*
 * GumballMachine simulation
 * Writer : Su Tan
 * Date : April 3, 2018
 * Version 1 : https://github.com/paulnguyen/cmpe202/tree/master/gumball/gumball-java-typical
 * Description : Functionalities of GumballMachine
 *               - insertQuarter function for 25 cents gumball
 *               - insertCoins function for 50 cents and smaller change (5 or 10 or 25)
 *               - turnCrank function for ejecting gumball
 */
public class GumballMachine {
	private int num_gumballs;
    private boolean has_quarter;
    
  //  private int money = 0; //for nickel, dime, and quarter
   // private int total =0;
    
    Scanner keyboard = new Scanner(System.in);
    
    public GumballMachine( int size )
    {
        // initialize instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin)
    {
    	System.out.println(coin);
        if ( coin == 50) 
            this.has_quarter = true ;
        
        else if  (coin == 25)
        	this.has_quarter = true;
        else 
        {	
     	     this.has_quarter = false ;
        }    
     	      
    }
    
    public void insertCoins()
    {
    	int total = 0; 
    	int money = 0;
    	boolean flag = true;
		
		while ( total < 50)
		{
			System.out.println("Insert coins (5 or 10 or 25) cents"); 
			money = keyboard.nextInt();
			if((money == 5) || (money == 10) || (money == 25))
			{
				total += money;
				
			}
			else
				System.out.println("Coins should be 5 or 10 or 25 cents|");
		}	
			
			
		System.out.println("Here is the total : " + total + " cent(s)");
	
		
		
		// greater than or equal 50 cents
		if (total >= 50)
		{
				total = total - 50;
				System.out.println("Here is your change " + total + " cent(s)");
				this.has_quarter =true;
		}
			
		else
			this.has_quarter = false;
				
	}	
			
	
    
 
    public void turnCrank()
    {
    	if ( this.has_quarter)
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks. Gumball Ejected!" ) ;
    			
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    		}
    	}
    	else 
    	{
    		System.out.println( "Please insert a quarter" ) ;
    	}        
    }
}
