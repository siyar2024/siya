

class Paperr
{
	double thickness=10;
	char size;
	String quality;
	String color;
	
	Paperr(char size)
	{
		this.size=size;
	}
	
	public void setQuality(String quality)
	{
		this.quality=quality;
	}
	
	public void display()
	{
		System.out.println("Paperr thickness:"+thickness);
		System.out.println("Paperr size:"+size);
		System.out.println("Paperr quality:"+quality);
		System.out.println("Paperr color:"+color);
	}
}