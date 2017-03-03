package pilha;

import static java.lang.System.exit;
import java.util.Scanner;
import java.util.Stack;

public class Pilha {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*Stack <Integer> pilha = new Stack ();
       //verifica se a pilha esta vazia ou cheia 
      if (pilha.isEmpty()){
      System.out.println ("Pilha Vazia.");
      }
      else{
          System.out.println ("Pilha com Valores.");
      }  
        
      System.out.println();
      
      pilha.push(0);
      pilha.push(1);
      pilha.push(2);
      pilha.push(3);
      pilha.push(4);
      pilha.push(5);
       
      //verifica se a pilha esta vazia ou cheia//
      if (pilha.isEmpty()){
      System.out.println ("Pilha Vazia.");
      }
      else{
          System.out.println ("Pilha com Valores.");
      }
      //imprime o tamanho da pilha
      System.out.println(pilha.size());
      //imprime a pilha inteira//
      System.out.println (pilha);
      
      //imprime o ultimo elemento da pilha//
      System.out.println (pilha.peek());
      
      //remove o ultimo elememento da pilha//
      System.out.println(pilha.pop());
      
      //imprime a pilha inteira       
      System.out.println (pilha);
      
      //metodo desempilha//
      while(!pilha.isEmpty()){
          
        System.out.println ("Valores = "+pilha.pop());  
      }*/
        Stack<Nomes> pilha1 = new Stack();

        while (true) {
            System.out.println("\nDigite 1 para inserir na pilha.");
            System.out.println("Digite 2 para desempilhar.");
            System.out.println("Digite 0 para Sair.");
            System.out.print("opcao ");
            int opcao = scan.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("\nDigite um nome");
                    scan.nextLine();
                    String nome = scan.nextLine();

                    Nomes nome1 = new Nomes();

                    nome1.setNome(nome);

                    pilha1.add(nome1);
                    break;
                case 2:
                   /* while(!pilha1.isEmpty()){
                   
                System.out.println(pilha1.pop());
               }*/
                    if (pilha1.isEmpty()) {
                        System.out.println("\nLista Vazia.");
                    } else {
                        while(!pilha1.isEmpty()){
                   
                      System.out.println(pilha1.pop());
               }
                    }

                    break;

                case 0:
                    exit(0);
                    break;

                default:
                    System.out.println("\nOpcao Invalida");
                    break;
            }

        }

    }

}
