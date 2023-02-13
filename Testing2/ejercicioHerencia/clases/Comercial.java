package clases;

public class Comercial extends Empleado {

	private int nVentas;
	private static double importeVenta=45.90;
	
	private static int VENTASMAX=25;
	private static int VENTASMAXDIA=7;
	
	public Comercial() {
		super();
		this.nVentas=0;
	}

	public Comercial(String nombre, String apellido, int edad, 
					 double salario, int antiguedad) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.nVentas=0;
	}

	public Comercial(String nombre, String apellido, int edad, 
					 double salario, int antiguedad, int nVentas) {
		super(nombre, apellido, edad, salario, antiguedad);
		this.nVentas = nVentas;
	}

	@Override
	public String toString() {
		return "Comercial [nVentas=" + nVentas + ", nombre=" + nombre 
				+ ", apellido=" + apellido + ", edad=" + edad
				+ ", salario=" + salario + ", antiguedad=" + antiguedad 
				+ "]";
	}
	
	public void contabilizaVentas(int ventasDia) {
		if (ventasDia>VENTASMAXDIA) {
			ventasDia=VENTASMAXDIA;
		}
		this.nVentas=this.nVentas+ventasDia;
		if (this.nVentas>VENTASMAX) {
			this.nVentas=VENTASMAX;
		}
		
//		this.nVentas=Math.min(VENTASMAX, 
//				this.nVentas+Math.min(VENTASMAXDIA, ventasDia));
	}
	
	public void reseteaContadorVentas() {
		this.nVentas=0;
	}

	@Override
	public double calculaSalario() {
		return super.calculaSalario()+nVentas*importeVenta;
	}
	
	
	
	
	
	
	
	
	
	
}
