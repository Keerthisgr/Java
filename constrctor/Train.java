class Train
{	
	int trainNumber;
	int numberOfCoaches;
	String trainName;
	String passengerName;
	
	public Train(){
		this(18657,17);
		System.out.println("Train class constructor called with no arguments!!");
	}
	public Train(int trainNumber, int numberOfCoaches){
			this("Intercity Express","Keerthi");
			System.out.println("parameterized constructor with two int type variable");
			this.trainNumber = trainNumber;
			this.numberOfCoaches = numberOfCoaches;
	}
	public Train(String trainName, String passengerName){
			System.out.println("parameterized constructor with two string type variable");
			this.trainName = trainName;
			this.numberOfCoaches = numberOfCoaches;
	}
	
	
	public void getTrainDetails()
	{
		System.out.println("Train Number: "+this.trainNumber);
		System.out.println("Number of coaches in train: "+this.numberOfCoaches);
		System.out.println("Name of the train: "+this.trainName);
		System.out.println("Name of passanger: "+this.passengerName);
	}
}