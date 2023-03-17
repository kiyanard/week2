public class Lampu {
    
    String jenis;  
    int watt;  
    boolean kondisi;  

    Lampu() {  
        jenis = "Phillips";  
        watt = 20;  
        kondisi = false;  
   }  

    void hidupkan() {  
         kondisi = true;  
         System.out.println("Apakah Lampu menyala ?");  
    }  

    void matikan() {  
         kondisi = false;  
         System.out.println("Apakah lampu menyala ?");  
    }  

    
    public static void main(String[] args) {  
         
         Lampu refLampu = new Lampu();  
         System.out.println("Jenis : " + refLampu.jenis);  
         System.out.println("Watts : " + refLampu.watt);  
         System.out.println("Apakah Lampu Menyala ? " + refLampu.kondisi);  
    }  

}  

