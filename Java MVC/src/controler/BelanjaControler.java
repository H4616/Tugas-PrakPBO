/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import model.BelanjaModel;
import view.BelanjaView;
import main.belanja;
import view.KasirView;

public class BelanjaControler{
    
    private ArrayList<belanja> list;
    private double  id_barang;
    private String nama_barang;
    private double harga_barang;
    
    public BelanjaControler(BelanjaView view, BelanjaModel model){
        if(model.isContainbelanja()){
            list = model.getitem();
            String [][] data = convertData(list);
            view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
        }else{
            JOptionPane.showMessageDialog(null, "Data Barang Kosong");
        }
        view.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String nama_barang = view.getnama_barang();
               double id_barang = view.getid_barang();
               double harga_barang = view.getharga_barang();
               if(isValid(id_barang, nama_barang, harga_barang)){
                    belanja Belanja = new belanja(id_barang,nama_barang,harga_barang);
                    model.insertbelanja(Belanja);
               };
               list = model.getitem();
               System.out.println(list.get(0).getid_barang());
               String [][] data = convertData(list);
               view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
            }
        });
        
        view.btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               System.out.println("btnUpdate");
               id_barang = view.getid_barang();
               nama_barang = view.getnama_barang();
               harga_barang = view.getharga_barang();
               belanja Belanja = new belanja(id_barang,nama_barang,harga_barang);
//                System.out.println(movie.getAkting());
               model.updatebelanja(Belanja);
               list = model.getitem();
               String [][] data = convertData(list);
               view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
            }
        });
        
        view.btnDelete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double id_barang = view.getid_barang();
                model.deletebelanja(id_barang);
                list = model.getitem();
                String[][] data = convertData(list);
                view.tabel.setModel((new JTable(data, view.namaKolom)).getModel());
            }
        });
        
        view.tabel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                int baris = view.tabel.getSelectedRow();
                int kolom = view.tabel.getSelectedColumn();
                
                id_barang = Double.valueOf(view.tabel.getValueAt(baris, 0).toString());
                nama_barang = view.tabel.getValueAt(baris, 1).toString(); 
                harga_barang = Double.valueOf(view.tabel.getValueAt(baris, 2).toString());         
                view.tfid_barang.setText(String.valueOf(id_barang));
                view.tfnama_barang.setText(nama_barang);                
                view.tfharga_barang.setText(String.valueOf(harga_barang));
            }
            
        });
        
        view.btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.tfid_barang.setText("");
                view.tfnama_barang.setText("");
                view.tfnama_barang.setText("");
            }
        });
    }
    
    private boolean isValid(double ID, String Nama, double Harga){
        if((ID > 0) && (Nama != null) && (Harga > 0))
            return true;
        else {
            return false;}
    }
    private String[][] convertData(ArrayList<belanja> list){
        String[][] data = new String[list.size()][3];
        
        for(int i = 0; i < list.size(); i++){
            data[i][0] = String.valueOf(list.get(i).getid_barang());
            data[i][1] = list.get(i).getnama_barang();
            data[i][2] = String.valueOf(list.get(i).getharga_barang());

        }
        
        return data;
    }
    }