class PANCard
{
	String panNo;
	String name;
	String fatherName;
	String dob;
	
	public PANCard()
	{
		System.out.println("PANCard constructor called!!");
	}
	public PANCard(String panNum,String nme,String fname,String dOB)
	{
		panNo = panNum;
		name = nme;
		fatherName = fname;
		dob = dOB;
	}
	public void details(){
		System.out.println("PAN Number: "+panNo);
		System.out.println("Name: "+name);
		System.out.println("Father name: "+fatherName);
		System.out.println("DOB: "+dob);
		System.out.println("-------------------");
	}
}