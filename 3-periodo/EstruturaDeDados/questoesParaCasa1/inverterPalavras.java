public class inverterPalavras{
    public static void main(String[] args) {
        
        System.out.println(inverter("recursividade"));
        System.out.println(inverter("vinicius"));
        System.out.println(inverter("Vingadores Guerra Infinita"));
    }

    public static String inverter(String entrada){
        if (entrada.isEmpty())
        return entrada;

        else
        return inverter(entrada.substring(1)) + entrada.charAt(0);
     }
}
