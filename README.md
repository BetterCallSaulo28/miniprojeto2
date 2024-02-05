import java.util.Scanner;

public class JogoAgentesSecretos {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introdução e escolha do personagem
        System.out.println("Bem-vindo ao mundo dos agentes secretos!");
        System.out.println("Escolha seu personagem:");
        System.out.println("1. Agente Alpha");
        System.out.println("2. Agente Bravo");
        System.out.print("Digite o número correspondente ao personagem: ");
        int escolhaPersonagem = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        // Nome do jogador
        System.out.print("Por favor, digite seu nome: ");
        String nome = scanner.nextLine();

        // Introdução à história
        System.out.println("\nOlá, Agente " + nome + "!");
        System.out.println("Você foi recrutado para uma missão secreta...");

        // Energia do jogador
        int energia = 100;

        // Escolha inicial
        System.out.println("\nVocê está diante de uma porta com três botões numerados: 1, 2 e 3.");
        System.out.println("Qual botão você escolhe pressionar?");
        System.out.println("1. Botão 1");
        System.out.println("2. Botão 2");
        System.out.println("3. Botão 3");
        int escolhaInicial = scanner.nextInt();

        // Segunda escolha
        switch (escolhaInicial) {
            case 1:
                escolhaBotao1();
                energia -= 20; // Exemplo de perda de energia
                break;
            case 2:
                escolhaBotao2();
                break;
            case 3:
                escolhaBotao3();
                break;
            default:
                System.out.println("Escolha inválida! Você falhou em seguir as instruções. Missão terminada!");
        }

        // Verificar se a energia chegou a zero
        if (energia <= 0) {
            System.out.println("Sua energia chegou a zero. Game over!");
        }
    }

    public static void escolhaBotao1() {
        System.out.println("\nVocê pressionou o Botão 1 e uma armadilha é acionada.");
        System.out.println("Você foi capturado pelos inimigos. Fim de jogo!");
    }

    public static void escolhaBotao2() {
        System.out.println("\nVocê pressionou o Botão 2 e uma escotilha se abre, revelando um túnel.");
        System.out.println("Você entra no túnel e continua sua missão. Parabéns, Agente!");
    }

    public static void escolhaBotao3() {
        System.out.println("\nVocê pressionou o Botão 3 e uma voz computadorizada pede uma senha.");
        System.out.println("Você digita uma senha e a porta se abre, revelando o objetivo da missão.");
        System.out.println("Missão cumprida, Agente! Você é um herói.");
    }
}
