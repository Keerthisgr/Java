class OperatingSystemTester
{
	public static void main(String val[])
	{
		OperatingSystem os1 = new OperatingSystem("Android", "android-12");
		os1.getOperatingSystemDetails();
		
		OperatingSystem os2 = new OperatingSystem("Android","android-14");
		os2.getOperatingSystemDetails();
		
		OperatingSystem os3 = new OperatingSystem("Android","android-10");
		os2.getOperatingSystemDetails();
		
		OperatingSystem os4 = new OperatingSystem("Android", "android-8");
		os4.getOperatingSystemDetails();
		
		OperatingSystem os5 = new OperatingSystem("MacOS","MacOS-12");
		os5.getOperatingSystemDetails();
		
		OperatingSystem os6 = new OperatingSystem("MacOS","MacOS-9");
		os6.getOperatingSystemDetails();
		
		OperatingSystem os7 = new OperatingSystem("Linux","Linux-06");
		os7.getOperatingSystemDetails();
		
		OperatingSystem os8 = new OperatingSystem("Linux","Linux-04");
		os8.getOperatingSystemDetails();
		
		OperatingSystem os9 = new OperatingSystem("MacOS","MacOS-06");
		os9.getOperatingSystemDetails();
	}
}