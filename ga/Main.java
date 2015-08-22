package RobocodeGeneticAlgorithm.ga;

import java.util.LinkedList;

import RobocodeGeneticAlgorithm.ga.Argument.EventInfo;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Bearing;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Distance;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Energy;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Heading;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Name;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Velocity;

public class Main 
{
	public static void main (String [] args)
	{
		for (int i = 0; i < 100; i++)
		{
			System.out.println("i = " + i);
			Argument arg;
			
			LinkedList <Class <?>> hasToBe = new LinkedList<>();
			LinkedList <Class <?>> cannotBe = new LinkedList<>();
			
			cannotBe.add(Bearing.class);
			cannotBe.add(Energy.class);
			cannotBe.add(Name.class);
			cannotBe.add(Heading.class);
			cannotBe.add(Velocity.class);
			cannotBe.add(Distance.class);
			
			arg = Argument.generate(hasToBe, cannotBe);
			
			System.out.println("Argument is: " + arg);
			for (Class <?> type : cannotBe) System.out.println("Argument contains event info " + arg.containsArgumentType(type));
		}
	}
}
