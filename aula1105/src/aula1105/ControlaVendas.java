/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1105;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tigas
 */
public class ControlaVendas {
    private List<Venda> listaVendas;
    
    public ControlaVendas(){
    this.listaVendas = new ArrayList();
    
    }
    public void adicionar(Venda v){
    this.listaVendas.add(v);
    
    }
    public List<Venda> getVendas(){
        return this.listaVendas;
    
    }
     public double getValorTotalVendas(){
        double valorTotal = 0;
        
        for(Venda v : listaVendas){
            valorTotal += v.getValorTotal();
            
        }
        return  valorTotal;
    }
    public double getTotalPorFormaPagamento(String formaPagamento){
    //calcular o valor ppor forma de pagamento
    double valorTotal = 0;
        for(Venda v : listaVendas){
            if(v.getFormaPagamento().equalsIgnoreCase(formaPagamento)){
            valorTotal += v.getValorTotal();
        }
            
        }
         return  valorTotal;
    }
}
