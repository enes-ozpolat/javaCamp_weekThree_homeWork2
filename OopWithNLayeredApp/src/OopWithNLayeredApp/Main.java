package OopWithNLayeredApp;

import OopWithNLayeredApp.business.ProductManager;
import OopWithNLayeredApp.core.logging.DatabaseLogger;
import OopWithNLayeredApp.core.logging.FileLogger;
import OopWithNLayeredApp.core.logging.Logger;
import OopWithNLayeredApp.core.logging.MailLogger;
import OopWithNLayeredApp.dataAccess.HibernateProductDao;
import OopWithNLayeredApp.dataAccess.JdbcProductDao;
import OopWithNLayeredApp.entitites.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		
		Product product1 = new Product(1, "Iphone Xr", 10000);
		Logger[] loggers = {new DatabaseLogger(), new MailLogger(), new FileLogger()} ;
		
		ProductManager productManager = new ProductManager(new JdbcProductDao(), loggers);
		productManager.add(product1);

	}

}
