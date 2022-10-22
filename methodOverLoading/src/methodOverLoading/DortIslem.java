package methodOverLoading;

// aynı isimde oluşturulan 2 method var ancak içerikleri farklı. Aynı isimde olmasına rağmen ikisini de çağırabiliriz. Buna overloading denir.


public class DortIslem {
	
  public int  topla(int sayi1, int sayi2) {
	 return sayi1 +sayi2; 
	  
  }
  
  public int topla(int sayi1, int sayi2, int sayi3) {
	  return sayi1 + sayi2 + sayi3;
	  
  }
	  
  
    

}
