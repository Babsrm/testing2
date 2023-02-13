package clases;

public class Repartidor extends Empleado {

	private String zona;
	private String matricula;
	private double kmIniciales;
	private double kmFinales;
	private double dietas;
	private static double maxDieta=25;
	private static double precioKM=0.45;
	
	public Repartidor() {
		super();
		this.zona="";
		this.matricula="";
		this.kmIniciales=0;
		this.kmFinales=0;
		this.edad=0;
	}

	public Repartidor(String nombre, String apellido, int edad,
			          double salario, int antiguedad, String zona,
			          String matricula, double kmIniciales, 
			          double kmFinales, double dietas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.zona = zona;
		this.matricula = matricula;
		this.kmIniciales = kmIniciales;
		this.kmFinales = kmFinales;
		this.dietas = dietas;
	}

	public Repartidor(Repartidor r) {
		super(r);
		this.zona = r.zona;
		this.matricula = r.matricula;
		this.kmIniciales = r.kmIniciales;
		this.kmFinales = r.kmFinales;
		this.dietas = r.dietas;
	}

	@Override
	public String toString() {
		return "Repartidor [zona=" + zona + ", matricula=" + matricula 
				+ ", kmIniciales=" + kmIniciales + ", kmFinales="
				+ kmFinales + ", dietas=" + dietas + ", nombre=" + nombre 
				+ ", apellido=" + apellido + ", edad=" + edad
				+ ", salario=" + salario + ", antiguedad=" + antiguedad 
				+ "]";
	}

	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public void anadirDieta(double dieta) {
		if (dieta>maxDieta) {
			dieta=maxDieta;
		}
		this.dietas=this.dietas+dieta;
	}
	
	public void actualizaKms(double kmActuales) {
		if (kmActuales>this.kmFinales) {
			this.kmFinales=kmActuales;
		}
	}
	
	public void resetearKms() {
		this.kmIniciales=this.kmFinales;
	}

	@Override
	public double calculaSalario() {
		return this.salario+this.dietas+
		      (this.kmFinales-this.kmIniciales)*precioKM;
	}
	
	
	
	
	
	
	
	
	
}
