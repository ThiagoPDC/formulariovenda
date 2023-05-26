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
    
    public void ControlaVendas(){
    this.listaVendas = new ArrayList();
    
    }
    public void adicionar(Venda v){
    this.listaVendas.add(v);
    
    }
    
    
}
