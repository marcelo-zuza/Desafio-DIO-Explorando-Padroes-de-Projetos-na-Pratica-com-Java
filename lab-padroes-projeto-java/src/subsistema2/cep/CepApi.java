package subsistema2.cep;

import one.digitalinovation.gof.singleton.SingletonEager;

public class CepApi {
    private static CepApi instancia = new CepApi();

    private CepApi() {
        super();
    }
    public static CepApi getInstancia() {

        return instancia;
    }
    public String recuperarCidade(String cep) {
        return "Uberlândia";
    }
    public String recuperarEstado(String cep) {
        return "MG";
    }
}
