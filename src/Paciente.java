import java.time.LocalDate;

public class Paciente {

    Prontuario prontuario = new Prontuario();

    //aributos
    int idade;
    int registro;

    String nome;
    LocalDate dataNacimento;

    //metodos
    public int calcularIdade(int idade){
        //todo: pedir a data de nascimento do usuario.dataNascimento
        //todo: pegar a data de hoje
        //todo: fazer dataNasciment0 - Hoje e guardar em idade
        return idade;
    }

    public void ExibirPaciente(){
        //todo: exibir nome, nascimento, registro
    }


}
