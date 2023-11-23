import java.util.Scanner;

public class MiniProjeto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introdução
        System.out.println("---CAPITULO I---");
        System.out.println("---Hotel em Monaco---");
        System.out.println("Seja bem vindo à CIA!");
        System.out.println("Preste atenção, essa é a sua missão:");
        System.out.println("Você deve se infiltrar no Hotel MonteCarlo, esse hotel esta sobre nossas investigações, se estivermos certos, este hotel é usado para lavagem de dinheiro da maior organização criminosa do Pacifico Norte ");
        
        System.out.print("Escolha o gênero do agente (M/F): ");

        int energia = 10;

        System.out.print("Me informe seu codinome: ");
        String nomeAgente = scanner.nextLine();

        // Fase 1
        System.out.println("\n--- Fase 1: Infiltração ---");
        System.out.println("O agente " + nomeAgente + " está em uma missão secreta.");

        // Escolhas da Fase 1
        System.out.println("Escolha o que fazer a seguir:");
        System.out.println("1. Entrar no prédio pela porta principal.");
        System.out.println("2. Invadir pela entrada dos fundos.");

        int escolhaFase1 = scanner.nextInt();

        if (escolhaFase1 == 1) {
            System.out.println("Entrando pela porta principal, você passa despercebido.");
            // Exibição de energia
            energia -= 0;
            System.out.println("Energia restante: " + energia);
        } else if (escolhaFase1 == 2) {
            System.out.println("Entrando pelos fundos, você encontra e evita as câmeras.");
            // Exibição de energia
            energia -= 3;
            System.out.println("Energia restante: " + energia);
        } else {
            System.out.println("Escolha inválida. O agente " + nomeAgente + " permanece em espera.");
        }

        // Fase 2
        System.out.println("\n--- Fase 2: O inimigo ---");
        System.out.println("O agente " + nomeAgente + " se depara com um agente inimigo.");

        // Escolhas da Fase 2
        System.out.println("Escolha o que fazer a seguir:");
        System.out.println("1. Eliminar o inimigo em uma luta.");
        System.out.println("2. Despistar o inimigo.");

        int escolhaFase2 = scanner.nextInt();

        if (escolhaFase2 == 1) {
            System.out.println("Envolvendo-se na luta, o agente " + nomeAgente + " vence o inimigo.");
            // Exibição de energia
            energia -= 3;
            System.out.println("Energia restante: " + energia);
        } else if (escolhaFase2 == 2) {
            System.out.println("Desviando-se habilmente, o agente " + nomeAgente + " continua a missão.");
            // Exibição de energia
            energia -= 0;
            System.out.println("Energia restante: " + energia);
        } else {
            System.out.println("Escolha inválida. O agente " + nomeAgente + " permanece em alerta.");
        }

        // Fase 3
        System.out.println("\n--- Fase 3: A fuga ---");
        System.out.println("O agente " + nomeAgente + " precisa escapar do local.");

        // Escolhas da Fase 3
        System.out.println("Escolha o que fazer a seguir:");
        System.out.println("1. Pedir apoio aéreo para uma extração rápida e segura.");
        System.out.println("2. Tentar escapar a pé pela rota de fuga arriscada.");

        int escolhaFase3 = scanner.nextInt();

        if (escolhaFase3 == 1) {
            System.out.println("A extração aérea chega a tempo, o agente " + nomeAgente + " escapa com sucesso.");
            // Exibição de energia
            energia -= 2;
            System.out.println("Energia restante: " + energia);
        } else if (escolhaFase3 == 2) {
            System.out.println("Correndo pela rota arriscada, o agente " + nomeAgente + " escapa, mas perde energia.");
            // Exibição de energia
            energia -= 4;
            System.out.println("Energia restante: " + energia);
        } else {
            System.out.println("Escolha inválida. O agente " + nomeAgente + " continua escondido.");
        }

        // Exibição de energia final
        System.out.println("\nMissão concluída!");

        // Finais diferentes com base na energia restante
        if (energia >= 5) {
            System.out.println("Parabéns, Agente " + nomeAgente + "! Você concluiu a missão com sucesso e está pronto para a próxima!");
        } else if (energia >= 1) {
            System.out.println("Você concluiu a missão, Agente " + nomeAgente + ", mas ficou um pouco exausto. Recarregue e esteja preparado para a próxima missão.");
        } else if (energia == 0) {
            System.out.println(" Voce ficou sem eneria, a missão foi uma falha.");
        }

        // Fechamento
        System.out.println("\nObrigado por jogar, Agente " + nomeAgente + ". Até a próxima missão!");
        scanner.close();
    }
}
