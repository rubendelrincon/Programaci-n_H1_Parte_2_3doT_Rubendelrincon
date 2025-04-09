package hito;

public class Adopcion {
	protected Animal animal;
	protected String nombrePersona;
	protected String dniPersona;


public Adopcion (Animal animal, String nombrePersona, String dniPersona) {
	this.animal = animal;
	this.nombrePersona = nombrePersona;
	this.dniPersona = dniPersona;
}
public void mostrarDatos() {
	animal.mostrarDatos();
	System.out.println("El animal ha sido adoptado por: " + nombrePersona + "con Dni: " + dniPersona +")");
	
}


public Animal obtenerAnimalAdoptado() {
	return animal;
}

public String obtenerNombreAdoptante() {
    return nombrePersona;
}

public String obtenerDniAdoptante() {
    return dniPersona;
}
}