package hito;

public class Perro extends Animal {
	public Perro(String chip, String nombre, int edad, String raza, boolean adoptado) {
		super(chip, nombre, edad, raza, adoptado);
		
	}

	public String tamanio;
	
	



@Override

public void mostrarDatos() {
	super.mostrarDatos();
	System.out.println("Es un perro de tamano" + tamanio);
	
}
}