package mtk;

public class mtkmain {

    public static void main(String [] args){
        Matematika2 mtk = new Matematika2();
        
        System.out.println("Hasil Pertambahan : " + mtk.pertambahan(20,10));
        System.out.println("Hasil Pengurangan : " + mtk.pengurangan(10,5));
        System.out.println("Hasil Perkalian : " + mtk.perkalian(10,3));
        System.out.println("Hasil Pembagian : " + mtk.pembagian(21,2));
        System.out.println("Hasil modulus : " + mtk.module(10,3)); // Ganti 'modulus' dengan 'module'
    }
}
