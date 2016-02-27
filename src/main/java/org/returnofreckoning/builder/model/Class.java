package org.returnofreckoning.builder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class Class {

	private int classID;
	private String name;
	@XmlElement(name="abilityList")
	private AbilityList abilities;
	
	public Class() {
		this.classID = 0;
		this.name = "Undefined Class";
		this.abilities = new AbilityList();
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public String getClassName() {
		return name;
	}
	public void setClassName(String className) {
		this.name = className;
	}
	public AbilityList getAbilities() {
		return abilities;
	}
	public void setAbilities(AbilityList abilities) {
		this.abilities = abilities;
	}	
	
}
