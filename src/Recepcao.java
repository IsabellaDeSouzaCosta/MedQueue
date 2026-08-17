import java.util.Scanner;
import java.time.LocalDate;

public class Recepcao {
    //atributos
    int opcaoMenu;
    int tamanhoFila = 0;
    Paciente [] fila = new Paciente[5];

    //entrada de dados
    Scanner scanner = new Scanner(System.in);

    //métodos

    public void cadastrarPaciente(){

        Paciente paciente = new Paciente();
        System.out.println("=== CADASTRO DE PACIENTE ===");

        //Nome
        System.out.println("Digite o nome:");
        paciente.nome = scanner.next();

        //Data de Nascismento
        System.out.println("Digite o ano, mês e dia de nascimento (yyyy mm dd):");
        int ano = scanner.nextInt();
        int mes = scanner.nextInt();
        int dia = scanner.nextInt();
        paciente.dataNacimento = LocalDate.of(ano, mes, dia);

        //Número de registro
        System.out.println("Digite o numero de registro: ");
        paciente.registro = scanner.nextInt();

        //Adiciona Paciente à fila
        fila[tamanhoFila] = paciente;
        tamanhoFila++;

    }

    public void chamarPaciente(){
        if (tamanhoFila == 0){
            System.out.println("Não há pacientes no momento.");
        } else {

            System.out.println("Proximo Paciente: " + fila[0].nome);
            //Move os pacientes uma posição para a esquerda após chamar o primeiro.
            for (int i = 0; i < (tamanhoFila - 1); i++) {
                fila[i] = fila[i+1];
            }
            tamanhoFila--;
        }

    }

    public void cobrarConsulta(){
        //todo: perguntar a forma do pagamento
        //todo: pedir o valor da consulta
    }

    public void agendarConsulta(){
        //todo: selecionar o paciente
        //todo: definir data/horário e registrar a consulta
    }

    public void exibirMenu(){
        System.out.println("Olá! Seja Bem vindo à clinica Medicine.");
        System.out.println("Selecione uma alternativa:");
        System.out.println("0 - Sair");
        System.out.println("1 - Cadastrar paciente");
        System.out.println("2 - Chamar o próximo paciente");
        System.out.println("3 - Agendar Consulta");
        System.out.println("4 - Cobrar Consulta");
        System.out.println();
        opcaoMenu = scanner.nextInt();

    }
}
