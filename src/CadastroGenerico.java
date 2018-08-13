import java.util.ArrayList;
import java.util.List;

public class CadastroGenerico <T> {

    private List<T> objetos;

    public CadastroGenerico(){
        objetos = new ArrayList<>();
    }

    public boolean adicionar(T obj){
        return objetos.add(obj);
    }

    public List<T> listar(){
        return objetos;
    }

    public boolean remover(T obj){
        return objetos.remove(obj);
    }

}