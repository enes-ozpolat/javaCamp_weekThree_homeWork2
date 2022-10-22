
public class Main {

	public static void main(String[] args) {
		
		ICustomerDal customerDal = new MySqlCustomerDal();  //Burada ICustomerDal inrerface i OrcaleCustomerDal sınıfının referansını tutuyor.
		customerDal.add();
		
		

	}

}
