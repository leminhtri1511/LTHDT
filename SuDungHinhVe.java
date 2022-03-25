/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

/**
 *
 * @author ACER
 */
public class SuDungHinhVe {
    public static void main(String[] args){
        HinhTron ht = new HinhTron(12);
        System.out.println(ht.tinhDienTich());
        System.out.println(ht.tinhChuVi());
        HinhChuNhat hcn = new HinhChuNhat(12, 5);
        System.out.println(hcn.tinhDienTich());
        System.out.println(hcn.tinhChuVi());

    }
}