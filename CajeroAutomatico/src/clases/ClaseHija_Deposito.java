
package clases;

/**
 *
 * @author NRolon
 */
public class ClaseHija_Deposito extends ClasePadre_Abstracta{
    
    
    @Override
    public void Transacciones(){
        
        System.out.println("Cuánto deseas depositar: ");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("--------------------------");
        System.out.println("Depositaste: " + deposito);
        System.out.println("Tu saldo actual es: " + getSaldo() );
        System.out.println("----------------------------------");
    }
    
}
