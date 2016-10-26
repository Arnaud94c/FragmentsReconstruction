package Ressources;


import java.util.ArrayList;
import java.util.List;

public class Fragment 
{
	private List<String> chaineCaracteres;
	private List<String>chaineComplementaire;
	private String chaineString="";
	private int id= 0;
	private int size=0;

	public Fragment()
	{}
	
	public Fragment(int identifiant)
	{
		id=identifiant;
		chaineComplementaire=new ArrayList<String>();
		chaineCaracteres=new ArrayList<String>();
	}
	
	public List<String> getChaine()
	{
		return this.chaineCaracteres;
	}
	public void addChaine(String chaine)
	{
		chaineCaracteres.add(chaine);
		chaineString+=chaine;
		size=chaineCaracteres.size();
	}
	

}
