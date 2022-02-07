
package classes;

/**
 * Esta clase permite crear Naves espaciales tipo Orbitador o Sátelite, la cual 
 * hereda de la clase BuildShip
 * @author yenifer
 */
public class OrbiterSatellite  extends BuildShip{
    /**
     * Implementación del método abstracto que permite definir el destino de la 
     * nave acorde a su tipo.
     */
    @Override
    public void Destination() {
        setName("-Sátelite u Orbitador-");
        System.out.println("La nave del tipo " + getName()+" puede dirigirse a la Orbita terrestre u Orbitar cualqier cuerpo celeste en el sistema solar, "); 
        
    }
    /**
     * Implementación de método abstracto que permite fijar si la nave puede
     * aterrizar o no acorde a su tipo
     */
    @Override
    public void Land() {
        System.out.println("y no puede aterrizar, solo opera como satelite artificial.");
        System.out.println("");
        
    }

    
    
}
