/*
 * GumballMachine simulation
 * Writer : Su Tan
 * Date : April 3, 2018
 * Version 1 : https://github.com/paulnguyen/cmpe202/tree/master/gumball/gumball-java-typical
 * Description : Functionalities of GumballMachine
 *               - first 25 cents gumball
 *               - second 50 cents gumball (that also accepts smaller changes (5 or 10 or 25 cents)
 *               - third 25 cents gumball (check for no gumball state)
 */

import java.util.*;
public class Main {

	public static void main(String[] args) {// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		
		GumballMachine gumballMachine = new GumballMachine(2);

		System.out.println("---------------First 25 cents Gumball---------------------");
		
		
		// first gumballMachine for 25 cents
			gumballMachine.insertQuarter( 25 );
			gumballMachine.turnCrank();
			//System.out.println(gumballMachine);
			
				
		//second gumball for 50 cents (5 or 10 or 25 cents)
		
		System.out.println("-----------------Second 50 cents Gumball-----------------------");
		gumballMachine.insertCoins();
		gumballMachine.turnCrank();
			
		// third gumball (gumballmachine only have 2 gumballs)
		System.out.println("------Third 25 cents Gumball (no gumball state)-------");
			gumballMachine.insertQuarter( 25 );
			gumballMachine.turnCrank();

		keyboard.close();
		
		
		
	}

}