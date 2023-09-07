import java.util.Scanner;

public class KategoriNilai{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Masukan Nama");
        String nama = input.nextLine();
        System.out.println("Masukan Nilai" +nama);
        int nilai = input.nextInt();
        
        String predikat = null;
        String kategori =null;
        if(nilai > 96 && nilai <=100){
            predikat = "A+";
            kategori = "Sangat baik";
        }
        else if(nilai > 91 && nilai <=95){
            predikat = "A";
            kategori = "Sangat baik";
        }
        else if(nilai > 86 && nilai <=90){
            predikat = "B+";
            kategori = "Baik";
        }
        else if(nilai > 81 && nilai <=85){
            predikat = "B";
            kategori = "Baik";
        }
        else if(nilai > 75 && nilai <=80){
            predikat = "C+";
            kategori = "Cukup";
        }
        else if(nilai > 70 && nilai <=75){
            predikat = "C";
            kategori = "Cukup";
        }
        else if(nilai > 60 && nilai <=70){
            predikat = "D+";
            kategori = "Kurang";
        }
       
        System.out.println("Nama: "+nama);
        System.out.println("Nilai "+nilai);
        System.out.println(predikat);
        System.out.println(kategori);
    }
}
       