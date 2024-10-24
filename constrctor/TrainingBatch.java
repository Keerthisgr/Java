class TrainingBatch
{
	String batchName;
	int noOfTrainees;
	String trainerName;
	String instituteName;
	
	public TrainingBatch()
	{
		this("GO19",20);
		System.out.println("TrainingBatch constructor called with no arguments!!");
	}
	public TrainingBatch(String batchName,int noOfTrainees)
	{
		this("Devendra Singh","X-workz");
		System.out.println("Parameterized constructor with string and int type variable");
		this.batchName = batchName;
		this.noOfTrainees = noOfTrainees;
	}
	public TrainingBatch(String trainerName,String instituteName)
	{
		System.out.println("Parameterized constructor with two string type variable");
		this.trainerName = trainerName;
		this.instituteName = instituteName;
	}
	public void getDetails()
	{
		System.out.println("Batch name: "+this.batchName);
		System.out.println("Number of trainees: "+this.noOfTrainees);
		System.out.println("Trainer name: "+this.trainerName);
		System.out.println("Institute name: "+this.instituteName);
	}
}
