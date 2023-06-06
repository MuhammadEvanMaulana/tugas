package TokoOnline;

import java.util.ArrayList;

public class Member implements user{
    
    private ArrayList<String> namaMember = new ArrayList<String>();
    private ArrayList<String> alamat = new ArrayList<String>();
    private ArrayList<String> telepon = new ArrayList<String>();
    private ArrayList<Integer> saldo = new ArrayList<Integer>();
    
    public Member (){
        this.namaMember.add("adi");
        this.alamat.add("Jakarta");
        this.telepon.add("088123458679");
        this.saldo.add(200000000);
        
        this.namaMember.add("budi");
        this.alamat.add("Sawojajar");
        this.telepon.add("088123458679");
        this.saldo.add(300000000);
    }
    public void setSaldo(int saldo){
        this.saldo.add(saldo);
    }
    public int getSaldo(int idMember){
        return this.saldo.get(idMember);
    }
    public void  editSaldo(int idMember, int saldo){
        this.saldo.set(idMember, saldo);
    }
    public int getJmlMember(){
        return this.saldo.size();
    }

    @Override
    public void setnama(String namaMember) {
        this.namaMember.add(namaMember);
    }

    @Override
    public void setAlamat(String alamat) {
        this.namaMember.add(alamat);
    }

    @Override
    public void setTelepon(String telepon) {
        this.telepon.add(telepon);
    }

    @Override
    public String getnama(int idMember) {
        return this.namaMember.get(idMember);
    }

    @Override
     public String getAlamat(int idMember) {
        return this.alamat.get(idMember);
    }

    @Override
    public String getTelpon(int idMember) {
        return this.telepon.get(idMember);
    }   
}
