package Facade.example;

import java.sql.*;

public class finallyOperation implements IJDBC {

	Connection conn;
	PreparedStatement prep;
	CallableStatement call;
	ResultSet rset;

	public finallyOperation(Connection conn, PreparedStatement prep, CallableStatement call, ResultSet rset) {
		this.conn = conn;
		this.prep = prep;
		this.call = call;
		this.rset = rset;
	}

	@Override
	public void process() {
		rsetClose();
		prepClose();
		callClose();
		connClose();
	}

	private void rsetClose() {
		if (rset != null) {
			try {
				rset.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void prepClose() {
		if (prep != null) {
			try {
				prep.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void callClose() {
		if (call != null) {
			try {
				call.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}

	private void connClose() {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException ex) {
				ex.printStackTrace();
			}
		}
	}
}
