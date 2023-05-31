/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;


import controler.KasirControler;
import database.Connector;
import model.KasirModel;
import view.KasirView;



/**
 *
 * @author acer
 */
public class main_kasir {
    
    public static void main(String[] args) {
     KasirView kasir = new KasirView();
     KasirModel modelkasir = new KasirModel();
     KasirControler kasircontroler = new KasirControler(kasir,modelkasir);
    }
}
