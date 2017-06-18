
import java.util.*;

public class Employeetable1 {

	 private String empName;
	 private int empId;
	 private double empSal;
	 Employeetable1 employees[] = new Employeetable1[100];
	 
	 public Employeetable1(String name,int id,double sal){
         this.empName = name;
         this.empId = id;
         this.empSal = sal;
      }
	 
	 public String getEmpName(){
		 return empName;
	 }
	
	 public int getEmpId(){
	     return empId;
	 }
	 
	  public double getSalary(){
	     return empSal;
	 }
	 
	public static void main(String[] args) {
	
		Map<Integer,Employeetable1> empMap=new HashMap<Integer,Employeetable1>();  
		for (int i = 0; i <= 100; i++) {
			String name="emp" + i;
			int id= i;
			double sal = i+100;
			Employeetable1 employees = new Employeetable1(name,id,sal);
			empMap.put(i, employees);
		}
		
		
		 for(Map.Entry<Integer, Employeetable1> entry:empMap.entrySet()){    
		        int employeeId=entry.getKey();  
		        Employeetable1 empDetails=entry.getValue();  
		        System.out.println(employeeId+" Details:");  
		        System.out.println("Employee Name is " + empDetails.getEmpName() + " id is "+ empDetails.getEmpId() +" and salary is " + empDetails.getSalary());   
		    }   
	
	
	}

}
