class MatrimonyRunner
{
	public static void main(String[] args)
	{
		Matrimony matrimony=new Matrimony();
		String name=matrimony.name;
		long phoneNumber=matrimony.phoneNumber;
		int age=matrimony.age;
		System.out.println("name:"+name);
		System.out.println("phoneNumber:"+phoneNumber);
		System.out.println("age:"+age);
		
		matrimony.name="kriti";
		matrimony.phoneNumber=9876543212L;
		matrimony.age=25;
		String name1=matrimony.name;
	    long phoneNumber1=matrimony.phoneNumber;
		int age1=matrimony.age;
		System.out.println("name updated:"+name1);
		System.out.println("phoneNumber updated:"+phoneNumber1);
		System.out.println("age updated:"+age1);
	}
}