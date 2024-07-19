class BuyRunner
{
	public static void main(String[] args)
	{
		System.out.println("running main in BuyRunner");
		Buy.product("dell",116000);
		Buy.product("lenovo",40000);
		Buy.product("hp",500000,376889);
		Buy.product("hp",50000,76889);
		Buy.bookMovieTicket("kalki","orion",100,500.98);
		Buy.bookMovieTicket("kotee","orion",10000000,50000.98);
		Buy.buyEgg(2500,1000.1);
		Buy.buyEgg(25,9.1);
		Buy.buyShampoo(5,3000,"apple","18-4-2023");
		Buy.buyShampoo(150,100,"apple","28-4-2022");
		Buy.buyCake('F',"small","choclate",1000,2000);
		Buy.buyCake('F',"small","vanilla",450,500);
		Buy.buyLaptop("lenovo",50,543.0,500,250.9,"windows",150,15);
		Buy.buyLaptop("lenovo",4000,54300.0,500000,25044.9,"windows",15098,1512);
		Buy.buySmartWatch("dell",80000,3,'B',20000);
		Buy.buySmartWatch("dell",9000,4,'B',100);
	}
}