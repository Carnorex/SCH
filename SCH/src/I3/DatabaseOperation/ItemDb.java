/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I3.DatabaseOperation;

import I3.Classes.Item;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ItemDb {
    Connection conn = DataBaseConnection.connectTODB();
    PreparedStatement statement = null;
    ResultSet result = null;
    
     public void insertItem(Item item) {
        try {
            String insertItem = "insert into item('name','description','price') values('" + item.getItem_name() + "','" + item.getDescription() + "'," + item.getPrice() + ")";

            // System.out.println(">>>>>>>>>> "+ insertRoomTypeQuery);
            statement = conn.prepareStatement(insertItem);

            statement.execute();

            JOptionPane.showMessageDialog(null, "Insercion exitosa");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Insercion fallida");
        }
        finally
        {
            flushStatmentOnly();
        }
    }

    public void updateItem(Item item) {
        try {
            String updateFood = "update food set name= '" + item.getItem_name() + "', price= " + item.getPrice() + "description = '" + item.getDescription() + "' where item_id = " + item.getItem_id();

            // System.out.println(">>>>>>>>>> "+ insertRoomTypeQuery);
            statement = conn.prepareStatement(updateFood);

            statement.execute();

            JOptionPane.showMessageDialog(null, "Actualizacion con exito ");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Error al actualizar");
        }
        finally
        {
            flushStatmentOnly();
        }
    }

    public ResultSet getItems() {
        try {
            String query = "select * from item";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error al devolver las operaciones de la base de datos");
        }

        return result;
    }

    public void deleteItem(int itemId) {
        try {
            String deleteQuery = "delete from item where item_id=" + itemId;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Item borrado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Eliminar consulta/Error consulta");
        }
        finally
        {
            flushStatmentOnly();
        }
    }
    
     public void flushAll()
    {
        {
                        try
                        {
                            statement.close();
                            result.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> Cerrar la base de datos");}
                    }
    }
    
    private void flushStatmentOnly()
    {
        {
                        try
                        {
                            statement.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> Cerrar la base de datos");}
                    }
    }
    
}
