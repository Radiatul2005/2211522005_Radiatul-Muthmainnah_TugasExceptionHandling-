import java.util.Scanner;

public class Pelanggan extends Tranksaksi implements DetailTranksaksi 
{
    private String namaPelanggan;
    private String nomorHandphone;

    public Pelanggan() 
    {
        masukkanDetails();
    }

    @Override
    public void masukkanDetails() 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nama Pelanggan: ");
        this.namaPelanggan = scanner.nextLine();
        System.out.println("Nomor HP: ");
        this.nomorHandphone = scanner.nextLine();
    }

    @Override
    public void tampilkanDetails() 
    {
        System.out.println("Detail Pelanggan:");
        System.out.println("Nama: " + namaPelanggan);
        System.out.println("Nomor HP: " + nomorHandphone);
    }
}
