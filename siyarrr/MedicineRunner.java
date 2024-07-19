//. Declare a class with below methodif(info.length==4)
		

//a. Method to take medicine information like name,manf date, price,quantityaccept from main method and pass as arguments

//b.MEthod to take juice information like name,brand,flavour,price,quantity
//.Accept from main method and pass as arguments

class MedicineRunner
{
	public static void main(String[] args)
	{
		if(args.length==4){
		String name=args[0];
			String manfDate=args[1];
			String price=args[2];
			String quantity=args[3];
			float convertedprice=Float.parseFloat(price);
			int covertedquantity=Integer.parseInt(quantity);
		
		Medicine.medicineInfo(name,manfDate,convertedprice,covertedquantity);
		}
	}
}
