class TrainTicket
{
	String pnr;
	int age;
	String gender;
	String name;
	
	public TrainTicket()
	{
		this("763-5678676",25);
		System.out.println("Train ticket constructor invoked with no arguments");
	}
	public TrainTicket(String pnr,int age)
	{
		this("Female", "Akhila");
		System.out.println("Parameterized constructor with string and int type");
		this.pnr = pnr;
		this.age = age;
	}
	public TrainTicket(String gender,String name)
	{
		System.out.println("Parameterized constructor with  two string type");
		this.gender = gender;
		this.name = name;
	}
	public void getTrainTicketDetails()
	{
		System.out.println("PNR: "+this.pnr);
		System.out.println("Age: "+this.age);
		System.out.println("Gender: "+this.gender);
		System.out.println("Name: "+this.name);
	}
}