package cap05.exemplo;

import javax.xml.crypto.Data;

public class Paciente {

    private String nome;
    private String rg;
    private String endereco;
    private String telefone;
    private Data dataNascimento;
    private String profissao;

    public boolean verificaPacienteCadastrado(String name) {

        return name.equals("Paulo");
    }

    public void adicionarPaciente(){}
    public Paciente getPaciente(){
        return new Paciente();
    }

    public Paciente getConsulta(){
        return new Paciente();
    }

    public void adicionarCOnsulta(){}
    public void localizarPaciente(){}
    public void cadastrarPaciente(){}

}
