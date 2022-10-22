package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entitites.Product;

public class JdbcProductDao implements ProductDao {
	
	public void add(Product product) {
		//Sadece DB erişim kodları buraya yazılır. Burası için SQL bilmek gerekir.
		System.err.println("JDBC ile veritabanına eklendi.");
		
	}

}
