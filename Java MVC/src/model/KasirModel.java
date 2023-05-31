/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.Connector;
import main.kasir;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class KasirModel {
    
    Connector con = new Connector();
     public void insertkasir(kasir Kasir){
        String query = "insert into kasir(id_nota,id_kasir,id_barang,nama_barang,harga_barang,total_harga,jmlbarang) values (?,?,?,?,?,?)";
        PreparedStatement pstm;
        
        try{
           con.statement = con.koneksi.createStatement();
           pstm = con.koneksi.prepareStatement(query);
           pstm.setDouble(1, Kasir.getid_nota());
           pstm.setDouble(2, Kasir.getid_barang());
           pstm.setDouble(3, Kasir.getharga_barang());
           pstm.setDouble(4, Kasir.getharga_barang());
           pstm.setDouble(5, Kasir.getjmlbarang());
          pstm.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
    }
    
    public ArrayList<kasir> getkasir(){
        System.out.println("getkasir()");
        String query = "select * from kasir";
        PreparedStatement pstm;
        
        try{
           con.statement = con.koneksi.createStatement();
           pstm = con.koneksi.prepareStatement(query);
           ResultSet rs = pstm.executeQuery();
           ArrayList<kasir> list = new ArrayList<>();
           kasir Kasir;
           while(rs.next()){
               Kasir = new kasir(
                    rs.getDouble("id_nota"),
                    rs.getDouble("id_barang"),
                    rs.getDouble("jmlbarang"),
                    rs.getDouble("harga_barang"),
                    rs.getDouble("total_harga")
               );
//               System.out.println(movie.getAlurCerita());
               list.add(Kasir);
           }
           return list;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
      public boolean isContainKasir(){
        System.out.println("isContainKasir()");
        try{
            String query = "select count(*) as num from kasir";
            PreparedStatement ptsm = con.koneksi.prepareStatement(query);
            con.statement = con.koneksi.createStatement();
            ResultSet rs = ptsm.executeQuery(query);
            rs.next();
            if(rs.getInt("num") > 0) return true;
        }catch(Exception e){
            System.err.println(e.getMessage());
        }
        return false;
    }
}