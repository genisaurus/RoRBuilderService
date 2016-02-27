package org.returnofreckoning.builder.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.returnofreckoning.builder.dao.AbilityDAO;
import org.returnofreckoning.builder.dao.iAbilityDAO;

public class DAOUtilities {
	
	public static Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");
			return DriverManager.getConnection("jdbc:h2:mem:abilitydb", "sa", "sa");
		} catch (SQLException e) {
			System.out.println("Could not open connection!");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("Could not find h2 driver");
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static iAbilityDAO getAbilityDAO() {
		return new AbilityDAO();
	}
}
