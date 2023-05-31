/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import database.Connector;

/**
 *
 * @author acer
 */
public class belanja {
    private double id_nota;
    private double id_barang;
    private String nama_barang;
    private double total_harga;
    private double harga_barang;
    private double jmlbarang;

    
    
     public belanja(double id_barang, String nama_barang,double harga_barang) {
       Connector con = new Connector();  
       
         this.id_barang = id_barang;
         this.nama_barang = nama_barang;
         this.harga_barang = harga_barang;
       // setRating();
    }
     public belanja(double id_nota, double id_barang, String nama_barang, double total_harga,double harga_barang, double jmlbarang) {
         this.id_nota = id_nota;
         this.id_barang = id_barang;
         this.nama_barang = nama_barang;
         this.total_harga = total_harga;
         this.harga_barang = harga_barang;
         this.jmlbarang = jmlbarang;
       
    }

    public belanja() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public belanja(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public double  getid_nota(){
        id_nota++;
    return id_nota;
    }
    
    public void setid_nota(double id_nota){
        this.id_nota = id_nota;
    }
    
    public double getid_barang(){
    return id_barang;
    }
    
    public void setid_barang(double id_barang){
    this.id_barang = id_barang;
    }
    
    public String getnama_barang(){
        return nama_barang;
    } 
    
    public void setnama_barang(String nama_barang){
        this.nama_barang = nama_barang;
    }
    
    public double gettotal_harga(){
        total_harga = harga_barang*jmlbarang;
        return total_harga;
    }
    
    public void settotal_harga(double total_harga){
       this.total_harga = total_harga; 
    }
    
    public double getharga_barang(){
        return harga_barang;
    }
    
    public void setharga_barang(double harga_barang){
        this.harga_barang = harga_barang;
    }
    
    public double getjmlbarang(){
        return harga_barang;
    }
    
    public void setjmlbarang(double jmlbarang){
        this.jmlbarang = jmlbarang;
    }
    
    @Override
    public String toString(){
     return "belanja{" + "Id_Nota=" + id_nota + ", Id_Barang=" + id_barang + ", Nama_barang=" + nama_barang + ", Harga_Barang=" + harga_barang + ", Total_Harga=" + total_harga + '}';   
    }
    
}
