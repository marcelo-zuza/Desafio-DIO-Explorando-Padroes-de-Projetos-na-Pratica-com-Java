package one.digitalinovation.gof.singleton;


/**
 * singleton "preguiçoso"
 *@autor Marcelo-Zuza
 */
public class SingletonLazy {
    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
