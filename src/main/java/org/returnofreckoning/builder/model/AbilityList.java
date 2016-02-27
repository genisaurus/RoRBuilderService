package org.returnofreckoning.builder.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class AbilityList {

	@XmlElement(name="ability")
	private ArrayList<Ability> abilityList = new ArrayList<>();

	public ArrayList<Ability> getAbilityList() {
		return abilityList;
	}

	public void setAbilityList(ArrayList<Ability> abilityList) {
		this.abilityList = abilityList;
	}
	
	public void add(Ability ab) {
		this.abilityList.add(ab);
	}
	
	public String toString() {
		String output = new String("{ ");
		for (Ability ab : this.abilityList)
			output += ab.toString();
		output += " }";
		return output;
	}
}
