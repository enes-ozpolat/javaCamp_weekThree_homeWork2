
public class Main {

	public static void main(String[] args) {
		Product product = new Product() ;
		product.setId(1) ;
		product.setName("Leptop") ;
		product.setDescription("diz üstü pc") ;
		product.setPrice(5000) ;
		product.setStaockAmount(3) ;
		
		
		
		ProductManager productManager = new ProductManager() ;
		productManager.Add(product);
		
	
		
		System.out.println(product.getKod());
		
		
		
	}

}
