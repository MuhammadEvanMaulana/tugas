package TokoOnline;

import java.util.ArrayList;

public class Karyawan implements user{
    private ArrayList<String> namaKaryawan = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> jabatan = new ArrayList<Integer>();
    
    public Karyawan(){
        this.namaKaryawan.add("Admin");
        this.alamat.add("Surabaya");
        this.telepon.add("08823456778");
        this.jabatan.add(0);
    }
    
    public void setJabatan(int jabatan){
        this.jabatan.add(jabatan);
    }
    
    public int getJabatan(int jabatan){
        return this.jabatan.get(jabatan);
    }
    
    public int getjmlKaryawan(){
        return this.namaKaryawan.size();
    }
    
    @Override
    public void setnama(String namaKaryawan) {
        this.namaKaryawan.add(namaKaryawan);
    }

    @Override
    public void setAlamat(String alamat) {
        this.alamat.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
       this.telepon.add(telepon);
    }

    @Override
    public String getnama(int idKaryawan) {
        return this.namaKaryawan.get(idKaryawan);
    }

    @Override
    public String getAlamat(int idKaryawan) {
        return this.alamat.get(idKaryawan);
    }

    @Override
    public String getTelpon(int idKaryawan) {
        return this.telepon.get(idKaryawan);
    }
    
    
}
