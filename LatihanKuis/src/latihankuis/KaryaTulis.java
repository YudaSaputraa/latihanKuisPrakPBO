/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author Yudha
 */
public class KaryaTulis implements Penilaian {
    private String name, jurusan, nim;
    private int nilaiTBahasa, nilaiEyd, nilaiStruktur, nilaiKreatifitas, hasilNilaiAkhir;
    public int hasilNilaiAKhir;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getNilaiTBahasa() {
        return nilaiTBahasa;
    }

    public void setNilaiTBahasa(int nilaiTBahasa) {
        this.nilaiTBahasa = nilaiTBahasa;
    }

    public int getNilaiEyd() {
        return nilaiEyd;
    }

    public void setNilaiEyd(int nilaiEyd) {
        this.nilaiEyd = nilaiEyd;
    }

    public int getNilaiStruktur() {
        return nilaiStruktur;
    }

    public void setNilaiStruktur(int nilaiStruktur) {
        this.nilaiStruktur = nilaiStruktur;
    }

    public int getNilaiKreatifitas() {
        return nilaiKreatifitas;
    }

    public void setNilaiKreatifitas(int nilaiKreatifitas) {
        this.nilaiKreatifitas = nilaiKreatifitas;
    }

    public int getHasilNilaiAkhir() {
        return hasilNilaiAkhir;
    }

    public void setHasilNilaiAkhir(int hasilNilaiAkhir) {
        this.hasilNilaiAkhir = hasilNilaiAkhir;
    }

    public KaryaTulis(String name, String jurusan, String nim, int nilaiTBahasa, int nilaiEyd, int nilaiStruktur, int nilaiKreatifitas) {
        this.name = name;
        this.jurusan = jurusan;
        this.nim = nim;
        this.nilaiTBahasa = nilaiTBahasa;
        this.nilaiEyd = nilaiEyd;
        this.nilaiStruktur = nilaiStruktur;
        this.nilaiKreatifitas = nilaiKreatifitas;
     
        nilaiAkhir();
    }
    
    @Override
   public int nilaiAkhir(){
       hasilNilaiAkhir = (this.nilaiTBahasa + this.nilaiEyd + this.nilaiStruktur + this.nilaiKreatifitas) / 4;
       return hasilNilaiAkhir;
   }
    
}
