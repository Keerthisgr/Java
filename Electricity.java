class Electricity
{
	String rrNo;
	long accountId;
	String address;
	
	public Electricity(){
		System.out.println("Electricity class constroctor invoked");
	}
	public Electricity(String rRNum,long accId,String addrs){
		rrNo = rRNum;
		accountId = accId;
		address = addrs;
	}
	public void getDetails()
	{
		System.out.println("RR No: "+rrNo);
		System.out.println("Account ID: "+accountId);
		System.out.println("Address: "+address);
		System.out.println("---------------------------");
	}
}