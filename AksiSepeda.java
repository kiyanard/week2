public class AksiSepeda {
    public static void main(String[] args) {
        //membuat objek
        Sepeda sepedaBalap = new Sepeda(2, "sepedaBalap", "a");
        Sepeda sepedaTandem = new Sepeda(2, "sepedaBalap", "a");

        //mengakses atribut dan method
        int gearSepeda = sepedaBalap.gear;
        int gearTerbang = sepedaTandem.gear;
        System.out.println(gearSepeda);
        System.out.println(gearTerbang);
        sepedaBalap.ngerem();
    }
} 
    

