import java.sql.Connection;
import java.sql.DriverManager;
import CommonConstant; 

public class DBConnectionUtil {
    private static Connection connection;
    private static Statement statement;
    
    public EmployeeServiceImpl1() {
        try {
            Class.forName(CommonConstant.JDBC_DRIVER);
            connection = DriverManager.getConnection(properties.getProperty("url"), properties.getProperty("username"),
                    properties.getProperty("password"));
        } catch (Exception e) {
            log.log(Level.SEVERE, e.getMessage());
        }
    }
}