import java.time.LocalDate;

public class App {
    public static void main(String[] args){

        CadastroGenerico<Setor> cadastroSetor = new CadastroGenerico<>();

        Setor setor = new Setor(1, "Vendas");
        setor.add(new Funcionario("111.111.111-01", "João",
                LocalDate.now(), 2000));
        setor.add(new Funcionario("222.222.222-02", "Maria",
                LocalDate.now(), 2500));

        System.out.println(cadastroSetor.adicionar(setor));

    }
}