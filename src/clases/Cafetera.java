package clases;

public class Cafetera
{
	// Estado
	private int capacidadMaxima;
	private int capacidadActual;
	
	public Cafetera()
	{
		this.setCapacidadMaxima(1000);
		this.setCapacidadActual(0);
	}
	
	public Cafetera(int capacidadMax)
	{
		this.setCapacidadMaxima(capacidadMax);
		this.setCapacidadActual(capacidadMax);
		// this.capacidadMaxima = this.capacidadActual = capacidadMax;
	}
	
	public Cafetera(int capacidadMax, int capacidadActual)
	{
		this.setCapacidadMaxima(capacidadMax);
		this.setCapacidadActual(capacidadActual);
	}

	public int getCapacidadActual()
	{
		return this.capacidadActual;
	}

	public void setCapacidadActual(int capacidadActual)
	{
		this.capacidadActual = Math.min (capacidadActual, this.capacidadMaxima);
	}

	public int getCapacidadMaxima()
	{
		return this.capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMax)
	{
		this.capacidadMaxima = capacidadMax;
	}
	
	public void llenarCafetera()
	{
		this.setCapacidadActual(this.capacidadMaxima);
	}
	
	public boolean servirTaza(int cantidad)
	{
		if (this.capacidadActual < cantidad)
		{
			this.setCapacidadActual(0);
			return false;
		}
		this.setCapacidadActual(capacidadActual - cantidad);
		return true;
	}
	
	public void vaciarCafetera()
	{
		this.setCapacidadActual(0);
	}
	
	public void agregarCafe(int cantidad)
	{
		this.setCapacidadActual(this.capacidadActual + cantidad);
	}

	public String toString() {
		return "Capacidad actual de la cafetera " + this.capacidadActual + "/" + this.capacidadMaxima + " c.c.\n";
	}
}
