package TokoOnline;

import java.util.ArrayList;

public class Barang {
    
    private ArrayList<String> namaBarang = new ArrayList<String>();
    private ArrayList<Integer> stok = new ArrayList<Integer>();
    private ArrayList<Integer> harga = new ArrayList<Integer>();
    
    public Barang(){
        this.namaBarang.add("Sabun batang");
        this.stok.add(15);
        this.harga.add(10000);
        
        this.namaBarang.add("Coklat");
        this.stok.add(10);
        this.harga.add(20000);
        
        this.namaBarang.add("Odol");
        this.stok.add(50);
        this.harga.add(25000);
    }
    
    public int getJmlbarang(){
        return this.namaBarang.size();
    }
    public void setNamaBarang(String namaBarang){
        this.namaBarang.add(namaBarang);
    }
    public String getNamaBarang(int idBarang){
        return this.namaBarang.get(idBarang);
    }
    
    public void setStok(int stok){
        this.stok.add(stok);
    }
    public int getStok(int idBarang){
        return this.stok.get(idBarang);
    }
    public void editStok(int idBarang, int stok){
        this.stok.set(idBarang, stok);
    }
    public void setHarga(int harga){
        this.harga.add(harga);
    }
    public int getHarga(int idBarang){
        return this.harga.get(idBarang);
    }
}
