package RobocodeGeneticAlgorithm.ga;

import java.util.ArrayList;

public class Main 
{
	public static void main (String [] args)
	{
		double averageTimeTaken = 0;
		
		for (int j = 0; j < 50; j++)
		{
			long startingTime = System.currentTimeMillis();
			
			for (int i = 0; i < 1000; i++)
			{
				ArrayList <Class <? extends Argument> > possibilities = new ArrayList<>(Argument.allPossibilities);
				
				try 
				{
					for (Class<? extends Argument> poss : possibilities)
					{
						@SuppressWarnings("unused")
						Argument newArg = poss.newInstance();
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
			
			long endingTime = System.currentTimeMillis();
			long timeTaken = endingTime - startingTime;
			
			averageTimeTaken += timeTaken;
		}
		
		averageTimeTaken /= 50;
		System.out.println("Average time taken: " + averageTimeTaken);
	}
}
