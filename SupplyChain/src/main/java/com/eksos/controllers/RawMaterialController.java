/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.RawMaterials;
import dev.morphia.Datastore;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ljrp3
 */
public class RawMaterialController {
    private final Datastore ds = MongoDS.getDatastore();
    
   
    
        public DefaultTableModel seeRawMaterialsInventory() {
        DefaultTableModel modelTable = new DefaultTableModel();
//        modelTable.addColumn("Código");
        modelTable.addColumn("Producto");
        modelTable.addColumn("Inventario Total");
        modelTable.addColumn("Stock");
        

        List<RawMaterials> materials = ds.find(RawMaterials.class).iterator().toList();
        String[] datos = new String[3];

        for (int i = 0; i < materials.size(); i++) {
//            datos[0] = materials.get(i).get_id().toString();
            datos[0] = materials.get(i).getName();
            datos[1] = materials.get(i).getTotalInventory().toString();
            datos[2] = materials.get(i).getStock().toString();
            
  
           
            
            modelTable.addRow(datos);         
            
        }
        return modelTable;
    }
    
}
