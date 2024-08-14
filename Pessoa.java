import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public class Pessoa {

    protected String nome;
    protected String genero;
    protected Date nascimento;
    protected Double altura;
    protected Double peso;
    public Pessoa (String nome, String genero, String nascimento, Double altura, Double peso) throws ParseException{

        this.nome = nome;
        this.genero = genero;
        this.nascimento = convertStringToDate (nascimento);
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(String nome2, String graduacao, Date data, Double altura2, Double peso2) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    public Date getNascimento() {
        return nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }  
    
    public String mostraInfoString(){
        return "nome:" +nome+"genero:" +genero+ "altura" +altura+ "nascimento:" +nascimento+"peso" +peso;
    }

    @Override

    public String toString(){

        String nascimento = "";
        nascimento = convertDateToString(this.nascimento);

        return "Pessoa [nome =" + nome +"nascimento=" + nascimento + ",genero=" +genero+ ",altura=" + altura+ ",peso=" +peso+"]";
    }

    private String convertDateToString(Date nascimento2) {
        return null;
    }

    public static Date convertStringToDate(String Nascimento) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return  simpleDateFormat.parse(Nascimento);
    }


    public static String convertStringToDate(Date Nascimento) throws ParseException{
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return  simpleDateFormat.format(Nascimento);
    }

    public int CalcularIdade ()
        throws ParseException {
 
        SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);
        Date firstDate = sdf.parse("14/04/2007");
        Date secondDate = sdf.parse("14/07/2002");

        long diffInMillies = Math.abs(secondDate.getTime() - firstDate.getTime());
        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);

        return (int) diff/365;
}


    
}