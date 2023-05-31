/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.Connector;
import main.belanja;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class BelanjaModel {
    Connector con = new Connector();
     public void insertbelanja(belanja Belanja){
        String query = "insert into item(id_barang,nama_barang,harga_barang) values (?,?,?)";
        PreparedStatement pstm;
        
        try{
           con.statement = con.koneksi.createStatement();
           pstm = con.koneksi.prepareStatement(query);
           pstm.setDouble (1, Belanja.getid_barang());
           pstm.setString(2, Belanja.getnama_barang());
           pstm.setDouble(3, Belanja.getharga_barang());
           pstm.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }   
    }
    
    public ArrayList<belanja> getitem(){
        System.out.println("getitem()");
        String query = "select * from item";
        PreparedStatement pstm;
        
        try{
           con.statement = con.koneksi.createStatement();
           pstm = con.koneksi.prepareStatement(query);
           ResultSet rs = pstm.executeQuery();
           ArrayList<belanja> list = new ArrayList<>();
           belanja Belanja;
           while(rs.next()){
               Belanja = new belanja(
                    rs.getInt("id_barang"),
                    rs.getString("nama_barang"),
                    rs.getDouble("harga_barang")
               );
//               System.out.println(movie.getAlurCerita());
               list.add(Belanja);
           }
           return list;
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    
    public void updatebelanja(belanja Belanja ){
        Connector con = new Connector();
        System.out.println("updatebelanja()");
        Belanja.toString(); 
        String query = "update item set id_barang=?, nama_barang = ?, harga_barang = ? where id_barang=id_barang";
        PreparedStatement pstm;
        
        try{
           con.statement = con.koneksi.createStatement();
           pstm = con.koneksi.prepareStatement(query);
           pstm.setDouble(1, Belanja.getid_barang());
           pstm.setString(2, Belanja.getnama_barang());
           pstm.setDouble(3, Belanja.getharga_barang());
           pstm.executeUpdate();
           System.out.println("Update");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
    public void deletebelanja(double id_barang){
        String query = "delete from item where id_barang = ?";
        PreparedStatement pstm;
        try {
            pstm = con.koneksi.prepareStatement(query);
            pstm.setDouble(1, id_barang);
            pstm.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public boolean isContainbelanja(){
        System.out.println("isContainbelanja()");
        try{
            String query = "select count(*) as num from item";
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
