
public class Main {

	public static void main(String[] args) {

  
         KrediUI krediUI = new KrediUI() ;
         krediUI.KrediHesapla(new AskerKrediManager());
         krediUI.KrediHesapla(new OgretmenKrediManager());
         krediUI.KrediHesapla(new TarimKrediManager());
         
         // "kredıUI.KrediHesapla" ile diğer sınıfları bir aile ilişkisi içinde çağırabiliyoruz. Bu yapı "POLİMORFİZM" olarak bilinir.
         //  Polimorfizm, çok biçimlilik demek. Aralarında inheritance olan referans tiplerin birbirinin referansını tutması durumudur.   

	}

}
