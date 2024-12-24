class Olympics
{
	static String sportsNames[] = {null, null, null, null, null, null, null, null, null, null, null, null, null, null,null};
	static int index;
	public static boolean addSportsName(String sportsName)
	{
		boolean isSportsNameAdded = false;
		if(sportsNames != null && index < sportsNames.length)
		{
			sportsNames[index++]=sportsName;
			isSportsNameAdded = true;
		}else
		{
			System.out.println("Array is fulled");
		}
		return isSportsNameAdded;
	}
	public static void getSportsName()
	{
		System.out.println("List of sports names are ");
		for(String sportsName : sportsNames)
		{
			System.out.println(sportsName);
		}
	}
}
