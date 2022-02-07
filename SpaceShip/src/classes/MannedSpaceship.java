package classes;

/**
 * Esta clase permite crear Naves espaciales tipo Nave espacial tripulada, la
 * cual hereda de la clase BuildShip
 *
 * @author Mauro Villada Villada
 */
public class MannedSpaceship extends BuildShip {

    /**
     * Implementación del método abstracto que permite definir el destino de la
     * nave acorde a su tipo.
     */
    @Override
    public void Destination() {
        setName("-Espacial tripulada-");
        System.out.println("La nave del tipo " + getName() + " puede dirigirse a la EEI y Luna terrestre. Otros cuerpos celestes aun estan en materia de investigación, ");

    }

    /**
     * Implementación de método abstracto que permite fijar si la nave puede
     * aterrizar o no acorde a su tipo
     */
    @Override
    public void Land() {
        System.out.println(", puede aterrizar y explorar los destinos ya mencionados");

    }

}
