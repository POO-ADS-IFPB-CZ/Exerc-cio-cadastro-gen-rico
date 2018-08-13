import java.time.LocalDate;
import java.util.Objects;

public class Funcionario {

    private String cpf;
    private String nome;
    private LocalDate nascimento;
    private float salario;

    public Funcionario(String cpf, String nome, LocalDate nascimento, float salario) {
        this.cpf = cpf;
        this.nome = nome;
        this.nascimento = nascimento;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", nascimento=" + nascimento +
                ", salario=" + salario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Funcionario)) return false;
        Funcionario that = (Funcionario) o;
        return Float.compare(that.getSalario(), getSalario()) == 0 &&
                Objects.equals(getCpf(), that.getCpf()) &&
                Objects.equals(getNome(), that.getNome()) &&
                Objects.equals(getNascimento(), that.getNascimento());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getCpf(), getNome(), getNascimento(), getSalario());
    }
}
