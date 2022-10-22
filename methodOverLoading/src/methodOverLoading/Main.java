package methodOverLoading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		
		// overloading sayesinde aynı işlemdeki iki methodu da yazdırabildik.
		
		System.out.println(dortIslem.topla(2, 3));
		
		System.out.println(dortIslem.topla(5, 7, 9));
		

	}

}
