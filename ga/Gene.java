
package RobocodeGeneticAlgorithm.ga;

import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble;


public class Gene extends Mutatable implements Generatable
{
	public static interface HasArgument
	{
		public Argument getA ();
	}

	public static interface HasTwoArguments extends HasArgument
	{
		public Argument getB ();
	}

	public static interface Compound
	{
		public Gene getGene ();
	}

	public static interface Variable
	{

	}

	public static class GeneAction extends Gene
	{
		public static class ActionNoArguments extends GeneAction
		{
			public static class DoNothing extends ActionNoArguments
			{
				public String toString ()
				{
					return "doNothing();";
				}
			}
			
			public static class Resume extends ActionNoArguments
			{
				public String toString ()
				{
					return "resume();";
				}
			}
			
			public static class Scan extends ActionNoArguments
			{
				public String toString ()
				{
					return "scan();";
				}
			}
			
			public static class Stop extends ActionNoArguments
			{
				public String toString ()
				{
					return "stop();";
				}
			}
			
			public static class Execute extends ActionNoArguments
			{
				public String toString ()
				{
					return "execute();";
				}
			}
			
			public static class setResume extends ActionNoArguments
			{
				public String toString ()
				{
					return "setResume();";
				}
			}
			
			public static class setStop extends ActionNoArguments
			{
				public String toString ()
				{
					return "setStop();";
				}
			}
		}

		public static class ActionWithArgument implements HasArgument
		{
			Argument a;
			
			public static class ActionDouble extends ActionWithArgument
			{
				public static class Ahead extends ActionDouble
				{
					public Ahead ()
					{
						this (null);
					}
					
					public Ahead (ArgumentDouble a)
					{
						if (a == null)
						{
							
						}
						
						this.a = a;
					}
					
					public String toString ()
					{
						return "doNothing();";
					}
				}
			}

			public static class ActionBoolean extends ActionWithArgument
			{

			}

			public Argument getA ()
			{
				return a;
			}
		}
	}

	public static class GeneFlowControl extends Gene implements Compound
	{
		
		public Gene getGene ()
		{
			return null;
		}

	}

	public static class GeneVariable extends Gene implements Variable
	{

	}
}
