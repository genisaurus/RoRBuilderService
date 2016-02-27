package org.returnofreckoning.builder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@XmlRootElement(name="tooltipValue")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder={"position", "statID", "statScale", "weaponScale", "castTimeScale", "levelOneValue", "levelPattern"})
@JsonPropertyOrder({"position", "statID", "statScale", "weaponScale", "castTimeScale", "levelOneValue", "levelPattern"})
public class TooltipValue {

	private int position;
	private int statID;
	private double statScale;
	private double weaponScale;
	private double castTimeScale;
	private int levelOneValue;
	private String levelPattern;
	
	public TooltipValue() {
		this.position = 1;
		this.statID = 0;
		this.statScale = 0;
		this.weaponScale = 0;
		this.levelOneValue = 0;
		this.levelPattern = "0";
	}
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public int getStatID() {
		return statID;
	}
	public void setStatID(int statID) {
		this.statID = statID;
	}
	public double getStatScale() {
		return statScale;
	}
	public void setStatScale(double statScale) {
		this.statScale = statScale;
	}
	public double getWeaponScale() {
		return weaponScale;
	}
	public void setWeaponScale(double weaponScale) {
		this.weaponScale = weaponScale;
	}
	public double getCastTimeScale() {
		return castTimeScale;
	}

	public void setCastTimeScale(double castTimeScale) {
		this.castTimeScale = castTimeScale;
	}

	public int getLevelOneValue() {
		return levelOneValue;
	}

	public void setLevelOneValue(int levelOneValue) {
		this.levelOneValue = levelOneValue;
	}

	public String getLevelPattern() {
		return levelPattern;
	}
	public void setLevelPattern(String levelPattern) {
		this.levelPattern = levelPattern;
	}
	
	public String toString() {
		return new String(
					"{ " +
					position + ":" +
					statID + ":" +
					statScale + ":" +
					weaponScale + ":" +
					castTimeScale + ":" +
					levelOneValue + ":" +
					levelPattern + ":" +
					" }"
					);
	}
	
}
