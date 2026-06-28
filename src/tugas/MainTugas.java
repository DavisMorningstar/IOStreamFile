// Nama: Ahmad Davis Nazifa Subarja | NPM: 2410010217
package tugas;

public class MainTugas {
    public static void main(String[] args) {
        // Array kategori barang
        String[] kategori = {"Elektronik", "Makanan", "Minuman"};
        System.out.println("== Kategori Barang ==");
        for (String k : kategori) {
            System.out.println("- " + k);
        }
        System.out.println();

        // Membuat objek Gudang dan mengisi barang
        Gudang gudang = new Gudang("barang.txt");
        gudang.tambahBarang(new Barang("Laptop", 8000000, 5));
        gudang.tambahBarang(new Barang("Mouse", 150000, 20));
        gudang.tambahBarang(new Barang("Keyboard", 300000, 15));
        gudang.tambahBarang(new Barang("Monitor", 2500000, 8));
        gudang.tambahBarang(new Barang("Headset", 500000, 10));

        // Tampilkan dan simpan
        gudang.tampilkanSemua();
        gudang.simpanKeBerkas();
        System.out.println();

        // Objek baru, muat dari berkas, tampilkan total nilai
        Gudang gudangBaru = new Gudang("barang.txt");
        gudangBaru.muatDariBerkas();
        gudangBaru.tampilkanSemua();
        System.out.println("Total Nilai Persediaan: Rp" + gudangBaru.totalNilai());
    }
}