import java.text.ParseException;

public class Aluno extends Pessoa {

    protected String graduacao;

    public Aluno(String nome, String graduacao, String genero, String nascimento, double altura, double peso) throws ParseException {
        super(nome, genero, nascimento, altura, peso);

        this.graduacao = graduacao;
    }

    public Aluno ( String nome, String genero, String graduacao, String nascimento) throws ParseException{
        this( nome, genero, graduacao, nascimento, 0.0,0.0);  
    }

    public String mostraInfoString(){
        return "nome:" +nome+"genero:" +genero+ "altura" +altura+ "nascimento:" +nascimento+"peso" +peso+ "graduacao:" +graduacao;
    }

}
