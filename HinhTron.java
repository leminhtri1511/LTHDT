/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lthdt;

public class HinhTron
{
    double bankinh;
    public HinhTron(double bankinh) 
    {
        this.bankinh = bankinh;
    }
    public HinhTron() 
    {}
    public double getBankinh() 
    {
        return bankinh;
    }
    public void setBankinh(double bankinh)
    {
        this.bankinh = bankinh;
    }
    double tinhDienTich() 
    {
        return bankinh * bankinh * 3.14;
    }
    double tinhChuVi() {
        return bankinh * 2 * 3.14;
    }
}
