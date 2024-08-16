import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class AppAcademia{

    public static void main(String[] args) throws ParseException{

        Academia Hacker = new Academia("Hacker", "41997032029", "Rua Cole");
    
        Academia Torrance = new Academia("Torrance", "41997879090", "Rua Winter");
    
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        Date data = formato.parse("14/07/2007");
        //HACKER
        Aluno Lyz = new Aluno ("lyz", "intermediario", "Feminino", "14/07/2007",  1.62,52.0);

        Aluno Lyzo = new Aluno ("lyzo", "alto", "Masculino",  "14/07/2007", 1.78,83.0);

        Aluno Analice = new Aluno ("Analice", "intermediario", "Feminino",  "14/07/2007", 1.62, 52.0);

        //TORRANCE
        Aluno Heloisa = new Aluno ("Heloisa", "intermediario", "Indefinido",  "14/07/2007",  1.62,52.0);

        Aluno Bruna = new Aluno ("Bruna", "intermediario", "Feminino",  "14/07/2007",  1.58,47.0);

        Aluno Leal = new Aluno ("Leal", "intermediario", "Feminino",  "14/07/2007", 1.62, 52.0);

        System.out.println(Hacker.getnome());
        System.out.println(Hacker.gettelefone());
        System.out.println(Hacker.getendereco());

        Hacker.setnome("nome");
        Hacker.settelefone("telefone");
        Hacker.setendereco("endereco");

        Hacker.alunos.add(Lyz);
        Hacker.alunos.add(Lyzo);
        Hacker.alunos.add(Analice);

        System.out.println(Hacker.alunos.get(0).getNome());
        System.out.println(Hacker.alunos.get(1).getNome());
        System.out.println(Hacker.alunos.get(2).getNome());

        System.out.println("-----------------------------------");

        System.out.println(Torrance.getnome());
        System.out.println(Torrance.gettelefone());
        System.out.println(Torrance.getendereco());

        Torrance.setnome("nome");
        Torrance.settelefone("telefone");
        Torrance.setendereco("endereco");

        Torrance.alunos.add(Heloisa);
        Torrance.alunos.add(Bruna);
        Torrance.alunos.add(Leal);

        System.out.println(Torrance.alunos.get(0).getNome());
        System.out.println(Torrance.alunos.get(1).getNome());
        System.out.println(Torrance.alunos.get(2).getNome());

        for (Aluno alunos : Hacker.alunos){
            System.out.println(alunos.toString());
        }
        for (Aluno alunos : Torrance.alunos){
            System.out.println(alunos.toString());
        }
        System.out.println("Hacker");
        for(int i = 0 ; i< Hacker.alunos.size(); i++){
            System.out.println("-----------------------------------");
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o nome da Pessoa");
            Hacker.alunos.get(i).nome = scan.next();
            System.out.println("Digite o genero da Pessoa");
            Hacker.alunos.get(i).genero = scan.next();
            System.out.println("Digite o nascimento da Pessoa");
            Hacker.alunos.get(i).nascimento = Hacker.alunos.get(i).convertStringToDate(scan.next());
            System.out.println("Digite a graduação da Pessoa");
            Hacker.alunos.get(i).graduacao = scan.next();
            System.out.println("Digite o peso da Pessoa");
            Hacker.alunos.get(i).peso = scan.nextDouble();
            System.out.println("Digite a altura da Pessoa");
            Hacker.alunos.get(i).altura = scan.nextDouble();
        }

        for (Aluno alunos : Hacker.alunos){
            System.out.println(alunos.toString());
        }

        System.out.println("Torrance");
        for(int i = 0 ; i< Hacker.alunos.size(); i++){
            System.out.println("-----------------------------------");
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite o nome da Pessoa");
            Torrance.alunos.get(i).nome = scan.next();
            System.out.println("Digite o genero da Pessoa");
            Torrance.alunos.get(i).genero = scan.next();
            System.out.println("Digite o nascimento da Pessoa");
            Torrance.alunos.get(i).nascimento = Torrance.alunos.get(i).convertStringToDate(scan.next());
            System.out.println("Digite a graduação da Pessoa");
            Torrance.alunos.get(i).graduacao = scan.next();
            System.out.println("Digite o peso da Pessoa");
            Torrance.alunos.get(i).peso = scan.nextDouble();
            System.out.println("Digite a altura da Pessoa");
            Torrance.alunos.get(i).altura = scan.nextDouble();
        }

        for (Aluno alunos : Torrance.alunos){
            System.out.println(alunos.toString());
        }
    }
}
