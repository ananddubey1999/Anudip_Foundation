import java.sql.*;
public class InsertDataInTable {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employee";
		String username="root";
	    String password="Dubeyaddy1998";
		
		// Dynamically u want to insert
		
		String insertQuery="insert into employees(id,_first_name,last_name,age,) values(?,?,?,?)";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		
		PreparedStatement pstate=con.prepareStatement(insertQuery);
		pstate.setLong(1,1);
		pstate.setString(2,"Jhon");
		pstate.setString(3, "Deo");
        pstate.setInt(4, 30);
        int rowsAffected=pstate.executeUpdate();
		if(rowsAffected>0)
		{
			System.out.println(rowsAffected+"row affected");
		}
		
		else
		{
			System.out.println(rowsAffected+"row/s affected");
		}
		pstate.close();
		con.close();
		
	}

}

