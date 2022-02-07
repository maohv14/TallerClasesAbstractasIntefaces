package classes;

/**
 * Esta clase permite crear Naves espaciales tipo Sonda Rover, la cual hereda de
 * la clase BuildShip
 *
 * @author Mauro Villada Villada
 */
public class RoverProbe extends BuildShip {

    /**
     * Implementación del método abstracto que permite definir el destino de la
     * nave acorde a su tipo.
     */
    @Override
    public void Destination() {
        setName("-Sonda Rover-");
        System.out.println("La nave del tipo " + getName() + " puede dirigirse la superficie de cualqier cuerpo celeste en el sistema solar, ");

    }

    /**
     * Implementación de método abstracto que permite fijar si la nave puede
     * aterrizar o no acorde a su tipo
     */
    @Override
    public void Land() {
        System.out.println(", puede aterrizar y explorar cualquier destino anteriormente indicado");

    }

}
