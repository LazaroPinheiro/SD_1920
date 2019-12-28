public class View {

    public static void titulo(){
        System.out.println("*-----------------------------*");
        System.out.println("|            SOUND            |");
        System.out.println("|              &              |");
        System.out.println("|            CLOUD            |");
        System.out.println("*-----------------------------*");
    }


    public static void menuInical(){
        titulo();
        System.out.println("1 - Iniciar Sessão");
        System.out.println("2 - Criar conta");
        System.out.println("0 - Sair");
        System.out.println("\nIntroduza a sua opção.");
        System.out.println("Opção:");
    }

    public static void menuLogado(){
        titulo();
        System.out.println("1 - Upload de Conteudo");
        System.out.println("2 - Procurar Música");
        System.out.println("3 - Download de Conteudo");
        System.out.println("0 - Terminar Sessão");
        System.out.println("\nIntroduza a sua opção.");
        System.out.println("Opção:");
    }

    public static void menuEtiquetas(){
        System.out.println("\n******** Etiquetas ********");
        System.out.println("1 - Introduzir nova etiqueta");
        System.out.println("0 - Voltar");
        System.out.println("\nIntroduza a sua opção");
        System.out.println("Opção:");
    }

    public static void viewException(String mensagem){
        System.out.println("-----------------------------------------------------");
        System.out.println("                        ERRO!");
        System.out.println(" ");
        System.out.println(mensagem);
        System.out.println("-----------------------------------------------------");

    }
}
