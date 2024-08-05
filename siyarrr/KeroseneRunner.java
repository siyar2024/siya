class KeroseneRunner
{
	public static void main(String[] args)
	{
	Kerosene kerosene=new Kerosene();	
	
	Kerosene kerosene1=new Kerosene(500,100,true);
	System.out.println("kerosene price:"+kerosene1.price);
	System.out.println("kerosene quantity:"+kerosene1.quantity);
	System.out.println("kerosene quality:"+kerosene1.quality);
	
	Kerosene kerosene2=new Kerosene(false);
	System.out.println("kerosene quality:"+kerosene2.quality);
	
	Kerosene kerosene3=new Kerosene(600);
	System.out.println("kerosene price:"+kerosene3.price);
	}
}