package org.returnofreckoning.builder.model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement()
@XmlAccessorType(XmlAccessType.FIELD)
public class TooltipValueList {

	@XmlElement(name="tooltipValue")
	private ArrayList<TooltipValue> tooltipValueList = new ArrayList<>();

	public ArrayList<TooltipValue> getTooltipValueList() {
		return tooltipValueList;
	}

	public void setTooltipValueList(ArrayList<TooltipValue> tooltipValueList) {
		this.tooltipValueList = tooltipValueList;
	}
	
	public void add(TooltipValue ttv) {
		this.tooltipValueList.add(ttv);
	}
	
	public String toString() {
		String output = new String("{ ");
		for (TooltipValue ttv : this.tooltipValueList)
			output += ttv.toString();
		output += " }";
		return output;
	}
}
