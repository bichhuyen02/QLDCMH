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
public class QLHT extends QLChung{

    List<HinhThucDanhGia> ht =  new ArrayList<>();
    @Override
    public void hienthiDS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
     public void themHT(HinhThucDanhGia... h) {
        this.ht.addAll(Arrays.asList(h));
    }

    public void themHT(HinhThucDanhGia h) throws ParseException {
        this.ht.add(h);
    }

    public boolean xoaHT(HinhThucDanhGia h) {
        if (ht.remove(h) == true) {
            return true;
        }
        return false;
    }
    
}
