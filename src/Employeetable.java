import java.util.*;
public class Employeetable {

	 public String empName;
	 public int empId;
	 public double empSal;
	 Employeetable employees[] = new Employeetable[100];
		 
		 public Employeetable(String empName,int empId,double empSal){
	         this.empName=empName;
	         this.empId=empId; 
	         this.empSal=empSal;
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
		
			ArrayList<Employeetable> emp=new ArrayList<Employeetable>(); 	
			for (int i = 0; i <= 100; i++) {
				String name="emp" + i;
				int id= i;
				double sal = i+100;
				Employeetable employees = new Employeetable(name,id,sal);
				emp.add(employees);
			}
			
			for (int i = 0; i < emp.size() ; i++) {
				Employeetable employees = (Employeetable) emp.get(i);
				System.out.println("Employee " + i +  " name is " + employees.getEmpName());
				System.out.println("Employee " + i +  " id is " + employees.getEmpId());
				System.out.println("Employee " + i +  " sal is " + employees.getSalary());
			    } 
			
		
		
		}

	}



