public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private String data;
    private Funcionario funcionario;

    //construtor
    public Emprestimo(Livro livro, Usuario usuario, String data, Funcionario funcionario){
        this.data = data;
        this.livro = livro;
        this.usuario = usuario;
        this.funcionario = funcionario;
    }

    public void setLivro(Livro livro){
        this.livro = livro;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setData(String data){
        this.data = data;
    }

    public Livro getLivro(){
        return livro;
    }
    public Usuario getUsuario(){
        return usuario;
    }
    public String getData(){
        return data;
    }

}
