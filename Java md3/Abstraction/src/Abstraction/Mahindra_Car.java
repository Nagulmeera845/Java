package Abstraction;
interface Mahindra {
	void Accelerate();
	void brakes();
	void gears();
	void comforts();
	void tyres();
	void elevation();
	void glass();
	
}
class Senior_Architect implements Mahindra{
	public void Accelerate() {
		System.out.println("Accelerate");
	}
	public void comforts() {
		System.out.println("Comforts");
	}
	public void elevation() {
		System.out.println("Elveation");
	}
	@Override
	public void brakes() {
		System.out.println("brakes");
		
	}
	@Override
	public void gears() {
		
	}
	@Override
	public void tyres() {
		
	}
	@Override
	public void glass() {
		
	}
}
class Junior_Architect extends Senior_Architect{
	public void brakes() {
		System.out.println("Brakes");
	}
	public void tyres() {
		System.out.println("Tyres");
	}
	
	public void gears() {
		System.out.println("Gears");
	}
	public void glass() {
		System.out.println("Glass");
	}
}
public class Mahindra_Car {

	public static void main(String[] args) {

		Mahindra m1=new Senior_Architect();
		m1.Accelerate();
		m1.comforts();
		m1.elevation();
		Mahindra m2=new Junior_Architect();
		m2.brakes();
		m2.tyres();
		m2.gears();
		m2.glass();
		
	}

}
