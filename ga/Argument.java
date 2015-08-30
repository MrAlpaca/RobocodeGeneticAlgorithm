package RobocodeGeneticAlgorithm.ga;

import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.BinaryBoolean.And;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.BinaryBoolean.Or;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.BinaryBoolean.Greater;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.BinaryBoolean.GreaterEquals;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.BinaryBoolean.Equals;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.Not;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanConstant.False;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanConstant.True;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanEventInfo.EventInfoIsMyFault;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanEventInfo.EventInfoIsSentryRobot;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanRandom;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanVariable;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanRobotInfo.RobotInfoAdjustGunForRobotTurn;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanRobotInfo.RobotInfoAdjustRadarForGunTurn;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanRobotInfo.RobotInfoAdjustRadarForRobotTurn;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.BinaryDouble.Division;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.BinaryDouble.Hypotenuse;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.BinaryDouble.Maximum;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.BinaryDouble.Minimum;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.BinaryDouble.Power;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.UnaryDouble.Cosine;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.UnaryDouble.CubeRoot;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.UnaryDouble.Exponent;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.UnaryDouble.Logarithm;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.UnaryDouble.Sine;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.UnaryDouble.SquareRoot;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.UnaryDouble.Tangent;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleConstant;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleConstant.E;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleConstant.PI;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleConstant.SQRT2;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoBearing;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoBullet.BulletHeading;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoBullet.BulletPower;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoBullet.BulletVelocity;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoBullet.BulletX;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoBullet.BulletY;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoDistance;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoEnergy;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoHeading;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoHitBullet.HitBulletHeading;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoHitBullet.HitBulletPower;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoHitBullet.HitBulletVelocity;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoHitBullet.HitBulletX;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoHitBullet.HitBulletY;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoPower;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleEventInfo.EventInfoVelocity;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRandom.DoubleRandomBound;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRandom.DoubleRandomNoArguments;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRandom.DoubleRandomOriginBound;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoBattleFieldHeight;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoBattleFieldWidth;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoDistanceRemaining;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoEnergy;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoGunCoolingRate;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoGunHeading;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoGunHeat;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoGunTurnRemaining;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoHeading;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoHeight;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoRadarHeading;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoRadarTurnRemaining;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoTurnRemaining;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoX;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleRobotInfo.RobotInfoY;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleVariable;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerCompound;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerCompound.BinaryInteger.Modulu;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerConstant;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerConstant.NegativeOne;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerConstant.One;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerConstant.OneHundred;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerConstant.Ten;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerConstant.ThreeHundredAndSixty;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerConstant.Two;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerConstant.Zero;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerRandom.IntegerRandomRange;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerRandom.IntegerRandomNoArguments;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerRandom.IntegerRandomOriginRange;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerRobotInfo.RobotInfoNumRounds;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerRobotInfo.RobotInfoNumSentries;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerRobotInfo.RobotInfoOthers;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerRobotInfo.RobotInfoRoundNum;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerRobotInfo.RobotInfoTime;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerVariable;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.ArgumentStringEventInfo.BulletName;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.ArgumentStringEventInfo.EventInfoName;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.ArgumentStringEventInfo.HitBulletName;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.RobotInfoName;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.ArgumentStringVariable;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.Null;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Bearing;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Bullet;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Distance;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Energy;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Heading;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.HitBullet;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.IsMyFault;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.IsSentryRobot;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Name;
import RobocodeGeneticAlgorithm.ga.Argument.EventInfo.Velocity;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Argument implements Generatable
{
	protected Object value = "";
	
	public boolean containsArgumentType (Class<?> type)
	{
		return (type.isInstance(this));
	}
	
	public boolean isArgumentType (Class<?> type)
	{
		return (type.isInstance(this));
	}
	
	public String toString ()
	{
		return value.toString();
	}
	
	public int complexity ()
	{
		return 1;
	}
	
	
	
	private static Generator <Argument> generator;
	private static java.util.Random rnd = new java.util.Random();
	
	static
	{
		generator = new Generator<>();
		
		/*
		 * Boolean Arguments
		 */
		{
			/*
			 * Event Info
			 */
			{
				generator.add(EventInfoIsMyFault.class);
				generator.add(EventInfoIsSentryRobot.class);
			}
			
			/*
			 * Robot Info
			 */
			{
				generator.add(RobotInfoAdjustGunForRobotTurn.class);
				generator.add(RobotInfoAdjustRadarForGunTurn.class);
				generator.add(RobotInfoAdjustRadarForRobotTurn.class);
			}
			
			/*
			 * Constants
			 */
			{
				generator.add(True.class);
				generator.add(False.class);
			}
			
			/*
			 * Random
			 */
			{
				generator.add(ArgumentBooleanRandom.class);
			}
			
			/*
			 * Compound
			 */
			{
				generator.add(And.class);
				generator.add(Or.class);
				generator.add(Equals.class);
				generator.add(Greater.class);
				generator.add(GreaterEquals.class);
				generator.add(Not.class);
			}
			
			/*
			 * Variable
			 */
			{
				generator.add(ArgumentBooleanVariable.class);
			}
		}
		
		
		
		/*
		 * Integer Arguments
		 */
		{
			/*
			 * Robot Info
			 */
			{
				generator.add(RobotInfoNumRounds.class);
				generator.add(RobotInfoNumSentries.class);
				generator.add(RobotInfoOthers.class);
				generator.add(RobotInfoRoundNum.class);
				generator.add(RobotInfoTime.class);
			}
			
			/*
			 * Constants
			 */
			{
				generator.add(One.class);
				generator.add(Zero.class);
				generator.add(NegativeOne.class);
				generator.add(Two.class);
				generator.add(Ten.class);
				generator.add(OneHundred.class);
				generator.add(ThreeHundredAndSixty.class);
				generator.add(ArgumentIntegerConstant.RandomConstant.class);
			}
			
			/*
			 * Random
			 */
			{
				generator.add(IntegerRandomNoArguments.class);
				generator.add(IntegerRandomRange.class);
				generator.add(IntegerRandomOriginRange.class);
			}
			
			/*
			 * Compound
			 */
			{
				generator.add(ArgumentIntegerCompound.BinaryInteger.Addition.class);
				generator.add(ArgumentIntegerCompound.BinaryInteger.Subtraction.class);
				generator.add(ArgumentIntegerCompound.BinaryInteger.Multiplication.class);
				generator.add(Modulu.class);
				
				generator.add(ArgumentIntegerCompound.Absolute.class);
			}
			
			/*
			 * Variable
			 */
			{
				generator.add(ArgumentIntegerVariable.class);
			}
		}
		


		/*
		 * Double Arguments
		 */
		{
			/*
			 * Event Info
			 */
			{
				generator.add(EventInfoPower.class);
				generator.add(EventInfoEnergy.class);
				generator.add(EventInfoBearing.class);
				generator.add(EventInfoHeading.class);
				generator.add(EventInfoVelocity.class);
				generator.add(EventInfoDistance.class);
				
				generator.add(BulletPower.class);
				generator.add(BulletHeading.class);
				generator.add(BulletVelocity.class);
				generator.add(BulletX.class);
				generator.add(BulletY.class);
				
				generator.add(HitBulletPower.class);
				generator.add(HitBulletHeading.class);
				generator.add(HitBulletVelocity.class);
				generator.add(HitBulletX.class);
				generator.add(HitBulletY.class);
			}
			
			/*
			 * Robot Info
			 */
			{
				generator.add(RobotInfoTurnRemaining.class);
				generator.add(RobotInfoDistanceRemaining.class);
				generator.add(RobotInfoBattleFieldHeight.class);
				generator.add(RobotInfoBattleFieldWidth.class);
				generator.add(RobotInfoEnergy.class);
				generator.add(RobotInfoGunCoolingRate.class);
				generator.add(RobotInfoGunHeading.class);
				generator.add(RobotInfoGunHeat.class);
				generator.add(RobotInfoHeading.class);
				generator.add(RobotInfoHeight.class);
				generator.add(RobotInfoRadarHeading.class);
				generator.add(RobotInfoX.class);
				generator.add(RobotInfoY.class);
				generator.add(RobotInfoGunTurnRemaining.class);
				generator.add(RobotInfoRadarTurnRemaining.class);
			}
			
			/*
			 * Constants
			 */
			{
				generator.add(PI.class);
				generator.add(E.class);
				generator.add(SQRT2.class);
				generator.add(ArgumentDoubleConstant.RandomConstant.class);
			}
			
			/*
			 * Random
			 */
			{
				generator.add(DoubleRandomNoArguments.class);
				generator.add(DoubleRandomBound.class);
				generator.add(DoubleRandomOriginBound.class);
			}
			
			/*
			 * Compound
			 */
			{
				generator.add(ArgumentDoubleCompound.BinaryDouble.Addition.class);
				generator.add(ArgumentDoubleCompound.BinaryDouble.Subtraction.class);
				generator.add(ArgumentDoubleCompound.BinaryDouble.Multiplication.class);
				generator.add(Division.class);
				generator.add(Power.class);
				generator.add(Minimum.class);
				generator.add(Maximum.class);
				generator.add(Hypotenuse.class);
				
				generator.add(Sine.class);
				generator.add(Cosine.class);
				generator.add(Tangent.class);
				generator.add(SquareRoot.class);
				generator.add(CubeRoot.class);
				generator.add(Logarithm.class);
				generator.add(Exponent.class);
				generator.add(ArgumentDoubleCompound.UnaryDouble.Absolute.class);
			}
			
			/*
			 * Variable
			 */
			{
				generator.add(ArgumentDoubleVariable.class);
			}
		}
		
		
		
		/*
		 * String Arguments
		 */
		{
			/*
			 * Event Info
			 */
			{
				generator.add(EventInfoName.class);
				generator.add(BulletName.class);
				generator.add(HitBulletName.class);
			}
			
			/*
			 * Robot Info
			 */
			{
				generator.add(RobotInfoName.class);
			}
			
			/*
			 * Constant
			 */
			{
				generator.add(Null.class);
			}
			
			/*
			 * Variable
			 */
			{
				generator.add(ArgumentStringVariable.class);
			}
		}
	}
	
	/**
	 * Generates an argument for a certain chromosome of a certain robot
	 * @param argType The argument type (should be ArgumentBoolean, ArgumentInteger, ArgumentDouble or ArgumentString)
	 * @param cNum The chromosome number this argument will be placed in
	 * @param booleansNum The number of boolean variables this robot has
	 * @param integersNum The number of integer variables this robot has
	 * @param doublesNum The number of double variables this robot has
	 * @param stringsNum The number of string variables this robot has
	 * @return A new argument that holds up to all requirements
	 */
	public static Argument chromosomeGenerate (Class <? extends Argument> argType, int cNum, int booleansNum, int integersNum, int doublesNum, int stringsNum)
	{
		/*
		 * Adds to the hasToBe list the required argument type
		 */
		List < Class <?> > hasToBe = new ArrayList<>();
		hasToBe.add(argType);
		
		List < Class <?> > cannotBe = new ArrayList<>();
		
		/*
		 * This block adds to the cannotBe list any event info's that are not allowable in the particular chromosome
		 */
		switch (cNum) 
		{
			case 1:
			case 2:
				cannotBe.add(EventInfo.class);
				break;
			
			default:
				cannotBe.add(Bullet.class);
				cannotBe.add(HitBullet.class);
				cannotBe.add(IsMyFault.class);
				cannotBe.add(IsSentryRobot.class);
				cannotBe.add(EventInfo.Power.class);
				cannotBe.add(Bearing.class);
				cannotBe.add(Energy.class);
				cannotBe.add(Heading.class);
				cannotBe.add(Velocity.class);
				cannotBe.add(Distance.class);
				cannotBe.add(Name.class);
				
				Iterator < Class <?> > iter = cannotBe.iterator();
				while (iter.hasNext())
				{
					Class <? extends EventInfo> next = iter.next().asSubclass(EventInfo.class);
					try 
					{
						Method getChromosomes = next.getMethod("getChromosomes");
						
						int [] chromosomes = (int[]) getChromosomes.invoke(null);
						
						for (int i = 0; i < chromosomes.length; i++)
						{
							if (chromosomes[i] == cNum)
							{
								iter.remove();
								break;
							}
						}
					} 
					catch (NoSuchMethodException | 
							SecurityException | 
							IllegalAccessException | 
							IllegalArgumentException | 
							InvocationTargetException e) 
					{
						e.printStackTrace();
					}
				}
				
				break;
		}
		
		/*
		 * Adds to the cannotBe list variable arguments if the corresponding arguments do not exist
		 */
		if (booleansNum <= 0)
		{
			cannotBe.add(ArgumentBooleanVariable.class);
		}
		
		if (integersNum <= 0)
		{
			cannotBe.add(ArgumentIntegerVariable.class);
		}
		
		if (doublesNum <= 0)
		{
			cannotBe.add(ArgumentDoubleVariable.class);
		}
		
		if (stringsNum <= 0)
		{
			cannotBe.add(ArgumentStringVariable.class);
		}
		
		/*
		 * Generates an argument and sets the id of all variable arguments
		 */
		Argument toReturn = generate(hasToBe, cannotBe);
		
		List <Variable> allVariableArguments = getVariableArguments(toReturn);
		
		System.out.println("Variable arguments: " + allVariableArguments);
		
		for (Variable arg : allVariableArguments)
		{
			if (arg instanceof ArgumentBooleanVariable)
			{
				arg.setID(rnd.nextInt(booleansNum));
			}
			
			if (arg instanceof ArgumentIntegerVariable)
			{
				arg.setID(rnd.nextInt(integersNum));
			}
			
			if (arg instanceof ArgumentDoubleVariable)
			{
				arg.setID(rnd.nextInt(doublesNum));
			}
			
			if (arg instanceof ArgumentStringVariable)
			{
				arg.setID(rnd.nextInt(stringsNum));
			}
		}
		
		return toReturn;
	}
	//
	
	/**
	 *  Returns a random Argument
	 * @return A new Argument chosen randomly from all possibilities
	 */
	public static Argument generate ()
	{
		return generator.generate();
	}
	
	
	//
	
	/**
	 * Returns a new Argument according to the requirements
	 * @param hasToBe The new Argument must be of this type
	 * @return A new Argument
	 */
	public static Argument generate (Class <?> hasToBe)
	{
		return generator.generate(hasToBe);
	}
	//
	
	
	
	/**
	 * Returns a new Argument according to the requirements
	 * @param hasToBe The new Argument must be of this type
	 * @param cannotBe The new Argument cannot be of this type
	 * @return A new Argument
	 */
	public static Argument generate (Class <?> hasToBe, Class <?> cannotBe)
	{
		return generator.generate(hasToBe, cannotBe);
	}
	//
	
	
	
	/**
	 * Returns a new Argument according to the requirements
	 * @param hasToBe The new Argument must be of all specified types in this list
	 * @param cannotBe The new Argument cannot be of any of the specified types in this list
	 * @return A new Argument
	 */
	public static Argument generate (List<Class<?>> hasToBe, List<Class<?>> cannotBe)
	{
		return generator.generate(hasToBe, cannotBe);
	}
	//
	
	
	
	public static List < Class <? extends Argument> > getAllPossibilities ()
	{
		return generator.getAllPossibilities();
	}
	
	/**
	 * Returns all the variable arguments contained in the parameter argument
	 * @param a The parameter argument
	 * @return A list of all of the variable arguments
	 */
	public static List <Variable> getVariableArguments (Argument a)
	{
		List <Variable> toReturn = new ArrayList<>();
		addVariablesToList(toReturn, a);
		
		return toReturn;
	}
	
	private static void addVariablesToList (List <Variable> l, Argument a)
	{
		if (a instanceof Variable)
		{
			l.add((Variable)a);
		}
		else if (a instanceof Compound.Binary)
		{
			addVariablesToList(l, ((Compound.Binary) a).getA());
			addVariablesToList(l, ((Compound.Binary) a).getB());
		}
		else if (a instanceof Compound.Unary)
		{
			addVariablesToList(l, ((Compound.Unary) a).getA());
		}
	}
	
	
	/*
	 * Tagging interfaces
	 */
	//
	public static interface EventInfo
	{
		public static interface Bullet extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {3, 4, 5, 6};
				return chromosomes;
			}
		}
		public static interface HitBullet extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {4};
				return chromosomes;
			}
		}
		
		public static interface IsMyFault extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {7};
				return chromosomes;
			}
		}
		public static interface IsSentryRobot extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {10};
				return chromosomes;
			}
		}
		
		public static interface Power extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {6};
				return chromosomes;
			}
		}
		public static interface Bearing extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {6, 7, 8, 10};
				return chromosomes;
			}
		}
		public static interface Energy extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {3, 7, 10};
				return chromosomes;
			}
		}
		public static interface Heading extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {6, 10};
				return chromosomes;
			}
		}
		public static interface Velocity extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {6, 10};
				return chromosomes;
			}
		}
		public static interface Distance extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {10};
				return chromosomes;
			}
		}
		
		public static interface Name extends EventInfo 
		{
			static int [] getChromosomes ()
			{
				int [] chromosomes = new int [] {3, 6, 7, 9, 10};
				return chromosomes;
			}
		}
	}
	public static interface RobotInfo {}
	//
	public static interface Constant {}
	//
	public static interface Random {}
	//
	public static interface Compound 
	{
		public static interface Unary extends Compound
		{
			Argument getA();
		}
		
		public static interface Binary extends Unary
		{
			Argument getB();
		}
	}
	//
	public static interface Variable 
	{
		public void setID(int id);
	}
	
	
	
	//
	
	/*
	 * Arguments
	 */
	//
	public static class ArgumentBoolean extends Argument
	{
		public static abstract class ArgumentBooleanEventInfo extends ArgumentBoolean implements EventInfo
		{
			public ArgumentBooleanEventInfo ()
			{
				value = "event.is";
			}
			
			public static class EventInfoIsMyFault extends ArgumentBooleanEventInfo implements IsMyFault
			{
				public EventInfoIsMyFault ()
				{
					value += "MyFault()";
				}
			}
			
			public static class EventInfoIsSentryRobot extends ArgumentBooleanEventInfo implements IsSentryRobot
			{
				public EventInfoIsSentryRobot ()
				{
					value += "SentryRobot()";
				}
			}
		}
		
		public static class ArgumentBooleanRobotInfo extends ArgumentBoolean implements RobotInfo
		{
			public ArgumentBooleanRobotInfo ()
			{
				value = "this.get";
			}
			
			public static class RobotInfoAdjustGunForRobotTurn extends ArgumentBooleanRobotInfo
			{
				public RobotInfoAdjustGunForRobotTurn ()
				{
					value += "AdjustGunForRobotTurn()";
				}
			}
			
			public static class RobotInfoAdjustRadarForGunTurn extends ArgumentBooleanRobotInfo
			{
				public RobotInfoAdjustRadarForGunTurn ()
				{
					value += "AdjustRadarForGunTurn()";
				}
			}
			
			public static class RobotInfoAdjustRadarForRobotTurn extends ArgumentBooleanRobotInfo
			{
				public RobotInfoAdjustRadarForRobotTurn ()
				{
					value += "AdjustRadarForRobotTurn()";
				}
			}
		}
		
		public static class ArgumentBooleanConstant extends ArgumentBoolean implements Constant
		{
			public ArgumentBooleanConstant (boolean b)
			{
				value = Boolean.valueOf(b);
			}
			
			public static class True extends ArgumentBooleanConstant
			{
				public True ()
				{
					super(true);
				}
			}
			
			public static class False extends ArgumentBooleanConstant
			{
				public False ()
				{
					super(false);
				}
			}
		}
		
		public static class ArgumentBooleanRandom extends ArgumentBoolean implements Random
		{
			public ArgumentBooleanRandom ()
			{
				value = "(Math.random() > 0.5)";
			}
		}
		
		public static class ArgumentBooleanCompound extends ArgumentBoolean implements Compound
		{
			public static class BinaryBoolean extends ArgumentBooleanCompound implements Binary
			{
				Argument a, b;
				
				public int complexity ()
				{
					return super.complexity() + a.complexity() + b.complexity();
				}
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type) || b.containsArgumentType(type);
				}
				
				public Argument getA()
				{
					return a;
				}

				public Argument getB()
				{
					return b;
				}
				
				public static class And extends BinaryBoolean
				{
					public And ()
					{
						this(null, null);
					}
					
					public And (ArgumentBoolean a, ArgumentBoolean b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentBoolean) generate(ArgumentBoolean.class);
							b = (ArgumentBoolean) generate(ArgumentBoolean.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " && " + b + ")";
					}
				}
				
				public static class Or extends BinaryBoolean
				{
					public Or ()
					{
						this(null, null);
					}
					
					public Or (ArgumentBoolean a, ArgumentBoolean b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentBoolean) generate(ArgumentBoolean.class);
							b = (ArgumentBoolean) generate(ArgumentBoolean.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " || " + b + ")";
					}
				}
				
				public static class Equals extends BinaryBoolean
				{
					public Equals ()
					{
						this(null, null);
					}
					
					public Equals (Argument a, Argument b)
					{
						if (a == null || b == null)
						{
							a = generate();
							
							if (a instanceof ArgumentBoolean)
							{
								b = generate(ArgumentBoolean.class);
							}
							else if (a instanceof ArgumentInteger)
							{
								b = generate(ArgumentInteger.class);
							}
							else if (a instanceof ArgumentDouble)
							{
								b = generate(ArgumentDouble.class);
							}
							else
							{
								b = generate(ArgumentString.class);
							}
						}
						
						this.a = a;
						this.b = b;
						
						if (a instanceof ArgumentString)
						{
							value = a + ".equals(" + b + ")";
						}
						else
						{
							value = "(" + a + " == " + b + ")";
						}
					}
				}
				
				public static class Greater extends BinaryBoolean
				{
					public Greater ()
					{
						this(null, null);
					}
					
					public Greater (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = a + " > " + b;
					}
				}
				
				public static class GreaterEquals extends BinaryBoolean
				{
					public GreaterEquals ()
					{
						this(null, null);
					}
					
					public GreaterEquals (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = a + " >= " + b;
					}
				}
			}
				
			public static class Not extends ArgumentBooleanCompound implements Unary
			{
				Argument a;
				
				public Not ()
				{
					this(null);
				}
				
				public Not (ArgumentBoolean a)
				{
					if (a == null)
					{
						a = (ArgumentBoolean) generate(ArgumentBoolean.class);
					}
					
					this.a = a;
					
					value = "!(" + a + ")";
				}
				
				public int complexity ()
				{
					return super.complexity() + a.complexity();
				}
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type);
				}
				
				public Argument getA() 
				{
					return a;
				}
			}
		}
		
		public static class ArgumentBooleanVariable extends ArgumentBoolean implements Variable
		{
			public int id;
			
			public ArgumentBooleanVariable ()
			{
				id = 0;
				value = "booleans.get(" + id + ")";
			}
			
			@Override
			public void setID (int id) 
			{
				this.id = id;
				value = "booleans.get(" + id + ")";
			}
		}
	}
	//
	//
	public static class ArgumentInteger extends ArgumentDouble
	{
		public static class ArgumentIntegerRobotInfo extends ArgumentInteger implements RobotInfo
		{
			public ArgumentIntegerRobotInfo ()
			{
				value = "this.get";
			}
			
			public static class RobotInfoNumRounds extends ArgumentIntegerRobotInfo
			{
				public RobotInfoNumRounds ()
				{
					value += "NumRounds()";
				}
			}
			
			public static class RobotInfoNumSentries extends ArgumentIntegerRobotInfo
			{
				public RobotInfoNumSentries ()
				{
					value += "NumSentries()";
				}
			}
			
			public static class RobotInfoOthers extends ArgumentIntegerRobotInfo
			{
				public RobotInfoOthers ()
				{
					value += "Others()";
				}
			}
			
			public static class RobotInfoRoundNum extends ArgumentIntegerRobotInfo
			{
				public RobotInfoRoundNum ()
				{
					value += "RoundNum()";
				}
			}
			
			public static class RobotInfoTime extends ArgumentIntegerRobotInfo
			{
				public RobotInfoTime ()
				{
					value += "Time()";
					value = "(int)" + value;
				}
			}
		}
		
		public static class ArgumentIntegerConstant extends ArgumentInteger implements Constant
		{	
			public ArgumentIntegerConstant (int a)
			{
				value = Integer.valueOf(a);
			}
			
			public static class One extends ArgumentIntegerConstant
			{
				public One ()
				{
					super(1);
				}
			}
			
			public static class Zero extends ArgumentIntegerConstant
			{
				public Zero ()
				{
					super(0);
				}
			}
			
			public static class NegativeOne extends ArgumentIntegerConstant
			{
				public NegativeOne ()
				{
					super(-1);
				}
			}
			
			public static class Two extends ArgumentIntegerConstant
			{
				public Two ()
				{
					super(2);
				}
			}
			
			public static class Ten extends ArgumentIntegerConstant
			{
				public Ten ()
				{
					super(10);
				}
			}
			
			public static class OneHundred extends ArgumentIntegerConstant
			{
				public OneHundred ()
				{
					super(100);
				}
			}
			
			public static class ThreeHundredAndSixty extends ArgumentIntegerConstant
			{
				public ThreeHundredAndSixty ()
				{
					super(360);
				}
			}
			
			public static class RandomConstant extends ArgumentIntegerConstant
			{
				public RandomConstant ()
				{
					super(rnd.nextInt(401) - 200);
				}
			}
		}
		
		public static class ArgumentIntegerRandom extends ArgumentInteger implements Random
		{
			public static class IntegerRandomNoArguments extends ArgumentIntegerRandom
			{
				public IntegerRandomNoArguments ()
				{
					value = "random.nextInt(201)";
				}
			}
			
			public static class IntegerRandomRange extends ArgumentIntegerRandom implements Compound.Unary
			{
				ArgumentInteger range;
				
				public IntegerRandomRange ()
				{
					this((ArgumentInteger)generate(ArgumentInteger.class));
				}
				
				public IntegerRandomRange (ArgumentInteger range)
				{
					this.range = range;
					
					value = "random.nextInt(" + this.range + ")";
				}

				public Argument getA() 
				{
					return range;
				}
			}
			
			public static class IntegerRandomOriginRange extends ArgumentIntegerRandom implements Compound.Binary
			{
				ArgumentInteger origin, range;
				
				public IntegerRandomOriginRange ()
				{
					this((ArgumentInteger)generate(ArgumentInteger.class),
							(ArgumentInteger)generate(ArgumentInteger.class));
				}
				
				public IntegerRandomOriginRange (ArgumentInteger origin, ArgumentInteger range)
				{
					this.origin = origin;
					this.range = range;
					
					value = "(" + this.origin + " + random.nextInt(" + this.range + "))";
				}

				public Argument getA() 
				{
					return origin;
				}

				public Argument getB() 
				{
					return range;
				}
			}
		}
		
		public static class ArgumentIntegerCompound extends ArgumentInteger implements Compound
		{
			public static class BinaryInteger extends ArgumentIntegerCompound implements Binary
			{
				ArgumentInteger a, b;
				
				public int complexity ()
				{
					return super.complexity() + a.complexity() + b.complexity();
				}
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type) || b.containsArgumentType(type);
				}
				
				public Argument getA() 
				{
					return a;
				}
				
				public Argument getB() 
				{
					return b;
				}
				
				public static class Addition extends BinaryInteger
				{
					public Addition ()
					{
						this(null, null);
					}
					
					public Addition (ArgumentInteger a, ArgumentInteger b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentInteger) generate(ArgumentInteger.class);
							b = (ArgumentInteger) generate(ArgumentInteger.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " + " + b + ")";
					}
				}
				
				public static class Subtraction extends BinaryInteger
				{
					public Subtraction ()
					{
						this(null, null);
					}
					
					public Subtraction (ArgumentInteger a, ArgumentInteger b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentInteger) generate(ArgumentInteger.class);
							b = (ArgumentInteger) generate(ArgumentInteger.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " - " + b + ")";
					}
				}
				
				public static class Multiplication extends BinaryInteger
				{
					public Multiplication ()
					{
						this(null, null);
					}
					
					public Multiplication (ArgumentInteger a, ArgumentInteger b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentInteger) generate(ArgumentInteger.class);
							b = (ArgumentInteger) generate(ArgumentInteger.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " * " + b + ")";
					}
				}
				
				public static class Modulu extends BinaryInteger
				{
					public Modulu ()
					{
						this(null, null);
					}
					
					public Modulu (ArgumentInteger a, ArgumentInteger b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentInteger) generate(ArgumentInteger.class);
							b = (ArgumentInteger) generate(ArgumentInteger.class);
							
							
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " % " + b + ")";
					}
				}
			}
			
			public static class Absolute extends ArgumentIntegerCompound implements Unary
			{
				ArgumentInteger a;
				
				public Absolute ()
				{
					this(null);
				}
				
				public Absolute (ArgumentInteger a)
				{
					if (a == null) a = (ArgumentInteger) generate(ArgumentInteger.class);
					
					this.a = a;
					
					value = "Math.abs(" + a + ")";
				}
				
				public int complexity ()
				{
					return super.complexity() + a.complexity();
				}
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type);
				}

				public Argument getA() 
				{
					return a;
				}
			}
		}
		
		public static class ArgumentIntegerVariable extends ArgumentInteger implements Variable
		{
			public int id;
			
			public ArgumentIntegerVariable ()
			{
				id = 0;
				value = "integers.get(" + id + ")";
			}
			
			@Override
			public void setID (int id) 
			{
				this.id = id;
			}
		}
	}
	//
	//
	public static class ArgumentDouble extends Argument
	{
		public static abstract class ArgumentDoubleEventInfo extends ArgumentDouble implements EventInfo
		{
			public ArgumentDoubleEventInfo ()
			{
				value = "event.get";
			}
			
			public static class EventInfoPower extends ArgumentDoubleEventInfo implements Power
			{
				public EventInfoPower ()
				{
					value += "Power()";
				}
			}
			
			public static class EventInfoEnergy extends ArgumentDoubleEventInfo implements Energy
			{
				public EventInfoEnergy ()
				{
					value += "Energy()";
				}
			}
			
			public static class EventInfoBearing extends ArgumentDoubleEventInfo implements Bearing
			{
				public EventInfoBearing ()
				{
					value += "Bearing()";
				}
			}
			
			public static class EventInfoHeading extends ArgumentDoubleEventInfo implements Heading 
			{
				public EventInfoHeading ()
				{
					value += "Heading()";
				}
			}
			
			public static class EventInfoVelocity extends ArgumentDoubleEventInfo implements Velocity 
			{
				public EventInfoVelocity ()
				{
					value += "Velocity()";
				}
			}
			
			public static class EventInfoDistance extends ArgumentDoubleEventInfo implements Distance
			{
				public EventInfoDistance ()
				{
					value += "Distance()";
				}
			}
			
			public static class EventInfoBullet extends ArgumentDoubleEventInfo implements Bullet
			{
				public EventInfoBullet ()
				{
					value += "Bullet().get";
				}
				
				public static class BulletHeading extends EventInfoBullet
				{
					public BulletHeading ()
					{
						value += "Heading()";
					}
				}
				
				public static class BulletPower extends EventInfoBullet
				{
					public BulletPower ()
					{
						value += "Power()";
					}
				}
				
				public static class BulletVelocity extends EventInfoBullet
				{
					public BulletVelocity ()
					{
						value += "Velocity()";
					}
				}
				
				public static class BulletX extends EventInfoBullet
				{
					public BulletX ()
					{
						value += "X()";
					}
				}
				
				public static class BulletY extends EventInfoBullet
				{
					public BulletY ()
					{
						value += "Y()";
					}
				}
			}
			
			public static class EventInfoHitBullet extends ArgumentDoubleEventInfo implements HitBullet
			{
				public EventInfoHitBullet ()
				{
					value += "HitBullet().get";
				}
				
				public static class HitBulletHeading extends EventInfoHitBullet
				{
					public HitBulletHeading ()
					{
						value += "Heading()";
					}
				}
				
				public static class HitBulletPower extends EventInfoHitBullet
				{
					public HitBulletPower ()
					{
						value += "Power()";
					}
				}
				
				public static class HitBulletVelocity extends EventInfoHitBullet
				{
					public HitBulletVelocity ()
					{
						value += "Velocity()";
					}
				}
				
				public static class HitBulletX extends EventInfoHitBullet
				{
					public HitBulletX ()
					{
						value += "X()";
					}
				}
				
				public static class HitBulletY extends EventInfoHitBullet
				{
					public HitBulletY ()
					{
						value += "Y()";
					}
				}
			}
		}
		
		public static class ArgumentDoubleRobotInfo extends ArgumentDouble implements RobotInfo
		{
			public ArgumentDoubleRobotInfo ()
			{
				value = "this.get";
			}
			
			public static class RobotInfoTurnRemaining extends ArgumentDoubleRobotInfo
			{
				public RobotInfoTurnRemaining ()
				{
					value += "TurnRemaining()";
				}
			}
			
			public static class RobotInfoDistanceRemaining extends ArgumentDoubleRobotInfo
			{
				public RobotInfoDistanceRemaining ()
				{
					value += "DistanceRemaining()";
				}
			}
			
			public static class RobotInfoBattleFieldHeight extends ArgumentDoubleRobotInfo
			{
				public RobotInfoBattleFieldHeight ()
				{
					value += "BattleFieldHeight()";
				}
			}
			
			public static class RobotInfoBattleFieldWidth extends ArgumentDoubleRobotInfo
			{
				public RobotInfoBattleFieldWidth ()
				{
					value += "BattleFieldWidth()";
				}
			}
			
			public static class RobotInfoEnergy extends ArgumentDoubleRobotInfo
			{
				public RobotInfoEnergy ()
				{
					value += "Energy()";
				}
			}
			
			public static class RobotInfoGunCoolingRate extends ArgumentDoubleRobotInfo
			{
				public RobotInfoGunCoolingRate ()
				{
					value += "GunCoolingRate()";
				}
			}
			
			public static class RobotInfoGunHeading extends ArgumentDoubleRobotInfo
			{
				public RobotInfoGunHeading ()
				{
					value += "GunHeading()";
				}
			}
			
			public static class RobotInfoGunHeat extends ArgumentDoubleRobotInfo
			{
				public RobotInfoGunHeat ()
				{
					value += "GunHeat()";
				}
			}
			
			public static class RobotInfoHeading extends ArgumentDoubleRobotInfo
			{
				public RobotInfoHeading ()
				{
					value += "Heading()";
				}
			}
			
			public static class RobotInfoHeight extends ArgumentDoubleRobotInfo
			{
				public RobotInfoHeight ()
				{
					value += "Height()";
				}
			}
			
			public static class RobotInfoRadarHeading extends ArgumentDoubleRobotInfo
			{
				public RobotInfoRadarHeading ()
				{
					value += "RadarHeading()";
				}
			}
			
			public static class RobotInfoX extends ArgumentDoubleRobotInfo
			{
				public RobotInfoX ()
				{
					value += "X()";
				}
			}
			
			public static class RobotInfoY extends ArgumentDoubleRobotInfo
			{
				public RobotInfoY ()
				{
					value += "Y()";
				}
			}
			
			public static class RobotInfoGunTurnRemaining extends ArgumentDoubleRobotInfo
			{
				public RobotInfoGunTurnRemaining ()
				{
					value += "GunTurnRemaining()";
				}
			}
			
			public static class RobotInfoRadarTurnRemaining extends ArgumentDoubleRobotInfo
			{
				public RobotInfoRadarTurnRemaining ()
				{
					value += "RadarTurnRemaining()";
				}
			}
		}
		
		public static class ArgumentDoubleConstant extends ArgumentDouble implements Constant
		{
			public ArgumentDoubleConstant (double a)
			{
				value = Double.valueOf(a);
			}
			
			public static class PI extends ArgumentDoubleConstant
			{
				public PI ()
				{
					super(Math.PI);
				}
			}
			
			public static class E extends ArgumentDoubleConstant
			{
				public E ()
				{
					super(Math.E);
				}
			}
			
			public static class SQRT2 extends ArgumentDoubleConstant
			{
				public SQRT2 ()
				{
					super(Math.sqrt(2));
				}
			}
			
			public static class RandomConstant extends ArgumentDoubleConstant
			{
				public RandomConstant ()
				{
					super((rnd.nextDouble() * 400) - 200);
				}
			}
		}
		
		public static class ArgumentDoubleRandom extends ArgumentDouble implements Random
		{
			public static class DoubleRandomNoArguments extends ArgumentDoubleRandom
			{
				public DoubleRandomNoArguments ()
				{
					value = "(random.nextDouble() * 200)";
				}
			}
			
			public static class DoubleRandomBound extends ArgumentDoubleRandom implements Compound.Unary
			{
				ArgumentDouble scale;
				
				public DoubleRandomBound ()
				{
					this((ArgumentDouble)generate(ArgumentDouble.class));
				}
				
				public DoubleRandomBound (ArgumentDouble scale)
				{
					this.scale = scale;
					
					value = "(random.nextDouble() * " + scale + ")";
				}
				
				public int complexity ()
				{
					return super.complexity() + scale.complexity();
				}

				public Argument getA() 
				{
					return scale;
				}
			}
			
			public static class DoubleRandomOriginBound extends ArgumentDoubleRandom implements Compound.Binary
			{
				ArgumentDouble origin, scale;
				
				public DoubleRandomOriginBound ()
				{
					this((ArgumentDouble)generate(ArgumentDouble.class),
							(ArgumentDouble)generate(ArgumentDouble.class));
				}
				
				public DoubleRandomOriginBound (ArgumentDouble origin, ArgumentDouble scale)
				{
					this.origin = origin;
					this.scale = scale;
					
					value = "(" + origin + " + random.nextDouble() * " + scale + ")";
				}
				
				public int complexity ()
				{
					return super.complexity() + origin.complexity() + scale.complexity();
				}

				public Argument getA() 
				{
					return origin;
				}

				public Argument getB() 
				{
					return scale;
				}
			}
		}
		
		public static class ArgumentDoubleCompound extends ArgumentDouble implements Compound
		{
			public static class BinaryDouble extends ArgumentDoubleCompound implements Binary
			{
				ArgumentDouble a, b;
				
				public int complexity ()
				{
					return super.complexity() + a.complexity() + b.complexity();
				}
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type) || b.containsArgumentType(type);
				}
				
				public Argument getA ()
				{
					return a;
				}
				
				public Argument getB ()
				{
					return b;
				}
				
				public static class Addition extends BinaryDouble
				{
					public Addition ()
					{
						this(null, null);
					}
					
					public Addition (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " + " + b + ")";
					}
				}
				
				public static class Subtraction extends BinaryDouble
				{
					public Subtraction ()
					{
						this(null, null);
					}
					
					public Subtraction (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " - " + b + ")";
					}
				}
				
				public static class Multiplication extends BinaryDouble
				{
					public Multiplication ()
					{
						this(null, null);
					}
					
					public Multiplication (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " * " + b + ")";
					}
				}
				
				public static class Division extends BinaryDouble
				{
					public Division ()
					{
						this(null, null);
					}
					
					public Division (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " / " + b + ")";
					}
				}
				
				public static class Power extends BinaryDouble
				{
					public Power ()
					{
						this(null, null);
					}
					
					public Power (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "Math.pow(" + a + ", " + b + ")";
					}
				}
				
				public static class Minimum extends BinaryDouble
				{
					public Minimum ()
					{
						this(null, null);
					}
					
					public Minimum (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "Math.min(" + a + ", " + b + ")";
					}
				}
				
				public static class Maximum extends BinaryDouble
				{
					public Maximum ()
					{
						this(null, null);
					}
					
					public Maximum (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "Math.max(" + a + ", " + b + ")";
					}
				}
				
				public static class Hypotenuse extends BinaryDouble
				{
					public Hypotenuse ()
					{
						this(null, null);
					}
					
					public Hypotenuse (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
							b = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "Math.hypot(" + a + ", " + b + ")";
					}
				}
			}
			
			public static class UnaryDouble extends ArgumentDoubleCompound implements Unary
			{
				ArgumentDouble a;
				
				public int complexity ()
				{
					return super.complexity() + a.complexity();
				}
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type);
				}
				
				public Argument getA ()
				{
					return a;
				}
				
				public static class Sine extends UnaryDouble
				{
					public Sine ()
					{
						this(null);
					}
					
					public Sine (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.sin(Math.toRadians(" + a + "))";
					}
				}
				
				public static class Cosine extends UnaryDouble
				{
					public Cosine ()
					{
						this(null);
					}
					
					public Cosine (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.cos(Math.toRadians(" + a + "))";
					}
				}
				
				public static class Tangent extends UnaryDouble
				{
					public Tangent ()
					{
						this(null);
					}
					
					public Tangent (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.tan(Math.toRadians(" + a + "))";
					}
				}
				
				public static class SquareRoot extends UnaryDouble
				{
					public SquareRoot ()
					{
						this(null);
					}
					
					public SquareRoot (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.sqrt(" + a + ")";
					}
				}
				
				public static class CubeRoot extends UnaryDouble
				{
					public CubeRoot ()
					{
						this(null);
					}
					
					public CubeRoot (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.cbrt(" + a + ")";
					}
				}
				
				public static class Logarithm extends UnaryDouble
				{
					public Logarithm ()
					{
						this(null);
					}
					
					public Logarithm (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.log(" + a + ")";
					}
				}
				
				public static class Exponent extends UnaryDouble
				{
					public Exponent ()
					{
						this(null);
					}
					
					public Exponent (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.exp(" + a + ")";
					}
				}
				
				public static class Absolute extends UnaryDouble
				{
					public Absolute ()
					{
						this(null);
					}
					
					public Absolute (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.abs(" + a + ")";
					}
				}
			}
		}
		
		public static class ArgumentDoubleVariable extends ArgumentDouble implements Variable
		{
			public int id;
			
			public ArgumentDoubleVariable ()
			{
				id = 0;
				value = "doubles.get(" + id + ")";
			}
			
			@Override
			public void setID (int id) 
			{
				this.id = id;
				value = "doubles.get(" + id + ")";
			}
		}
	}
	//
	//
	public static class ArgumentString extends Argument
	{
		public static abstract class ArgumentStringEventInfo extends ArgumentString implements EventInfo
		{
			public ArgumentStringEventInfo ()
			{
				value = "event.get";
			}
			
			public static class EventInfoName extends ArgumentStringEventInfo implements Name
			{
				public EventInfoName ()
				{
					value += "Name()";
				}
			}
			
			public static class BulletName extends ArgumentStringEventInfo implements Bullet
			{
				public BulletName ()
				{
					value += "Bullet().getName()";
				}
			}
			
			public static class HitBulletName extends ArgumentStringEventInfo implements HitBullet
			{
				public HitBulletName ()
				{
					value += "HitBullet().getName()";
				}
			}
		}
		
		public static class RobotInfoName extends ArgumentString implements RobotInfo
		{
			public RobotInfoName ()
			{
				value += "this.getName()";
			}
		}
		
		public static class Null extends ArgumentString implements Constant
		{
			public Null ()
			{
				value = "null";
			}
		}
		
		public static class ArgumentStringVariable extends ArgumentString implements Variable
		{
			public int id;
			
			public ArgumentStringVariable ()
			{
				id = 0;
				value = "strings.get(" + id + ")";
			}
			
			@Override
			public void setID (int id) 
			{
				this.id = id;
				value = "strings.get(" + id + ")";
			}
		}
	}
	//
}
