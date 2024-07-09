package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder".
 * 
 * @see <a href="https://stackoverflow.com/a/24018148">Referencia</a>
 * 
 * @author falvojr
 */
public class SingletonLazyHolder {

    private SingletonLazyHolder() {
        // Construtor privado para evitar instanciação externa
    }
    
    private static class InstanceHolder {
        private static final SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    
    public static SingletonLazyHolder getInstancia() {
        return InstanceHolder.instancia;
    }
}

