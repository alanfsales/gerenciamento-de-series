import model.Serie;
import model.SerieAcao;
import model.SerieComedia;
import model.SerieDrama;
import service.SerieService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SerieService service = new SerieService();
        int opcao = 0;

        do{
            menu();
            opcao = lerInteiro(sc);

            switch (opcao){
                case 1 -> cadastrar(sc, service);
                case 2 -> listar(service);
                case 3 -> atualizar(sc, service);
                case 4 -> excluir(sc, service);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida.");
            }
        }while (opcao !=0);


    }

    private static  void menu(){
        System.out.print("""
                \n===== Sistema de Gerenciamento de Séries =====
                1 - Adicionar série
                2 - Listar séries
                3 - Atualizar série
                4 - Excluir série
                0 - Sair
                """);
        System.out.print("Escolha: ");
    }

    private static void cadastrar(Scanner sc, SerieService service){
        System.out.println("\n==== Cadastrar Série ====");
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        if (!service.existe(titulo)) {
            System.out.print("Temporadas: ");
            int temporadas = lerInteiro(sc);
            int tipo = 0;
                    System.out.println("Tipo de série (1-Drama, 2-Comédia, 3-Ação): ");
            while (true) {
                tipo = lerInteiro(sc);
                if(tipo > 0 && tipo < 4){
                    break;
                }else {
                    System.out.println("Tipo inválido. Informe o número 1, 2 ou 3");
                }
            }


            Serie serie = switch (tipo) {
                case 1 -> new SerieDrama(titulo, temporadas);
                case 2 -> new SerieComedia(titulo, temporadas);
                case 3 -> new SerieAcao(titulo, temporadas);
                default -> null;
            };

            service.adicionar(serie);
            System.out.println("\nSerie cadastrada com sucesso");

        }else {
            System.out.println("\nSerie já cadastrada");
        }
    }

    private static void listar(SerieService service){
        System.out.println("\n==== Lista de Séries ====");
        if (!service.listar().isEmpty()) {
            service.listar().forEach(Serie::exibirDetalhes);
        }else {
            System.out.println("\nA lista de série está fazia.");
        }
    }

    private static void atualizar(Scanner sc, SerieService service){
        System.out.println("\n==== Atualizar Série ====");
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        if (service.existe(titulo)) {
            System.out.print("Temporadas: ");
            int temporadas = lerInteiro(sc);

            Serie serie = service.buscar(titulo);
            serie.setTemporadas(temporadas);
            service.atualizar(serie);
            System.out.println("\nSérie atualizada com sucesso.");
        }else {
            System.out.println("\nSérie não encontrada.");
        }
    }

    private static int lerInteiro(Scanner sc) {
        int opcao;
        while (true) {
            try {
                opcao = sc.nextInt();
                sc.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.print("Entrada inválida! Digite um número inteiro: ");
                sc.nextLine();
            }
        }
        return opcao;
    }

    private static void excluir(Scanner sc, SerieService service) {
        System.out.println("\n==== Excluir Série ====");
        System.out.print("Título: ");
        String titulo = sc.nextLine();

        if(service.buscar(titulo) != null){
            service.excluir(titulo);
            System.out.println("\nSérie excluída com sucesso. ");
        }else {
            System.out.println("\nSérie não encontrada.");
        }
    }
}