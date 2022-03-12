/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package adapterb;

/**
 *
 * @author estudiante
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Adaptador miAdaptador = new Adaptador();
        System.out.println("Saldo de la cuenta: " + (int)miAdaptador.getSaldoDolares()+" Dolares.");
        miAdaptador.consignarPesos(8000000);
        System.out.println("Saldo de la cuenta: " + (int)miAdaptador.getSaldoDolares()+" Dolares.");
        miAdaptador.retirarPesos(4000000);
        System.out.println("Saldo de la cuenta: " + (int)miAdaptador.getSaldoDolares()+" Dolares.");

    }
    
}
