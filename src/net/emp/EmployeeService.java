package net.emp;

import java.util.*;

public class EmployeeService {
	// Q1: Add Employees (with duplicate)
	public List<EmployeeData> addEmployee() {
		List<EmployeeData> list = new ArrayList<EmployeeData>();

		list.add(new EmployeeData(101, "Khadeer", "IT"));
		list.add(new EmployeeData(103, "Srikanth", "HR"));
		list.add(new EmployeeData(102, "Khan", "Finance"));
		list.add(new EmployeeData(104, "Haneef", "Admin"));
		list.add(new EmployeeData(101, "Khadeer", "IT"));
		return list;
	}
		//Q2. Remove duplicates

		public Set<EmployeeData> removeDuplicateEmployees(List<EmployeeData> list) {
			 

			Set<EmployeeData> set = new HashSet<>(list);   // duplicates not allowed.
			return set;
	}
		//Q3. Sorting
		
	public List<EmployeeData> sortEmployees(List<EmployeeData>list){
		Collections.sort(list);
		return list;
	}
	
	 //Q4.storeInLinkedHashMap()
		public Map<Integer, EmployeeData> storeInLinkedHashMap() {
			Map<Integer,EmployeeData> map = new LinkedHashMap<>();
			map.put(1,new EmployeeData(101, "Khadeer", "IT"));
			map.put(3,new EmployeeData(103, "Srikanth", "HR"));
			map.put(2,new EmployeeData(102, "Khan", "Finance"));
			map.put(4,new EmployeeData(104, "Haneef", "Admin"));
			map.put(5,new EmployeeData(101, "Khadeer", "IT"));

			for (Map.Entry<Integer, EmployeeData> entry : map.entrySet()) {
			    System.out.println(entry.getKey() + " -> " + entry.getValue());
			}

	        return map;
    }	
		

		//Q5. storeInTreeMap()
		
		public Map<Integer, EmployeeData> storeInTreeMap() {
			 Map<Integer, EmployeeData> map = new TreeMap<>();
				map.put(1,new EmployeeData(101, "Khadeer", "IT"));
				map.put(3,new EmployeeData(103, "Srikanth", "HR"));
				map.put(2,new EmployeeData(102, "Khan", "Finance"));
				map.put(4,new EmployeeData(104, "Haneef", "Admin"));
				map.put(5,new EmployeeData(101, "Khadeer", "IT"));
				
				
				for (Map.Entry<Integer, EmployeeData> entry : map.entrySet()) {
				    System.out.println(entry.getKey() + " -> " + entry.getValue());
				}
				return map;
				
			 

		}
		

		//Q6.getEmployeeById(int id)
		//Retrieve employee using Map.
		public EmployeeData getEmployeeById(int id) {
			 Map<Integer, EmployeeData> map = new TreeMap<>();
				map.put(1,new EmployeeData(101, "Khadeer", "IT"));
				map.put(3,new EmployeeData(103, "Srikanth", "HR"));
				map.put(2,new EmployeeData(102, "Khan", "Finance"));
				map.put(4,new EmployeeData(104, "Haneef", "Admin"));
				map.put(5,new EmployeeData(101, "Khadeer", "IT"));
				
		      
				return map.get(id);
		}
		


		// Q7. removeEmployeeSafely()
		//Remove employee using Iterator.remove().
		
		 public List<EmployeeData> removeEmployeeSafely(List<EmployeeData> list){
			 
			 
			 Iterator<EmployeeData> itr = list.iterator();

				while (itr.hasNext()) {

					EmployeeData emp = itr.next();

					if (emp.getId() == 101) {

						itr.remove();  //When it finds  employee  ID 101 it safely removes the employee.

					}
				}
				return list;
		 }
			
			//Q8. explainFailFast()
			

			public String explainFailFast() {
				// TODO Auto-generated method stub
				return null;
			}

}
