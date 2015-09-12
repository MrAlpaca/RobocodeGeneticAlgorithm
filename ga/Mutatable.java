package RobocodeGeneticAlgorithm.ga;

public abstract class Mutatable
{
	public boolean containsType ( Class < ? > type )
	{
		return ( type.isInstance(this) );
	}

	public boolean isType ( Class < ? > type )
	{
		return ( type.isInstance(this) );
	}

	public String toString ()
	{
		return "";
	}

	public int complexity ()
	{
		return 1;
	}
}
