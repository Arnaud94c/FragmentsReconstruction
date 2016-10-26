package Ressources;

import java.util.ArrayList;
import java.util.List;

public class CollectionFragments
{
	private List<Fragment> listFragments;
	
	public CollectionFragments()
	{
		listFragments= new ArrayList<Fragment>();
	}
	
	public void addFragments(Fragment fragment)
	{
		listFragments.add(fragment);
	}

}
