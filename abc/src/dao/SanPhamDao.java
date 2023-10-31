/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import database.DBconnect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.SanPham;

public class SanPhamDao {

    // hàm select dữ liệu 
    public List<SanPham> getAll() {
        List<SanPham> listSP = new ArrayList<>();
        try {
            Connection connect = DBconnect.getConnect();
            String sql = "SELECT * FROM SANPHAM";
            PreparedStatement statement = connect.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt("MaSanPham"));
                sp.setTenSP(rs.getString("TenSanPham"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setTrangThai(rs.getInt("TrangThai"));
                listSP.add(sp);
            }
            DBconnect.closeConnection(connect);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return listSP;
    }

    // tạo  hàm thêm đối tượng 
    public int insert(SanPham sp) {
        int ketQua = 0;
        // bước 1 kết nối CSDl 

        return ketQua;
    }

    public List<SanPham> selectByTen(String t) {
        List<SanPham> listSP = new ArrayList<>();
        Connection connect = null;
        try {
            connect = DBconnect.getConnect();
            String sql = "SELECT * FROM SANPHAM WHERE TenSanPham LIKE ?";
            PreparedStatement statement = connect.prepareStatement(sql);
            statement.setString(1, "%" + t + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                SanPham sp = new SanPham();
                sp.setMaSP(rs.getInt("MaSanPham"));
                sp.setTenSP(rs.getString("TenSanPham"));
                sp.setSoLuong(rs.getInt("SoLuong"));
                sp.setTrangThai(rs.getInt("TrangThai"));
                listSP.add(sp);
            }
            DBconnect.closeConnection(connect);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                connect.close();
                System.out.println("đã đóng kết nối");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return listSP;
    }

    public int themData(SanPham sp) {
        int kq = 0;
        Connection connect = DBconnect.getConnect();
        if (sp != null) {
            try {
                String sql = "";
                PreparedStatement statement = connect.prepareStatement(sql);
             
            } catch (Exception e) {
            }
        }
        return kq;
    }

}
