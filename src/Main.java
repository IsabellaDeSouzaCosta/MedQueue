public class Main {

    public static void main(String[] args) {
        //variaveis
        boolean executando = true;

        //inicializando as classes que utilizarei no meu programa
        Recepcao recepcao = new Recepcao();


        //Inicializando o programa
        recepcao.ExibirMenu();

        while (executando == true) {
            switch (recepcao.opcaoMenu) {
                case 0:
                    System.out.println("Encerrando...");
                    executando = false;
                    break;
                case 1:
                    recepcao.ChamarPaciente();
                    break;
                case 2:
                    recepcao.AgendarConsulta();
                    break;
                case 3:
                    recepcao.CadastrarPaciente();
                    break;
                case 4:
                    recepcao.CobrarConsulta();
                }

                if (recepcao.opcaoMenu != 0) {
                    recepcao.ExibirMenu();
                }

            }


        }
    }

