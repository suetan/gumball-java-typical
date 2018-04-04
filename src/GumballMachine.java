
/*
 * GumballMachine simulation
 * Writer : Su Tan
 * Date : April 3, 2018
 * Version 1 : https://github.com/paulnguyen/cmpe202/tree/master/gumball/gumball-java-typical
 * Description : Functionalities of GumballMachine
 *               - insertQuarter
 *               - turnCrank
 */
public class GumballMachine {
	private int num_gumballs;
    private boolean has_quarter;

    public GumballMachine( int size )
    {
        // initialize instance variables
        this.num_gumballs = size;
        this.has_quarter = false;
    }

    public void insertQuarter(int coin)
    {
        if ( coin == 25 )
            this.has_quarter = true ;
        else 
            this.has_quarter = false ;
    }
    
    public void turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    			//
    			//System.out.println("Gumball_count = "+ this.num_gumballs);
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
