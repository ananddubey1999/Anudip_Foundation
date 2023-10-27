import java.sql.*;
public class TableCreate {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/kamal";
		String username="root";
		String password="Dubeyaddy1998";
		String query="create table if not exists employees(\r\n" + "id int auto_increment primary key,\r\n" + 
		"first_name varchar(50),\r\n" + "last_name varchar(50),\r\n" + "age int";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,user,password);
		Statement state=con.createStatement();
		state.executeUpdate(query);
		System.out.print("Table create successfully into the database");
		state.close();
		con.close();
		

	}

}
