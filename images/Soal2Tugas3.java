public class Soal2Tugas3 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("987654321");
        System.out.println(str);
        str.reverse();
        for (int i = 0; i < str.length(); i++) {
            String angka = str.substring(i, i + 1);
            int index = str.indexOf(angka);
            for (int j = 0; j < index; j++) {
                System.out.print(" ");
            }
            System.out.print(((index < 4) ? "1" : angka) + "\n");
        }
        System.out.println(str);
    }
}