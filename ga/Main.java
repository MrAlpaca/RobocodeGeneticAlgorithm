package RobocodeGeneticAlgorithm.ga;

import java.util.List;

public class Main 
{
	@SuppressWarnings("unused")
	public static void main (String [] args)
	{
		double averageTimeTaken = 0;
		
		for (int j = 0; j < 10; j++)
		{
			long startingTime = System.currentTimeMillis();
			
			for (int i = 0; i < 1000; i++)
			{
				List <Class <? extends Argument> > possibilities = Argument.getAllPossibilities();
				
				try 
				{
					for (Class<? extends Argument> poss : possibilities)
					{
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
		
		averageTimeTaken /= 10;
		System.out.println("Average time taken: " + averageTimeTaken);
	}
}
