
public class MainElectrodomestico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lavadora listaElectrodomesticos[] = new Lavadora[10];
	
		int suma1=0;
		
	
		//ASIGNAR UN OBJETO A CADA POSICION
		listaElectrodomesticos[0]= new Lavadora();
		listaElectrodomesticos[1]= new Lavadora(200000, "Negro",'C',10,3);
		listaElectrodomesticos[2]= new Lavadora(200000, "Gris", 'J',10,3);
		listaElectrodomesticos[3]= new Lavadora(200000, "Amarillo", 'F',10,3);
		
		
		
		
		for (int i = 0; i < listaElectrodomesticos.length; i++) {
			
			System.out.println(listaElectrodomesticos[i]);
			
		suma1=suma1+listaElectrodomesticos[i].getPrecioFinal();
		
			
			
			
		}
		
		System.out.println("La suma total de los electrodomesticos es: "+suma1);
		
	}
	
}
