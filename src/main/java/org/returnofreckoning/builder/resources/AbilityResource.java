package org.returnofreckoning.builder.resources;

import org.returnofreckoning.builder.dao.iAbilityDAO;
import org.returnofreckoning.builder.model.Ability;
import org.returnofreckoning.builder.model.Class;
import org.returnofreckoning.builder.utilities.DAOUtilities;

public class AbilityResource implements iAbilityResource {
	
	public Ability getAbility(int abilityID) {
		iAbilityDAO dao = DAOUtilities.getAbilityDAO();

		return dao.getAbility(abilityID);
	}
	
	public String getAbilityString(int abilityID) {
		iAbilityDAO dao = DAOUtilities.getAbilityDAO();
		System.out.println("Fetching ability " + abilityID);
		Ability ab = dao.getAbility(abilityID);
		System.out.println(ab);
		return ab.toString();
	}

	public Class getAbilitiesForClass(int classID, String type) {
		iAbilityDAO dao = DAOUtilities.getAbilityDAO();
		
		if (type.equals("all"))
			return dao.getAbilitiesForClass(classID);
		else
			return dao.getAbilitiesForClass(classID, type);
	}
	
}
