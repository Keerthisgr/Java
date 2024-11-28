package com.xworkz.instituteapp.institute;

public interface Institute {
    public boolean addTrainee(Training traineee);
    public void getDetails();
    public Training getNameById(int id);
    public Training getGenderById(int id);
    public Training getNameByGender(GenderType gender);
    public Training getPhoneNumberByName(String name);
    public Training getEmailByName(String name);
    public Training getEmailById(int id);
    public Training getDOBById(int id);
    public Training getDegreeNameByName(String name);
    public Training getYearByDegree(String degree);
    public boolean updateEmailById(String UpdatedEmail,int id);
    public boolean updateNumByName(long updatedNumber,String name);
    public boolean updatePlacedByName(boolean placed,String name);
    public boolean deleteTraineeById( int id);
}
