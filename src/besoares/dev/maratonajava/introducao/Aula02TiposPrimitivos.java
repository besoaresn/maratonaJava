package besoares.dev.maratonajava.introducao;

// Classe começa começa com letra maiuscula

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // Int, double, float, chat, byte, short, long, boolean
        int age = 10;
        long numeroGrande = 10000;
        double salaryDouble = 2000.0; // Casting : forçando variavel a se tornar outra
        float salarioFloat = 2500.0F; // usar F dps para o java entender
        byte ageByte = 10;
        short ageShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';

        String nome = "Bernardo ";
        System.out.println("A idade é " + age+ " anos"); // se usa + n o virgula igual C
        System.out.println(verdadeiro);
        System.out.println("Meu nome é " + nome);
    }
}