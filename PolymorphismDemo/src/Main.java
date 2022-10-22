

public class Main {

	public static void main(String[] args) {
	
		//FileLogger logger = new FileLogger();
		
		//logger.Log("Log Mesajı: ");
			
			
	// Burada tüm sınıfların "BaseLogger" sınıfı ile inheritance ilişkisi olduğu için işlem yaptığımız sınııfn içi boş olsada "BaseLogger" içindeki "log" fonksiyonu polymorfizm den dolayı çalışacaktır.

		
		BaseLogger[] loggers = new BaseLogger[] {new DatabaseLogger(), new FileLogger(), new EmailLogger()} ;
		for (BaseLogger logger:loggers) {
			logger.Log("Log Mesajı ");
		
			
		}
		
	}
	
	
	

}
