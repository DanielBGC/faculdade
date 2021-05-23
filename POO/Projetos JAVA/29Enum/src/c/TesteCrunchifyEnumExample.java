package c;


//https://crunchify.com/why-and-for-what-should-i-use-enum-java-enum-examples/
public class TesteCrunchifyEnumExample {
 
	public enum Company {
		EBAY, PAYPAL, GOOGLE, YAHOO, ATT
	}
 
	Company cName;
 
	public TesteCrunchifyEnumExample(Company cName) {
		this.cName = cName;
	}
 
	public void companyDetails() {
		switch (cName) {
		case EBAY:
			System.out.println("Biggest Market Place in the World.");
			break;
 
		case PAYPAL:
			System.out.println("Simplest way to manage Money.");
			break;
 
		case GOOGLE:
		case YAHOO:
			System.out.println("1st Web 2.0 Company.");
			break;
 
		default:
			System.out.println("Google - biggest search giant.. ATT - my carrier provider..");
			break;
		}
	}
 
	public static void main(String[] args) {
		TesteCrunchifyEnumExample ebay = new TesteCrunchifyEnumExample(Company.EBAY);
		ebay.companyDetails();
		TesteCrunchifyEnumExample paypal = new TesteCrunchifyEnumExample(Company.PAYPAL);
		paypal.companyDetails();
		TesteCrunchifyEnumExample google = new TesteCrunchifyEnumExample(Company.GOOGLE);
		google.companyDetails();
		TesteCrunchifyEnumExample yahoo = new TesteCrunchifyEnumExample(Company.YAHOO);
		yahoo.companyDetails();
		TesteCrunchifyEnumExample att = new TesteCrunchifyEnumExample(Company.ATT);
		att.companyDetails();
	}
        
}
