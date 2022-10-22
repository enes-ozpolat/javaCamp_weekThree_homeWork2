
public abstract class GameCalculator { // Sınıf Abstract olunca sadece imza olarak bırakılır, hesaplamalar her extend edenin içine ayrıca yazılır.

	public abstract void hesapla();   //Burada abstract yaparak burayı extend eden tüm sınıfların hesapla yı kullanmasını zorunlu hale getirdik.
		
		
	
	
	public final void gameOver() {
		System.out.println("Oyun Bitti!");
	}
}
