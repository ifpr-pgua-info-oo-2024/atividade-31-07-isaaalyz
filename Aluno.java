import java.util.Date;
import java.text.SimpleDateFormat;

public class Aluno {
    private String nome;
    private String graduacao;
    private Date data_nascimento;
    private String genero;
    private Double altura;
    private Double peso;

    // Construtor 1:
    public Aluno ( String nome, String graduacao, Date data_nascimento, String genero, Double altura, Double peso){
        this.nome = nome;
        this.graduacao = graduacao;
        this.data_nascimento = data_nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    } 
    public Aluno ( String nome, String graduacao,Date data_nascimento){
        this( nome,  graduacao,  data_nascimento, "Não Informado", 0.0,0.0);  
    }
    

    public String getnome(){
        return nome;
    }
    public void setnome(String nome){
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getGraduacao() {
        return graduacao;
    }
    public void setGraduacao(String graduacao) {
        this.graduacao = graduacao;
    }
    public Date getData_nascimento() {
        return data_nascimento;
    }
    public void setData_nascimento(Date data_nascimento) {
        this.data_nascimento = data_nascimento;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public Double getAltura() {
        return altura;
    }
    public void setAltura(Double altura) {
        this.altura = altura;
    }
    public Double getPeso() {
        return peso;
    } 
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    
    public String toString() {
        SimpleDateFormat  simpleDateFormat = new  SimpleDateFormat  ("dd/MM/yyyy");
        
        return "Aluno [nome=" + nome + ", graduacao=" + graduacao + ", data_nascimento=" +  simpleDateFormat.format(data_nascimento) + ", genero="
                + genero + ", altura=" + altura + ", peso=" + peso + "]";
    }  


}
