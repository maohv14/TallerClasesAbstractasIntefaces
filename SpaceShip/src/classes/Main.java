
package classes;

/**
 * Clase principal que cotiene el Main para arrancar el programa instanciar el 
 * método principal 
 * @author Mauro Villada Villada
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("*****************************************************");
        System.out.println("Bienvenido al sistema de creación de Naves Espaciales");
        System.out.println("*****************************************************");
        System.out.println("");
       BuildShip courier = new OrbiterSatellite();     
       courier.Producing();
        
    }
}
