package ex06;
import java.util.ArrayList;
import java.util.Iterator;
public class Main {
    public static void main(String [] args){
        ArrayList<Pedido> pedidos = new ArrayList<>();

        Pedido pedido1 = new Pedido(1, "joao", 23.87);
        Pedido pedido2 = new Pedido(2, "ezequiel", 33.37);
        Pedido pedido3 = new Pedido(3, "lucas", 50.82);
        Pedido pedido4 = new Pedido(4, "thiago", 12.89);
        Pedido pedido5 = new Pedido(5, "luiza", 100.23);

        pedidos.add(pedido1);
        pedidos.add(pedido2);
        pedidos.add(pedido3);
        pedidos.add(pedido4);
        pedidos.add(pedido5);

        pedido2.cancelarPedido();
        pedido3.cancelarPedido();


        Iterator<Pedido> it = pedidos.iterator();

        while(it.hasNext()){

            Pedido pedidoAtual = it.next();

            System.out.println(pedidoAtual.getID() + " " +
                    pedidoAtual.getValor() + " " +
                    pedidoAtual.getCliente() + " " +
                    pedidoAtual.getStatus()

            );

            if(pedidoAtual.getStatus() == Statuspedido.CANCELADO){
                it.remove();
            }

            for(Pedido p : pedidos){
                System.out.println("Cliente: " + p.getCliente());
            }

        }




    }
}
