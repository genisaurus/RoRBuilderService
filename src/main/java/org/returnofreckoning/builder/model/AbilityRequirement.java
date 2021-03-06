package org.returnofreckoning.builder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@XmlRootElement(name="abilityRequirement")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"position", "text"})
@JsonPropertyOrder({"position", "text"})
public class AbilityRequirement {

	private int position;
	private String text;
		
	public AbilityRequirement() {
		this.position = 1;
		this.text = "";
	}
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	public String toString() {
		return new String(
				"{ " +
				position + ":" +
				text +
				" }"
				);
	}
}
