import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class DBConnectorTest {

    @Test
    public void testConnection() {
        try {
            // Intentar obtener la conexión a la base de datos
            Connection connection = DBConnector.getConnection();

            // Verificar si la conexión no es nula
            Assert.assertNotNull(connection);

            // Cerramos la conexión para liberar recursos.
            connection.close();
        } catch (SQLException e) {
            // Si ocurre una excepción, significa que hubo un problema al conectarse.
            Assert.fail("Error al conectarse a la base de datos: " + e.getMessage());
        }
    }
}


