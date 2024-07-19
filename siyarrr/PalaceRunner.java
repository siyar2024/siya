class PalaceRunner
{
	public static void main(String[] palace)
	{
		if (palace.length==4){
			String name=palace[0];
			String location=palace[1];
			String builtBy=palace[2];
			String builtYear=palace[3];
			System.out.println("name:"+name);
			System.out.println("location:"+location);
			System.out.println("builtBy:"+builtBy);
			System.out.println("builtYear:"+builtYear);
			}
			else
			{
			System.out.println("invalid");
			}
		}
	
}

