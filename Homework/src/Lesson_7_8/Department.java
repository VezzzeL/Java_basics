package Lesson_7_8;

import java.util.ArrayList;
import java.util.Random;

public class Department {

    Random random=new Random();
    String[]roles={"SELLnSPEAK","TROLnCONTROL","JOYSnGAMES","HELPnPAY"};
    InternalMobility internalMobility=new InternalMobility();

    public void hireEmployee(String name, String surname, String education){
        internalMobility.hireEmployee(new Employee(name,surname,education));
    }
    public void retireEmployee(String name,String surname, String education){
        internalMobility.retireEmployee(new Employee(name,surname,education));
    }
    public void showMeHistory(){
        internalMobility.getHistory();
    }
    private class Employee{

        String name, surname,education,role;
        int id=10_000;

        private Employee(String name, String surname, String education) {
            this.name = name;
            this.surname = surname;
            this.education = education;
            this.id = id+1;
            id=id+1;
            int i=random.nextInt(roles.length);
            this.role=roles[i];
        }
    }
    private class InternalMobility{
        ArrayList mobilityHistory=new ArrayList();
        ArrayList currentPersonal=new ArrayList();
        StringBuilder employeeIdentity=new StringBuilder();

        private void hireEmployee(Employee employee){
            employeeIdentity.delete(0,employeeIdentity.lastIndexOf(employeeIdentity.toString()));
            employeeIdentity.append(employee.name+employee.surname+employee.education);

            mobilityHistory.add("Hired: "+employee.name+" "+employee.surname+" "+employee.role);
            currentPersonal.add(employeeIdentity);
        }
        private void retireEmployee(Employee employee){
            employeeIdentity.delete(0,employeeIdentity.lastIndexOf(employeeIdentity.toString()));
            employeeIdentity.append(employee.name+employee.surname+employee.education);

            mobilityHistory.add("Retired: "+employee.name+" "+employee.surname);
            currentPersonal.remove(employeeIdentity);
        }
        private void getHistory(){
            for(int i=0;i<mobilityHistory.size();i++){
                System.out.println(mobilityHistory.get(i));
            }
        }
    }

    public static void main(String[] args) {
        Department department=new Department();
        department.hireEmployee("Pedro","Pedruchio","Clown");
        department.hireEmployee("Stefan","Stepanenko","Baker");
        department.hireEmployee("Liza","Luiza","Finance");
        department.retireEmployee("Liza","Luiza","Finance");
        department.showMeHistory();
    }
}
