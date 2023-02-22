package clases;

import java.util.Scanner;

/**
 *
 * @author NRolon
 */
public abstract class ClasePadre_Abstracta {

    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {

        int bandera = 0;
        int seleccion = 0;

        do {
            do {

                System.out.println("Por favor seleccion una opcion");
                System.out.println("    1. Consulta de saldo");
                System.out.println("    2. Retiro de efectivo");
                System.out.println("    3. Depoosito de efectivo");
                System.out.println("    4. Salir");

                //Guardamos la eleccion del cliente y con ésto el codigo tomara cierto camino
                seleccion = entrada.nextInt();

                //Validacion del campo seleccion
                if (seleccion >= 1 && seleccion <= 4) {
                    //Con esto cortamos el ciclo del do while
                    bandera = 1;
                } else {
                    System.out.println("------------------------------------------------");
                    System.out.println("Opcion no disponible, vuelva a intentar porfavor");
                    System.out.println("-------------------------------------------------");
                }

            } while (bandera == 0);
            
            if( seleccion == 1){
                
                ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                mensajero.Transacciones();
                
            } else if( seleccion == 2){
                
                ClasePadre_Abstracta mensajero = new ClaseHija_Retiro();
                mensajero.Transacciones();
                
            } else if( seleccion == 3){
                
                ClasePadre_Abstracta mensajero = new ClaseHija_Deposito();
                mensajero.Transacciones();
                
            } else if( seleccion == 4){ // Con esto hacemos que el ciclo deje de continuar
                System.out.println("----------------------");
                System.out.println("Gracias, vuelva pronto");
                System.out.println("-------------------------");
                bandera = 2;
            }
        } while (bandera !=2); // este bucle se utiliza para que siempre pida el menu hasta que ingresemos la tecla 4
    }
    
    // Metodo para solicitar cantidad de retiro
    
    public void Retiro(){
        
        retiro = entrada.nextInt(); 
    }
    
    // Metodo para solicitar deposito
    
    public void Deposito(){
        
        deposito = entrada.nextInt();
    }
    
    // Método abstracto para las transacciones
    
    public abstract void Transacciones();
    
    // Metodo setter y getter
    
    public int getSaldo(){
        
        return saldo;
    }
    
    public void setSaldo(int saldo){
        
        this.saldo = saldo; 
    }

}
