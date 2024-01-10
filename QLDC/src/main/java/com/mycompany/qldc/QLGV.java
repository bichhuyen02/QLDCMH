/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QLGV extends QLChung{

    private List<GiangVien> gv = new ArrayList<>();
    
    @Override
    public void hienthiDS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void themGV(GiangVien... g) {
        this.gv.addAll(Arrays.asList(g));
    }

    public void themGV(GiangVien g) throws ParseException {
       this.gv.add(g);
    }

    public GiangVien timGVTheoMa(String tuKhoa) {
        for (GiangVien g : gv) {
            if (g.getMaGV().equals(tuKhoa) == true) {
                return g;
            }
        }
        return null;
    }

    public GiangVien timGVTheoTen(String tuKhoa) {
        for (GiangVien g : gv) {
            if (g.getTen().equals(tuKhoa) == true) {
                return g;
            }
        }
        return null;
    }

    /**
     * @return the gv
     */
    public List<GiangVien> getGv() {
        return gv;
    }

    /**
     * @param gv the gv to set
     */
    public void setGv(List<GiangVien> gv) {
        this.gv = gv;
    }
}
