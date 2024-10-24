class DrivingLicence
{
	String dlNo;
	String name;
	String dob;
	String validTill;
	String bloodGroup;
	String fatherName;
	int rtoOfficeNumber;
	public DrivingLicence()
	{
		this("KA14 2020 6787897","Kavya","12/09/2002");
		System.out.println("DrivingLicence constructor called which do not contain any argument!!");
	}
	
	public DrivingLicence(String dlNo,String name, String dob)
	{
		this("14/10/2036","A+","Ramesh",14);
		System.out.println("parameterized constructor which having three string type is invoked");
		this.dlNo = dlNo;
		this.name = name;
		this.dob = dob;
	}
	public DrivingLicence(String validTill,String bloodGroup, String fatherName, int rtoOfficeNumber)
	{
		System.out.println("parameterized constructor which having three string and int type is invoked");
		this.validTill = validTill;
		this.bloodGroup = bloodGroup;
		this.fatherName = fatherName;
		this.rtoOfficeNumber = rtoOfficeNumber;
	}
	public void getDetails()
	{
		System.out.println("DL No: "+this.dlNo);
		System.out.println("Name: "+this.name);
		System.out.println("DOB: "+this.dob);
		System.out.println("Valid Till: "+this.validTill);
		System.out.println("Blood Group: "+this.bloodGroup);
		System.out.println("Father name: "+this.fatherName);
		System.out.println("RTO Office number "+this.rtoOfficeNumber);
	}
}
