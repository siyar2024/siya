class MaskRunner
{
	public static void main(String[] args)
	{
		Mask mask=new Mask();
		
		Mask mask1=new Mask(100);
		System.out.println("mask cost:"+mask1.cost);
        
		Mask mask2=new Mask('M');
		System.out.println("mask cost:"+mask2.size);
		
		Mask mask3=new Mask("cotton");
		System.out.println("mask cost:"+mask3.material);
		
		Mask mask4=new Mask(150,'S',"cotton");
		System.out.println("mask cost:"+mask4.cost);
		System.out.println("mask cost:"+mask4.size);
		System.out.println("mask cost:"+mask4.material);
		
		Mask mask5=new Mask(120,'S');
		System.out.println("mask cost:"+mask5.cost);
		System.out.println("mask cost:"+mask5.size);
	}
}