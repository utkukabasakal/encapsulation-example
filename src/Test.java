public class Test {
    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation();
        encapsulation.ad("Ahmet");
        encapsulation.setSoyad("Korkmaz");
        encapsulation.setYas(27);


        System.out.println("Adi : " + encapsulation.ad());
        System.out.println("Soyadi : " + encapsulation.getSoyad());
        System.out.println("yasi : " + encapsulation.getYas());

    }
}