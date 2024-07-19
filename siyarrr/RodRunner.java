class RodRunner
{
	public static void main(String[] args){
		int code=Rod.code("India");
		System.out.println("code:"+code);
		int code1=Rod.code("China");
		System.out.println("code1:"+code1);
		int code2=Rod.code("Russia");
		System.out.println("code2:"+code2);
		int code3=Rod.code("Japan");
		System.out.println("code3:"+code3);
		int code4=Rod.code("Italy");
		System.out.println("code4:"+code4);
		int code5=Rod.code("america");
		System.out.println("code5:"+code5);
		
		String price=Rod.item(150);
		System.out.println("price:"+price);
		String price1=Rod.item(200);
		System.out.println("price1:"+price1);
		String price2=Rod.item(90);
		System.out.println("price2:"+price2);
		String price3=Rod.item(100);
		System.out.println("price3:"+price3);
		String price4=Rod.item(80);
		System.out.println("price4:"+price4);
		String price5=Rod.item(50);
		System.out.println("price5:"+price5);
		
		String movie=Rod.movieName("shreya");
		System.out.println("movie:"+movie);
		String movie1=Rod.movieName("sharan");
		System.out.println("movie1:"+movie1);
		String movie2=Rod.movieName("prashant");
		System.out.println("movie2:"+movie2);
		String movie3=Rod.movieName("ashith");
		System.out.println("movie3:"+movie3);
	    String movie4=Rod.movieName("rishika");
		System.out.println("movie4:"+movie4);
		String movie5=Rod.movieName("shraya");
		System.out.println("movie5:"+movie5);
	}
}