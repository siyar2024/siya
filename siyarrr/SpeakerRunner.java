class SpeakerRunner
{
	public static void main(String[] args)
	{
		Speaker speaker=new Speaker('M');
		speaker.output=true;
		speaker.setCost(1000);
		speaker.display();
		
		Speaker speaker1=new Speaker('S');
		speaker1.output=false;
		speaker1.setCost(2000);
		speaker1.display();
		
		Speaker speaker2=new Speaker('M');
		speaker2.output=true;
		speaker2.setCost(1000);
		speaker2.display();
	}
}