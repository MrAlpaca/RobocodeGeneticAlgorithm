package RobocodeGeneticAlgorithm.ga;

import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString;

public class Main 
{
	public static void main (String [] args)
	{
		for (int cNum = 1; cNum <= 10; cNum++)
		{
			for (int booleansNum = 0; booleansNum < 5; booleansNum++)
			{
				for (int integersNum = 0; integersNum < 5; integersNum++)
				{
					for (int doublesNum = 0; doublesNum < 5; doublesNum++)
					{
						for (int stringsNum = 0; stringsNum < 5; stringsNum++)
						{
							System.out.printf("cNum: %d, booleansNum: %d, integersNum: %d, doublesNum: %d, stringsNum: %d" , 
									cNum, 
									booleansNum, 
									integersNum, 
									doublesNum, 
									stringsNum);
							System.out.println("Boolean argument generated: " + Argument.chromosomeGenerate(ArgumentBoolean.class, cNum, booleansNum, integersNum, doublesNum, stringsNum));
						}
					}
				}
			}
		}
		
		for (int cNum = 1; cNum <= 10; cNum++)
		{
			for (int booleansNum = 0; booleansNum < 5; booleansNum++)
			{
				for (int integersNum = 0; integersNum < 5; integersNum++)
				{
					for (int doublesNum = 0; doublesNum < 5; doublesNum++)
					{
						for (int stringsNum = 0; stringsNum < 5; stringsNum++)
						{
							System.out.printf("cNum: %d, booleansNum: %d, integersNum: %d, doublesNum: %d, stringsNum: %d" , 
									cNum, 
									booleansNum, 
									integersNum, 
									doublesNum, 
									stringsNum);
							System.out.println("Integer argument generated: " + Argument.chromosomeGenerate(ArgumentInteger.class, cNum, booleansNum, integersNum, doublesNum, stringsNum));
						}
					}
				}
			}
		}
		
		for (int cNum = 1; cNum <= 10; cNum++)
		{
			for (int booleansNum = 0; booleansNum < 5; booleansNum++)
			{
				for (int integersNum = 0; integersNum < 5; integersNum++)
				{
					for (int doublesNum = 0; doublesNum < 5; doublesNum++)
					{
						for (int stringsNum = 0; stringsNum < 5; stringsNum++)
						{
							System.out.printf("cNum: %d, booleansNum: %d, integersNum: %d, doublesNum: %d, stringsNum: %d" , 
									cNum, 
									booleansNum, 
									integersNum, 
									doublesNum, 
									stringsNum);
							System.out.println("Double argument generated: " + Argument.chromosomeGenerate(ArgumentDouble.class, cNum, booleansNum, integersNum, doublesNum, stringsNum));
						}
					}
				}
			}
		}
		
		for (int cNum = 1; cNum <= 10; cNum++)
		{
			for (int booleansNum = 0; booleansNum < 5; booleansNum++)
			{
				for (int integersNum = 0; integersNum < 5; integersNum++)
				{
					for (int doublesNum = 0; doublesNum < 5; doublesNum++)
					{
						for (int stringsNum = 0; stringsNum < 5; stringsNum++)
						{
							System.out.printf("cNum: %d, booleansNum: %d, integersNum: %d, doublesNum: %d, stringsNum: %d" , 
									cNum, 
									booleansNum, 
									integersNum, 
									doublesNum, 
									stringsNum);
							System.out.println("String argument generated: " + Argument.chromosomeGenerate(ArgumentString.class, cNum, booleansNum, integersNum, doublesNum, stringsNum));
						}
					}
				}
			}
		}
	}
}
