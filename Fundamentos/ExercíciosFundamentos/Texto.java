public class Texto {
 
    public static void main(String[] args) {
        String s = "IFC Videira";

        String s3 = new String("IFC Videira");
        
        String sub = s.substring(0, 5); // Pra contar os caracteres
        System.out.println(sub);
        
        String s2 = "Videira";

        System.out.println(s.indexOf(s2)); // Procura o valor de s2 em s
        System.out.println(s2.indexOf(s)); // Procura o valor de s em s2
    }
}


// Tipos Permitidos de declaração de strings: 

// 1- String s = "IFC Videira";

// 2- String s2 = new String("IFC Videira");

/* 3- String s3; 
s3 = new String("IFC Videira"); */ 