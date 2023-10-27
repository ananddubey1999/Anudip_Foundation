
import java.sql.*;
public class  UpdateNameAndAge {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employee";
		String username="root";
	    String password="Dubeyaddy1998";
		String UpdateQuery="update employee set first_name=?, last_name=?, age=? where id=?";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		PreparedStatement pstate=con.prepareStatement(UpdateQuery);
		
		pstate.setInt(1, 1);
		pstate.setString(2,"Anand");
		pstate.setString(3,"Dubey");
		pstate.setInt(4,22);
		int rowsAffected=pstate.executeUpdate();
		System.out.println(rowsAffected+" record update succsessfully!");
		
		
		System.out.println("Data Upadatede Successfully");
		
		pstate.close();
		con.close();

	}


	}


