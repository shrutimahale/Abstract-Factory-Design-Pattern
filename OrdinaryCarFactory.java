package abstractFactoryPattern;

public class OrdinaryCarFactory implements VehicalFactory{

	@Override
	public Vehical getVehical() {
		
		return new Swift();
	}

}
