package ga;

import java.util.ArrayList;
import java.util.Random;

import robocode.AdvancedRobot;
import robocode.BulletHitBulletEvent;
import robocode.BulletHitEvent;
import robocode.BulletMissedEvent;
import robocode.HitByBulletEvent;
import robocode.HitRobotEvent;
import robocode.HitWallEvent;
import robocode.RobotDeathEvent;
import robocode.ScannedRobotEvent;

public class EvolvingAlpaca extends AdvancedRobot 
{
	//Init code - part of the mold
	ArrayList<Boolean> booleans = new ArrayList<>();
	ArrayList<Integer> integers = new ArrayList<>();
	ArrayList<Double> doubles = new ArrayList<>();
	ArrayList<String> strings = new ArrayList<>();
	
	Random random = new Random();
	
	public void run ()
	{
		//Chromosome 1
		while (true)
		{
			//Chromosome 2
		}
	}
	
	public void onBulletHit(BulletHitEvent event) 
	{
		//Chromosome 3
	}
	
	public void onBulletHitBullet(BulletHitBulletEvent event) 
	{
		//Chromosome 4
	}
	
	public void onBulletMissed(BulletMissedEvent event) 
	{
		//Chromosome 5
	}
	
	public void onHitByBullet(HitByBulletEvent event)
	{
		//Chromosome 6
	}
	
	public void onHitRobot(HitRobotEvent event)
	{
		//Chromosome 7
	}
	
	public void onHitWall(HitWallEvent event)
	{
		//Chromosome 8
	}
	
	public void onRobotDeath(RobotDeathEvent event) 
	{
		//Chromosome 9
	}
	
	public void onScannedRobot(ScannedRobotEvent event) 
	{
		//Chromosome 10
	}
}
