import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            // Obtener la conexión a la base de datos
            Connection connection = DBConnector.getConnection();

            // A partir de aquí, puedes utilizar la conexión para realizar consultas y operaciones en la base de datos.
            // Por ejemplo:
            // Statement statement = connection.createStatement();
            // ResultSet resultSet = statement.executeQuery("SELECT * FROM MiTabla;");
            // ...continúa con las operaciones necesarias...

            // No olvides cerrar la conexión cuando hayas terminado de utilizarla.
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}