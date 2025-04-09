package hito;

public class Animal {
    protected String chip;
    protected String nombre;
    protected int edad;
    protected String raza;
    protected boolean adoptado;


public Animal(String chip, String nombre, int edad, String raza, boolean adoptado) {
    this.chip = chip;
    this.nombre = nombre;
    this.edad = edad;
    this.raza = raza;
    this.adoptado = adoptado;
}

public void mostrarDatos() {
    System.out.println("chip: " + chip);
    System.out.println("nombre: " + nombre);
    System.out.println("edad: " + edad + " años");
    System.out.println("raza: " + raza);
    System.out.println("adoptado: " + (adoptado ? "Sí" : "No"));
}


}
	


