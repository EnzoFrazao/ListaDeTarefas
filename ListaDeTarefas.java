package projetos;

import java.beans.PropertyEditorManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<String> listaTarefas = new ArrayList<>();
        ArrayList<String> listaTarefasConcluidas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("Escolha uma ação:\n" +
                    "1- Adicionar na lista\n" +
                    "2- Marcar tarefas como concluidas\n" +
                    "3- Listar todas as tarefas\n" +
                    "4- Sair");
            opcao = entrada.nextInt();
            entrada.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Digite a tarefa que deseja adicionar a lista: ");
                    String novatarefa = entrada.nextLine();
                    listaTarefas.add(novatarefa);
                    break;
                case 2:
                    if (listaTarefas.isEmpty()){
                        System.out.println("A lista está vazia.\n");
                        break;
                    }
                    System.out.println("Lista de tarefas: ");
                    for (int i = 0; i<listaTarefas.size(); i++){
                        System.out.println((i+1)+":"+listaTarefas.get(i));
                    }
                    System.out.println("Digite o número da tarefa que foi concluida: \n");
                    int indice = entrada.nextInt() - 1;
                    entrada.nextLine();
                    if (indice >= 0 && indice <listaTarefas.size()){
                        String tarefaConcluida = listaTarefas.remove(indice);
                        listaTarefasConcluidas.add(tarefaConcluida);
                        System.out.println("Tarefa marcada como concluida.\n");
                    }
                    else
                        System.out.println("Número da tarefa inválido.\n");
                    break;
                case 3:
                    System.out.println("Tarefas pendentes: \n");
                    if (listaTarefas.isEmpty()){
                        System.out.println("Nenhuma tarefa pendente.\n");
                    }
                    else{
                        for (int i = 0; i<listaTarefas.size(); i++){
                            System.out.println((i+1)+":"+listaTarefas.get(i));
                        }
                    }
                    System.out.println("Tarefas concluidas: ");
                    if (listaTarefasConcluidas.isEmpty()){
                        System.out.println("Não há tarefas concluídas.");
                    }
                    else{
                        for (int i = 0; i<listaTarefasConcluidas.size(); i++){
                            System.out.println((i+1)+":"+listaTarefasConcluidas.get(i));
                        }
                    }
                    break;
                case 4:
                    System.out.println("Saindo do programa.\n");
                    break;
                default:
                    System.out.println("Número inválido, escolha uma opção válida\n");
            }
        }while (opcao != 4);

        entrada.close();
    }
}
