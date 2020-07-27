
public class Lavadora extends Electrodomestico{

	int carga;

	
	// CONSTRUCTOR
	public Lavadora() {
		// TODO Auto-generated constructor stub
	
	this.carga=5;
	
	}


	public Lavadora(int precioBase, int peso, int carga) {
		super(precioBase, peso);
		// TODO Auto-generated constructor stub
		
		this.carga=5;
		
	}


	public Lavadora(int precioBase, String color, char consumoEnergetico, int peso, int carga) {
		super(precioBase, color, consumoEnergetico, peso);
		// TODO Auto-generated constructor stub
		
		this.carga=carga=5;
		
		
	}

		
	

	@Override
	public int precioFinal() {
		// TODO Auto-generated method stub
		
		
		int precioLavadora=super.precioFinal();
		
		if (peso>30) {
		precioLavadora=precioLavadora+50000;
			
		} else {
		precioLavadora=super.precioFinal();
		
		}
		
		return precioLavadora;
	}


	public int getCarga() {
		return carga;
	}


	public void setCarga(int carga) {
		this.carga = carga;
	}


	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + ", precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", precioFinal()=" + precioFinal() + "]";
	}
	
	 public int getPrecioFinal() {
		 return precioFinal();
		 
		 
	 }
	
	
	
	
	
	
	
	
	
}
