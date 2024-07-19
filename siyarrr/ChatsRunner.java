class ChatsRunner
{
	public static void main(String[] args)
{
	System.out.println("running main in main method");
	Chats.name("pizza");
	Chats.quality("sweet","red");
	Chats.amount("burger",90);
	Chats.name("brown","crispy",150);
	Chats.name("200");
}
}