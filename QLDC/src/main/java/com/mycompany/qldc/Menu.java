/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.qldc;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Menu {

    private Scanner sc = new Scanner(System.in);
    private int n = 0;

    private void menuMonHoc() {
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
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuMain();
                    break;
                case 7:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 7);
    }

    private void menuDeCuongCSCQ() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucCQ();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCSNCQ() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucCQ();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCNCQ() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucCQ();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCSTX() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucTX();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCSNTX() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucTX();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuDeCuongCNTX() {
        do {
            System.out.println("-----------------------menu outline------------------------");
            System.out.println("1. Them de cuong mon hoc");
            System.out.println("2. Sua de cuong mon hoc");
            System.out.println("3. Xoa de cuong mon hoc");
            System.out.println("4. Tim kiem de cuong mon hoc");
            System.out.println("5. Hien thi danh sach de cuong");
            System.out.println("6. Quay lai Khoi kien thuc");
            System.out.println("7. Quay lai he");
            System.out.println("8. Quay lai nemu chinh");
            System.out.println("9. Thoat");
            System.out.println("-------------------------end-----------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 2:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 3:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 4:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 5:
                    System.out.println("com.mycompany.qldcmh.QLDCMH.main()");
                    break;
                case 6:
                    menuKhoiKienThucTX();
                    break;
                case 7:
                    menuHeDaoTao();
                    break;
                case 8:
                    menuMain();
                    break;
                case 9:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 9);
    }

    private void menuKhoiKienThucCQ() {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Co so");
            System.out.println("2. Co so nganh");
            System.out.println("3. Chuyen nganh");
            System.out.println("4. Chon lai He");
            System.out.println("5. Quay lai menu chinh");
            System.out.println("6. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuDeCuongCSTX();
                    break;
                case 2:
                    menuDeCuongCSNTX();
                    break;
                case 3:
                    menuDeCuongCNTX();
                    break;
                case 4:
                    menuHeDaoTao();
                    break;
                case 5:
                    menuMain();
                    break;
                case 6:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }

    private void menuKhoiKienThucTX() {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Co so");
            System.out.println("2. Co so nganh");
            System.out.println("3. Chuyen nganh");
            System.out.println("4. Chon lai He");
            System.out.println("5. Quay lai menu chinh");
            System.out.println("6. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuDeCuongCSTX();
                    break;
                case 2:
                    menuDeCuongCSNTX();
                    break;
                case 3:
                    menuDeCuongCNTX();
                    break;
                case 4:
                    menuHeDaoTao();
                    break;
                case 5:
                    menuMain();
                    break;
                case 6:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }

    private void menuHeDaoTao() {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. He chinh quy");
            System.out.println("2. He tu xa");
            System.out.println("3. Quay lai menu");
            System.out.println("4. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();
            switch (n) {
                case 1:
                    menuKhoiKienThucCQ();
                    break;
                case 2:
                    menuKhoiKienThucTX();
                    break;
                case 3:
                    menuMain();
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 4);
    }

    public void menuMain() {
        do {
            System.out.println("-----------------------menu------------------------");
            System.out.println("1. Quan ly mon hoc");
            System.out.println("2. Quan ly de cuong mon hoc");
            System.out.println("4. Tim kiem mon hoc");
            System.out.println("5. Tim kiem de cuong mon hoc theo ma giang vien");
            System.out.println("6. Thoat");
            System.out.println("-----------------------end------------------------");
            System.out.print("chon: ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    menuMonHoc();
                    break;
                case 2:
                    menuHeDaoTao();
                    break;
                case 3:
                    System.out.println("Cam on da su dung");
                    break;
                case 4:
                    System.out.println("Cam on da su dung");
                    break;
                case 5:
                    System.out.println("Cam on da su dung");
                    break;
                case 6:
                    System.out.println("Cam on da su dung");
                    break;
                default:
                    System.out.println("Khong hop le!!!");
            }
        } while (n < 6);
    }
}
