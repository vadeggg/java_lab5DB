import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {
    private String user = "postgres";
    private String passwrod = "fizmat";
    private String url = "jdbc:postgresql://localhost:5432/java_labs";

    public static final String CREATE_TABLE_EMPLOYEE = "CREATE TABLE EMPLOYEE"
            + "("
            + "ID serial,"
            + "NAME varchar(30) NOT NULL,"
            + "PRIMARY KEY (ID)"
            + ")";
    public static final String CREATE_TABLE_SOME_TABLE = "CREATE TABLE ANOTHER_TABLE"
            + "("
            + "TABLE_ID serial,"
            + "NAME_ID INTEGER NOT NULL,"
            + "SOME_DATA VARCHAR(30) NOT NULL,"
            + "PRIMARY KEY (TABLE_ID),"
            + "FOREIGN KEY  (NAME_ID)"
            + "REFERENCES  EMPLOYEE(ID)"
            + ")";

    final Connection connection = DriverManager.getConnection(url,user,passwrod);

    public CreateTable() throws SQLException {
    }

    public void creating_table() throws SQLException {
        try(Statement statement = connection.createStatement()) {
            statement.execute(CREATE_TABLE_EMPLOYEE);
        } catch (SQLException e){
            System.err.format(e.getSQLState());
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    public void creating_table_another_table() throws SQLException{
        try(Statement statement = connection.createStatement()) {
            statement.execute(CREATE_TABLE_SOME_TABLE);
        }
    }
}
//catch (SQLException e){
//        System.err.format(e.getSQLState());
//        } catch (Exception e){
//        e.printStackTrace();
//        }