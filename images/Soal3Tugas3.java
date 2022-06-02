public class Soal3Tugas3 {
    public static void main(String[] args) {
        String str = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis", var1, var2, var3, var4, var5;
        System.out.println("String Awal: " + str);
        var1 = str.substring(0, 36);
        System.out.println("1: " + var1);
        var2 = var1.toLowerCase();
        System.out.println("2: " + var2);
        var3 = var1.toUpperCase();
        System.out.println("3: " + var3);
        var4 = str.substring(25, 36);
        System.out.println("4: " + var4);
        var5 = str.substring(37, 63);
        System.out.println(("5: " + var5));
    }

}
