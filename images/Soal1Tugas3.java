import java.util.Scanner;

public class Soal1Tugas3 {
    public static void main(String[] args) {
        int menuDipilih;
        System.out.println("[1] Matriks Transpose");
        System.out.println("[2] Mencari Luas Persegi Panjang");
        System.out.println("[3] Selesai");
        System.out.print("Input Menu Yang Diinginkan ");
        Scanner scan = new Scanner(System.in);
        menuDipilih = scan.nextInt();
        System.out.println(menuDipilih);
        while (menuDipilih < 1 || menuDipilih > 3) {
            System.out.print("Menu tidak tersedia, silahkan input lagi: ");
            menuDipilih = scan.nextInt();
        }
        switch (menuDipilih) {
            case 1:
                penyelesaianMatriksTranspose(scan);
                break;
            case 2:
                mencariLuasPersegiPanjang(scan);
                break;
            default:
                System.out.println("Selesai");
        }
    }

    public static void mencariLuasPersegiPanjang(Scanner scanHitungLuas) {
        int panjang, lebar, luas;
        System.out.print("Masukkan panjang: ");
        panjang = scanHitungLuas.nextInt();
        System.out.print("Masukkan lebar: ");
        lebar = scanHitungLuas.nextInt();
        luas = panjang * lebar;
        System.out.println("Panjang: " + panjang + ", Lebar: " + lebar + ", Luas: " + luas);
        scanHitungLuas.close();
    }

    public static void penyelesaianMatriksTranspose(Scanner scan) {
        int i, j, m, n;
        System.out.print("Masukkan jumlah baris matriks: ");
        m = scan.nextInt();
        System.out.print("Masukkan jumlah kolom matriks: ");
        n = scan.nextInt();
        String matriks[][] = new String[m][n];
        String transpose[][] = new String[n][m];
        System.out.println("Masukkan elemen matriks: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                matriks[i][j] = scan.next();
            }
        }
        System.out.println("Sebelum matriks di transpose: ");
        for (i = 0; i < matriks.length; i++) {
            for (j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + "\t");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                transpose[j][i] = matriks[i][j];
            }
        }
        System.out.println("Hasil transpose matriks: ");
        for (i = 0; i < transpose.length; i++) {
            for (j = 0; j < transpose[i].length; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }
    }
}