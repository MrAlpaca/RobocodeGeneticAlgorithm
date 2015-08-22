package RobocodeGeneticAlgorithm.ga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generator <T extends Generatable>
{
	private ArrayList <Class<? extends T>> possibilities, allPossibilities;
	private java.util.Random rnd = new java.util.Random();
	
	private boolean stillGenerating = false;
	
	public Generator ()
	{
		possibilities = new ArrayList<>();
		allPossibilities = new ArrayList<>();
	}
	
	public void add (Class<? extends T> type)
	{
		add(type, 1);
	}
	
	public void add (Class<? extends T> type, int times)
	{
		for (int i = 0; i < times; i++) 
		{
			possibilities.add(type);
			allPossibilities.add(type);
		}
	}
	
	/*
	 * Public generate methods modify the list allPossibilities so the outside caller's requirements will be considered further down the stack call
	 */
	
	/**
	 * Returns a random Generatable
	 * @return New instance of an Generatable type, chosen randomly from all of the possibilities
	 */
	public T generate ()
	{
		if (stillGenerating) return generate(new ArrayList<Class <?> >(), new ArrayList<Class <?> >());
		
		else 
		{
			stillGenerating = true;
			return m_generate(new ArrayList<Class <?> >(), new ArrayList<Class <?> >());
		}
	}
	
	/**
	 * Returns a new Generatable according to the requirements
	 * @param hasToBe The new Generatable must be of this type
	 * @return A new Generatable
	 */
	public T generate (Class <?> hasToBe)
	{
		ArrayList<Class <?> > htb = new ArrayList<>();
		htb.add(hasToBe);
		
		if (stillGenerating) return generate(htb, new ArrayList<Class <?> >());
		
		else 
		{
			stillGenerating = true;
			return m_generate(htb, new ArrayList<Class <?> >());
		}
	}
	
	/**
	 * Returns a new Generatable according to the requirements
	 * @param hasToBe The new Generatable must be of this type
	 * @param cannotBe The new Generatable cannot be of this type
	 * @return A new Generatable
	 */
	public T generate (Class <?> hasToBe, Class <?> cannotBe)
	{
		ArrayList<Class <?> > htb = new ArrayList<>();
		ArrayList<Class <?> > cnb = new ArrayList<>();
		
		htb.add(hasToBe);
		cnb.add(cannotBe);
		
		if (stillGenerating) return generate(htb, cnb);
		
		else
		{
			stillGenerating = true;
			return m_generate(htb, cnb);
		}
	}
	
	/**
	 * Returns a new Generatable according to the requirements
	 * @param hasToBe The new Generatable must be of all specified types in this list
	 * @param cannotBe The new Generatable cannot be of any of the specified types in this list
	 * @return
	 */
	public T generate (List<Class<?>> hasToBe, List<Class<?>> cannotBe)
	{
		if (stillGenerating) 
		{
			return m_generate (hasToBe, cannotBe);
		}
		
		else 
		{
			stillGenerating = true;
			
			ArrayList <Class <? extends T> > excludedPossibilities = new ArrayList<>();
			
			Iterator< Class <? extends T> > possibilitiesIterator = allPossibilities.listIterator();
			
			while (possibilitiesIterator.hasNext())
			{
				Iterator< Class <?> > htbIterator = hasToBe.listIterator();
				Iterator< Class <?> > cnbIterator = cannotBe.listIterator();
				
				Class<? extends T> poss = possibilitiesIterator.next();
				
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
			
			T toReturn = m_generate(hasToBe, cannotBe);
			allPossibilities.addAll(excludedPossibilities);
			
			stillGenerating = false;
			
			return toReturn;
		}
	}
	
	/**
	 * Returns a copy of the list of all of the possibilities
	 * @return the copy
	 */
	public ArrayList < Class <? extends T> > getAllPossibilities ()
	{
		return new ArrayList<>(allPossibilities);
	}
	
	
	/*
	 * Generate method changes possibilities so it contains all of the possibilities that have been allowed by the outside caller (a copy of allPossibilities).
	 * Then picks one possibility at random, creates a new instance of it, and return it.
	 */
	
	protected T m_generate ()
	{
		return m_generate(new ArrayList<Class <?> >(), new ArrayList<Class <?> >());
	}
	
	protected T m_generate (Class <?> hasToBe)
	{
		ArrayList<Class <?> > htb = new ArrayList<>();
		htb.add(hasToBe);
		
		return m_generate(htb, new ArrayList<Class <?> >());
	}
	
	protected T m_generate (Class <?> hasToBe, Class <?> cannotBe)
	{
		ArrayList<Class <?> > htb = new ArrayList<>();
		ArrayList<Class <?> > cnb = new ArrayList<>();
		
		htb.add(hasToBe);
		cnb.add(cannotBe);
		
		return m_generate(htb, cnb);
	}
	
	protected T m_generate (List<Class<?>> hasToBe, List<Class<?>> cannotBe)
	{
		ArrayList <Class <? extends T> > copyPossibilities = new ArrayList<>(possibilities);
		
		possibilities.clear();
		possibilities.addAll(allPossibilities);
		
		T toReturn = getRandomPossibility(hasToBe, cannotBe);
		
		possibilities.clear();
		possibilities.addAll(copyPossibilities);
		
		return toReturn;
	}
	
	protected T getRandomPossibility (List<Class<?>> hasToBe, List<Class<?>> cannotBe)
	{
		ArrayList <Class <? extends T> > excludedPossibilities = new ArrayList<>();
		
		Iterator< Class <? extends T> > possibilitiesIterator = possibilities.listIterator();
		
		while (possibilitiesIterator.hasNext())
		{
			Iterator< Class <?> > htbIterator = hasToBe.listIterator();
			Iterator< Class <?> > cnbIterator = cannotBe.listIterator();
			
			Class<? extends T> poss = possibilitiesIterator.next();
			
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
		
		int randomPos = rnd.nextInt(possibilities.size());
		Class<? extends T> chosen = possibilities.get(randomPos);
		T toReturn = null;
		
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
}
