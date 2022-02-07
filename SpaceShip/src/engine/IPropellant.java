
package engine;

/**
 * Interfaz con tres constantes para asignar velocidad aproximada acorde al tipo
 * de propulsor solictado por el usuario
 * @author Mauro Villada Villada
 */
public interface IPropellant {
    public int solid = 1000, biopropelent = 5000, ionic =50000;
    
    public void Speed();
}
