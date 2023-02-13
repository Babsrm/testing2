package ppal;

import clases.ComercialTest;
import clases.Empleado;
import clases.Repartidor;

public class Principal {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Ana", "López", 29, 1000, 2);
		
		System.out.println("Empleado "+ e1);
		System.out.println("Importe Trienios: " +e1.calculaTrienios());
		System.out.println("SAlario final: " + e1.calculaSalario());
		
		e1.setAntiguedad(8);
		System.out.println("Empleado "+ e1);
		System.out.println("Importe Trienios: " +e1.calculaTrienios());
		System.out.println("SAlario final: " + e1.calculaSalario());
		
		ComercialTest c1 = new ComercialTest("Luis", "Sánchez", 45, 1800, 4);
		System.out.println("Comercial: "+c1);
		
		System.out.println("añadiendo ventas del día 1");
		c1.contabilizaVentas(3);
		System.out.println("Comercial: "+c1);
		
		System.out.println("añadiendo ventas del día 2");
		c1.contabilizaVentas(9);
		System.out.println("Comercial: "+c1);
		
		System.out.println("añadiendo ventas del día 3");
		c1.contabilizaVentas(7);
		System.out.println("Comercial: "+c1);
		
		System.out.println("añadiendo ventas del día 4");
		c1.contabilizaVentas(3);
		System.out.println("Comercial: "+c1);
		
		System.out.println("añadiendo ventas del día 5");
		c1.contabilizaVentas(8);
		System.out.println("Comercial: "+c1);
		
		System.out.println("El salario del comercial es "
						+c1.calculaSalario());	
		Repartidor r1 = new Repartidor("María", "Urbano", 37, 1600, 6,
								"Málaga", "1111-ABC", 12000, 12000, 0);
		
		r1.anadirDieta(30);
		System.out.println("La repartidora es: "+r1);
		
		r1.anadirDieta(20);
		System.out.println("La repartidora es: "+r1);
		
		r1.actualizaKms(12740);
		System.out.println("La repartidora es: "+r1);
		
		r1.actualizaKms(13210);
		System.out.println("La repartidora es: "+r1);
		
		System.out.println("El salario es "+r1.calculaSalario());
	}
}
