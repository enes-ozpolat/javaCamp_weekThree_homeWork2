
public class StudentCreditManager extends BaseCreditManager {
	public double hesapla(double tutar) {
		return tutar * 1.10 ;
		
		
		
	}
	
		
		
	

}

// Diğerlerini aksine student içine Base içindeki kod aynı şekilde alınarak kredi oranı değiştirildi. Burada yapılan işlem ile student içindeki kod ile Base i ezmiş olduk.
// Bu duruma overriding deniliyor. Yani üstüne yazma.