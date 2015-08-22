package RobocodeGeneticAlgorithm.ga;

import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.Binary.And;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.Binary.Or;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.Binary.Greater;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.Binary.GreaterEquals;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.Binary.Equals;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanCompound.Not;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanConstant.False;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanConstant.True;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanEventInfo.EventInfoIsMyFault;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanEventInfo.EventInfoIsSentryRobot;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanRandom;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanRobotInfo.RobotInfoAdjustGunForRobotTurn;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanRobotInfo.RobotInfoAdjustRadarForGunTurn;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean.ArgumentBooleanRobotInfo.RobotInfoAdjustRadarForRobotTurn;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Binary.Division;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Binary.Hypotenuse;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Binary.Maximum;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Binary.Minimum;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Binary.Power;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Unary.Cosine;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Unary.CubeRoot;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Unary.Exponent;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Unary.Logarithm;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Unary.Sine;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Unary.SquareRoot;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble.ArgumentDoubleCompound.Unary.Tangent;
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
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerCompound;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger.ArgumentIntegerCompound.Binary.Modulu;
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
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.ArgumentStringEventInfo.BulletName;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.ArgumentStringEventInfo.EventInfoName;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.ArgumentStringEventInfo.HitBulletName;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.ArgumentStringRobotInfo.RobotInfoName;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString.Null;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Argument
{
	public Object value = "";
	
	public static ArrayList <Class<? extends Argument>> possibilities, allPossibilities;
	
	static
	{
		possibilities = new ArrayList<>();
		allPossibilities = new ArrayList<>();
		
		/*
		 * Boolean Arguments
		 */
		{
			/*
			 * Event Info
			 */
			{
				add(EventInfoIsMyFault.class);
				add(EventInfoIsSentryRobot.class);
			}
			
			/*
			 * Robot Info
			 */
			{
				add(RobotInfoAdjustGunForRobotTurn.class);
				add(RobotInfoAdjustRadarForGunTurn.class);
				add(RobotInfoAdjustRadarForRobotTurn.class);
			}
			
			/*
			 * Constants
			 */
			{
				add(True.class);
				add(False.class);
			}
			
			/*
			 * Random
			 */
			{
				add(ArgumentBooleanRandom.class);
			}
			
			/*
			 * Compound
			 */
			{
				add(And.class);
				add(Or.class);
				add(Equals.class);
				add(Greater.class);
				add(GreaterEquals.class);
				add(Not.class);
			}
			
			/*
			 * Variable
			 */
			{
				
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
				add(RobotInfoNumRounds.class);
				add(RobotInfoNumSentries.class);
				add(RobotInfoOthers.class);
				add(RobotInfoRoundNum.class);
				add(RobotInfoTime.class);
			}
			
			/*
			 * Constants
			 */
			{
				add(One.class);
				add(Zero.class);
				add(NegativeOne.class);
				add(Two.class);
				add(Ten.class);
				add(OneHundred.class);
				add(ThreeHundredAndSixty.class);
				add(ArgumentIntegerConstant.RandomConstant.class);
			}
			
			/*
			 * Random
			 */
			{
				add(IntegerRandomNoArguments.class);
				add(IntegerRandomRange.class);
				add(IntegerRandomOriginRange.class);
			}
			
			/*
			 * Compound
			 */
			{
				add(ArgumentIntegerCompound.Binary.Addition.class);
				add(ArgumentIntegerCompound.Binary.Subtraction.class);
				add(ArgumentIntegerCompound.Binary.Multiplication.class);
				add(Modulu.class);
				
				add(ArgumentIntegerCompound.Absolute.class);
			}
			
			/*
			 * Variable
			 */
			{
				
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
				add(EventInfoPower.class);
				add(EventInfoEnergy.class);
				add(EventInfoBearing.class);
				add(EventInfoHeading.class);
				add(EventInfoVelocity.class);
				add(EventInfoDistance.class);
				
				add(BulletPower.class);
				add(BulletHeading.class);
				add(BulletVelocity.class);
				add(BulletX.class);
				add(BulletY.class);
				
				add(HitBulletPower.class);
				add(HitBulletHeading.class);
				add(HitBulletVelocity.class);
				add(HitBulletX.class);
				add(HitBulletY.class);
			}
			
			/*
			 * Robot Info
			 */
			{
				add(RobotInfoTurnRemaining.class);
				add(RobotInfoDistanceRemaining.class);
				add(RobotInfoBattleFieldHeight.class);
				add(RobotInfoBattleFieldWidth.class);
				add(RobotInfoEnergy.class);
				add(RobotInfoGunCoolingRate.class);
				add(RobotInfoGunHeading.class);
				add(RobotInfoGunHeat.class);
				add(RobotInfoHeading.class);
				add(RobotInfoHeight.class);
				add(RobotInfoRadarHeading.class);
				add(RobotInfoX.class);
				add(RobotInfoY.class);
				add(RobotInfoGunTurnRemaining.class);
				add(RobotInfoRadarTurnRemaining.class);
			}
			
			/*
			 * Constants
			 */
			{
				add(PI.class);
				add(E.class);
				add(SQRT2.class);
				add(ArgumentDoubleConstant.RandomConstant.class);
			}
			
			/*
			 * Random
			 */
			{
				add(DoubleRandomNoArguments.class);
				add(DoubleRandomBound.class);
				add(DoubleRandomOriginBound.class);
			}
			
			/*
			 * Compound
			 */
			{
				add(ArgumentDoubleCompound.Binary.Addition.class);
				add(ArgumentDoubleCompound.Binary.Subtraction.class);
				add(ArgumentDoubleCompound.Binary.Multiplication.class);
				add(Division.class);
				add(Power.class);
				add(Minimum.class);
				add(Maximum.class);
				add(Hypotenuse.class);
				
				add(Sine.class);
				add(Cosine.class);
				add(Tangent.class);
				add(SquareRoot.class);
				add(CubeRoot.class);
				add(Logarithm.class);
				add(Exponent.class);
				add(ArgumentDoubleCompound.Unary.Absolute.class);
			}
			
			/*
			 * Variable
			 */
			{
				
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
				add(EventInfoName.class);
				add(BulletName.class);
				add(HitBulletName.class);
			}
			
			/*
			 * Robot Info
			 */
			{
				add(RobotInfoName.class);
			}
			
			/*
			 * Constant
			 */
			{
				add(Null.class);
			}
			
			/*
			 * Variable
			 */
			{
				
			}
		}
		
		allPossibilities.addAll(possibilities);
	}
	
	public static void add (Class<? extends Argument> type)
	{
		add(type, 1);
	}
	
	public static void add (Class<? extends Argument> type, int times)
	{
		for (int i = 0; i < times; i++) possibilities.add(type);
	}
	
	public static interface RunTimeValue {}
	
	public static interface EventInfo extends RunTimeValue
	{
		public static interface Bullet {}
		public static interface HitBullet {}
		
		public static interface Bearing {}
		public static interface Energy {}
		public static interface Name {}
		public static interface Heading {}
		public static interface Velocity {}
		public static interface Distance {}
	}
	
	public static interface RobotInfo extends RunTimeValue {}
	public static interface Constant {}
	public static interface Random extends RunTimeValue {}
	public static interface Compound {}
	public static interface Variable extends RunTimeValue {}
	
	/*
	 * Generate methods modify the static list possibilities
	 * Useful for when the requirements need to match the requirements of upper levels in the call stack
	 */
	
	public static Argument generate ()
	{
		return generate(new ArrayList<Class <?> >(), new ArrayList<Class <?> >());
	}
	
	public static Argument generate (Argument a)
	{
		return generate(a.getClass());
	}
	
	public static Argument generate (Class <?> hasToBe)
	{
		ArrayList<Class <?> > htb = new ArrayList<>();
		htb.add(hasToBe);
		
		return generate(htb, new ArrayList<Class <?> >());
	}
	
	public static Argument generate (Class <?> hasToBe, Class <?> cannotBe)
	{
		ArrayList<Class <?> > htb = new ArrayList<>();
		ArrayList<Class <?> > cnb = new ArrayList<>();
		
		htb.add(hasToBe);
		cnb.add(cannotBe);
		
		return generate(htb, cnb);
	}
	
	public static Argument generate (List<Class<?>> hasToBe, List<Class<?>> cannotBe)
	{
		ArrayList <Class <? extends Argument> > excludedPossibilities = new ArrayList<>();
		
		Iterator< Class <? extends Argument> > possibilitiesIterator = possibilities.listIterator();
		
		while (possibilitiesIterator.hasNext())
		{
			Iterator< Class <?> > htbIterator = hasToBe.listIterator();
			Iterator< Class <?> > cnbIterator = cannotBe.listIterator();
			
			Class<? extends Argument> poss = possibilitiesIterator.next();
			
			while (htbIterator.hasNext())
			{
				Class<?> type = htbIterator.next();
				if (!type.isAssignableFrom(poss))
				{
					excludedPossibilities.add(poss);
					possibilitiesIterator.remove();
				}
			}
			
			while (cnbIterator.hasNext())
			{
				Class<?> type = cnbIterator.next();
				if (type.isAssignableFrom(poss))
				{
					excludedPossibilities.add(poss);
					possibilitiesIterator.remove();
				}
			}
		}
		
		Collections.shuffle(possibilities);
		Class<? extends Argument> chosen = possibilities.get(0);
		Argument toReturn = null;
		
		try 
		{
			toReturn = chosen.newInstance();
		} 
		catch (InstantiationException | IllegalAccessException e) 
		{
			e.printStackTrace();
		}
		
		possibilities.addAll(excludedPossibilities);
		
		return toReturn;
	}
	
	/*
	 * New Generate methods create a new list of possibilities (from the list allPossibilities)
	 * Useful for when it is needed to ignore the requirements of the upper levels in the call stack
	 * 
	 * ***SHOULD BE REMOVED - THESE METHODS WILL CAUSE BUGS IN THE FUTURE*** 
	 */
	
	public static Argument newGenerate ()
	{
		return newGenerate(new ArrayList<Class <?> >(), new ArrayList<Class <?> >());
	}
	
	public static Argument newGenerate (Argument a)
	{
		return newGenerate(a.getClass());
	}
	
	public static Argument newGenerate (Class <?> hasToBe)
	{
		ArrayList<Class <?> > htb = new ArrayList<>();
		htb.add(hasToBe);
		
		return newGenerate(htb, new ArrayList<Class <?> >());
	}
	
	public static Argument newGenerate (Class <?> hasToBe, Class <?> cannotBe)
	{
		ArrayList<Class <?> > htb = new ArrayList<>();
		ArrayList<Class <?> > cnb = new ArrayList<>();
		
		htb.add(hasToBe);
		cnb.add(cannotBe);
		
		return newGenerate(htb, cnb);
	}
	
	public static Argument newGenerate (List<Class<?>> hasToBe, List<Class<?>> cannotBe)
	{
		
		ArrayList <Class <? extends Argument> > copyPossibilities = new ArrayList<>(possibilities);
		
		possibilities.clear();
		possibilities.addAll(allPossibilities);
		
		Argument toReturn = generate(hasToBe, cannotBe);
		
		possibilities.clear();
		possibilities.addAll(copyPossibilities);
		
		return toReturn;
		
		
		//return generate(hasToBe, cannotBe);
	}
	
	public static int sign (Integer a)
	{
		if (a > 0) return 1;
		else return -1;
	}
	
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
	
	
	
	public static class ArgumentBoolean extends Argument
	{
		public static class ArgumentBooleanEventInfo extends ArgumentBoolean implements EventInfo
		{
			public ArgumentBooleanEventInfo ()
			{
				value = "event.is";
			}
			
			public static class EventInfoIsMyFault extends ArgumentBooleanEventInfo 
			{
				public EventInfoIsMyFault ()
				{
					value += "MyFault()";
				}
			}
			
			public static class EventInfoIsSentryRobot extends ArgumentBooleanEventInfo 
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
			public static class Binary extends ArgumentBooleanCompound
			{
				Argument a, b;
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type) || b.containsArgumentType(type);
				}
				
				public static class And extends Binary
				{
					public And ()
					{
						this(null, null);
					}
					
					public And (ArgumentBoolean a, ArgumentBoolean b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentBoolean) Argument.newGenerate(ArgumentBoolean.class);
							b = (ArgumentBoolean) Argument.newGenerate(ArgumentBoolean.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " && " + b + ")";
					}
				}
				
				public static class Or extends Binary
				{
					public Or ()
					{
						this(null, null);
					}
					
					public Or (ArgumentBoolean a, ArgumentBoolean b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentBoolean) Argument.newGenerate(ArgumentBoolean.class);
							b = (ArgumentBoolean) Argument.newGenerate(ArgumentBoolean.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " || " + b + ")";
					}
				}
				
				public static class Equals extends Binary
				{
					public Equals ()
					{
						this(null, null);
					}
					
					public Equals (Argument a, Argument b)
					{
						if (a == null || b == null)
						{
							a = Argument.newGenerate();
							
							if (a instanceof ArgumentBoolean)
							{
								b = Argument.newGenerate(ArgumentBoolean.class);
							}
							else if (a instanceof ArgumentInteger)
							{
								b = Argument.newGenerate(ArgumentInteger.class);
							}
							else if (a instanceof ArgumentDouble)
							{
								b = Argument.newGenerate(ArgumentDouble.class);
							}
							else
							{
								b = Argument.newGenerate(ArgumentString.class);
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
				
				public static class Greater extends Binary
				{
					public Greater ()
					{
						this(null, null);
					}
					
					public Greater (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.newGenerate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.newGenerate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = a + " > " + b;
					}
				}
				
				public static class GreaterEquals extends Binary
				{
					public GreaterEquals ()
					{
						this(null, null);
					}
					
					public GreaterEquals (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.newGenerate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.newGenerate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = a + " >= " + b;
					}
				}
			}
				
			public static class Not extends ArgumentBooleanCompound
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
						a = (ArgumentBoolean) Argument.generate(ArgumentBoolean.class);
					}
					
					this.a = a;
					
					value = "!(" + a + ")";
				}
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type);
				}
			}
		}
		
		public static class ArgumentBooleanVariable extends ArgumentBoolean implements Variable
		{
			
		}
	}
	
	
	
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
			static java.util.Random rnd = new java.util.Random();
			
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
			
			public static class IntegerRandomRange extends ArgumentIntegerRandom
			{
				public IntegerRandomRange ()
				{
					this((ArgumentInteger)Argument.generate(ArgumentInteger.class));
				}
				
				public IntegerRandomRange (ArgumentInteger range)
				{
					value = "random.nextInt(" + range + ")";
				}
			}
			
			public static class IntegerRandomOriginRange extends ArgumentIntegerRandom
			{
				public IntegerRandomOriginRange ()
				{
					this((ArgumentInteger)Argument.generate(ArgumentInteger.class),
							(ArgumentInteger)Argument.generate(ArgumentInteger.class));
				}
				
				public IntegerRandomOriginRange (ArgumentInteger origin, ArgumentInteger range)
				{
					value = "(" + origin + " + random.nextInt(" + range + "))";
				}
			}
		}
		
		public static class ArgumentIntegerCompound extends ArgumentInteger implements Compound
		{
			public static class Binary extends ArgumentIntegerCompound
			{
				ArgumentInteger a, b;
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type) || b.containsArgumentType(type);
				}
				
				public static class Addition extends Binary
				{
					public Addition ()
					{
						this(null, null);
					}
					
					public Addition (ArgumentInteger a, ArgumentInteger b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentInteger) Argument.generate(ArgumentInteger.class);
							b = (ArgumentInteger) Argument.generate(ArgumentInteger.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " + " + b + ")";
					}
				}
				
				public static class Subtraction extends Binary
				{
					public Subtraction ()
					{
						this(null, null);
					}
					
					public Subtraction (ArgumentInteger a, ArgumentInteger b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentInteger) Argument.generate(ArgumentInteger.class);
							b = (ArgumentInteger) Argument.generate(ArgumentInteger.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " - " + b + ")";
					}
				}
				
				public static class Multiplication extends Binary
				{
					public Multiplication ()
					{
						this(null, null);
					}
					
					public Multiplication (ArgumentInteger a, ArgumentInteger b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentInteger) Argument.generate(ArgumentInteger.class);
							b = (ArgumentInteger) Argument.generate(ArgumentInteger.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " * " + b + ")";
					}
				}
				
				public static class Modulu extends Binary
				{
					public Modulu ()
					{
						this(null, null);
					}
					
					public Modulu (ArgumentInteger a, ArgumentInteger b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentInteger) Argument.generate(ArgumentInteger.class);
							b = (ArgumentInteger) Argument.generate(ArgumentInteger.class);
							
							
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " % " + b + ")";
					}
				}
			}
			
			public static class Absolute extends ArgumentIntegerCompound
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
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type);
				}
			}
		}
		
		public static class ArgumentIntegerVariable extends ArgumentInteger implements Variable
		{
			
		}
	}
	
	
	
	public static class ArgumentDouble extends Argument
	{
		public static class ArgumentDoubleEventInfo extends ArgumentDouble implements EventInfo
		{
			public ArgumentDoubleEventInfo ()
			{
				value = "event.get";
			}
			
			public static class EventInfoPower extends ArgumentDoubleEventInfo
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
			
			public static class EventInfoDistance extends ArgumentDoubleEventInfo
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
			static java.util.Random rnd = new java.util.Random();
			
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
			
			public static class DoubleRandomBound extends ArgumentDoubleRandom
			{
				public DoubleRandomBound ()
				{
					this((ArgumentDouble)Argument.generate(ArgumentDouble.class));
				}
				
				public DoubleRandomBound (ArgumentDouble scale)
				{
					value = "(random.nextDouble() * " + scale + ")";
				}
			}
			
			public static class DoubleRandomOriginBound extends ArgumentDoubleRandom
			{
				public DoubleRandomOriginBound ()
				{
					this((ArgumentDouble)Argument.generate(ArgumentDouble.class),
							(ArgumentDouble)Argument.generate(ArgumentDouble.class));
				}
				
				public DoubleRandomOriginBound (ArgumentDouble origin, ArgumentDouble scale)
				{
					value = "(" + origin + " + random.nextDouble() * " + scale + ")";
				}
			}
		}
		
		public static class ArgumentDoubleCompound extends ArgumentDouble implements Compound
		{
			public static class Binary extends ArgumentDoubleCompound
			{
				ArgumentDouble a, b;
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type) || b.containsArgumentType(type);
				}
				
				public static class Addition extends Binary
				{
					public Addition ()
					{
						this(null, null);
					}
					
					public Addition (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " + " + b + ")";
					}
				}
				
				public static class Subtraction extends Binary
				{
					public Subtraction ()
					{
						this(null, null);
					}
					
					public Subtraction (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " - " + b + ")";
					}
				}
				
				public static class Multiplication extends Binary
				{
					public Multiplication ()
					{
						this(null, null);
					}
					
					public Multiplication (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " * " + b + ")";
					}
				}
				
				public static class Division extends Binary
				{
					public Division ()
					{
						this(null, null);
					}
					
					public Division (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "(" + a + " / " + b + ")";
					}
				}
				
				public static class Power extends Binary
				{
					public Power ()
					{
						this(null, null);
					}
					
					public Power (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "Math.pow(" + a + ", " + b + ")";
					}
				}
				
				public static class Minimum extends Binary
				{
					public Minimum ()
					{
						this(null, null);
					}
					
					public Minimum (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "Math.min(" + a + ", " + b + ")";
					}
				}
				
				public static class Maximum extends Binary
				{
					public Maximum ()
					{
						this(null, null);
					}
					
					public Maximum (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "Math.max(" + a + ", " + b + ")";
					}
				}
				
				public static class Hypotenuse extends Binary
				{
					public Hypotenuse ()
					{
						this(null, null);
					}
					
					public Hypotenuse (ArgumentDouble a, ArgumentDouble b)
					{
						if (a == null || b == null)
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
							b = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						this.b = b;
						
						value = "Math.hypot(" + a + ", " + b + ")";
					}
				}
			}
			
			public static class Unary extends ArgumentDoubleCompound
			{
				ArgumentDouble a;
				
				public boolean containsArgumentType (Class<?> type)
				{
					return super.containsArgumentType(type) || a.containsArgumentType(type);
				}
				
				public static class Sine extends Unary
				{
					public Sine ()
					{
						this(null);
					}
					
					public Sine (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.sin(Math.toRadians(" + a + "))";
					}
				}
				
				public static class Cosine extends Unary
				{
					public Cosine ()
					{
						this(null);
					}
					
					public Cosine (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.cos(Math.toRadians(" + a + "))";
					}
				}
				
				public static class Tangent extends Unary
				{
					public Tangent ()
					{
						this(null);
					}
					
					public Tangent (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.tan(Math.toRadians(" + a + "))";
					}
				}
				
				public static class SquareRoot extends Unary
				{
					public SquareRoot ()
					{
						this(null);
					}
					
					public SquareRoot (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.sqrt(" + a + ")";
					}
				}
				
				public static class CubeRoot extends Unary
				{
					public CubeRoot ()
					{
						this(null);
					}
					
					public CubeRoot (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.cbrt(" + a + ")";
					}
				}
				
				public static class Logarithm extends Unary
				{
					public Logarithm ()
					{
						this(null);
					}
					
					public Logarithm (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.log(" + a + ")";
					}
				}
				
				public static class Exponent extends Unary
				{
					public Exponent ()
					{
						this(null);
					}
					
					public Exponent (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.exp(" + a + ")";
					}
				}
				
				public static class Absolute extends Unary
				{
					public Absolute ()
					{
						this(null);
					}
					
					public Absolute (ArgumentDouble a)
					{
						if (a == null) 
						{
							a = (ArgumentDouble) Argument.generate(ArgumentDouble.class);
						}
						
						this.a = a;
						
						value = "Math.abs(" + a + ")";
					}
				}
			}
		}
		
		public static class ArgumentDoubleVariable extends ArgumentDouble implements Variable
		{
			
		}
	}
	
	public static class ArgumentString extends Argument
	{
		public static class ArgumentStringEventInfo extends ArgumentString implements EventInfo
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
		
		public static class ArgumentStringRobotInfo extends Argument implements RobotInfo
		{
			public ArgumentStringRobotInfo ()
			{
				value = "this.get";
			}
			
			public static class RobotInfoName extends ArgumentStringRobotInfo
			{
				public RobotInfoName ()
				{
					value += "Name()";
				}
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
			
		}
	}
}
