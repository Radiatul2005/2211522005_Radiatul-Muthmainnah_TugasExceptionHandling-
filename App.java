public class App {
    public static void main(String[] args) {
        DetailTranksaksi transaksi1 = new Pelanggan(); // Objek Barang sebagai DetailTransaksi menggunakan polimorfisme
        DetailTranksaksi transaksi2 = new Barang(); // Memanggil metode sesuai dengan perilaku yang bervariasi
        System.out.println();
        transaksi1.tampilkanDetails(); 
        System.out.println();
        transaksi2.tampilkanDetails(); 
        System.out.println();
    }
}
