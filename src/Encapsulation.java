public class Encapsulation {

    public String ad;
    private String soyad;
    protected int yas;


    public Encapsulation() {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }
    
    
    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }
    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public void ad(String ad) {
        this.ad=ad;
    }

    public String ad() {
        return ad;
    }
}
