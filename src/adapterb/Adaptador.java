/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapterb;

/**
 *
 * @author estudiante
 */
public class Adaptador extends CuentaDolares implements IAdaptador{
    public Adaptador(){}
    public void retirarPesos(double pesos){
        double dolares= pesos/3817;
        this.retirarDolares(dolares);
    }
    public void consignarPesos(double pesos){
            double dolares= pesos/3817;
            this.consignarDolares(dolares);
    }
}
