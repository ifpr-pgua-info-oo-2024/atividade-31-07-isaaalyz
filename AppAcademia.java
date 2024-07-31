public class AppAcademia{

    public static void main(String[] args){

        Academia Hacker = new Academia("Hacker", "41997032029", "Rua Cole");
    
        Academia Torrance = new Academia("Torrance", "41997879090", "Rua Winter");

            System.out.println(Hacker.getnome());
            System.out.println(Hacker.gettelefone());
            System.out.println(Hacker.getendereco());

            System.out.println(Torrance.getnome());
            System.out.println(Torrance.gettelefone());
            System.out.println(Torrance.getendereco());

            Hacker.setnome("nome");
            Hacker.settelefone("telefone");
            Hacker.setendereco("endereco");

            Torrance.setnome("nome");
            Torrance.settelefone("telefone");
            Torrance.setendereco("endereco");

            System.out.println(Hacker.getnome());
            System.out.println(Hacker.gettelefone());
            System.out.println(Hacker.getendereco());

            System.out.println(Torrance.getnome());
            System.out.println(Torrance.gettelefone());
            System.out.println(Torrance.getendereco());

     }
}
