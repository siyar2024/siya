class ApplicationnRunner
{
	public static void main(String[] args)
	{
		Applicationn applicationn=new Applicationn();
		String name=applicationn.name;
		double storage=applicationn.storage;
		int quantity=applicationn.quantity;
		System.out.println("name:"+name);
		System.out.println("storage:"+storage);
		System.out.println("quantity:"+quantity);
		
		applicationn.name="instagram";
		applicationn.storage=32;
		applicationn.quantity=1;
		String name1=applicationn.name;
	    double storage1=applicationn.storage;
		int quantity1=applicationn.quantity;
		System.out.println("name updated:"+name1);
		System.out.println("storage1 updated:"+storage1);
		System.out.println("quantity1 updated:"+quantity1);
	}
}