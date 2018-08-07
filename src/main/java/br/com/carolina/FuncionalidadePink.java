package br.com.carolina;

import br.com.carolina.models.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class FuncionalidadePink {
    private Produto bota = new Produto();

    public FuncionalidadePink(){
        bota.setNomeProdutoCart("botasalto");
        bota.setNomeProdutoPdp("botasalto");
        bota.setPercDesconto(20);
        bota.setPrecoTotalCart(new BigDecimal(2000));

        List<String> cores = new ArrayList<>();
        cores.add("AZUL");
        cores.add("VERMELHO");
        cores.add("PRETO");
        cores.add("ROXO");
        cores.add("AMARELO");

        bota.setCores(cores);

        List<Integer> tamanhos = new ArrayList<>();
        tamanhos.add(33);
        tamanhos.add(34);
        tamanhos.add(35);

        bota.setTamanhos(tamanhos);
    }

    public void testaNomePdpXnomeCart(){
        String nomeProdPdp = bota.getNomeProdutoPdp();
        String nomeProdCart = bota.getNomeProdutoCart();

        if(!nomeProdPdp.equalsIgnoreCase(nomeProdCart)){
            System.out.println("Test FAILED : Nome do produto '"+nomeProdPdp+"' na PDP não corresponde ao nome do produto no carrinho");
        }else{
            System.out.println("Test PASSED : Nome do produto '"+nomeProdPdp+"' na PDP corresponde ao nome do produto no carrinho");
        }

    }

    public void testaTamanhoDisponivel(int tamanho){
        boolean find = false;
        for (int botaTam : bota.getTamanhos()) {
            if(tamanho==botaTam)
                find = true;
        }

        if (find){
            System.out.println("Test PASSED : Tamanho "+tamanho+" verificado é exibido como Disponivel na pagina.");
        }else{
            System.out.println("Test FAILED : Tamanho "+tamanho+" verificado NÃO é exibido na pagina.");
        }
    }

    public void testaCorDisponivel(String cor){
        boolean achei =false;
        for (String botaCor : bota.getCores()) {
            if(cor.equalsIgnoreCase(botaCor)){
                achei =true;
            }
        }

        if (achei){
            System.out.println("Test PASSED : Cor "+cor+" verificado é exibida como Disponivel` na pagina.");

        }else{
            System.out.println("Test FAILED : Cor "+cor+" verificado `NÃO` é exibida na pagina.");
        }
    }
}
