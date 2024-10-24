class TrainTicket
{
	String pnr;
	int age;
	String gender;
	String name;
	
	public TrainTicket()
	{
		System.out.println("Train ticket constructor invoked");
	}
	public TrainTicket(String pNR,int agE, String gen,String nme)
	{
		pnr = pNR;
		age = agE;
		gender = gen;
		name = nme;
	}
	public void getTrainTicketDetails()
	{
		System.out.println("PNR: "+pnr);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
		System.out.println("Name: "+name);
		System.out.println("--------------------");
	}
}