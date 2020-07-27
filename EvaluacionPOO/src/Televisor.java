
public class Televisor extends Electrodomestico{

	int resolucion;
	boolean sintonizador;
	
	
	public Televisor() {
		// TODO Auto-generated constructor stub
		
	this.resolucion=20;
	this.sintonizador=false;
	
		
	}


	public Televisor(int precioBase, int peso) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		
		this.resolucion=20;
		this.sintonizador=false;
		
	}


	public Televisor(int precioBase, String color, char consumoEnergetico, int peso, int resolucion, boolean sintonizador) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
	
		
	}


	
	public int precioFinal() {
		// TODO Auto-generated method stub
		
	    int precioFinal=super.precioFinal();
	
	    if (resolucion>40) {
			
	    precioFinal=precioFinal+(int)(precioFinal*0.30);
	    
		}
		
	    if (sintonizador=true) {
	    precioFinal=precioFinal+50000;
			
		}
	    return precioFinal;
	}


	
	
	@Override
	public String toString() {
		return "Televisor [resolucion=" + resolucion + ", sintonizador=" + sintonizador + ", precioBase=" + precioBase
				+ ", color=" + color + ", consumoEnergetico=" + consumoEnergetico + ", peso=" + peso
				+ ", precioFinal()=" + precioFinal() + "]";
	}


	public int getResolucion() {
		return resolucion;
	}


	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}


	public boolean isSintonizador() {
		return sintonizador;
	}


	public void setSintonizador(boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	
	
	
	
	
}
