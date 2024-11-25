package com.xworkz.instituteapp.institute;

import com.xworkz.instituteapp.gendertype.GenderType;
import com.xworkz.instituteapp.training.Training;

import java.util.Arrays;

public class Institute {
    Training trainees[] = new Training[5];
    int index;

    public boolean addTrainee(Training traineee){
        boolean isTraineeAdded = false;
        if(index < this.trainees.length){
            this.trainees[index++] = traineee;
            isTraineeAdded = true;
        }
        else{
            System.out.println("Maximum length is reached!!..");
        }
        return isTraineeAdded;
    }
    public void getDetails(){
        for(Training tra : trainees){
            if(tra!=null){
                System.out.println("Id: "+tra.getId());
                System.out.println("Name: "+tra.getName());
                System.out.println("Year of graduation: "+tra.getYearOfGraduation());
                System.out.println("Degree name: "+tra.getDegreeName());
                System.out.println("Date of Birth: "+tra.getDoB());
                System.out.println("Email: "+tra.getEmail());
                System.out.println("Gender Type: "+tra.getGenderType());
                System.out.println("********************************");
            }
        }
    }
    public Training getNameById(int id){
        Training traineeId = null;
        System.out.println("Name by id method is invoked");
        for(Training trainee:trainees){
            if(trainee.getId()==id){
                traineeId=trainee;
                System.out.println("Name: "+trainee.getName());
                System.out.println("********************************");
            }
        }
        if(traineeId==null)
            System.out.println("Id not found");
        return traineeId;
    }

    public Training getGenderById(int id){
        Training traine = null;
        System.out.println("Gender by id method is invoked");
        for(Training trainee:trainees){
            if(trainee.getId()==id){
                traine=trainee;
                System.out.println("Gender Type: "+traine.getGenderType());
                System.out.println("********************************");
            }
        }
        if(traine==null)
            System.out.println("Id not found");
        return traine;
    }

    public Training getNameByGender(GenderType gender){
        Training tra = null;
        System.out.println("Name by gender method is invoked");
        for(Training t:trainees){
            if(t.getGenderType()==gender){
                tra=t;
                System.out.println("Name: "+tra.getName());
                System.out.println("********************************");
            }
        }
        if(tra==null)
            System.out.println("Gender not found");
        return tra;
    }
    public Training getPhoneNumberByName(String name){
        Training no = null;
        System.out.println("Phone number by name method is invoked");
        for(Training n:trainees){
            if(n.getName()==name){
                no=n;
                System.out.println("Phone number: "+no.getPhoneNumber());
                System.out.println("********************************");
            }
        }
        if(no==null)
            System.out.println("Name not found");
        return no;
    }

    public Training getEmailByName(String name){
        Training nam = null;
        System.out.println("Email by name method is invoked");
        for(Training tr:trainees){
            if(tr.getName()==name){
                nam=tr;
                System.out.println("Email: "+nam.getEmail());
                System.out.println("********************************");
            }
        }
        if(nam==null)
            System.out.println("Id not found");
        return nam;
    }
    public Training getEmailById(int id){
        Training n = null;
        System.out.println("Email by Id method is invoked");
        for(Training tri:trainees){
            if(tri.getId()==id){
                n=tri;
                System.out.println("Email: "+n.getEmail());
                System.out.println("********************************");
            }
        }
        if(n==null)
            System.out.println("Id not found");
        return n;
    }
    public Training getDOBById(int id){
        Training n1 = null;
        System.out.println("DOB by Id method is invoked");
        for(Training trin:trainees){
            if(trin.getId()==id){
                n1=trin;
                System.out.println("DOB: "+n1.getDoB());
                System.out.println("********************************");
            }
        }
        if(n1==null)
            System.out.println("Id not found");
        return n1;
    }

    public Training getDegreeNameByName(String name){
        Training n2 = null;
        System.out.println("Degree name by name method is invoked");
        for(Training trim:trainees){
            if(trim.getName()==name){
                n2=trim;
                System.out.println("Degree name: "+n2.getDegreeName());
                System.out.println("********************************");
            }
        }
        if(n2==null)
            System.out.println("name not found");
        return n2;
    }
    public Training getYearByDegree(String degree){
        Training n3 = null;
        System.out.println("Year of passing by degree name method is invoked");
        for(Training trinn:trainees){
            if(trinn.getDegreeName()==degree){
                n3=trinn;
                System.out.println("Year of passing: "+n3.getEmail());
                System.out.println("********************************");
            }
        }
        if(n3==null)
            System.out.println("degree name not found");
        return n3;
    }

    public boolean updateEmailById(String UpdatedEmail,int id){
        boolean isUpdated = false;
        for(Training ref:trainees){
            if(ref.getId()==id){
                ref.setEmail(UpdatedEmail);
                isUpdated = true;
            }
        }
        if(isUpdated==false)
            System.out.println("id not found");
        return isUpdated;
    }

    public boolean updateNumByName(long updatedNumber,String name){
        boolean isNumUpdated = false;
        for(Training ref1:trainees){
            if(ref1.getName()==name){
                ref1.setPhoneNumber(updatedNumber);
                isNumUpdated = true;
            }
        }
        if(isNumUpdated==false)
            System.out.println("Name not found");
        return isNumUpdated;
    }

    public boolean updatePlacedByName(boolean placed,String name) {
        boolean isPlacedUpdated = false;
        for (Training ref3 : trainees) {
            if (ref3.getName() == name) {
                ref3.setPlaced(placed);
                isPlacedUpdated = true;
            }
        }
        if (isPlacedUpdated == false)
            System.out.println("Name not found");
        return isPlacedUpdated;
    }

        public boolean deleteTraineeById( int id){
            boolean isTraineeDeleted = false;
            int i = 0;
            for (int start = 0; start < this.trainees.length; start++) {
                if (trainees[start].getId() != id) {
                    trainees[i++] = trainees[start];
                } else {
                    isTraineeDeleted = true;
                }
            }
            int size = i;
            trainees = Arrays.copyOf(trainees, i);
            return isTraineeDeleted;
        }
    }


