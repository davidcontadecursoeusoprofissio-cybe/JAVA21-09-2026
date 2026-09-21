
import java.util.Scanner;

public class PortaSeguranca{
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        String senhaCorreta = "Senha";

        System.out.println("===PORTA DE SEGUNRANÇA 🚪🔑===");
        System.out.println("📷CÂmera ligada");
        System.out.println("👀Escaneando rosto...");

        System.out.print("🔑Digite a senha para entrar:");
        String senha = teclado.nextLine();

        if(senha.equals(senhaCorreta)){
            System.out.println("\nIdentidade confirmada");
            System.out.println("Porta aberta");
            System.out.println("Câmera registrou entrada");
        }else{
            System.out.println("\n Senha incorreta");
            System.out.println("Foto do invasor salva");
            System.out.println("Segurança avisada");
        }
        teclado.close();
    }
}








