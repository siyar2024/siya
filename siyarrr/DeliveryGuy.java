class DeliveryGuy
{
	public static void deliver(String item)
	{
		System.out.println("item:"+item);
		DeliverVehicle.deliver(item,"MG ROAD");
}
}