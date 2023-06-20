import java.util.Scanner;

public class LivroInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bem-vindo ao livro interativo! Você está lendo 'A Floresta Misteriosa'.");
        System.out.println("Você está em uma encruzilhada na floresta. Escolha o seu caminho: [esquerda / direita]");
        
        String escolha1 = scanner.nextLine(); // Lê a primeira escolha do usuário
        
        if (escolha1.equalsIgnoreCase("esquerda")) { // Verifica se a escolha foi "esquerda"
            System.out.println("Você escolheu ir para a esquerda. Agora você está em um rio caudaloso.");
            System.out.println("Deseja construir uma jangada para atravessar o rio? [s / n]");
            
            String escolha2 = scanner.nextLine(); // Lê a segunda escolha do usuário
            
            if (escolha2.equalsIgnoreCase("s")) { // Verifica se a segunda escolha foi "sim"
                System.out.println("Você constrói uma jangada improvisada e consegue atravessar o rio.");
                System.out.println("Do outro lado, você encontra uma caverna escura. Deseja entrar? [s / n]");
                
                String escolha3 = scanner.nextLine(); // Lê a terceira escolha do usuário
                
                if (escolha3.equalsIgnoreCase("s")) { // Verifica se a terceira escolha foi "sim"
                    System.out.println("Ao entrar na caverna, você encontra um tesouro brilhante!");
                    System.out.println("Parabéns! Você encontrou o tesouro e concluiu a sua aventura na Floresta Misteriosa.");
                } else if (escolha3.equalsIgnoreCase("n")) { // Verifica se a terceira escolha foi "não"
                    System.out.println("Você decide não entrar na caverna e continua sua jornada pela floresta.");
                    System.out.println("Após explorar mais um pouco, você encontra um caminho que leva à saída da floresta.");
                    System.out.println("Você escapou com segurança e concluiu a sua aventura na Floresta Misteriosa.");
                } else { // Se a terceira escolha não for nenhuma das opções esperadas
                    System.out.println("Opção inválida. Fim do livro.");
                }
            } else if (escolha2.equalsIgnoreCase("n")) { // Verifica se a segunda escolha foi "não"
                System.out.println("Você decide não construir uma jangada e tenta atravessar o rio a nado.");
                System.out.println("Infelizmente, a correnteza é muito forte e você é arrastado. Fim do capítulo.");
            } else { // Se a segunda escolha não for nenhuma das opções esperadas
                System.out.println("Opção inválida. Fim do livro.");
            }
        } else if (escolha1.equalsIgnoreCase("direita")) { // Verifica se a primeira escolha foi "direita"
            System.out.println("Você escolheu ir para a direita. Agora você está em uma clareira tranquila.");
            System.out.println("Você encontra um mapa antigo no chão. Deseja seguir o mapa? [s / n]");
            
            String escolha2 = scanner.nextLine(); // Lê a segunda escolha do usuário
            
            if (escolha2.equalsIgnoreCase("s")) { // Verifica se a segunda escolha foi "sim"
                System.out.println("Você decide seguir o mapa e começa a percorrer o caminho indicado.");
                System.out.println("Após algumas horas, você encontra uma cabana abandonada com uma chave em cima da mesa.");
                System.out.println("Deseja pegar a chave? [s / n]");
                
                String escolha3 = scanner.nextLine(); // Lê a terceira escolha do usuário
                
                if (escolha3.equalsIgnoreCase("s")) { // Verifica se a terceira escolha foi "sim"
                    System.out.println("Você pega a chave e continua seguindo o mapa.");
                    System.out.println("No final do caminho indicado pelo mapa, você encontra um tesouro escondido!");
                    System.out.println("Parabéns! Você encontrou o tesouro e concluiu a sua aventura na Floresta Misteriosa.");
                } else if (escolha3.equalsIgnoreCase("n")) { // Verifica se a terceira escolha foi "não"
                    System.out.println("Você decide não pegar a chave e continua seguindo o mapa.");
                    System.out.println("Após mais algum tempo, você encontra um baú de tesouros mas não consegue abrir.");
                    System.out.println("Infelizmente o baú continha equipamentos mágicos, você é atacado e não consegue se defender.");
                    System.out.println("Fim do capítulo.");
                } else { // Se a terceira escolha não for nenhuma das opções esperadas
                    System.out.println("Opção inválida. Fim do livro.");
                }
            } else if (escolha2.equalsIgnoreCase("n")) { // Verifica se a segunda escolha foi "não"
                System.out.println("Você decide ignorar o mapa e explorar a clareira por conta própria.");
                System.out.println("Após algum tempo, você se perde na floresta e não consegue encontrar o caminho de volta.");
                System.out.println("Fim do capítulo.");
            } else { // Se a segunda escolha não for nenhuma das opções esperadas
                System.out.println("Opção inválida. Fim do livro.");
            }
        } else { // Se a primeira escolha não for nenhuma das opções esperadas
            System.out.println("Opção inválida. Fim do livro.");
        }
        
        scanner.close();
    }
}
