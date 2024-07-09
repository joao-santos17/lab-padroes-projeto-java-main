package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado".
 * 
 * @author falvojr
 */
public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();
    
    private SingletonEager() {
        // Construtor privado para evitar instanciação externa
    }
    
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
