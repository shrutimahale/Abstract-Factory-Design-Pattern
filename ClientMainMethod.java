package abstractFactoryPattern;

public class ClientMainMethod {

	public static void main(String[] args) {
		VehicalFactory ordinaryFactory = FactoryProducer.getVehicalFactory("ordinary");
		Vehical ordinaryCar = ordinaryFactory.getVehical();
		ordinaryCar.carName();
		
		VehicalFactory luxuryFactory = FactoryProducer.getVehicalFactory("luxury");
		Vehical luxCar = luxuryFactory.getVehical();
		luxCar.carName();

	}

}
