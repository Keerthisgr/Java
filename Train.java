class Train
{	
	int trainNumber;
	int numberOfCoaches;
	String trainName;
	
	public Train(){
		System.out.println("Train class constructor called!!");
	}
		public Train(int trainNo,int noOfCoach,String trainNme){
			trainNumber = trainNo;
			numberOfCoaches = noOfCoach;
			trainName = trainNme;
	}
	
	public void getTrainDetails()
	{
		System.out.println("Train Number: "+trainNumber);
		System.out.println("Number of coaches in train: "+numberOfCoaches);
		System.out.println("Name of the train: "+trainName);
		System.out.println("---------------------------------");
	}
}