package hito;

public class Gato extends Animal {
   

    public Gato(String chip, String nombre, int edad, String raza, boolean adoptado, boolean leucemia) {
        super(chip, nombre, edad, raza, adoptado);
        this.leucemia = leucemia;
    }
    
    private boolean leucemia;
    
@Override

public void mostrarDatos() {
	super.mostrarDatos();
	System.out.println("Es un gato que su test de leucemia ha dado " + (leucemia ? "Positivo" : "Negativo"));
}
public boolean Leucemia() {
    return leucemia;
}
}

