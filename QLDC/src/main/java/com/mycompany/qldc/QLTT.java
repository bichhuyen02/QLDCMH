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
public class QLTT extends QLChung{
    
    List<TyTrong> tt = new ArrayList<>();
    
    @Override
    public void hienthiDS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void themTT(TyTrong... h) {
        this.tt.addAll(Arrays.asList(h));
    }

    public void themTT(TyTrong h) throws ParseException {
        this.tt.add(h);
    }

    public boolean xoaT(TyTrong h) {
        if (tt.remove(h) == true) {
            return true;
        }
        return false;
    }
    
     public List<TyTrong> timTTtheoDC(DeCuong h) {
        List<TyTrong> t = new ArrayList<>();
        for(TyTrong ty : tt){
            if(ty.getDe().getId().equals(h.getId())){
                t.add(ty);
            }
        }
        return t;
    }
}
