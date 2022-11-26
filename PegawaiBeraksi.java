public class PegawaiBeraksi {
    public static void main(String[] args) {
      // Membuat Object dengan CONSTRUCTOR
      // Praktikum 5 membuat contructor
      Pegawai naswa = new Manager("Naswa", 5000000, 1000000);
      Pegawai tama = new Manager("Tama", 4000000, 400000);
  
      /* Memberi attribute dan memberi nilai */
      // naswa.setNama("Naswa");
      // naswa.setGajiPokok(9980000);
      // naswa.setTunjangan(5500000);
  
      // tama.setNama("Tama");
      // tama.setGajiPokok(5450000);
      // tama.setBonus(3200000);
  
      /* Mengakses Method */
      naswa.cetakInfo();
      System.out.println();
      tama.cetakInfo();
    }
  }