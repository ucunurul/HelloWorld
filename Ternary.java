public class Ternary {
    
    public static void main(String []args){
        int num = 15;
        int mod = num % 2;
        String modulo = mod == 0 ? "Genap" : "Ganjil";
        
        System.out.println("Angka " + num +" Adalah " + modulo);
        
    }
}