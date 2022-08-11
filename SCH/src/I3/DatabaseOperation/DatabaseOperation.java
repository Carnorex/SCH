package I3.DatabaseOperation;
import I3.Classes.Food;
import I3.Classes.Item;
import I3.Classes.Room;
import I3.Classes.RoomFare;
import I3.Classes.UserInfo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class DatabaseOperation {

    Connection conn = DataBaseConnection.connectTODB();
    PreparedStatement statement = null;
    ResultSet result = null;

    public void insertCustomer(UserInfo user) throws SQLException {
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

            JOptionPane.showMessageDialog(null, "Insercion con exito el nuevo huesped");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Fallo (Error)");
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
                        {System.err.print(ex.toString()+" >>Cierre la base de datos");}
                    }
    }

    public void updateCustomer(UserInfo user) {
        // update userInfo set name = 'faysal' ,address = 'dhaka' where user_id = 3
        try {
            String updateQuery = "Actualizando = '"
                    + user.getName() + "',"
                    + "direccion = '" + user.getAddress() + "',"
                    + "Telefono = '" + user.getPhone_no() + "',"
                    + "Tipo = '" + user.getType() + "' donde user_id= "
                    + user.getCustomer_id();

            //System.out.println(">>>>>>>>>> "+ insertQuery);
            //System.out.println(updateQuery);
            statement = conn.prepareStatement(updateQuery);

            //System.out.println(updateQuery);
            statement.execute();

            JOptionPane.showMessageDialog(null, "Actualizando con exito nuevo huesped");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "La consulta de actualizar fallo");
        }

    }

    public void deleteCustomer(int userId) throws SQLException {
        try {
            String deleteQuery = "delete from userInfo where user_id=" + userId;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Huesped eliminado");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "La eliminacion a fallado");
        }
        finally
        {
            flushStatmentOnly();
        }

    }

    public ResultSet getAllCustomer() {
        try {
            String query = "select * from userInfo";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error al devolver todas las operaciones de la base de datos huesped");
        }
        finally
        {
            flushAll();
        }

        return result;
    }

  
      public ResultSet searchUser(String user) {
        try {
            String query = "select user_id,name,address from userInfo where name like '%"+user+"%'";
            
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error de busqueda huesped");
        }
            //System.out.println("fetching something");
        return result;
    }
    
    public ResultSet searchAnUser(int id)
    {
        try {
            String query = "select * from userInfo where user_id="+id;
            
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error de devolver una funcion al huesped");
        }
            //System.out.println("fetching something");
        return result;
    }

    public ResultSet getAvailableRooms(long check_inTime)
    {
       try {
                      
            String query = "SELECT room_no FROM room LEFT OUTER JOIN booking ON room.room_no = booking.booking_room WHERE booking.booking_room is null or "+check_inTime+"< booking.check_in " +"or booking.check_out <"+check_inTime+" group by room.room_no  order by room_no ";
            System.out.println(query);
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error de devolucion de habitaciones ");
        }

      
        return result;
    }
    
    public ResultSet getBookingInfo(long start_date, long end_date,String roomNo)
    {
        try {
            /*
            
                 select * from booking where 
                (check_in <= start_date and (check_out=0 or check_out<= end_date ) )
                or
                (check_in>start_date and check_out< end_date)
                or
                (check_in <=end_date and (check_out =0 or check_out > end_date) ) 
            
                    */
            
            String query = "select * from booking where booking_room = '"+ roomNo+"' AND ("
                    +"( check_in <= "+start_date +" and ( check_out = 0 or check_out<= "+end_date+") ) or"
                    +"( check_in >"+start_date+" and check_out< "+end_date+" ) or"
                    +"( check_in <= "+end_date +" and ( check_out =0 or check_out> "+end_date+") ) )";
                    
                    
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error al devolver la informacion de reserva entre dos dias especificos");
        }
        

        return result;
    }
    
    public int getCustomerId(UserInfo user)
    { int id = -1;
        try {
            String query = "select user_id from userInfo where name='"+user.getName()+"' and phone ='"+user.getPhone_no()+"'";
            
            System.out.println(query +" <<<");
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            //System.out.println(" user id "+ result.getInt("user_id"));
            
            id = result.getInt("user_id");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error de devolver una funcion al usuario");
        }
       
        return id;
    }
    
    
    
    private void flushStatmentOnly()
    {
        {
                        try
                        {
                            statement.close();
                        }
                        catch(SQLException ex)
                        {System.err.print(ex.toString()+" >> Cierre la base de datos");}
                    }
    }
}
