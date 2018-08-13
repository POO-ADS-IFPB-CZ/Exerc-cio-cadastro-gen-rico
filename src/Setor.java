import java.util.HashSet;
import java.util.Set;

public class Setor {

    private int codigo;
    private String nome;
    private Set<Funcionario> funcionarios;

    public Setor(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
        funcionarios = new HashSet<>();
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean add(Funcionario f){
        return funcionarios.add(f);
    }

    public Set<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    @Override
    public String toString() {
        return "Setor{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", funcionarios=" + funcionarios +
                '}';
    }

}
