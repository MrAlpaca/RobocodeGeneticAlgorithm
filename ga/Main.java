package ga;

import java.util.ArrayList;

import ga.Argument.RunTimeValue;

public class Main 
{
	public static void main (String [] args)
	{
		System.out.println(0 % 5);
		
		ArrayList <Class <? extends Argument> > possibilities = new ArrayList<>();
		possibilities.addAll(Argument.allPossibilities);
		
		try 
		{
			for (Class<? extends Argument> poss : possibilities)
			{
				System.out.println("Current poss is " + poss.getSimpleName());
				Argument newArg = poss.newInstance();
				System.out.println("Argument is: " + newArg);
				System.out.println("Argument get: " + newArg.get());
				System.out.println("Argument contains RunTimeValue: " + newArg.containsArgumentType(RunTimeValue.class));
			}
		}
		
		catch (InstantiationException e) 
		{
			e.printStackTrace();
		} catch (IllegalAccessException e) 
		{
			e.printStackTrace();
		}
	}
}
