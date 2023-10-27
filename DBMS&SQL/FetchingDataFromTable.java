
import java.sql.*;
public class FetchingDataFromTable {

	public static void main(String[] args)  throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/employee";
		String username="root";
	    String password="Dubeyaddy1998";
		String query="select * from employee";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		PreparedStatement pstate=con.prepareStatement(query);
		ResultSet result= pstate.executeQuery();
		while(result.next())
		{
			int id=result.getInt("id");
			String first_name=result.getString("first_name");
            String last_name=result.getString("last_name");
			int age=result.getInt("age");
			
			System.out.println("Id: "+id+"First_Name: "+first_name+"Last_Name: "+last_name+"Age: "+age);
			
		}
		
		System.out.println("Data Display Successfully");
		
		pstate.close();
		con.close();

	}

}

