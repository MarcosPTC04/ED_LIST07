import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Defina a capacidade inicial da lista: ");
        int capacidade = scanner.nextInt();
        MyArrayList lista = new MyArrayList(capacidade);

        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n------------------------------------");
            System.out.println("       MENU TAD MYARRAYLIST         ");
            System.out.println("------------------------------------");
            System.out.println("1.  Adicionar ao Final (addLast)");
            System.out.println("2.  Adicionar no Início (addFirst)");
            System.out.println("3.  Inserir em Posição (insertAt)");
            System.out.println("4.  Inserir Ordenado (addSorted)");
            System.out.println("5.  Remover Último (removeLast)");
            System.out.println("6.  Remover Primeiro (removeFirst)");
            System.out.println("7.  Remover por Índice (removeAt)");
            System.out.println("8.  Remover por Valor (remove)");
            System.out.println("9.  Buscar Índice de um Valor (find)");
            System.out.println("10. Obter Valor por Índice (get)");
            System.out.println("11. Alterar Valor por Índice (set)");
            System.out.println("12. Exibir Informações (Size/Full/Empty)");
            System.out.println("13. EXIBIR LISTA COMPLETA");
            System.out.println("0.  Sair");
            System.out.print("\nEscolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.print("Digite o valor: ");
                    lista.addLast(scanner.nextInt());
                }
                case 2 -> {
                    System.out.print("Digite o valor: ");
                    lista.addFirst(scanner.nextInt());
                }
                case 3 -> {
                    System.out.print("Índice: ");
                    int idx = scanner.nextInt();
                    System.out.print("Valor: ");
                    lista.insertAt(idx, scanner.nextInt());
                }
                case 4 -> {
                    System.out.print("Digite o valor para inserir ordenado: ");
                    lista.addSorted(scanner.nextInt());
                }
                case 5 -> lista.removeLast();
                case 6 -> lista.removeFirst();
                case 7 -> {
                    System.out.print("Índice para remoção: ");
                    lista.removeAt(scanner.nextInt());
                }
                case 8 -> {
                    System.out.print("Valor para remover: ");
                    lista.remove(scanner.nextInt());
                }
                case 9 -> {
                    System.out.print("Valor para busca: ");
                    int val = scanner.nextInt();
                    int pos = lista.find(val);
                    if(pos != -1) System.out.println("Valor encontrado no índice: " + pos);
                    else System.out.println("Valor não encontrado.");
                }
                case 10 -> {
                    try {
                        System.out.print("Índice: ");
                        System.out.println("Valor na posição: " + lista.get(scanner.nextInt()));
                    } catch (Exception e) { System.out.println("Erro: Índice inválido."); }
                }
                case 11 -> {
                    try {
                        System.out.print("Índice: ");
                        int idx = scanner.nextInt();
                        System.out.print("Novo Valor: ");
                        lista.set(idx, scanner.nextInt());
                        System.out.println("Valor atualizado!");
                    } catch (Exception e) { System.out.println("Erro: Índice inválido."); }
                }
                case 12 -> {
                    System.out.println("-> Total de elementos: " + lista.count());
                    System.out.println("-> Está vazia? " + lista.isEmpty());
                    System.out.println("-> Está cheia? " + lista.isFull());
                }
                case 13 -> lista.display();
                case 0 -> System.out.println("Encerrando programa...");
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
        scanner.close();
    }
}