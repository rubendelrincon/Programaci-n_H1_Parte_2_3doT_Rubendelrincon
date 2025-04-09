package hito;

import java.util.ArrayList;
import java.util.Scanner;

import java.util.HashMap;
import java.util.Map;


import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Map<String, Animal> animales = new HashMap<>();
        List<Adopcion> adopciones = new ArrayList<>();
        
        int opcion;
        
        do {
            System.out.println(" MENÚ ");
            System.out.println("1. Dar de alta animal");
            System.out.println("2. Listar animales");
            System.out.println("3. Buscar animal");
            System.out.println("4. Realizar adopción");
            System.out.println("5. Dar de baja l");
            System.out.println("6. Mostrar estadísticas de gatos");
            System.out.println("7. Salir");
            
            
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print(" 1-Perro  2-Gato: ");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Número de chip: ");
                    String chip = sc.nextLine();
                    
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Raza: ");
                    String raza = sc.nextLine();

                    System.out.print("es adoptado? s/n ");
                    boolean adoptado = sc.nextLine().equalsIgnoreCase("s");

                    if (tipo == 1) {
                    
                        String tamanio = sc.nextLine();
                        Perro perro = new Perro(chip, nombre, edad, raza, adoptado);
                        perro.tamanio = tamanio;
                        animales.put(chip, perro);
                        System.out.print(" selecciona el tamano ");
                        
                    } else if (tipo == 2) {
                        System.out.print("tiene leucemia s/n : ");
                        boolean leucemia = sc.nextLine().equalsIgnoreCase("s");
                        animales.put(chip, new Gato(chip, nombre, edad, raza, adoptado, leucemia));
                        
                    } else {
                        System.out.println("Error");
                        break;
                    }
                    System.out.println(" registrado .");
                    break;

                case 2:
                    if (animales.isEmpty()) {
                        System.out.println("No hay animales registrados.");
                        
                    } else {
                        System.out.println(" LISTADO DE ANIMALES ");
                        for (Animal animal : animales.values()) {
                            animal.mostrarDatos();
                            
                        }
                    }
                    break;

                case 3:
                    System.out.print(" introduce el chip ");
                    String chipBuscar = sc.nextLine();
                    Animal animal = animales.get(chipBuscar);
                    
                    if (animal != null) {
                        System.out.println(" datos ainmal");
                        animal.mostrarDatos();
                    } 
                    break;

                case 4:
                    System.out.print("Introduce el chip del animal: ");
                    String chipAdopcion = sc.nextLine();
                    Animal animalAdoptar = animales.get(chipAdopcion);
                    
                    if (animalAdoptar == null) {
                        System.out.println("Error: No existe un animal con ese chip.");
                    } else if (animalAdoptar.adoptado) {
                        System.out.println("Error: Este animal ya está adoptado.");
                    } else {
                    	System.out.println("Datos del adoptador:");
                    	System.out.println("--------------------");
                        System.out.print("Nombre del adoptante: ");
                        
                        String nombrePersona = sc.nextLine();
                        
                        System.out.print("DNI del adoptante: ");
                        String dni = sc.nextLine();
                        
                        animalAdoptar.adoptado = true;
                        adopciones.add(new Adopcion(animalAdoptar, nombrePersona, dni));
                        System.out.println("Adopción registrada ");
                    }
                    break;

                case 5:
                    System.out.print("Introduce el chip del animal: ");
                    String chipBaja = sc.nextLine();
                    
                    if (animales.remove(chipBaja) != null) {
                        System.out.println("Animal eliminado correctamente.");
                    } else {
                        System.out.println("Error: No existe un animal con ese chip.");
                    }
                    break;

                case 6:
                    int totalGatos = 0;
                    int gatosLeucemiaPositivo = 0;
                    
                    for (Animal animal1 : animales.values()) {
                        if (animal1 instanceof Gato) {
                            totalGatos++;
                            if (((Gato) animal1).Leucemia()) {
                                gatosLeucemiaPositivo++;
                            }
                        }
                    }
                    
                    
                    System.out.println("Total de gatos: " + totalGatos);
                    System.out.println("Gatos con leucemia positiva: " + gatosLeucemiaPositivo);

                    break;

                case 7:
                    System.out.println("Saliendo del sistema...");
                    break;

                default:
                    System.out.println("Error: Introduce un número del 1 al 7.");
            }
            
        } while (opcion != 7);
        
        sc.close();
        System.out.println("saliendo...");
    }
}