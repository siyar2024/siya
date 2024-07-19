class WatchRunner
{
	public static void main(String[] args)
	{
		char grade='A';
		char section='B';
		char status='C';
		char data='E';
		char alphabet='D';
		char direction='F';
		char depth='G';
		char height='H';
		char power='I';
		char volt='J';
		char light='K';
		char thing='L';
		char heat='M';
		char cold='N';
		char rain='O';
		char temp='P';
		char percentage='Q';
		char signal='R';
		char red='W';
		char money='Z';
		char[] container={grade,section,status,data,alphabet,direction,depth,height,power,volt,light,thing,heat,cold,rain,temp,percentage,signal,red,money};
		int total=container.length;
		System.out.println("total:"+total);
		char ref=container[6];
		System.out.println("elements at 6:"+ref);
	}
}