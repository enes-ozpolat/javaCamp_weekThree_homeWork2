
public class Main {

	public static void main(String[] args) {
	
		Customer customer  = new Customer() ;
		Employee employee = new Employee() ;
		
	
		
		CustomerManager customerManager = new CustomerManager() ;
		EmployeeManager employeeManager = new EmployeeManager() ;
		
		customerManager.Add();
		employeeManager.BestEmployee();
		
		
		
		
		// Inheritance "miras" manasındadır. Burada aynı fields ları kullanacağımız birden fazla sınıf var ise, 
		//ortak olanları bir sınıf altında toplarız ve diğerlerinde bu sınıfı extend ederek yeniden onların altında yazmaya gerek kalamdan getirebiliriz.
		
		
		}

	}


