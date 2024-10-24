class Electricity
{
	String rrNo;
	long accountId;
	String address;
	double cost;
	
	public Electricity(){
		this("14539E",8945667895l);
		System.out.println("Electricity class constroctor with no arguments is invoked");
	}
	public Electricity(String rrNo,long accountId){
		this("Rajaji nagar",350.55);
		System.out.println("Parameterized constructor having string and long type of instance variable");
		this.rrNo = rrNo;
		this.accountId = accountId;
	}
	public Electricity(String address,double cost){
		System.out.println("Parameterized constructor having string and long type of instance variable");
		this.address = address;
		this.cost = cost;
	}
	public void getDetails()
	{
		System.out.println("RR No: "+this.rrNo);
		System.out.println("Account ID: "+this.accountId);
		System.out.println("Address: "+this.address);
		System.out.println("Cost: "+this.cost);
	}
}