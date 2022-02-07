package engine;

/**
 * Clase para establecer velocidad con propulsor con conbustible biopropelente
 * que implementa la interfaz IPropellant (Propulsor)
 *
 * @author Mauro Villada Villada
 */
public class Biopropelent implements IPropellant {

    /**
     * Se sobre esribe metodo de interfaz y se ejecutan acciones para asignar
     * velocidad
     */
    @Override
    public void Speed() {
        System.out.println(" puede alcanzar una velocidad promedio de " + biopropelent + "m/s");
    }

}
