
public class Electrodomestico {

	int precioBase;
	String color;
	char consumoEnergetico;
	int peso;
	
	
	//CONSTRUCTOR POR DEFECTO VACIO
	public Electrodomestico() {
		// TODO Auto-generated constructor stub
		
		
		precioBase=100000;
		color="Blanco";
		consumoEnergetico='F';
		peso=5;
		
	}

	// 2DO CONSTRUCTOR PRECIO Y PESO / LO OTRO POR DEFECTO
	public Electrodomestico(int precioBase, int peso) {
		super();
		this.precioBase = precioBase;
		this.peso = peso;
		this.color="Blanco";
		this.consumoEnergetico='F';
		
	}

	
	//CONSTRUCTOR CON TODOS LOS ATRIBUTOS
	public Electrodomestico(int precioBase, String color, char consumoEnergetico, int peso) {
		super();
		this.precioBase = precioBase;
		this.color = comprobarColor (color);
		this.consumoEnergetico = consumoEnergetico (consumoEnergetico);
		this.peso = peso;
	}

	
	// METODO C. ENERGETICO / FILTRO
	
	public char consumoEnergetico(char letra) {
	
	if (letra=='A'||letra=='B'||letra=='C'||letra=='D'||letra=='E'||letra=='F') {
	letra=letra;
	}
	
	else {
		letra='F';	
	}	
	return letra;
		
	}
	
	
	// METODO COLOR
	
		public String comprobarColor(String color) {
		
		if (color=="Blanco"||color=="Negro"||color=="Azul"||color=="Gris"||color=="Rojo") {
		color=color;
		}
		
		else {
			color="Blanco";
		}	
		return color;
			
		}
		
	
	// METODO PRECIO FINAL
		
		public int precioFinal() {
		
			int precioFinal=precioBase;
			
		
		switch (consumoEnergetico) {
		case 'A': precioFinal=precioFinal+100000;
		break;

		case 'B': precioFinal=precioFinal+80000;
		break;

		case 'C': precioFinal=precioFinal+60000;
		break;
	
		case 'D': precioFinal=precioFinal+50000;
		break;
	
		case 'E': precioFinal=precioFinal+30000;
		break;

		case 'F': precioFinal=precioFinal+10000;
		break;

		
			}	
		
		
		if (peso>=0&&peso<19) {
			precioFinal=precioFinal+10000;
			} else if(peso>=20&&peso<49){
				precioFinal=precioFinal+50000;
				} else if (peso>=50&&peso<79) {
					precioFinal=precioFinal+80000;
					} else if (peso>=80) {
						precioFinal=precioFinal+100000;	
			}
		
		
		return precioFinal;
		
		}
		
		
		
	
	// METODO TODOS LOS ATRIBUTOS
	public int getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(int precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	
	
	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + ", precioFinal()=" + precioFinal() + "]";
	}
	
	
	
	
	
	
	
	
}
