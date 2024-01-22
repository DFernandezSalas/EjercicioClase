
public class perroSalchicha extends perro {

	public void saltar() {
		System.out.println("Y salta");
	}

	public static void main(String[] args) {
		perroSalchicha ps = new perroSalchicha();
		System.out.println("Perro salchicha");
		ps.comer();
		ps.ladrar();
		ps.saltar();
		animal a = new animal();
		System.out.println("Animal");
		a.comer();
		perro b = new perro();
	}
}
