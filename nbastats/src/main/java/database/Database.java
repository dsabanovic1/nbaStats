package database;
import helpers.Helper;
import org.apache.commons.lang3.RandomStringUtils;

import java.sql.*;
import java.util.Properties;

public class Database {

    private Connection con;
    private Statement st;
    private ResultSet rs;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("io.crate.client.jdbc.CrateDriver");
        Properties properties = new Properties();
        properties.put("user","crate");

        Connection con =DriverManager.getConnection("crate://127.0.0.1:5432/",properties);
        con.setSchema("school");
        return con;
    }

    public static PreparedStatement prepareStatement(String SQLquery) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();

        return connection.prepareStatement(SQLquery);
    }

    public static String generatorId(Integer playerId, String seasonId, String typeOfData)
    {
        //if(typeOfDatagenerator(typeOfData).equals(0)) throw new ValidatorException("unknown type of data");
        //if(seasonId.equals(null))seasonId="0";
        return playerId.toString() + seasonId + Helper.typeOfDatagenerator(typeOfData);
       // return RandomStringUtils.randomNumeric(5);
    }


}

