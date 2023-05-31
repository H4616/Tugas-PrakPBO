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
import main.kasir;
import model.KasirModel;
import view.KasirView;

/**
 *
 * @author acer
 */
public class KasirControler {
    private ArrayList<kasir> list;
    private double id_nota;
    private double  id_barang;
    private double jmlbarang;
    private double harga_barang;
    
    public KasirControler( KasirView kasir , KasirModel model){
        if(model.isContainKasir()){
            list = model.getkasir();
            String [][] data = convertData(list);
            kasir.tabel2.setModel((new JTable(data, kasir.namaKolom)).getModel());
        }else{
            JOptionPane.showMessageDialog(null, "Data Barang Kosong");
        }
        kasir.btnTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               double id_nota = kasir.getid_nota(); 
               double id_barang = kasir.getid_barang();
               double jmlbarang = kasir.getjmlbarang();
               
               double harga_barang = kasir.getharga_barang();
               if(isValid(id_nota,id_barang, jmlbarang, harga_barang)){
                    kasir Kasir = new kasir(id_nota,id_barang,jmlbarang,harga_barang);
                    model.insertkasir(Kasir);
               };
               list = model.getkasir();
               System.out.println(list.get(0).getid_barang());
               String [][] data = convertData(list);
               kasir.tabel2.setModel((new JTable(data, kasir.namaKolom)).getModel());
            }
        });
        
//        kasir.btnTambah.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//               System.out.println("btnUpdate");
//               id_barang = view.getid_barang();
//               nama_barang = view.getnama_barang();
//               harga_barang = view.getharga_barang();
//               belanja Belanja = new belanja(id_barang,nama_barang,harga_barang);
////                System.out.println(movie.getAkting());
//               model.updatebelanja(Belanja);
//               list = model.getitem();
//               String [][] data = convertData(list);
//               kasir.tabel2.setModel((new JTable(data, kasir.namaKolom)).getModel());
//            }
//        });
        
//        view.btnDelete.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                double id_barang = view.getid_barang();
//                model.deletebelanja(id_barang);
//                list = model.getitem();
//                String[][] data = convertData(list);
//                 kasir.tabel2.setModel((new JTable(data, kasir.namaKolom)).getModel());
//            }
//        });
        
       kasir.tabel2.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                int baris = kasir.tabel2.getSelectedRow();
                int kolom = kasir.tabel2.getSelectedColumn();
                
                id_nota = Double.valueOf(kasir.tabel2.getValueAt(baris, 0).toString());
                id_barang = Double.valueOf(kasir.tabel2.getValueAt(baris, 1).toString()); 
                harga_barang = Double.valueOf(kasir.tabel2.getValueAt(baris, 2).toString()); 
                jmlbarang = Double.valueOf(kasir.tabel2.getValueAt(baris, 3).toString()); 
             //   total_harga = Double.valueOf(kasir.tabel2.getValueAt(baris, 4).toString()); 
                kasir.tfid_nota.setText(String.valueOf(id_nota));  
                kasir.tfid_barang.setText(String.valueOf(id_barang));             
                kasir.tfharga_barang.setText(String.valueOf(harga_barang));
                kasir.tfjmlbarang.setText(String.valueOf(jmlbarang));
            }
            
        });
        
//        view.btnReset.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                view.tfid_barang.setText("");
//                view.tfnama_barang.setText("");
//                view.tfnama_barang.setText("");
//            }
//        });
    }
    
    private boolean isValid(double Nota, double ID,double jmlbarang, double Harga){
        if((Nota > 0) && (ID > 0) && (jmlbarang > 0) && (Harga > 0))
            return true;
        else {
            return false;}
    }
    private String[][] convertData(ArrayList<kasir> list){
        String[][] data = new String[list.size()][3];
        
        for(int i = 0; i < list.size(); i++){
            data[i][0] = String.valueOf(list.get(i).getid_nota());
            data[i][1] = String.valueOf(list.get(i).getid_barang());
            data[i][2] = String.valueOf(list.get(i).getharga_barang());
            data[i][3] = String.valueOf(list.get(i).getjmlbarang());

        }
        
        return data;
    }
    }

