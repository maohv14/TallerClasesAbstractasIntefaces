package engine;

/**
 * Clase para establecer velocidad con propulsor Iónico que implementa la
 * interfaz IPropellant (Propulsor).
 *
 * @author Mauro Villada Villada
 */
public class Ionic implements IPropellant {

    /**
     * Se sobre esribe metodo de interfaz y se ejecutan acciones para asignar
     * velocidad
     */
    @Override
    public void Speed() {
        System.out.println(" puede alcanzar una velocidad promedio de " + ionic + "m/s");
    }

}
