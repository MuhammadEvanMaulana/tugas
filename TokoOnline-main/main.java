package TokoOnline;

public class main {
    public static void main(String[] args) {
        Barang barangOK = new Barang();
        Karyawan karyawanOK = new Karyawan();
        Member memberOK = new Member();
        Laporan laporanOK = new Laporan();
        Transaksi transaksiOK = new Transaksi();
        
        laporanOK.laporan(barangOK);
        laporanOK.laporan(memberOK);
        laporanOK.laporan(transaksiOK, barangOK);
        transaksiOK.prosesTransaksi(memberOK, transaksiOK, barangOK);
        
    }
}
