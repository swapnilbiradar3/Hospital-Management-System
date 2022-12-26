/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author swapnilbiradar
 */
public class DoctorDirectory {
    
    private ArrayList<Doctor> doctors;

    public DoctorDirectory() {
        doctors = new ArrayList<>();
        addDoctors();
    }
    
    
    public void addDoctors() {
        Doctor p1 = new Doctor("Dr Peter",new House("75Aplhonsus",new City("Boston"),"MA",021200,"abc"),"Male","11/29/1997",1,11);
        Doctor p2 = new Doctor("Dr Kal",new House("75Aplhonsus",new City("Boston"),"MA",021200,"abc"),"Male","11/29/1997",2,22);
        Doctor p3 = new Doctor("Dr Raj",new House("75Aplhonsus",new City("Boston"),"MA",021200,"abc"),"Male","11/29/1997",3,33);
        Doctor p4 = new Doctor("Dr Anis",new House("75Aplhonsus",new City("Boston"),"MA",021200,"abc"),"Male","11/29/1997",4,44);
        addDoctor(p1);
        addDoctor(p2);
        addDoctor(p3);
        addDoctor(p4);
    }

    public void addDoctor(Doctor doctor){
        doctors.add(doctor);
    }
    public void addDoctor(String name, House residence, String gender, String dob, int id, int patientId) {

        Doctor doctor = new Doctor(name, residence, gender,dob,id,patientId);

        doctors.add(doctor);
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(ArrayList<Doctor> doctors) {
        this.doctors = doctors;
    }
    public Doctor getDoctor(String name){
        
        for (Doctor emp : doctors) {
 
            if (emp.getName() == name) {
                return emp;
            }
        }
        return null;
    }
    
    public void deleteDoctor(String name){
        
        for (Doctor emp : doctors) {
 
            if (emp.getName() == name) {
                doctors.remove(emp);
                break;
            }
            else if(emp.getDocId() == Integer.parseInt(name)){
                doctors.remove(emp);
                break;
            }
        }
    }
    
    public DoctorDirectory idFilter(int eId) {

        DoctorDirectory list = new DoctorDirectory();
        for (Doctor emp : doctors) {
            if (emp.getDocId() == eId) {
                list.addDoctor(emp);
            }
        }
        return list;
    }
    
    public DoctorDirectory idFilter(String eId) {

        DoctorDirectory list = new DoctorDirectory();
        for (Doctor emp : doctors) {
            if (emp.getResidence().getCommunity().equals(eId)) {
                list.addDoctor(emp);
            }
        }
        return list;
    }
    
   
    
    
}
