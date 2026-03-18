import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Usuario> usuarios = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();
    //construtor
    public Biblioteca( ArrayList<Emprestimo> emprestimos,ArrayList<Livro> livros, ArrayList<Funcionario> funcionarios, ArrayList<Usuario> usuarios){
        this.usuarios = usuarios;
        this.funcionarios = funcionarios;
        this.livros = livros;
        this.emprestimos = emprestimos;

    }

    //metodos
    public void adicionarLivro(Livro livro){
        livros.add(livro);
    }
    public void removerLivro(Livro livro){
        livros.remove(livro);
    }

    public void adicionarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }
    public void removerFuncionario(Funcionario funcionario){
        funcionarios.remove(funcionario);
    }

    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
    }
    public void removerUsuario(Usuario usuario){
        usuarios.remove(usuario);
    }

    public void adicionarEmprestimo(Emprestimo emprestimo){
        emprestimos.add(emprestimo);
    }
    public void removerEmprestimo(Emprestimo emprestimo){
        emprestimos.remove(emprestimo);
    }

    //get
    public ArrayList<Livro> getLivros(){
        return livros;
    }
    public ArrayList<Funcionario> getFuncionarios(){
        return funcionarios;
    }
    public ArrayList<Usuario> getUsuarios(){
        return usuarios;
    }
    public ArrayList<Emprestimo> getEmprestimos(){
        return emprestimos;
    }

}
