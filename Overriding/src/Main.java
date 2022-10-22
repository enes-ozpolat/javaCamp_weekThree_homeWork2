
public class Main {

	public static void main(String[] args) { 
		
		BaseCreditManager[] creditManagers = new BaseCreditManager[] {new TeacherCreditManager(), new CarCreditManager(), new StudentCreditManager()} ;
				  
				   for (BaseCreditManager creditManager : creditManagers) {
				  
				 double tutar;
				 System.out.println(creditManager.hesapla( tutar = 1000)); 
				
				  
				   }
			
		

	}

}

