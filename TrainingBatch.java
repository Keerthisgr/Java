class TrainingBatch
{
	String batchName;
	int noOfTrainees;
	String trainerName;
	String instituteName;
	
	public TrainingBatch()
	{
		System.out.println("TrainingBatch constructor called!!");
	}
	public TrainingBatch(String btchName,int numOfTrainee,String trainerNme,String instituteNme)
	{
		batchName = btchName;
		noOfTrainees = numOfTrainee;
		trainerName = trainerNme;
		instituteName = instituteNme;
	}
	public void getDetails()
	{
		System.out.println("Batch name: "+batchName);
		System.out.println("Number of trainees: "+noOfTrainees);
		System.out.println("Trainer name: "+trainerName);
		System.out.println("Institute name: "+instituteName);
		System.out.println("-------------------------");
	}
}
