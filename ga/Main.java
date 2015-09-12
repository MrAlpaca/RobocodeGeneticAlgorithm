package RobocodeGeneticAlgorithm.ga;

import RobocodeGeneticAlgorithm.ga.Argument.ArgumentBoolean;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentDouble;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentInteger;
import RobocodeGeneticAlgorithm.ga.Argument.ArgumentString;

public class Main 
{
	public static void main (String [] args)
	{
		System.out.println("Testing Boolean Arguments");
		for (int cNum = 1; cNum <= 4; cNum++)
		{
			for (int booleansNum = 0; booleansNum < 5; booleansNum++)
			{
				for (int integersNum = 0; integersNum < 5; integersNum++)
				{
					for (int doublesNum = 0; doublesNum < 5; doublesNum++)
					{
						for (int stringsNum = 0; stringsNum < 5; stringsNum++)
						{
							System.out.printf("cNum: %d, booleansNum: %d, integersNum: %d, doublesNum: %d, stringsNum: %d\n" , 
									cNum, 
									booleansNum, 
									integersNum, 
									doublesNum, 
									stringsNum);
							Argument curr = Argument.chromosomeGenerate(ArgumentBoolean.class, cNum, booleansNum, integersNum, doublesNum, stringsNum);
							System.out.println("Boolean argument generated: " + curr);
						}
					}
				}
			}
		}
		
		System.out.println("Testing Integer Arguments");
		for (int cNum = 1; cNum <= 4; cNum++)
		{
			for (int booleansNum = 0; booleansNum < 5; booleansNum++)
			{
				for (int integersNum = 0; integersNum < 5; integersNum++)
				{
					for (int doublesNum = 0; doublesNum < 5; doublesNum++)
					{
						for (int stringsNum = 0; stringsNum < 5; stringsNum++)
						{
							System.out.printf("cNum: %d, booleansNum: %d, integersNum: %d, doublesNum: %d, stringsNum: %d\n" , 
									cNum, 
									booleansNum, 
									integersNum, 
									doublesNum, 
									stringsNum);
							Argument curr = Argument.chromosomeGenerate(ArgumentInteger.class, cNum, booleansNum, integersNum, doublesNum, stringsNum);
							System.out.println("Integer argument generated: " + curr);
						}
					}
				}
			}
		}
		
		System.out.println("Testing Double Arguments");
		for (int cNum = 1; cNum <= 4; cNum++)
		{
			for (int booleansNum = 0; booleansNum < 5; booleansNum++)
			{
				for (int integersNum = 0; integersNum < 5; integersNum++)
				{
					for (int doublesNum = 0; doublesNum < 5; doublesNum++)
					{
						for (int stringsNum = 0; stringsNum < 5; stringsNum++)
						{
							System.out.printf("cNum: %d, booleansNum: %d, integersNum: %d, doublesNum: %d, stringsNum: %d\n" , 
									cNum, 
									booleansNum, 
									integersNum, 
									doublesNum, 
									stringsNum);
							Argument curr = Argument.chromosomeGenerate(ArgumentDouble.class, cNum, booleansNum, integersNum, doublesNum, stringsNum);
							System.out.println("Double argument generated: " + curr);
						}
					}
				}
			}
		}
		
		System.out.println("Testing String Arguments");
		for (int cNum = 1; cNum <= 4; cNum++)
		{
			for (int booleansNum = 0; booleansNum < 5; booleansNum++)
			{
				for (int integersNum = 0; integersNum < 5; integersNum++)
				{
					for (int doublesNum = 0; doublesNum < 5; doublesNum++)
					{
						for (int stringsNum = 0; stringsNum < 5; stringsNum++)
						{
							System.out.printf("cNum: %d, booleansNum: %d, integersNum: %d, doublesNum: %d, stringsNum: %d\n" , 
									cNum, 
									booleansNum, 
									integersNum, 
									doublesNum, 
									stringsNum);
							Argument curr = Argument.chromosomeGenerate(ArgumentString.class, cNum, booleansNum, integersNum, doublesNum, stringsNum);
							System.out.println("String argument generated: " + curr);
						}
					}
				}
			}
		}
	}
}
