/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package I3.DatabaseOperation;

import I3.Classes.Room;
import I3.Classes.RoomFare;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class RoomDb {
    Connection conn = DataBaseConnection.connectTODB();
    PreparedStatement statement = null;
    ResultSet result = null;

     public void insertRoom(Room room) {
        try {
            String insertQuery = "insert into room('room_no','bed_number','tv','wifi','gizer','phone','room_class')"
                    + " values('"
                    + room.getRoom_no()
                    + "'," + room.getBed_number() + ""
                    + ",'" + room.isHasTV() + "'"
                    + ",'" + room.isHasWIFI() + "'"
                    + ",'" + room.isHasGizer() + "'"
                    + ",'" + room.isHasPhone() + "'"
                    + ",'" + room.getRoom_class().getRoom_type() + "'"
                    + ")";

            System.out.println(">>>>>>>>>> "+ room.getRoom_class().getRoom_type());
            statement = conn.prepareStatement(insertQuery);

            statement.execute();

            JOptionPane.showMessageDialog(null, "Insercion con exito nueva sala");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Error");
        }
        finally
        {
            flushStatmentOnly();
        }
    }

    public ResultSet getRooms() {
        try {
            String query = "select * from room";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error al devolver las operaciones de la base de datos");
        }
        
        return result;
    }
    
    public int getNoOfRooms()
    {
        int rooms = -1;
        try {
            String query = "select count(room_no)  as noRoom from room";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
            while(result.next())
            {
                rooms = result.getInt("noRoom");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error habitacion base de datos");
        }
        
        return rooms;
    }
    
    public ResultSet getAllRoomNames()
    {
         try {
            String query = "select room_no from room";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error al devolver todas la habitaciones y numeros de habitaciones");
        }
        
        return result;
    }

    public void deleteRoom(int roomId) {

        try {
            String deleteQuery = "delete from room where room_id=" + roomId;
            statement = conn.prepareStatement(deleteQuery);
            statement.execute();
            JOptionPane.showMessageDialog(null, "Habitacion Eliminada");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Eliminar la sala de consultas error");
        }
        finally
        {
            flushStatmentOnly();
        }
    }
 /////////////////////////////////////////////////////////////////////////////   
    public void updateRoom(Room room)
    {
         try {
              String updateQuery = "update room set room_no = '"+ room.getRoom_no() + "',"
               + "bed_number = '" + room.getBed_number()
            //        + "tv = '" + boolToString(room.isHasTV())+ "',"
              //      + "Wifi = '" +boolToString(room.isHasWIFI())+","
                //    + "gizer = '" +boolToString(room.isHasGizer())+ ","
                  //  + "phone = '" +boolToString(room.isHasPhone())+","
                    + "room_class = '" +room.getRoom_class().getRoom_type()
                   + "meal_id ='";
             
             
            //String updateQuery ="update room set room_no = '"+room.getRoom_no()+ "',"
              //      +"', bed_number="+room.getBed_number()
                    //+", tv = '"+boolToString(room.isHasTV())
                    //+"', wifi = '"+boolToString(room.isHasWIFI())
                    //+"',gizer = '"+boolToString(room.isHasGizer())
                    //+"', phone = '"+boolToString(room.isHasPhone())
                 //  +"', room_class= '"+room.getRoom_class().getRoom_type()
                   // +"', meal_id = ";
                    

            System.out.println(">>>>>>>>>> "+ updateQuery);
            //System.out.println(updateQuery);
            statement = conn.prepareStatement(updateQuery);

            //System.out.println(updateQuery);
            statement.execute();

            JOptionPane.showMessageDialog(null, "Actualizando con exito la actualizacion");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "La consulta de actualizacion fallo");
        }
         finally
         {
             flushStatmentOnly();
         }

    }

    public String boolToString(boolean value) {
        return value ? "true" : "false";
    }
    
    public void insertRoomType(RoomFare roomType) {
        try {
            String insertRoomTypeQuery = "insert into roomType values('" + roomType.getRoom_type() + "'," + roomType.getPricePerDay() + ")";

            System.out.println(">>>>>>>>>> " + insertRoomTypeQuery);

            statement = conn.prepareStatement(insertRoomTypeQuery);

            statement.execute();

            JOptionPane.showMessageDialog(null, "Inserccion exitosa nuevo tipo de habitacion");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Inserccion fallo");
        }
        finally
        {
            flushStatmentOnly();
        }
    }

    public ResultSet getRoomType() {
        try {
            String query = "select * from roomType";
            statement = conn.prepareStatement(query);
            result = statement.executeQuery();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n Error al devolver todo el funcionamiento");
        }

        return result;
    }

    public void updateRoomType(RoomFare roomType) {//solo se puede modificar el precio.
        try {
            String updateRoomTypeQuery = "update roomType set price= " + roomType.getPricePerDay() + " where type='" + roomType.getRoom_type() + "'";

            System.out.println(">>>>>>>>>> "+ updateRoomTypeQuery);
            statement = conn.prepareStatement(updateRoomTypeQuery);

            statement.execute();

            JOptionPane.showMessageDialog(null, "Se actualizo con exito un nuevo tipo de habitacion");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Fallo algo");
        }
        finally
        {
            flushStatmentOnly();
        }
    }
    
    public void deleteRoomType(RoomFare roomType) {//solo se puede modificar el precio.
        try {
            String deleteRoomTypeQuery = "delete roomType set type= " + roomType.getRoom_type() + " where type='" + roomType.getRoom_type() + "'";

            System.out.println(">>>>>>>>>> "+ deleteRoomTypeQuery);
            statement = conn.prepareStatement(deleteRoomTypeQuery);

            statement.execute();

            JOptionPane.showMessageDialog(null, "Se actualizo con exito un nuevo tipo de habitacion");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString() + "\n" + "Fallo algo");
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
