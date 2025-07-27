package abstractFactoryPattern;

public class LuxuryCarFactory implements VehicalFactory{

	@Override
	public Vehical getVehical() {
		return new Bmw();
	}

}
