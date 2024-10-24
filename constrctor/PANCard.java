class PANCard
{
	String panNo;
	String name;
	String fatherName;
	String dob;
	int cost;
	
	public PANCard()
	{
		this("HUYJF7896Y","Arun");
		System.out.println("PANCard constructor called with no arguments!!");
	}
	public PANCard(String panNo,String name)
	{
		this("Ramesh","12/09/2000",350);
		System.out.println("Parameterized constructor with two string type variable");
		this.panNo = panNo;
		this.name = name;
	}
	public PANCard(String fatherName,String dob,int cost)
	{
		System.out.println("Parameterized constructor with two string and int type variable");
		this.fatherName = fatherName;
		this.dob = dob;
		this.cost = cost;
	}
	public void details(){
		System.out.println("PAN Number: "+this.panNo);
		System.out.println("Name: "+this.name);
		System.out.println("Father name: "+this.fatherName);
		System.out.println("DOB: "+this.dob);
		System.out.println("Cost: "+this.cost);
	}
}