package cap09.herancaAula;

public class HerancaTest {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Cristiane");
        pessoa.setIdade(32);
        pessoa.setCpf("12345678910");

        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula("SA12345");
        funcionario.setNome("Joao Silva");
        funcionario.setIdade(30);
        funcionario.setCpf("98765432111");
        funcionario.setNacionalidade("Brasileiro");
        funcionario.setNaturalidade("Sao Paulo");

        Cliente cliente = new Cliente();
        cliente.setId("PF51545");
        cliente.setNome("Maria Silva");
        cliente.setIdade(20);
        cliente.setCpf("546545654655");
        cliente.setNacionalidade("Brasileiro");
        cliente.setNaturalidade("Sao Paulo");

        Programador programador = new Programador();
        programador.setLinguagem("Java"); // é da classe Funcionario
        programador.setMatricula("SA5444"); // é da classe Funcionario
        programador.setNome("Daiane"); // é da classe Pessoa
        programador.setIdade(28); // é da classe Pessoa
        programador.setCpf("98798798711"); // é da classe Pessoa
        programador.setNacionalidade("Brasileiro"); // é da classe Pessoa
        programador.setNaturalidade("Rio de Janeiro"); // é da classe Pessoa

    }
}
