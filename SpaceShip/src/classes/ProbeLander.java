
package classes;

/**
 * Esta clase permite crear Naves espaciales tipo Sonda aterrizador, la cual 
 * hereda de la clase BuildShip
 * @author Mauro Villada Villada
 */
public class ProbeLander  extends BuildShip {
    /**
     * Implementación del método abstracto que permite definir el destino de la 
     * nave acorde a su tipo.
     */
    @Override
    public void Destination(){
      setName("-Sonda aterrizador-");
      System.out.println("La nave del tipo " + getName()+" puede dirigirse cualqier cuerpo celeste en el sistema solar, ");          
    }
    /**
     * Implementación de método abstracto que permite fijar si la nave puede
     * aterrizar o no acorde a su tipo
     */
    @Override
    public void Land() {
      System.out.println(" y puede aterrizar en el lugar de destino.");    
    }
    
}
