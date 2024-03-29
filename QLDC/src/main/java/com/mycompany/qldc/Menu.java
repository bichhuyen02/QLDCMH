/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    private Scanner sc = new Scanner(System.in);
    private int n = 0;
    HeDaoTao cq = new HeDaoTao(1, "Chinh quy");
    HeDaoTao tx = new HeDaoTao(2, "Lien thong");
    KhoiKienThuc cs = new KhoiKienThuc(1, "Co so");
    KhoiKienThuc csn = new KhoiKienThuc(2, "Co so nganh");
    KhoiKienThuc cn = new KhoiKienThuc(3, "Chuyen nganh");

    //------------------------------------------Thống kê-------------------------------------------
    private void thongKeDctheotc(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        float tc;
        String s;
        int i = 1;
        s = sc.nextLine();
        System.out.println("Nhap so tin chi muon thong ke: ");
        tc = sc.nextFloat();
        System.out.println("-----------------------Danh sach de cuong------------------------");
        for (DeCuong d : qldc.thongKe(tc)) {
            System.out.println(i + ". " + d.getId() + ": " + d.getMh().getTen() + "-" + d.getHe().getTen());
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("1. Thong ke");
        System.out.println("2. Quay lai menu");
        System.out.println("chon: ");
        n = sc.nextInt();
        switch (n) {
            case 1 ->
                thongKeDctheotc(qlmh, qldc, qlgv, qlht, qltt);
            case 2 ->
                menuMain(qlmh, qldc, qlgv, qlht, qltt);
            default ->
                System.out.println("Khong hop le!!!");
        }
    }

    //------------------------------------------Đề cương-------------------------------------------
    //xóa đề cương
    private void xoaDc(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        DeCuong c = new DeCuong();
        sc.nextLine();
        System.out.print("Nhap ten hoac ma cua giang vien / mon hoc cua de cuong muon xoa: ");
        s = sc.nextLine();
        if (qldc.timDCTheoTenMH(s) != null) {
            c = qldc.timDCTheoTenMH(s);
        }
        if (qldc.timDCTheoMaMH(s) != null) {
            c = qldc.timDCTheoMaMH(s);
        }
        if (qldc.timDCTheoMaGV(s) != null) {
            c = qldc.timDCTheoMaGV(s);
        }
        if (qldc.timDCTheoTenGV(s) != null) {
            c = qldc.timDCTheoTenGV(s);
        }
        if (qldc.timDCTheoMa(s) != null) {
            c = qldc.timDCTheoMa(s);
        }
        if (c != null) {
            System.out.println("-----------------------De cuong------------------------");
            System.out.println("Ma de cuong: " + c.getId());
            System.out.println("Giang vien: " + c.getgV().getTen());
            System.out.println("He: " + c.getHe().getTen());
            System.out.println("Muc tieu: " + c.getMucTieu());
            System.out.println("Chuan dau ra: " + c.getChuanDauRa());
//            System.out.println("Hinh thuc đanh gia: " );
            System.out.println("-------------------------end--------------------------");
            System.out.println("Co phai de cuong muon xoa?");
            System.out.println("1. Xoa");
            System.out.println("2. Tim lai");
            System.out.println("3. Quay lai menu de cuong");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    if (qldc.xoaDC(c) == true) {
                        System.out.println("Xoa thanh cong!!!");
                    } else {
                        System.out.println("Xoa that bai!!!");
                    }
                    System.out.println("Ban co muon tiep tuc xoa?");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    n = sc.nextInt();
                    switch (n) {
                        case 1:
                            xoaDc(qlmh, qldc, qlgv, qlht, qltt);
                            break;
                        case 2:
                            menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
                            break;
                        default:
                            System.out.println("Khong hop le!!!");
                    }
                    break;
                case 2:
                    xoaDc(qlmh, qldc, qlgv, qlht, qltt);
                    break;
                case 3:
                    menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } else {
            System.out.println("De cuong khong ton tai!!");
        }
    }

    //Sửa hình thức
    private void suaHT(DeCuong c, QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        sc.nextLine();
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Them hinh thuc");
            System.out.println("2. Xoa hinh thuc");
            System.out.println("3. Quay lai menu");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    if (qltt.timTTtheoDC(c).size() < 5) {
                        int i = 1;
                        for (TyTrong t : qltt.timTTtheoDC(c)) {
                            System.out.println(i + ". " + t.getDanhGia().getTen());
                            i++;
                        }
                        luuDG(c, qlmh, qldc, qlgv, qlht, qltt);
                        System.out.println("Ma mon hoc: " + c.getMh().getId());
                        System.out.println("Ten mon hoc: " + c.getMh().getTen());
                        System.out.println("Mo ta mon hoc: " + c.getMh().getMoTa());
                        System.out.println("Tin chi mon hoc: " + c.getMh().getSoTC());
                        System.out.println("Giang vien: " + c.getgV().getTen());
                        System.out.println("He: " + c.getHe().getTen());
                        System.out.println("Muc tieu: " + c.getMucTieu());
                        System.out.println("Chuan dau ra: " + c.getChuanDauRa());
                        System.out.println("Hinh thuc danh gia: ");
                        if (!qltt.timTTtheoDC(c).isEmpty()) {
                            for (TyTrong t : qltt.timTTtheoDC(c)) {
                                System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getTen());
                                System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getPhuongPDG());
                                System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getNoiDung());
                                System.out.println("Hinh thuc danh gia: " + t.getCotDiem());
                            }
                        }
                        suaHT(c, qlmh, qldc, qlgv, qlht, qltt);
                    } else {
                        System.out.print("De cuong chi da co 5 hinh thuc danh gia khong the them!!!");
                    }
                    break;
                case 2:
                    if (qltt.timTTtheoDC(c).size() > 2) {
                        int i = 1;
                        List<TyTrong> tt = qltt.timTTtheoDC(c);
                        for (TyTrong t : tt) {
                            System.out.println(i + ". " + t.getDanhGia().getTen());
                            i++;
                        }
                        System.out.println("chon: ");
                        n = sc.nextInt();
                        qltt.xoaT(tt.get(n));
                        System.out.println("Ma mon hoc: " + c.getMh().getId());
                        System.out.println("Ten mon hoc: " + c.getMh().getTen());
                        System.out.println("Mo ta mon hoc: " + c.getMh().getMoTa());
                        System.out.println("Tin chi mon hoc: " + c.getMh().getSoTC());
                        System.out.println("Giang vien: " + c.getgV().getTen());
                        System.out.println("He: " + c.getHe().getTen());
                        System.out.println("Muc tieu: " + c.getMucTieu());
                        System.out.println("Chuan dau ra: " + c.getChuanDauRa());
                        System.out.println("Hinh thuc danh gia: ");
                        if (!qltt.timTTtheoDC(c).isEmpty()) {
                            for (TyTrong t : qltt.timTTtheoDC(c)) {
                                System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getTen());
                                System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getPhuongPDG());
                                System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getNoiDung());
                                System.out.println("Hinh thuc danh gia: " + t.getCotDiem());
                            }
                        }
                        suaHT(c, qlmh, qldc, qlgv, qlht, qltt);
                    } else {
                        System.out.print("De cuong chi co 2 hinh thuc danh gia khong the xoa!!!");
                    }
                    break;
                case 3:
                    menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 7);
    }

    //sửa đề cương
    private void suaDC(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        sc.nextLine();
        DeCuong c = new DeCuong();
        System.out.print("Nhap ten hoac ma của mon hoc và giang vien cua de cuong muon tim: ");
        s = sc.nextLine();
        if (qldc.timDCTheoTenMH(s) != null) {
            c = qldc.timDCTheoTenMH(s);
        }
        if (qldc.timDCTheoMaMH(s) != null) {
            c = qldc.timDCTheoMaMH(s);
        }
        if (qldc.timDCTheoMaGV(s) != null) {
            c = qldc.timDCTheoMaGV(s);
        }
        if (qldc.timDCTheoTenGV(s) != null) {
            c = qldc.timDCTheoTenGV(s);
        }
        if (qldc.timDCTheoMa(s) != null) {
            c = qldc.timDCTheoMa(s);
        }
        if (c.getId() != null) {
            System.out.println("-----------------------Đề cương------------------------");
            System.out.println("Ma mon hoc: " + c.getMh().getId());
            System.out.println("Ten mon hoc: " + c.getMh().getTen());
            System.out.println("Mo ta mon hoc: " + c.getMh().getMoTa());
            System.out.println("So tin chi: " + c.getMh().getSoTC());
            System.out.println("1. Ma de cuong: " + c.getId());
            System.out.println("2. Mục tieu: " + c.getMucTieu());
            System.out.println("3. Chuan dau ra: " + c.getChuanDauRa());
            System.out.println("4. He dao tao: " + c.getHe().getTen());
            System.out.println("5. Hinh thuc danh gia: " + c.getHe().getTen());
            System.out.println("6. Quay lai menu");
            System.out.println("-------------------------end--------------------------");
            System.out.println("Ban muon sua tieu chi nao hay thoat?");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print("Nhap ma: ");
                    c.setId(sc.nextLine());
                    suaDC(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 2 -> {
                    System.out.print("Nhap muc tieu: ");
                    c.setMucTieu(sc.nextLine());
                    suaDC(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 3 -> {
                    System.out.print("Nhap chuan dau ra: ");
                    c.setChuanDauRa(sc.nextLine());
                    suaDC(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 4 -> {
                    System.out.println("-----------------------menu------------------------");
                    System.out.println("1. He chinh quy");
                    System.out.println("2. He lien thong");
                    System.out.println("-----------------------end------------------------");
                    System.out.print("chon: ");
                    switch (n) {
                        case 1 ->
                            c.setHe(cq);
                        case 2 ->
                            c.setHe(tx);
                        default ->
                            System.out.println("Khong hop le!!!");
                    }
                    suaDC(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 5 ->
                    suaHT(c, qlmh, qldc, qlgv, qlht, qltt);
                case 6 ->
                    menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } else {
            System.out.println("Mon hoc khong ton tai!!");
        }
    }

    //tìm kiếm dề cương
    private void timDC(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        sc.nextLine();
        DeCuong c = new DeCuong();
        System.out.print("Nhap ten hoac ma của mon hoc và giang vien cua de cuong muon tim: ");
        s = sc.nextLine();
        if (qldc.timDCTheoTenMH(s) != null) {
            c = qldc.timDCTheoTenMH(s);
        }
        if (qldc.timDCTheoMaMH(s) != null) {
            c = qldc.timDCTheoMaMH(s);
        }
        if (qldc.timDCTheoMaGV(s) != null) {
            c = qldc.timDCTheoMaGV(s);
        }
        if (qldc.timDCTheoTenGV(s) != null) {
            c = qldc.timDCTheoTenGV(s);
        }
        if (qldc.timDCTheoMa(s) != null) {
            c = qldc.timDCTheoMa(s);
        }
        if (c.getId() != null) {
            System.out.println("-----------------------De cuong------------------------");
            System.out.println("Ma mon hoc: " + c.getMh().getId());
            System.out.println("Ten mon hoc: " + c.getMh().getTen());
            System.out.println("Mo ta mon hoc: " + c.getMh().getMoTa());
            System.out.println("Tin chi mon hoc: " + c.getMh().getSoTC());
            System.out.println("Giang vien: " + c.getgV().getTen());
            System.out.println("He: " + c.getHe().getTen());
            System.out.println("Muc tieu: " + c.getMucTieu());
            System.out.println("Chuan dau ra: " + c.getChuanDauRa());
            System.out.println("Hinh thuc danh gia: ");
            if (!qltt.timTTtheoDC(c).isEmpty()) {
                for (TyTrong t : qltt.timTTtheoDC(c)) {
                    System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getTen());
                    System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getPhuongPDG());
                    System.out.println("Hinh thuc danh gia: " + t.getDanhGia().getNoiDung());
                    System.out.println("Hinh thuc danh gia: " + t.getCotDiem());
                }
            }
            System.out.println("-------------------------end--------------------------");
            System.out.println("Tim tiep hay thoat?");
            System.out.println("1. Tim");
            System.out.println("2. Thoat");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    timDC(qlmh, qldc, qlgv, qlht, qltt);
                case 2 ->
                    menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } else {
            System.out.println("De cuong khong ton tai!!");
        }
    }

    //xem ds de cuong
    private void hienThiDsDc(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        System.out.println("-----------------------Danh sach de cuong------------------------");
        qldc.hienthiDS();
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc xem hay quay lai menu de cuong?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1:
                hienThiDsDc(qlmh, qldc, qlgv, qlht, qltt);
                break;
            case 2:
                menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
                break;
            default:
                System.out.println("Khong hop le!!!");
        }
    }

    //lưu hình thức đánh giá
    private void luuTT(DeCuong c, HinhThucDanhGia ht, QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        s = sc.nextLine();
        TyTrong t = new TyTrong();
        System.out.print("Nhap noi dung hinh thuc danh gia:");
        ht.setNoiDung(sc.nextLine());
        qlht.themHT(ht);
        t.setDe(c);
        t.setDanhGia(ht);
        System.out.print("Nhap ty trong:");
        t.setCotDiem(sc.nextDouble());
        qltt.themTT(t);
    }

    private void luuHT(DeCuong c, HinhThucDanhGia ht, QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        s = sc.nextLine();
        System.out.println("Chon phuong phap danh gia:");
        System.out.println("1. Qua trinh");
        System.out.println("2. Cuoi ki");
        System.out.println("3. Bai Tap Lon");
        System.out.println("4 Chuyen can");
        n = sc.nextInt();
        switch (n) {
            case 1 -> {
                ht.setPhuongPDG("Qua trinh");
                luuTT(c, ht, qlmh, qldc, qlgv, qlht, qltt);
            }
            case 2 -> {
                ht.setPhuongPDG("Cuoi ki");
                luuTT(c, ht, qlmh, qldc, qlgv, qlht, qltt);
            }
            case 3 -> {
                ht.setPhuongPDG("Bai Tap Lon");
                luuTT(c, ht, qlmh, qldc, qlgv, qlht, qltt);
            }
            case 4 -> {
                ht.setPhuongPDG("Chuyen can");
                luuTT(c, ht, qlmh, qldc, qlgv, qlht, qltt);
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
    }

    private void luuDG(DeCuong c, QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        s = sc.nextLine();
        HinhThucDanhGia ht = new HinhThucDanhGia();
        System.out.println("Chon hinh thuc danh gia:");
        System.out.println("1. Tren giay");
        System.out.println("2. Tren may");
        n = sc.nextInt();
        switch (n) {
            case 1 -> {
                ht.setTen("Tren giay");
                luuHT(c, ht, qlmh, qldc, qlgv, qlht, qltt);
            }
            case 2 -> {
                ht.setTen("Tren may");
                luuHT(c, ht, qlmh, qldc, qlgv, qlht, qltt);
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
    }

    //Lưu đề cương
    private void menuLuuDCCQ(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        DeCuong c = new DeCuong();
        String s;
        s = sc.nextLine();
        MonHoc m = new MonHoc();
        System.out.print("Nhap ten hoac ma mon hoc muon tao de cuong: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null) {
            m = qlmh.timMHTheoId(s);
        }
        if (qlmh.timMHTheoTen(s) != null) {
            m = qlmh.timMHTheoTen(s);
        }
        if (m.getId() != null) {
            if (qldc.checkMH(m, cq) == true) {
                c.setMh(m);
                c.setHe(cq);
                System.out.println("-----------------------De cuong------------------------");
                System.out.println("Mon hoc tao de cuong: " + m.getTen());
                System.out.print("Nhap ma de cuong: ");
                c.setId(sc.nextLine());
                System.out.print("Nhap muc tieu mon hoc: ");
                c.setMucTieu(sc.nextLine());
                System.out.print("Nhap chuan dau ra: ");
                c.setChuanDauRa(sc.nextLine());
                do {
                    GiangVien gv = new GiangVien();
                    System.out.println("Nhap ma hoac ten giang vien: ");
                    s = sc.nextLine();
                    if (qlgv.timGVTheoMa(s) != null) {
                        gv = qlgv.timGVTheoMa(s);
                    }
                    if (qlgv.timGVTheoTen(s) != null) {
                        gv = qlgv.timGVTheoTen(s);
                    }
                    if (gv != null) {
                        if (qldc.checkGv(gv) < 5) {
                            c.setgV(gv);
                        } else {
                            System.out.println("Giang vien da vuoc qua so luong!!!");
                        }
                    } else {
                        System.out.println("Giang vien khong ton tai!!!");
                    }
                } while (c.getgV() == null);
                n = 1;
                do {
                    luuDG(c, qlmh, qldc, qlgv, qlht, qltt);
                    if (qltt.timTTtheoDC(c).size() > 2) {
                        System.out.println("Co tiep tuc them hinh thuc khong?");
                        System.out.println("1. Co");
                        System.out.println("2. Khong");
                        n = sc.nextInt();
                    }

                } while (qltt.timTTtheoDC(c).size() < 5 && n == 1);
                System.out.println("-----------------------end------------------------");
                qldc.themDC(c);
                menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
            } else {
                System.out.println("De cuong mon hoc nay cua he chinh quy da ton tai!!!");
            }
        } else {
            System.out.println("Mon hoc khong ton tai!!!");
        }
    }

    private void menuLuuDCTX(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        DeCuong c = new DeCuong();
        String s;
        s = sc.nextLine();
        MonHoc m = new MonHoc();
        System.out.print("Nhap ten hoac ma mon hoc muon tao de cuong: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null) {
            m = qlmh.timMHTheoId(s);
        }
        if (qlmh.timMHTheoTen(s) != null) {
            m = qlmh.timMHTheoTen(s);
        }
        if (m.getId() != null) {
            if (qldc.checkMH(m, cq) == true) {
                c.setMh(m);
                c.setHe(cq);
                int h = 0;
                System.out.println("-----------------------De cuong------------------------");
                System.out.println("Mon hoc tao de cuong: " + m.getTen());
                System.out.print("Nhap ma de cuong: ");
                c.setId(sc.nextLine());
                System.out.print("Nhap muc tieu mon hoc: ");
                c.setMucTieu(sc.nextLine());
                System.out.print("Nhap chuan dau ra: ");
                c.setChuanDauRa(sc.nextLine());
                do {
                    GiangVien gv = new GiangVien();
                    System.out.println("Nhap ma hoac ten giang vien: ");
                    s = sc.nextLine();
                    if (qlgv.timGVTheoMa(s) != null) {
                        gv = qlgv.timGVTheoMa(s);
                    }
                    if (qlgv.timGVTheoTen(s) != null) {
                        gv = qlgv.timGVTheoTen(s);
                    }
                    if (gv != null) {
                        if (qldc.checkGv(gv) < 5) {
                            c.setgV(gv);
                        } else {
                            System.out.println("Giang vien da vuoc qua so luong!!!");
                        }
                    } else {
                        System.out.println("Giang vien khong ton tai!!!");
                    }
                } while (c.getgV() == null);
                n = 1;
                do {
                    luuDG(c, qlmh, qldc, qlgv, qlht, qltt);
                    if (qltt.timTTtheoDC(c).size() > 2) {
                        System.out.println("Co tiep tuc them hinh thuc khong?");
                        System.out.println("1. Co");
                        System.out.println("2. Khong");
                        n = sc.nextInt();
                    }

                } while (qltt.timTTtheoDC(c).size() < 5 && n == 1);
                System.out.println("-----------------------end------------------------");
                qldc.themDC(c);
                menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
            } else {
                System.out.println("De cuong mon hoc nay cua he chinh quy da ton tai!!!");
            }
        } else {
            System.out.println("Mon hoc khong ton tai!!!");
        }
    }

    //menu hệ đào tạo
    private void menuHeDaoTao(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. He chinh quy");
            System.out.println("2. He lien thong");
            System.out.println("3. Quay lai menu");
            System.out.println("4. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    menuLuuDCCQ(qlmh, qldc, qlgv, qlht, qltt);
                case 2 ->
                    menuLuuDCTX(qlmh, qldc, qlgv, qlht, qltt);
                case 3 ->
                    menuMain(qlmh, qldc, qlgv, qlht, qltt);
                case 4 ->
                    System.out.println("Cam on da su dung");
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 4);
    }

    //menu đề cương
    private void menuDeCuong(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai nemu chinh");
            System.out.println("7. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    menuHeDaoTao(qlmh, qldc, qlgv, qlht, qltt);
                case 2 ->
                    suaDC(qlmh, qldc, qlgv, qlht, qltt);
                case 3 ->
                    xoaDc(qlmh, qldc, qlgv, qlht, qltt);
                case 4 ->
                    timDC(qlmh, qldc, qlgv, qlht, qltt);
                case 5 ->
                    hienThiDsDc(qlmh, qldc, qlgv, qlht, qltt);
                case 6 ->
                    menuMain(qlmh, qldc, qlgv, qlht, qltt);
                case 7 ->
                    System.out.println("Cam on da su dung");
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 7);
    }

    //----------------------------------------------------Môn học-----------------------------------
    //xóa môn học
    private void xoaMH(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        sc.nextLine();
        MonHoc m = new MonHoc();
        System.out.print("Nhap ten hoac ma mon hoc muon xoa: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null) {
            m = qlmh.timMHTheoId(s);
        }
        if (qlmh.timMHTheoId(s) != null) {
            m = qlmh.timMHTheoId(s);
        }
        if (m != null) {
            System.out.println("-----------------------Mon Hoc------------------------");
            System.out.println("Nhap ma mon hoc: " + m.getId());
            System.out.println("Nhap ten mon hoc: " + m.getTen());
            System.out.println("Nhap ma mo ta mon hoc: " + m.getMoTa());
            System.out.println("Nhap so tin chi: " + m.getSoTC());
            System.out.println("-------------------------end--------------------------");
            System.out.println("Co phai mon hoc muon xoa?");
            System.out.println("1. Xoa");
            System.out.println("2. Tim lai");
            System.out.println("3. Quay lai menu mon hoc");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    if (qlmh.xoaMH(m) == true) {
                        System.out.println("Xoa thanh cong!!!");
                    } else {
                        System.out.println("Xoa that bai!!!");
                    }
                    System.out.println("Ban co muon tiep tuc xoa?");
                    System.out.println("1. Co");
                    System.out.println("2. Khong");
                    n = sc.nextInt();
                    switch (n) {
                        case 1 ->
                            xoaMH(qlmh, qldc, qlgv, qlht, qltt);
                        case 2 ->
                            menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
                        default ->
                            System.out.println("Khong hop le!!!");
                    }
                }
                case 2 ->
                    xoaMH(qlmh, qldc, qlgv, qlht, qltt);
                case 3 ->
                    menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } else {
            System.out.println("Mon hoc khong ton tai!!");
        }
    }

    //sửa môn học
    private void suaMH(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        sc.nextLine();
        MonHoc m = new MonHoc();
        System.out.print("Nhap ten hoac ma mon hoc muon tim: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null) {
            m = qlmh.timMHTheoId(s);
        }
        if (qlmh.timMHTheoTen(s) != null) {
            m = qlmh.timMHTheoTen(s);
        }
        if (m != null) {
            System.out.println("-----------------------Mon Hoc------------------------");
            System.out.println("1. Ma mon hoc: " + m.getId());
            System.out.println("2. Ten mon hoc: " + m.getTen());
            System.out.println("3. Mo ta mon hoc: " + m.getMoTa());
            System.out.println("4. So tin chi: " + m.getSoTC());
            if (!m.getDstr().isEmpty()) {
                System.out.println("5. Danh sach mon hoc truoc: ");
                int i = 0;
                for (MonHoc h : m.getDstr()) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            } else {
                System.out.println("6. Danh sach mon hoc truoc: Khong co");
            }
            if (!m.getDstq().isEmpty()) {
                System.out.println("6. Danh sach mon hoc tien quyet: ");
                int i = 0;
                for (MonHoc h : m.getDstq()) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            } else {
                System.out.println("6. Danh sach mon hoc tien quyet: Khong co");
            }
            System.out.println("-------------------------end--------------------------");
            System.out.println("Ban muon sua tieu chi nao hay thoat?");
            System.out.println("7. Thoat");
            n = sc.nextInt();
            switch (n) {
                case 1 -> {
                    System.out.print("Nhap ma mon: ");
                    m.setId(sc.nextLine());
                    suaMH(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 2 -> {
                    System.out.print("Nhap ten mon: ");
                    m.setTen(sc.nextLine());
                    suaMH(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 3 -> {
                    System.out.print("Nhap mo ta: ");
                    m.setMoTa(sc.nextLine());
                    suaMH(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 4 -> {
                    System.out.print("Nhap so tín chỉ: ");
                    m.setSoTC(sc.nextFloat());
                    suaMH(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 5 -> {
                    System.out.print("Nhap ma mon: ");
                    m.setId(sc.nextLine());
                    suaMH(qlmh, qldc, qlgv, qlht, qltt);
                }
                case 6 -> {
                }
                case 7 -> {
                }
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } else {
            System.out.println("Mon hoc khong ton tai!!");
        }
    }

    //tìm kiếm môn học
    private void timMH(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        sc.nextLine();
        MonHoc m = new MonHoc();
        System.out.print("Nhap ten hoac ma mon hoc muon tim: ");
        s = sc.nextLine();
        if (qlmh.timMHTheoId(s) != null) {
            m = qlmh.timMHTheoId(s);
        }
        if (qlmh.timMHTheoTen(s) != null) {
            m = qlmh.timMHTheoTen(s);
        }
        if (m != null) {
            System.out.println("-----------------------Mon Hoc------------------------");
            System.out.println("Nhap ma mon hoc: " + m.getId());
            System.out.println("Nhap ten mon hoc: " + m.getTen());
            System.out.println("Nhap ma mo ta mon hoc: " + m.getMoTa());
            System.out.println("Nhap so tin chi: " + m.getSoTC());
            if (!m.getDstr().isEmpty()) {
                System.out.println("Danh sach mon hoc truoc: ");
                int i = 0;
                for (MonHoc h : m.getDstr()) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            } else {
                System.out.println("Danh sach mon hoc truoc: Khong co");
            }
            if (!m.getDstq().isEmpty()) {
                System.out.println("Danh sach mon hoc tien quyet: ");
                int i = 0;
                for (MonHoc h : m.getDstq()) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            } else {
                System.out.println("Danh sach mon hoc tien quyet: Khong co");
            }
            System.out.println("-------------------------end--------------------------");
            System.out.println("Ban tiep tuc xem hay quay lai menu mon hoc?");
            System.out.println("1. Tiep tuc");
            System.out.println("2. Quay lai");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    timMH(qlmh, qldc, qlgv, qlht, qltt);
                case 2 ->
                    menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } else {
            System.out.println("Mon hoc khong ton tai!!");
        }
    }

    //xem ds môn học
    private void hienThiDsMH(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {

        System.out.println("-----------------------Danh sach mon hoc------------------------");
        qlmh.hienthiDS();
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc xem hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1 ->
                hienThiDsMH(qlmh, qldc, qlgv, qlht, qltt);
            case 2 ->
                menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
            default ->
                System.out.println("Khong hop le!!!");
        }
    }

    //menu quay lại Lưu môn học
    private void menuQuaylaiMH(MonHoc m, QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        System.out.println("-----------------------Mon Hoc------------------------");
        System.out.print("Nhap ma mon hoc: " + m.getId());
        System.out.print("Nhap ten mon hoc: " + m.getTen());
        System.out.print("Nhap ma mo ta mon hoc: " + m.getMoTa());
        System.out.print("Nhap so tin chi: " + m.getSoTC());
        if (m.getDstr().size() <= 3) {
            if (!m.getDstr().isEmpty()) {
                int i = 0;
                for (MonHoc h : m.getDstr()) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            }
            System.out.println("Nhap mon hoc truoc: 1. Co - 2. Khong");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    menuMhT(m, qlmh, qldc, qlgv, qlht, qltt);
                case 2 -> {
                }
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } else {
            int i = 0;
            for (MonHoc h : m.getDstr()) {
                System.out.println(i + ". " + h.getTen());
                i++;
            }
        }
        if (m.getDstq().size() <= 3) {
            if (!m.getDstr().isEmpty()) {
                int i = 0;
                for (MonHoc h : m.getDstr()) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            }
            System.out.println("Nhap mon hoc tien quyet: 1. Co - 2. Khong");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    menuMhTQ(m, qlmh, qldc, qlgv, qlht, qltt);
                case 2 -> {
                }
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } else {
            int i = 0;
            for (MonHoc h : m.getDstr()) {
                System.out.println(i + ". " + h.getTen());
                i++;
            }
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc them hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1 -> {
                qlmh.themMH(m);
                menuLuuMHCSN(qlmh, qldc, qlgv, qlht, qltt);
            }
            case 2 -> {
                qlmh.themMH(m);
                menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
    }

    //lưu môn học tiên quyết
    private void menuMhTQ(MonHoc m, QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        System.out.println("-----------------------Mon hoc tien quyet------------------------");
        List<MonHoc> mh = new ArrayList<>();
        mh = m.getDstq();
        do {
            if (!mh.isEmpty()) {
                int i = 0;
                for (MonHoc h : mh) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            }
            System.out.print("Nhap ma mon hoc hoac ten mon hoc: ");
            s = sc.nextLine();
            if (qlmh.timMHTheoTen(s) != null || qlmh.timMHTheoId(s) != null) {
                if (qlmh.timMHTheoTen(s) != null) {
                    MonHoc mon = qlmh.timMHTheoId(s);
                    if (mon.getTen().equals(s) == false && m.checkList(mon) == false) {
                        mh.add(qlmh.timMHTheoTen(s));
                    } else {
                        System.out.print("Mon hoc da ton tai!!!");
                    }
                }
                if (qlmh.timMHTheoId(s) != null) {
                    MonHoc mon = qlmh.timMHTheoId(s);
                    if (mon.getTen().equals(s) == false && m.checkList(mon) == false) {
                        mh.add(qlmh.timMHTheoId(s));
                    } else {
                        System.out.print("Mon hoc da ton tai!!!");
                    }
                }
            } else {
                System.out.print("Mon hoc khong ton tai!!!");
            }

            System.out.println("-----------------------------end--------------------------------");
            System.out.println("Nhap tiep hoac thoat");
            System.out.println("1. Nhap tiep");
            System.out.println("2. Thoat");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    menuMhTQ(m, qlmh, qldc, qlgv, qlht, qltt);
                case 2 -> {
                    m.setDstq(mh);
                    menuQuaylaiMH(m, qlmh, qldc, qlgv, qlht, qltt);
                }
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } while (mh.size() > 4);
        m.setDstq(mh);
        menuQuaylaiMH(m, qlmh, qldc, qlgv, qlht, qltt);
    }

    //lưu môn học trước
    private void menuMhT(MonHoc m, QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        String s;
        System.out.println("-----------------------Mon hoc truoc------------------------");
        List<MonHoc> mh = new ArrayList<>();
        mh = m.getDstr();
        do {
            if (!mh.isEmpty()) {
                int i = 0;
                for (MonHoc h : mh) {
                    System.out.println(i + ". " + h.getTen());
                    i++;
                }
            }
            System.out.print("Nhap ma mon hoc hoac ten mon hoc: ");
            s = sc.nextLine();
            if (qlmh.timMHTheoTen(s) != null || qlmh.timMHTheoId(s) != null) {
                if (qlmh.timMHTheoTen(s) != null) {
                    MonHoc mon = qlmh.timMHTheoId(s);
                    if (mon.getTen().equals(s) == false && m.checkList(mon) == false) {
                        mh.add(qlmh.timMHTheoTen(s));
                    } else {
                        System.out.print("Mon hoc da ton tai!!!");
                    }
                }
                if (qlmh.timMHTheoId(s) != null) {
                    MonHoc mon = qlmh.timMHTheoId(s);
                    if (mon.getTen().equals(s) == false && m.checkList(mon) == false) {
                        mh.add(qlmh.timMHTheoId(s));
                    } else {
                        System.out.print("Mon hoc da ton tai!!!");
                    }
                }
            } else {
                System.out.print("Mon hoc khong ton tai!!!");
            }
            System.out.println("-----------------------------end--------------------------------");
            System.out.println("Nhap tiep hoac thoat");
            System.out.println("1. Nhap tiep");
            System.out.println("2. Thoat");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    menuMhT(m, qlmh, qldc, qlgv, qlht, qltt);
                case 2 -> {
                    m.setDstr(mh);
                    menuQuaylaiMH(m, qlmh, qldc, qlgv, qlht, qltt);
                }
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } while (mh.size() > 4);
        m.setDstr(mh);
        menuQuaylaiMH(m, qlmh, qldc, qlgv, qlht, qltt);
    }

    //lưu môn học
    private void menuLuuMHCS(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        MonHoc m = new MonHoc();
        m.setKt(cs);
        System.out.println("-----------------------Mon Hoc------------------------");
        System.out.print("Nhap ma mon hoc: ");
        m.setId(sc.nextLine());
        sc.nextLine();
        System.out.print("Nhap ten mon hoc: ");
        m.setTen(sc.nextLine());
        System.out.print("Nhap ma mo ta mon hoc: ");
        m.setMoTa(sc.nextLine());
        System.out.print("Nhap so tin chi: ");
        m.setSoTC(sc.nextFloat());
        qlmh.themMH(m);
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc them hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1 ->
                menuLuuMHCS(qlmh, qldc, qlgv, qlht, qltt);
            case 2 ->
                menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
            default ->
                System.out.println("Khong hop le!!!");

        }
    }

    private void menuLuuMHN(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        MonHoc m = new MonHoc();
        m.setKt(csn);
        System.out.println("-----------------------Mon Hoc------------------------");
        System.out.print("Nhap ma mon hoc: ");
        m.setId(sc.nextLine());
        System.out.print("Nhap ten mon hoc: ");
        m.setTen(sc.nextLine());
        System.out.print("Nhap ma mo ta mon hoc: ");
        m.setMoTa(sc.nextLine());
        System.out.print("Nhap so tin chi: ");
        m.setSoTC(sc.nextFloat());
        System.out.println("Nhap mon hoc truoc: 1. Co - 2. Khong");
        n = sc.nextInt();
        switch (n) {
            case 1 ->
                menuMhT(m, qlmh, qldc, qlgv, qlht, qltt);
            case 2 -> {
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
        System.out.println("Nhap mon hoc tien quyet: 1. Co - 2. Khong");
        n = sc.nextInt();
        switch (n) {
            case 1 ->
                menuMhTQ(m, qlmh, qldc, qlgv, qlht, qltt);
            case 2 -> {
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc them hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1 -> {
                qlmh.themMH(m);
                menuLuuMHCSN(qlmh, qldc, qlgv, qlht, qltt);
            }
            case 2 -> {
                qlmh.themMH(m);
                menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
    }

    private void menuLuuMHCSN(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        MonHoc m = new MonHoc();
        m.setKt(cn);
        System.out.println("-----------------------Mon Hoc------------------------");
        System.out.print("Nhap ma mon hoc: ");
        m.setId(sc.nextLine());
        System.out.print("Nhap ten mon hoc: ");
        m.setTen(sc.nextLine());
        System.out.print("Nhap ma mo ta mon hoc: ");
        m.setMoTa(sc.nextLine());
        System.out.print("Nhap so tin chi: ");
        m.setSoTC(sc.nextFloat());
        System.out.println("Nhap mon hoc truoc: 1. Co - 2. Khong");
        n = sc.nextInt();
        switch (n) {
            case 1 ->
                menuMhT(m, qlmh, qldc, qlgv, qlht, qltt);
            case 2 -> {
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
        System.out.println("Nhap mon hoc tien quyet: 1. Co - 2. Khong");
        n = sc.nextInt();
        switch (n) {
            case 1 ->
                menuMhTQ(m, qlmh, qldc, qlgv, qlht, qltt);
            case 2 -> {
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
        System.out.println("-------------------------end--------------------------");
        System.out.println("Ban tiep tuc them hay quay lai menu mon hoc?");
        System.out.println("1. Tiep tuc");
        System.out.println("2. Quay lai");
        n = sc.nextInt();
        switch (n) {
            case 1 -> {
                qlmh.themMH(m);
                menuLuuMHCSN(qlmh, qldc, qlgv, qlht, qltt);
            }
            case 2 -> {
                qlmh.themMH(m);
                menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
            }
            default ->
                System.out.println("Khong hop le!!!");
        }
    }

    //menu khối kiến thức môn học
    private void menuKhoiKienThuc(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Co so");
            System.out.println("2. Co so nganh");
            System.out.println("3. Chuyen nganh");
            System.out.println("4. Quay lai menu mon hoc");
            System.out.println("5. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    menuLuuMHCS(qlmh, qldc, qlgv, qlht, qltt);
                case 2 ->
                    menuLuuMHN(qlmh, qldc, qlgv, qlht, qltt);
                case 3 ->
                    menuLuuMHCSN(qlmh, qldc, qlgv, qlht, qltt);
                case 4 ->
                    menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
                case 5 ->
                    System.out.println("Cam on da su dung");
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }

    //menu môn học
    private void menuMonHoc(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        do {
            System.out.println("-----------------------menu subject------------------------");
            System.out.println("1. Them mon hoc");
            System.out.println("2. Sua mon hoc");
            System.out.println("3. Xoa mon hoc");
            System.out.println("4. Tim kiem mon hoc");
            System.out.println("5. Hien thi danh sach mon hoc");
            System.out.println("6. Quay lai nemu chinh");
            System.out.println("7. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1 ->
                    menuKhoiKienThuc(qlmh, qldc, qlgv, qlht, qltt);
                case 2 ->
                    suaMH(qlmh, qldc, qlgv, qlht, qltt);
                case 3 ->
                    xoaMH(qlmh, qldc, qlgv, qlht, qltt);
                case 4 ->
                    timMH(qlmh, qldc, qlgv, qlht, qltt);
                case 5 ->
                    hienThiDsMH(qlmh, qldc, qlgv, qlht, qltt);
                case 6 ->
                    menuMain(qlmh, qldc, qlgv, qlht, qltt);
                case 7 ->
                    System.out.println("Cam on da su dung");
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 7);
    }

    //menu chính
    public void menuMain(QLMH qlmh, QLDCM qldc, QLGV qlgv, QLHT qlht, QLTT qltt) throws ParseException {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Quan ly mon hoc");
            System.out.println("2. Quan ly de cuong mon hoc");
            System.out.println("3. Thong ke ");
            System.out.println("4. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();

            switch (n) {
                case 1 ->
                    menuMonHoc(qlmh, qldc, qlgv, qlht, qltt);
                case 2 ->
                    menuDeCuong(qlmh, qldc, qlgv, qlht, qltt);
                case 3 ->
                    thongKeDctheotc(qlmh, qldc, qlgv, qlht, qltt);
                case 4 ->
                    System.out.println("Cam on da su dung");
                default ->
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 7);
    }
}
