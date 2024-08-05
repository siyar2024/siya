

class Projector
{
	String color="white";
	String type;
	String company;
	double weight;
	
	Projector(String type)
	{
		this.type=type;
	}
	
	public void setCompany(String company)
	{
		this.company=company;
	}
	
	public void display()
	{
		System.out.println("Projector color:"+color);
		System.out.println("Projector type:"+type);
		System.out.println("Projector company:"+company);
		System.out.println("Projector weight:"+weight);
	}
}