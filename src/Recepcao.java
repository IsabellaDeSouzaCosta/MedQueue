import java.util.Scanner;

public class Recepcao {
    int menu;
    int opcaoMenu;


    //metodos

    public void ChamarPaciente(){

    }

    public void CobrarConsulta(){

    }

    public void AgendarConsulta(){

    }

    public void ExibirMenu(){
        System.out.println("Olá! Seja Bem vindo à clinica Medicine.");
        System.out.println("Selecione uma alternativa:");
        System.out.println("0 - Sair");
        System.out.println("1 - Chamar o proximo paciente");
        System.out.println("2 - Cobrar Consulta");
        System.out.println("3 - Agendar Consulta");
        System.out.println();
        Scanner menu = new Scanner(System.in);
        opcaoMenu = menu.nextInt();

    }
}
