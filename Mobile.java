class Mobile
{
	static int index;
	static String applications[] = {null, null, null, null, null};
	public static void main(String app[])
	{
	create("WhatsApp");
	create("Pintrest");
	create("Inshorts");
	create("Udemy");
	create("Telegram");
	create("Instagram");
	create("Facebook");
	
	}public static void create(String application)
	{
		if(application != null && index < applications.length)
		{
			applications[index] = application;
			System.out.println(application+" added successfully ");
			index++;
		}
	}
}