package abstractFactoryPattern;

public class FactoryProducer {
	
	public static VehicalFactory getVehicalFactory(String type) {
		if(type.equalsIgnoreCase("ordinary")) {
			return new OrdinaryCarFactory();
		}
		else if (type.equalsIgnoreCase("luxury")) {
			return new LuxuryCarFactory();
		}
		
		return null;
	}	
}
