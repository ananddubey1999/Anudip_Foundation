
import java.sql.*;
public class DeleteDataFromTable {

	public static void main(String[] args)throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employee";
		String username="root";
	    String password="Dubeyaddy1998";
		String deleteQuery="delete from employee where id=1";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		Statement state=con.createStatement();
		int rowsAffected=state.executeUpdate(deleteQuery);
		System.out.println(rowsAffected+" Record Deleted Succsessfully");
		state.close();
		con.close();
		
	}

}

