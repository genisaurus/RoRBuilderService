package org.returnofreckoning.builder.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@XmlRootElement(name="ability")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = { 	"abilityID", "classID", "name", "type", "masteryPathID", "requiredMasteryRank", 
						"apCost", "channeled", "castTime", "cooldown", "range", "buffType", "tooltipText", 
						"iconID", "tooltipValues", "abilityRequirements" })
@JsonPropertyOrder({ 	"abilityID", "classID", "name", "type", "masteryPathID", "requiredMasteryRank", 
						"apCost", "channeled", "castTime", "cooldown", "range", "buffType", "tooltipText", 
						"iconID", "tooltipValues", "abilityRequirements" })
public class Ability {

	private int abilityID;
	private int classID;
	private String name;
	private String type;
	private int masteryPathID;
	private int requiredMasteryRank;
	private int apCost;
	private boolean channeled;
	private double castTime;
	private double cooldown;
	private int range;
	private String buffType;
	private String tooltipText;
	private int iconID;
	@XmlElement(name="tooltipValueList")
	private TooltipValueList tooltipValues;
	@XmlElement(name="abilityRequirementList")
	private AbilityRequirementList abilityRequirements;
	
	public Ability() {
		this.abilityID = 0;
		this.classID = 0;
		this.name = "Undefined ability";
		this.type = "";
		this.masteryPathID = 0;
		this.requiredMasteryRank = 0;
		this.apCost = 0;
		this.channeled = false;
		this.castTime = 0.0;
		this.cooldown = 0.0;
		this.range = 0;
		this.buffType = "";
		this.tooltipText = "This ability does not exist, or was undefined.";
		this.tooltipValues = new TooltipValueList();
		this.abilityRequirements = new AbilityRequirementList();
	}
	
	public String toString() {
		return new String( 
					"{ " +
					abilityID + ":" +
					classID + ":" +
					name + ":" +
					type + ":" +
					masteryPathID + ":" +
					requiredMasteryRank + ":" +
					apCost + (isChanneled()?" AP/sec":" AP") +":" +
					castTime + ":" +
					cooldown + ":" +
					range + ":" +
					buffType + ":" +
					tooltipText + ":" +
						tooltipValues.toString() + ":" +
						abilityRequirements.toString() + 
					" }"
				);
	}
	
	public int getAbilityID() {
		return abilityID;
	}
	public void setAbilityID(int abilityID) {
		this.abilityID = abilityID;
	}
	public int getClassID() {
		return classID;
	}
	public void setClassID(int classID) {
		this.classID = classID;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getMasteryPathID() {
		return masteryPathID;
	}
	public void setMasteryPathID(int masteryPathID) {
		this.masteryPathID = masteryPathID;
	}
	public int getRequiredMasteryRank() {
		return requiredMasteryRank;
	}
	public void setRequiredMasteryRank(int requiredMasteryRank) {
		this.requiredMasteryRank = requiredMasteryRank;
	}
	public int getApCost() {
		return apCost;
	}
	public void setApCost(int apCost) {
		this.apCost = apCost;
	}
	public boolean isChanneled() {
		return channeled;
	}
	public void setChanneled(boolean channeled) {
		this.channeled = channeled;
	}
	public double getCastTime() {
		return castTime;
	}
	public void setCastTime(double castTime) {
		this.castTime = castTime;
	}
	public double getCooldown() {
		return cooldown;
	}
	public void setCooldown(double cooldown) {
		this.cooldown = cooldown;
	}
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public String getBuffType() {
		return buffType;
	}
	public void setBuffType(String buffType) {
		this.buffType = buffType;
	}
	public String getTooltipText() {
		return tooltipText;
	}
	public void setTooltipText(String tooltipText) {
		this.tooltipText = tooltipText;
	}

	public int getIconID() {
		return iconID;
	}

	public void setIconID(int iconID) {
		this.iconID = iconID;
	}

	public TooltipValueList getTooltipValues() {
		return tooltipValues;
	}

	public void setTooltipValues(TooltipValueList tooltipValues) {
		this.tooltipValues = tooltipValues;
	}

	public AbilityRequirementList getAbilityRequirements() {
		return abilityRequirements;
	}

	public void setAbilityRequirements(AbilityRequirementList abilityRequirements) {
		this.abilityRequirements = abilityRequirements;
	}
	
	
	
}
