import java.util.Scanner;
import java.time.LocalDate;

public class Recepcao {
    //atributos
    int menu;
    int opcaoMenu;

    //outros
    Scanner scanner = new Scanner(System.in);

    Paciente [] fila = new Paciente[5];
    int tamanhoFila = 0;





    //metodos
    public void CadastrarPaciente(){
        //cria o paciente
        Paciente paciente = new Paciente();
        System.out.println("=== CADASTRO DE PACIENTE ===");

        //pede o nome
        System.out.println("Digite o nome:");
        paciente.nome = scanner.next();

        //pede nascismento
        System.out.println("Digite o ano, mês e dia de nascimento (yyyy mm dd):");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        paciente.dataNacimento = LocalDate.of(year, month, day);

        //pede registro
        System.out.println("Digite o numero de registro: ");
        paciente.registro = scanner.nextInt();

        //colocar o paciente pronto numa fila
        fila[tamanhoFila] = paciente;
        tamanhoFila++;

    }

    public void ChamarPaciente(){
        //todo: chamar o primeiro da fila (FIFO)
        //todo: exibir O NOME
    }

    public void CobrarConsulta(){
        System.out.println("Cobrar");
    }

    public void AgendarConsulta(){
        System.out.println("agendar");
    }

    public void ExibirMenu(){
        System.out.println("Olá! Seja Bem vindo à clinica Medicine.");
        System.out.println("Selecione uma alternativa:");
        System.out.println("0 - Sair");
        System.out.println("1 - Chamar o proximo paciente");
        System.out.println("2 - Cobrar Consulta");
        System.out.println("3 - Agendar Consulta");
        System.out.println();
        //Scanner menu = new Scanner(System.in);
        opcaoMenu = scanner.nextInt();

    }
}
