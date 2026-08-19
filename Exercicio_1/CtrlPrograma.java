package controller;

import model.ContaBancaria;
import exception.SaldoInsuficienteException;

import java.util.Scanner;

public class CtrlPrograma {
    public static void main(String[] args) {
    	// ==========================================
        // EXERCÍCIO 5
        // ==========================================
        Scanner scanner = new Scanner(System.in);
        
        ContaBancaria conta = new ContaBancaria("Claudia", 500.0);
        
        try {
            
            System.out.print("Digite o valor do saque: R$ ");
            double valorSaque = scanner.nextDouble();
            
            System.out.println("Tentando realizar saque...");
            conta.getSaldo(); 
            
            conta.sacar(valorSaque); 
            
        } catch (SaldoInsuficienteException e) {
            
            System.err.println("Capturado no Bloco Catch -> " + e.getMessage());
        } finally {
            System.out.println("Fluxo de validação bancária encerrado.");
            
            scanner.close();
        }
    }
}
