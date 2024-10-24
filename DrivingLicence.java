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
		System.out.println("DrivingLicence construcor called!!");
	}
	
	public DrivingLicence(String dno,String ownerName, String dOB, String validityDate,String bloodGrp,String nameOfFather,int rtoNo)
	{
		dlNo = dno;
		name = ownerName;
		dob = dOB;
		validTill = validityDate;
		bloodGroup = bloodGrp;
		fatherName = nameOfFather;
		rtoOfficeNumber = rtoNo;
	}
	public void getDetails()
	{
		System.out.println("DL No: "+dlNo);
		System.out.println("Name: "+name);
		System.out.println("DOB: "+dob);
		System.out.println("Valid Till: "+validTill);
		System.out.println("Blood Group: "+bloodGroup);
		System.out.println("Father name: "+fatherName);
		System.out.println("RTO Office number "+rtoOfficeNumber);
		System.out.println("----------------------");
	}
}