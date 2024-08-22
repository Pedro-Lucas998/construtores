public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa sarah = new Pessoa("Sarah", "1875-000");

        System.out.println("O nome é " + sarah.getNome() + " e o cpf dele(a) é " + sarah.getCpf());

    }
}
