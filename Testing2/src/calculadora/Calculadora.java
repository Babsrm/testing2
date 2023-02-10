package calculadora;

public class Calculadora {

	public static float  suma (float a, float b) {
		return a+b;
	}
	
	public static float divide (int a , int b) throws ArithmeticException {
		if (b==0) {
			throw new ArithmeticException ("División por 0");
		}
		return a/b;
	}
	
	public static boolean esPar(int num) {
		if (num%2 ==0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	public static boolean esPrimo(int num) {
		num=Math.abs(num);
		for (int i=2; i<num;i++) {
			if (num%i==0) return false;
		}
		return true;
	}
	
	public static long factorial(int n) {
        long producto=1;
        int i;
        if (n<0) 
        	throw new ArithmeticException(
        			"Debe ser positivo");
        for (i = 2; i <= n; i++) {
        	producto =producto* i;
        }
        return producto;
    }
	
	public static void rotarDerecha(int v[]) {
		int aux = v[v.length-1];
		for (int i = v.length-1; i >=1; i--) {
			v[i]=v[i-1];
		}
		v[0]=aux;
	}
}
