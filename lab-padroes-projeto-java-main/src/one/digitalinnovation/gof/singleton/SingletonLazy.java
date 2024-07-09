package one.digitalinnovation.gof.singleton;

/**
 * Singleton "pregui�oso".
 * 
 * @author falvojr
 */
public class SingletonLazy {

    private static SingletonLazy instancia;
    
    private SingletonLazy() {
        // Construtor privado para evitar instanciação externa
    }
    
    public static synchronized SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}

