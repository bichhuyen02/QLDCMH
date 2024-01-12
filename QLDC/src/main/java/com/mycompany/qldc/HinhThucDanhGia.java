/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

/**
 *
 * @author Admin
 */
public class HinhThucDanhGia {
    private int ma;
    private String ten;
    private String phuongPDG;
    private String noiDung;
    
    public HinhThucDanhGia(){}
    
    public void them(int ma, String ten,String phuongPDG, String noiDung){
        this.ma = ma;
        this.ten = ten;
        this.phuongPDG = phuongPDG;
        this.noiDung = noiDung;
    }
    
    public void xoa(){}

    /**
     * @return the ma
     */
    public int getMa() {
        return ma;
    }

    /**
     * @param ma the ma to set
     */
    public void setMa(int ma) {
        this.ma = ma;
    }

    /**
     * @return the phuongPDG
     */
    public String getPhuongPDG() {
        return phuongPDG;
    }

    /**
     * @param phuongPDG the phuongPDG to set
     */
    public void setPhuongPDG(String phuongPDG) {
        this.phuongPDG = phuongPDG;
    }

    /**
     * @return the noiDung
     */
    public String getNoiDung() {
        return noiDung;
    }

    /**
     * @param noiDung the noiDung to set
     */
    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }
}
