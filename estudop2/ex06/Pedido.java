package ex06;

public class Pedido {
    private int ID;
    private String cliente;
    private double valor;
    private Statuspedido status;



    public Pedido(int ID, String cliente, double valor ){
        this.ID = ID;
        this.cliente = cliente;
        this.valor = valor;
        this.status = Statuspedido.PENDENTE;
    }
    public void setID(int ID){this.ID = ID;}
    public void setCliente(String cliente){this.cliente = cliente;}
    public void setValor(double valor){this.valor = valor;}


    public int getID(){return ID;}
    public String getCliente(){return cliente;}
    public double getValor(){return valor;}
    public Statuspedido getStatus(){return status;}

    public void pagarPedido(){
        status = Statuspedido.PAGO;
    }

    public void cancelarPedido(){
        status = Statuspedido.CANCELADO;
    }

    public void entregarPedido(){
        if(status == Statuspedido.PAGO){
            status = Statuspedido.ENTREGUE;
        }else{
            System.out.println("O pedido deve estar pago antes da entrega.");
        }
    }


}
