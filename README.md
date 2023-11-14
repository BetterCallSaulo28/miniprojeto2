import java.util.Scanner;

public class MiniProjeto2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introdução
        System.out.println("Bem-vindo ao Mundo dos Espiões!");
        System.out.print("Digite o nome do agente principal: ");
        String nomeAgente = scanner.nextLine();

        System.out.print("Escolha o gênero do agente (M/F): ");

        int energia = 10;

        // Fase 1
        System.out.println("\n--- Fase 1: Missão Infiltrada ---");
        System.out.println("O agente " + nomeAgente + " está em uma missão ultrassecreta.");

        // Escolhas da Fase 1
        System.out.println("Escolha o que fazer a seguir:");
        System.out.println("1. Entrar no prédio pela porta principal.");
        System.out.println("2. Procurar uma entrada secreta nos fundos.");

        int escolhaFase1 = scanner.nextInt();

        if (escolhaFase1 == 1) {
            System.out.println("Entrando pela porta principal, você passa despercebido.");
        } else if (escolhaFase1 == 2) {
            System.out.println("Procurando uma entrada secreta, você encontra e evita as câmeras.");
        } else {
            System.out.println("Escolha inválida. O agente " + nomeAgente + " permanece em espera.");
        }

        // Exibição de energia
        System.out.println("Energia restante: " + energia);

        // Fase 2
        System.out.println("\n--- Fase 2: Encontro Perigoso ---");
        System.out.println("O agente " + nomeAgente + " se depara com um agente inimigo.");

        // Escolhas da Fase 2
        System.out.println("Escolha o que fazer a seguir:");
        System.out.println("1. Engajar em uma luta direta.");
        System.out.println("2. Tentar se esquivar e continuar furtivamente.");

        int escolhaFase2 = scanner.nextInt();

        if (escolhaFase2 == 1) {
            System.out.println("Envolvendo-se na luta, o agente " + nomeAgente + " vence o inimigo.");
        } else if (escolhaFase2 == 2) {
            System.out.println("Desviando-se habilmente, o agente " + nomeAgente + " continua a missão.");
        } else {
            System.out.println("Escolha inválida. O agente " + nomeAgente + " permanece em alerta.");
        }

        // Exibição de energia
        energia -= 2;
        System.out.println("Energia restante: " + energia);

        // Fase 3
        System.out.println("\n--- Fase 3: Extração Arriscada ---");
        System.out.println("O agente " + nomeAgente + " precisa escapar do local.");

        // Escolhas da Fase 3
        System.out.println("Escolha o que fazer a seguir:");
        System.out.println("1. Pedir apoio aéreo para uma extração rápida e segura.");
        System.out.println("2. Tentar escapar a pé pela rota de fuga arriscada.");

        int escolhaFase3 = scanner.nextInt();

        if (escolhaFase3 == 1) {
            System.out.println("A extração aérea chega a tempo, o agente " + nomeAgente + " escapa com sucesso.");
        } else if (escolhaFase3 == 2) {
            System.out.println("Correndo pela rota arriscada, o agente " + nomeAgente + " escapa, mas perde energia.");
            energia -= 2;
        } else {
            System.out.println("Escolha inválida. O agente " + nomeAgente + " continua escondido.");
        }

        // Exibição de energia final
        System.out.println("\nMissão concluída!");

        // Finais diferentes com base na energia restante
        if (energia >= 8) {
            System.out.println("Parabéns, Agente " + nomeAgente + "! Você concluiu a missão com sucesso e está pronto para a próxima!");
        } else if (energia >= 4) {
            System.out.println("Você concluiu a missão, Agente " + nomeAgente + ", mas ficou um pouco exausto. Recarregue e esteja preparado para a próxima missão.");
        } else {
            System.out.println("A missão foi um sucesso, mas a baixa energia deixou o Agente " + nomeAgente + " vulnerável. Descanse e se recupere para a próxima missão.");
        }

        // Fechamento
        System.out.println("\nObrigado por jogar, Agente " + nomeAgente + ". Até a próxima missão!");
        scanner.close();
    }
}

# miniprojeto2
