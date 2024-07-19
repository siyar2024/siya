class tabletRunner
{
	public static void main(String[] args)
	{
		String medicine=tablet.medicine(150);
		System.out.println("medicine:"+medicine);
		String medicine1=tablet.medicine(90);
		System.out.println("medicine1:"+medicine1);
		String medicine2=tablet.medicine(100);
		System.out.println("medicine2:"+medicine2);
		String medicine3=tablet.medicine(1530);
		System.out.println("medicine3:"+medicine3);
		
		String symptom=tablet.symptom("dolo");
		System.out.println("symptom:"+symptom);
		String symptom1=tablet.symptom("paracetamal");
		System.out.println("symptom1:"+symptom1);
		String symptom2=tablet.symptom("strepsil");
		System.out.println("symptom2:"+symptom2);
		String symptom3=tablet.symptom("anticeptic");
		System.out.println("symptom3:"+symptom3);
		
		String doctor=tablet.doctor("morning");
		System.out.println("doctor:"+doctor);
		String doctor1=tablet.doctor("afternoon");
		System.out.println("doctor1:"+doctor1);
		String doctor2=tablet.doctor("evening");
		System.out.println("doctor2:"+doctor2);
		String doctor3=tablet.doctor("night");
		System.out.println("doctor3:"+doctor3);
	}
}