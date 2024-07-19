class CountryRunner
{
	public static void main(String[] args)
	{
    System.out.println("running main method in CountryRunner ");
	
	String[] stateName={"Andhra Pradesh","Arunachal Pradesh","Assam","Bihar","Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jharkhand","Karnataka","Kerala","Madhya Pradesh","Maharashtra","Manipur","Meghalaya","Mizoram","Nagaland","Odisha","Punjab","Rajasthan","Sikkim","Tamil Nadu","Telangana","Tripura","Uttar Pradesh","Uttarakhand","West Bengal"};
	Country.state(stateName);
	
	int[] pincodeNo= {23,456,23,56,678,489,45,78};
	Country.pincode(pincodeNo);
	
	String[] primeministersName={"Jawaharlal Nehru","Gulzari Lal Nanda ","Gulzarilal Nanda","Lal Bahadur Shastri","Indira gandhi","Morarji Desai","Rajiv Gandhi","Charan Singh","V. P. Singh","	P. V. Narasimha Rao","Chandra Shekar","Atal Bihari Vajpayee","H. D. Deve Gowda","Inder Kumar Gujral","Manmohan Singh","	Narendra Mod"};
	Country.primeminister(primeministersName);
	
	String[] cabinetministerName={"Shri Rajnath Singh","Shri Amit Shah ","Shri Nitin Jairam Gadkari","Smt.Nirmala Sitharaman","Shri Shivraj Singh Chouhan","Dr. Subrahmanyam Jaishankar","Shri Jagat Prakash Nadda","Shri Manohar Lal","Shri H. D. Kumaraswamy","Shri Piyush Goyal","Shri Dharmendra Pradhan","Shri Jitan Ram Manjhi","Shri Rajiv Ranjan Singh alias Lalan Singh","Shri Sarbananda Sonowal","Dr Virendra Kumar","Shri Kinjarapu Rammohan Naidu","Shri Pralhad Josh","Shri Jual Oram","Shri Giriraj Singh","Shri Ashwini Vaishnaw","Shri Jyotiraditya M. Scindia","Shri Bhupender Yadav","Shri Gajendra Singh Shekhawat","Smt. Annpurna Devi","Shri Kiren Rijiju","Shri Hardeep Singh Puri","Dr. Mansukh Mandaviya","Shri G. Kishan Reddy","Shri Chirag Paswan","Shri C R Patil"};
	Country.cabinetminister(cabinetministerName);
	
	String[] politicalpartieName={"Bharatiya Janata Party","Communist Party of India ","Indian National Congress","Aam Aadmi Party","National People's Party"};
	Country.politicalpartie(politicalpartieName);
	}
}