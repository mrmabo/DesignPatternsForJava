package Facade.example;

import java.sql.*;

public class JDBCdemo {
    public static void main(String[] arg) {
        Connection conn = null;
        PreparedStatement prep = null;
        CallableStatement call = null;
        ResultSet rset = null;

        try {
            Class.forName("<driver>").newInstance();
            conn = DriverManager.getConnection("<database>");
            String sql = "SELECT * FROM <table> WHERE <column name> =?";
            prep = conn.prepareStatement(sql);
            prep.setString(1, "<column value>");
            rset = prep.executeQuery();
            if (rset.next()) {
                System.out.println(rset.getString("<column name"));
            }
            sql = "{call <stored procedure>( ?, ? )}";
            call = conn.prepareCall(sql);
            call.setInt(1, 1972);
            call.registerOutParameter(2, Types.INTEGER);
            call.execute();
            System.out.println(call.getInt(2));
        } catch (Exception e) {
            ICatch icatch = new catchException();
            icatch.processCatch(e);
        } finally {
            IJDBC ijdbc = new finallyOperation(conn, prep, call, rset);
            ijdbc.process();
        }
    }
}
