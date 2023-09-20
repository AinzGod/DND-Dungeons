import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
    private static final String DB_URL = "jdbc:sqlserver://localhost:1433;databaseName=DungeonDND;"
            + "sslTrustStore=your_truststore_file;sslTrustStorePassword=root;encrypt=true;trustServerCertificate=false;";
    private static final String username = "root";
    private static final String password = "root";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            // Cargar el driver JDBC
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Establecer la conexión
            connection = DriverManager.getConnection(DB_URL,username,password);

        } catch (ClassNotFoundException e) {
            System.out.println("No se pudo cargar el driver JDBC.");
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
        }
        return connection;
    }
}


//Statement statement= connection.createStatement(); //para poder llamar a las tablas