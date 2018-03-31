
public class DoctorDemo {

	public static void main(String[] args) {
		Doctor d = new Doctor();
		Doctor e = new Doctor();
		
		d.setName("Warren Buffey");
		d.setSpecialty("Surgery");
		d.setVisit_fee(1000);
		System.out.println(d.toString());
		e.setName("WArren Peace");
		e.setSpecialty("Dentist");
		e.setVisit_fee(900);
		System.out.println(d.same(e));
		

	}

}
