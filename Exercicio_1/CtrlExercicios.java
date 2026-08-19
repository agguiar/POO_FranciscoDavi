package controller;
import java.util.Scanner;
import java.util.InputMismatchException;
import exception.IdadeInvalidaException;



public class CtrlExercicios {
	public static int converterParaInteiro(String texto) throws NumberFormatException {
	        return Integer.parseInt(texto);
	}
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);

//        // ==========================================
//        // EXERCÍCIO 1
//        // ==========================================
//        System.out.println("--- EXERCÍCIO 1: DIVISÃO SEGURA ---");
//        
//        try {
//            System.out.print("Digite o primeiro número inteiro: ");
//            int num1 = scanner.nextInt();
//            
//            System.out.print("Digite o segundo número inteiro: ");
//            int num2 = scanner.nextInt();
//            
//            int resultado = num1 / num2;
//            System.out.println("Resultado da divisão: " + resultado);
//            
//        } catch (ArithmeticException e) {
//            System.out.println("Erro: Não é possível dividir por zero!");
//        } catch (InputMismatchException e) {
//            System.out.println("Erro: Você deve digitar apenas números inteiros!");
//            scanner.nextLine();
//        } finally {
//            System.out.println("Fim da operação.");
//        }
//
//        System.out.println();
//
//        // ==========================================
//        // EXERCÍCIO 2
//        // ==========================================
//        System.out.println("--- EXERCÍCIO 2: ACESSO A POSIÇÕES DE ARRAY ---");
//        String[] cidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte", "Curitiba", "Salvador"};
//        
//        System.out.print("Digite um número de 0 a 4 para escolher uma cidade: ");
//        
//        try {
//            int indice = scanner.nextInt();
//            System.out.println("Cidade escolhida: " + cidades[indice]);
//            
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Erro: Índice inválido! Posição inexistente no array.");
//        } catch (InputMismatchException e) {
//            System.out.println("Erro: Você deve digitar um número inteiro válido!");
//        } finally {
//            System.out.println("Fim da operação do array.");
//            scanner.close();
//        }
//        
        // ==========================================
        // EXERCÍCIO 3
        // ==========================================
        System.out.println("--- EXERCÍCIO 3: VALIDAÇÃO DE IDADE ---");
        System.out.print("Digite a sua idade: ");

        try {
            int idade = scanner.nextInt();

            if (idade < 0 || idade > 150) {
                throw new IdadeInvalidaException("A idade deve ser entre 0 e 150 anos!");
            }

            System.out.println("Idade válida cadastrada: " + idade);
        } catch (IdadeInvalidaException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Erro: Digite um número inteiro para a idade.");
        } finally {
            System.out.println("Fim da operação de validação.");
            scanner.close(); 
        }
     // ==========================================
     // EXERCÍCIO 4
     // ==========================================
       System.out.print("Digite uma string númerica para conversão: ");
       String texto = scanner.nextLine();

       try {
    	   int numero = converterParaInteiro(texto);
    	   System.out.println("Conversão correta: " + numero);
       } catch (NumberFormatException e) {
    	   System.out.println("Erro: O texto contém caracteres inválidos!");
       }
        
       try {
           int numero = converterParaInteiro(texto);
           System.out.println("Conversão correta: " + numero);
       } catch (NumberFormatException e) {
           System.out.println("Erro ao converter texto válido.");
       }
       
       
    }
}
