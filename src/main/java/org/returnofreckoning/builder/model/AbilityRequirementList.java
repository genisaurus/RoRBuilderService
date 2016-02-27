package org.returnofreckoning.builder.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class AbilityRequirementList {

	@XmlElement(name="abilityRequirement")
	private ArrayList<AbilityRequirement> abilityRequirementList = new ArrayList<>();

	public ArrayList<AbilityRequirement> getAbilityRequirementList() {
		return abilityRequirementList;
	}

	public void setAbilityRequirementList(ArrayList<AbilityRequirement> abilityRequirementList) {
		this.abilityRequirementList = abilityRequirementList;
	}
	
	public void add (AbilityRequirement abr) {
		this.abilityRequirementList.add(abr);
	}
	
	public String toString() {
		String output = new String("{ ");
		for (AbilityRequirement abr : this.abilityRequirementList)
			output += abr.toString();
		output += " }";
		return output;
	}
}
