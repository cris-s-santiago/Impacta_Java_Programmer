package cap15.streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamsTeste {

    public static void main(String[] args) {

        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario(1587, "Cristiane Santana", "Desenvolvedor(a)", 5000.00));
        funcionarios.add(new Funcionario(8564, "Maria Santos", "Intrutora", 1500.00));
        funcionarios.add(new Funcionario(7910, "Pedro Silva", "SM", 10500.00));
        funcionarios.add(new Funcionario(9641, "Fernando Lima", "PO", 15000.00));
        funcionarios.add(new Funcionario(3210, "Jao Santos", "Desenvolvedor(a)", 2500.00));
        funcionarios.add(new Funcionario(4562, "Paulo Mouro", "Desenvolvedor(a)", 4500.00));

        // Como é feito com streams
        System.out.println("\n Como é feito com streams");
        funcionarios
                .stream() // copia para streams
                .filter(funcionario -> funcionario.getSalario() >= 1000) // nova lista com quem ganha acima de 5000
                //.filter(funcionario -> funcionario.getCargo() == "Desenvolvedor(a)") // nova lista somente com o cago Desenvolvedor(a)
                .limit(10) // Limita o retorno em no maximo 10
                .skip(1) // pulou o 1° resultado
                //.map(Funcionario::getNome)
                .map(funcionario -> funcionario.getCargo()) // Dado um objeto de entrada, ele retorna outro de saida
                .distinct()
                .forEach(System.out::println);


        // Como é feito sem streams
        System.out.println("\n Como é feito sem streams");
        List<Funcionario> funcionariosSalarioMaior = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getSalario() >= 5000){
                funcionariosSalarioMaior.add(funcionario);
            }
        }

        List<Funcionario> funcionariosCargoDesenvolvedor = new ArrayList<>();
        for (Funcionario funcionario: funcionariosSalarioMaior){
            if (funcionario.getCargo() == "Desenvolvedor(a)"){
                funcionariosCargoDesenvolvedor.add(funcionario);
            }
        }
        funcionariosCargoDesenvolvedor.forEach(System.out::println);

        // Como é feito com streams
        System.out.println("\n Como é feito com streams usando count");
        long totalCargos = funcionarios
                .stream()
                .filter(funcionario -> funcionario.getSalario() >= 1000)
                .limit(10)
                .skip(1)
                .map(funcionario -> funcionario.getCargo())
                .distinct()
                .count();
        //.forEach(System.out::println);
        System.out.println(totalCargos);

        // Como é feito com streams
        System.out.println("\n Streams ordenando com Comparable implementaado na classe Funcionario");
        funcionarios
                .stream()
                .filter(funcionario -> funcionario.getSalario() >= 1000)
                .sorted()
                .forEach(System.out::println);


        // Como é feito com streams
        System.out.println("\n Streams com Comparator usando direto a interface");
        funcionarios
                .stream()
                .filter(funcionario -> funcionario.getSalario() >= 1000)
                .sorted(Comparator.comparing(Funcionario::getNome))
                .forEach(System.out::println);

        // Como é feito com streams
        System.out.println("\n Streams com min Salario");
        Funcionario minSalario = funcionarios
                .stream()
                .filter(funcionario -> funcionario.getSalario() >= 1000)
                .sorted(Comparator.comparing(Funcionario::getNome))
                .min(Comparator.comparingDouble(Funcionario::getSalario))
                .orElse(null);
        //.forEach(System.out::println);

        System.out.println(minSalario);

        // Como é feito com streams
        System.out.println("\n Streams com max Salario");
        Funcionario maxSalario = funcionarios
                .stream()
                .filter(funcionario -> funcionario.getSalario() >= 1000)
                .sorted(Comparator.comparing(Funcionario::getNome))
                .max(Comparator.comparingDouble(Funcionario::getSalario))
                .orElse(null);
        //.forEach(System.out::println);

        System.out.println(maxSalario);



    }
}
