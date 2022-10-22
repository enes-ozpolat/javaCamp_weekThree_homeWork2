
public interface ICustomerDal {  //Dal, Data Access Layer. Yani veri tabanı ile alakalı olanlarda Dal kullanılır, anlaşılması için.
	void add();                  // Interface burada imza olarak kullanılmıştır.
 
}

// sınıflar sadece bir sınıfı extend edebilirken, birden fazla interface i implement edebilir.

// Interfaceler genel olarak katmanlar arası geçişler için kullanılırlar ve referans tutuculardır.
// Katmanlar; Database Layer, Business Layer, Interface Layer