/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihankuis;

/**
 *
 * @author Yudha
 */
public interface Penilaian {
    default int nilaiAkhir(){
        System.out.println("nilai akhir");
        return 0;
    }
}
