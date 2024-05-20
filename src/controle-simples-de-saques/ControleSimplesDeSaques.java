import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        double limiteDiario = scanner.nextDouble();

// TODO: Crie um loop 'for' para iterar sobre os saques:
    
// TODO: Solicite ao usuário o valor do saque:
    for(int i = 0; i < 5; i++){
    double valorSaque = scanner.nextDouble();
    
    if(valorSaque == 0){
      System.out.println("Transacoes encerradas.");
      break;
    }
// Dica: Utilize um 'if/else' para verificar as condições do valorSaque e o limiteDiario;
  else if(valorSaque >= limiteDiario){
    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
    break;
  }
  else if(valorSaque <= limiteDiario){
    limiteDiario -= valorSaque;
    System.out.println("Saque realizado. Limite restante: "+limiteDiario);
     System.out.println("Transacoes encerradas.");
    break;
    
  } else{
    System.out.println("Saque realizado. Limite restante: "+limiteDiario);
     System.out.println("Transacoes encerradas.");
    break;
  }
           
    }   

// TODO: Verifique se o valor do saque é zero, encerrando as transações:
// TODO: Se o valor do saque não ultrapassar o limite diário, subtraia o valor do saque do limite diário:
            

// TODO: Informe que o saque foi realizado e mostre o limite restante:
              
        scanner.close(); 
            }
        }

// Fechamos o Scanner para evitar vazamento de recursos:
