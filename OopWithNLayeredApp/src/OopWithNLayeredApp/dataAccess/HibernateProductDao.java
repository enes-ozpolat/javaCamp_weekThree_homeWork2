package OopWithNLayeredApp.dataAccess;

import OopWithNLayeredApp.entitites.Product;

public class HibernateProductDao implements ProductDao {
	
	public void add(Product product) {
		//Sadece DB erişim kodları buraya yazılır. Burası için SQL bilmek gerekir.
		System.err.println("Hibernate ile veritabanına eklendi.");
		
	}

}
