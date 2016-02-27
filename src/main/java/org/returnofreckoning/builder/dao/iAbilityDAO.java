package org.returnofreckoning.builder.dao;

import org.returnofreckoning.builder.model.Ability;
import org.returnofreckoning.builder.model.Class;

public interface iAbilityDAO {

	public Ability getAbility(int abilityID);
	public Class getAbilitiesForClass(int classID);
	public Class getAbilitiesForClass(int classID, String type);
}
