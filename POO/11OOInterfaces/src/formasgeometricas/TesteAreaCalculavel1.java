package formasgeometricas;

public class TesteAreaCalculavel1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		AreaCalculavel quadrado = new Retangulo(10,20);
		double areaQuadrado = quadrado.calculaArea();
		System.out.println("A área do quadrado é: " + areaQuadrado + "\n");
                
                AreaCalculavel retangulo = new Quadrado(10);
		double areaRetangulo = retangulo.calculaArea();
		System.out.println("A área do retangulo é: " + areaRetangulo);
	}

}
