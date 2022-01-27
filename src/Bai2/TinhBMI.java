/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author pc
 */
public class TinhBMI {
    double canNang;
    double chieuCao;
    double bmi;

    public TinhBMI() {
    }

    public TinhBMI(double canNang, double chieuCao, double bmi) {
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.bmi = bmi;
    }

    TinhBMI(double canNang, double chieuCao) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public double Tinh(){
        this.bmi = (this.canNang) / (Math.pow(this.chieuCao, 2));
        return bmi;
    }
}
