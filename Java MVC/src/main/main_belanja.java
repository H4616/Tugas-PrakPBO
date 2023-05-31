/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controler.BelanjaControler;
import database.Connector;
import model.BelanjaModel;
import view.BelanjaView;


public class main_belanja {

    
    
    public static void main(String[] args) {
       BelanjaView view = new BelanjaView();
       BelanjaModel model = new BelanjaModel();
       BelanjaControler controler = new BelanjaControler(view, model);
        
    }
    
}
