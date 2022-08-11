/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I3.DatabaseOperation;

import I3.Classes.UserInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CustomerDb {
    Connection conn;
    PreparedStatement statement = null;
    ResultSet result = null;
    
    public CustomerDb()
    {
        conn = DataBaseConnection.connectTODB();
    }
      public void insertCustomer(UserInfo user)  {
        try {
            String insertQuery = "insert into userInfo"
                    + "('" + "name" + "'," + "'" + "address" + "','" + "phone" + "','" + "type" + "')"
                    + " values('"
                    + user.getName()
                    + "','" + user.getAddress() + "'"
                    + ",'" + user.getPhone_no() + "'"
                    + ",'" + user.getType() + "'"
                    + ")";

            //System.out.println(">>>>>>>>>> "+ insertQuery);
            statement = conn.prepareStatement(insertQuery);

            statement.execute();

            JOptionPane.showMessageDialog(null, "Insercion con exito sobre el huesped");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Error ");
        }
        finally
        {
            flushStatementOnly();
        }
        
        
    }
    
    public void updateCustomer(UserInfo user) {
        // update userInfo set name = 'faysal' ,address = 'dhaka' where user_id = 3  
         //JOptionPane.showMessageDialog(null, user.getType());     
        try {
           
              String updateQuery = "update userInfo set name = '"+ user.getName() + "',"
              + "address = '" + user.getAddress() + "',"
              + "phone = '" + user.getPhone_no() + "',"
              + "type = '" + user.getType() + "' where user_id= "
              + user.getCustomer_id();
            
             // if (user.getType()=="Simple")
            //{
              statement = conn.prepareStatement(updateQuery);
              statement.execute();
            JOptionPane.showMessageDialog(null, "Actualizando con exito habitacion");     
            //}
          //else
           // {
            //            JOptionPane.showMessageDialog(null, "Poner los tipos de habitacion");
            //}
            //System.out.println(">>>>>>>>>> "+ insertQuery);
            //System.out.println(updateQuery);
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Error");
        }
        
        finally
        {
            flushStatementOnly();
        }

    }

    public void deleteCustomer(int userId) throws SQLException {
        try {
            String deleteQuery = "delete from userInfo where user_id=" + userId;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "huesped eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Eliminar consulta fallida");
        }
        finally
        {
            flushStatementOnly();
        }

    }

    public ResultSet getAllCustomer() {
        try {
            String query = "select * from userInfo";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error al devolver las operaciones de base de datos huesped");
        }
        

        return result;
    }
     private void flushStatementOnly()
    {
        {
                        try
                        {
                            statement.close();
                            //conn.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >>Clausurado :,C");}
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
                        {System.err.print(ex.toString()+" >> Clausurado :,C");}
                    }
    }

    
    
}
