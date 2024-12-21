package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.institute.exception.DegreeNotFoundException;
import com.xworkz.instituteapp.institute.exception.GenderNotFoundException;
import com.xworkz.instituteapp.institute.exception.IdNotFoundException;
import com.xworkz.instituteapp.institute.exception.NameNotFoundException;

public interface Institute {
    public boolean addTrainee(Training traineee);
    public void getDetails();
    public Training getNameById(int id) throws IdNotFoundException;
    public Training getGenderById(int id)throws IdNotFoundException;
    public Training getNameByGender(GenderType gender) throws GenderNotFoundException;
    public Training getPhoneNumberByName(String name) throws NameNotFoundException;
    public Training getEmailByName(String name)throws NameNotFoundException;
    public Training getEmailById(int id)throws IdNotFoundException;
    public Training getDOBById(int id)throws IdNotFoundException;
    public Training getDegreeNameByName(String name)throws NameNotFoundException;
    public Training getYearByDegree(String degree) throws DegreeNotFoundException;
    public boolean updateEmailById(String UpdatedEmail,int id);
    public boolean updateNumByName(long updatedNumber,String name);
    public boolean updatePlacedByName(boolean placed,String name);
    public boolean deleteTraineeById( int id);
}
