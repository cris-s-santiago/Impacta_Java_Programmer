package cap05.laboratori_01;

public class Cap5_Lab1 {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Cristiane";
        funcionario.sobrenome = "Santiago";
        funcionario.cargo = "Dev";
        funcionario.salario = 3000;

        System.out.println("Nome: "+ funcionario.nome);
        System.out.println("Sobrenome: "+ funcionario.sobrenome);
        System.out.println("Cargo: "+ funcionario.cargo);
        System.out.println("Salário: "+ funcionario.salario);

    }

}
