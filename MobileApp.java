class MobileApp
{
	static int index;
	static String applications[] = {null, null, null, null, null};
	public static void main(String app[])
	{
		String application = "WhatsApp";
		boolean isAppAdded =create(application);
		System.out.println(application+" added is "+isAppAdded);
		application = "Telegram";
		isAppAdded =create(application);
		System.out.println(application+" added is "+isAppAdded);
		application = "Inshorts";
		isAppAdded =create(application);
		System.out.println(application+" added is "+isAppAdded);
		application = "Udemy";
		isAppAdded =create(application);
		System.out.println(application+" added is "+isAppAdded);
		application = "Instagram";
		isAppAdded =create(application);
		System.out.println(application+" added is "+isAppAdded);
		application = "Facebook";
		isAppAdded =create(application);
		System.out.println(application+" added is "+isAppAdded);
	}
	public static boolean create(String application)
	{
		boolean isAppAdded = false;
		if(application != null && index < applications.length)
		{
			isAppAdded = true;
			applications[index] = application;
			index++;
			return isAppAdded=true;
		}
		return isAppAdded;
	}
}