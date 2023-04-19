import models.cliente;
import models.produto;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.*;

public class Main {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bem vindo, insira seu nome e o limite do seu catão");
            cliente cliente1 = new cliente(sc.next(), sc.nextDouble());


            double dinheiroDisponivel = cliente1.getLimiteCartao();
            double valorGasto = 0;
            int continuar = 1;
        List<produto> listaDeCompras = new LinkedList<>();

        while(continuar == 1){

            if(dinheiroDisponivel > 15){
                System.out.print("Digite o nome do produto, valor e quantidade: ");
                produto p1 = new produto(sc.next(), sc.nextDouble(), sc.nextInt());
                valorGasto += p1.totalProduto(p1.getValor(), p1.getQuantidade());

                System.out.println("O valor restante e de R$: "  + (cliente1.getLimiteCartao() - valorGasto) );

                    if(dinheiroDisponivel > p1.getValor()){

                        dinheiroDisponivel -= valorGasto;

                        listaDeCompras.add(p1);
                    } else {
                        System.out.println("**********************");
                        System.out.println("");
                        System.out.println("O valor da compra execede o limite do cartao!");
                        System.out.println("");
                        System.out.println("**********************");
                    }
                System.out.println("**********************");
                System.out.println("");
                System.out.print("Deseja continuar comprando? ");
                continuar = sc.nextInt();
            }else {
                System.out.println("**********************");
                System.out.println("");
                System.out.print("Dinheiro em conta insuficiente!");
                System.out.println("");
                System.out.println("**********************");

            }

        }

        System.out.println("**********************");
        System.out.println("");
        System.out.print("Lista de compras:");
        listaDeCompras.sort(Comparator.comparing(produto::getValor));
        for ( var i: listaDeCompras) {
            System.out.println(listaDeCompras);
        }
        System.out.println("");
        System.out.println("**********************");
    }
}