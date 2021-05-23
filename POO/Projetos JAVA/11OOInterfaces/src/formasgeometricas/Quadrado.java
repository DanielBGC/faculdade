package formasgeometricas;

public class Quadrado implements AreaCalculavel {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return (this.lado * this.lado);
	}

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

        
}
