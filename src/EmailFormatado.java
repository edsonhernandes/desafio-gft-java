import java.util.*;

public class EmailFormatado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> emailsGerados = new HashMap<>();

        while (true) {
            System.out.print("Digite o nome completo (ou 'sair' para encerrar): ");
            String nomeCompleto = scanner.nextLine();

            if (nomeCompleto.equalsIgnoreCase("sair")) {
                break;
            }

            // Divide o nome completo em partes
            String[] partes = nomeCompleto.trim().toLowerCase().split(" ");
            if (partes.length < 2) {
                System.out.println("Digite pelo menos nome e sobrenome.");
                continue;
            }

            String primeiroNome = partes[0];
            String sobrenome = partes[partes.length - 1]; // último elemento
            String baseEmail = primeiroNome + "." + sobrenome;
            String emailFinal;

            // Verificar se o email base já existe
            if (emailsGerados.containsKey(baseEmail)) {
                int contador = emailsGerados.get(baseEmail) + 1;
                emailFinal = baseEmail + contador + "@empresa.com";
                emailsGerados.put(baseEmail, contador);
            } else {
                emailFinal = baseEmail + "@empresa.com";
                emailsGerados.put(baseEmail, 1);
            }

            System.out.println("Email gerado: " + emailFinal);
        }

        scanner.close();
    }
}

