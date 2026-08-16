public class Main {

    public static void main(String[] args) {
        //variaveis
        boolean executando = true;

        //inicializando as classes que utilizarei no meu programa
        Recepcao recepcao = new Recepcao();


        //Inicializando o programa
        recepcao.exibirMenu();

        while (executando == true) {

            switch (recepcao.opcaoMenu) {
                case 0:
                    System.out.println("Encerrando...");
                    executando = false;
                    break;
                case 1:
                    recepcao.cadastrarPaciente();
                    break;
                case 2:
                    recepcao.chamarPaciente();
                    break;
                case 3:
                    recepcao.agendarConsulta();
                    break;
                case 4:
                    recepcao.cobrarConsulta();
                }

                if (recepcao.opcaoMenu != 0) {
                    recepcao.exibirMenu();
                }

            }


        }
    }

