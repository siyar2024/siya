class TrainRunner
{
public static void main(String[] args)
{
	System.out.println("running main in main method");
	Train.book("udupi","bngl");
	Train.book("mngl","delhi",2);
	Train.book("mumbai","bngl",5,1000);
	Train.cancel(234567);
	Train.cancel("udupi","bngl");
}
}