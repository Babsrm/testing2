package clases;


public class Empleado {

	protected String nombre;
	protected String apellido;
	protected int edad;
	protected double salario;
	protected int antiguedad;
	
	public Empleado() {
		this.nombre="";
		this.apellido="";
		this.edad=0;
		this.salario=0;
		this.antiguedad=0;
	}

	public Empleado(String nombre, String apellido, int edad, 
				    double salario, int antiguedad) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.salario = salario;
		this.antiguedad = antiguedad;
	}
	
	public Empleado(Empleado e) {
		this.nombre = e.nombre;
		this.apellido = e.apellido;
		this.edad = e.edad;
		this.salario = e.salario;
		this.antiguedad = e.antiguedad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getAntiguedad() {
		return antiguedad;
	}

	public void setAntiguedad(int antiguedad) {
		this.antiguedad = antiguedad;
	}

	
	
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", salario=" + salario	+ ", antiguedad=" + antiguedad + "]";
	}

	public double calculaTrienios() {
		int numTrienio=this.antiguedad/3;
		if (numTrienio>5) {
			return this.salario*numTrienio*0.08;
		} else if (numTrienio>0){
			return this.salario*numTrienio*0.05;
		}
		return 0;
	}
	
	public double calculaSalario() {
		return this.salario+this.calculaTrienios();
	}
	
	
}
