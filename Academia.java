import java.util.ArrayList;
import java.util.List;

public class Academia {

    private String nome;
    private String endereco;
    private String telefone;

    List<Aluno> alunos;
    public Academia (String nome, String telefone, String endereco){
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        alunos = new ArrayList<>();
    }

    public String getnome(){
        return nome;

    }
    public void setnome(String nome){
        this.nome = nome;
    }
     public String gettelefone(){
        return telefone;
    }
    public void settelefone(String telefone){
        this.telefone = telefone;
    }
     public String getendereco(){
        return endereco;
    }
    public void setendereco(String endereco){
        this.endereco = telefone;
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }



}