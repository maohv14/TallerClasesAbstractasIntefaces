package classes;

import java.util.Scanner;
import engine.Solid;
import engine.Biopropelent;
import engine.Ionic;

/**
 * Esta es una clase abstracta, la cual permite construir diferentes tipos de 
 * nave espacial y definir atributos especificos de cada una.
 * @author Mauro Villada Villada
 */
public abstract class BuildShip {
/**
 * Definicios de variables
 */
    private String name;
    private String propeller;
    public int velocidad;
    Scanner input = new Scanner(System.in);

    public BuildShip() {
    }
    /**
     * Es metodo se encarga de la construcción de la nave acorde con los datos 
     * solicitados al usuario
     */
    public void Producing() {
        int flag = 0;
        int option = 0;
        do {
            do {
                System.out.println("");
                System.out.println("Por favor seleccione tipo de Nave Espacial deseado o 5 para salir");
                System.out.println("");
                System.out.println("    1. Sonda orbital o Satélite.");
                System.out.println("    2. Sonda aterrizador.");
                System.out.println("    3. Sonda Rover");
                System.out.println("    4. Nave tripulada");
                System.out.println("    5. Salir");
                System.out.println("");
                option = input.nextInt();

                if (option >= 1 && option <= 5) {
                    flag = 1;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("No disponible, vuelva a intentar");
                    System.out.println("--------------------------------");
                }

            } while (flag == 0);
            switch (option) {
                case 1:
                    BuildShip courier1 = new OrbiterSatellite();
                    PropellerType();
                    courier1.Destination();
                    courier1.Fly();
                    courier1.Land();
                    buildYesNo();
                    
                    break;
                case 2:
                    BuildShip courier2 = new ProbeLander();
                    PropellerType();
                    courier2.Destination();
                    courier2.Fly();
                    courier2.Land();
                    buildYesNo();
                    break;
                case 3:
                    BuildShip courier3 = new RoverProbe(); 
                    PropellerType();
                    courier3.Destination();
                    courier3.Fly();
                    courier3.Land();
                    buildYesNo();
                    break;
                case 4:
                    BuildShip courier4 = new MannedSpaceship();
                    PropellerType();
                    courier4.Destination();
                    courier4.Fly();
                    courier4.Land();
                    buildYesNo();
                    break;
                case 5:
                    System.out.println("-------------------------------------------------");
                    System.out.println("Gracias por contratar con nosotros, vuelva pronto");
                    System.out.println("-------------------------------------------------");
                    flag = 2;
                    break;
                default:
                    break;
            }

        } while (flag != 2);
    }
    /**
     * Metodo abstracto permite establecer el tipo de destino para el cual
     * se puede fijar rumbo de la nave
     */
    public abstract void Destination();
    /**
     * Metodo abstracto que define si una nave puede o no aterrizar en el destino
     */
    public abstract void Land();
    /**
     * Metodo para interactuar con el usuario y confirmar construcción de la nave
     */
    public void buildYesNo(){
        int Yes_No;  
        System.out.println("");
        System.out.println("Ingrese 1 para construir nave o 0 para seleccionar otra nave");
        Yes_No = input.nextInt();
        if(Yes_No == 1){
            System.out.println("Nave espacial construida");
        }
    }
    /**
     * Metodo que define comportamiento general de volar para todas las naves
     */
    public void Fly() {
        System.out.print("esta nave puede volar ");

    }
    /**
     * Metodo para definir tipo de propulsor y velocidad para la nave
     */
    public void PropellerType() {
        int option1 = 0;
        System.out.println("Por favor seleccione tipo tipo de propulsor");
        System.out.println("    1. Combustible solido.");
        System.out.println("    2. Biopropelente.");
        System.out.println("    3. Iónico");
        option1 = input.nextInt();

        switch (option1) {
            case 1:
                setPropeller("Propulsor de combustible Sólido");               
                System.out.print("Esta nave con " + getPropeller());
                Solid courier_a = new Solid();
                courier_a.Speed();
                break;
            case 2:
                setPropeller("Propulsor de Combustible Biopropelente");
                System.out.print("Esta nave con " + getPropeller());
                Biopropelent courier_b = new Biopropelent();
                courier_b.Speed();
                break;
            case 3:
                setPropeller("Propulsor Iónico");
                System.out.print("Esta nave con " + getPropeller());
                Ionic courier_c = new Ionic();
                courier_c.Speed();
                break;
            default:
                break;
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the propeller
     */
    public String getPropeller() {
        return propeller;
    }

    /**
     * @param propeller the propeller to set
     */
    public void setPropeller(String propeller) {
        this.propeller = propeller;
    }

}
