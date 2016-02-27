package org.returnofreckoning.builder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.returnofreckoning.builder.model.Ability;
import org.returnofreckoning.builder.model.AbilityRequirement;
import org.returnofreckoning.builder.model.AbilityRequirementList;
import org.returnofreckoning.builder.model.Class;
import org.returnofreckoning.builder.model.TooltipValue;
import org.returnofreckoning.builder.model.TooltipValueList;
import org.returnofreckoning.builder.utilities.DAOUtilities;

public class AbilityDAO implements iAbilityDAO {
	
	@Override
	public Ability getAbility(int abilityID) {
		
		Ability ability = new Ability();
		
		try (Connection conn = DAOUtilities.getConnection()) {
			String sql = "SELECT * FROM Abilities WHERE abilityID=?";
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, abilityID);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				ability.setAbilityID(abilityID);
				ability.setClassID(rs.getInt("classID"));
				ability.setName(rs.getString("name"));
				ability.setType(rs.getString("type"));
				ability.setMasteryPathID(rs.getInt("masteryPathID"));
				ability.setRequiredMasteryRank(rs.getInt("masteryRank"));
				ability.setApCost(rs.getInt("apCost"));
				ability.setChanneled(rs.getBoolean("channeled"));
				ability.setCastTime(rs.getDouble("castTime"));
				ability.setCooldown(rs.getDouble("cooldown"));
				ability.setRange(rs.getInt("range"));
				ability.setBuffType(rs.getString("buffType"));
				ability.setTooltipText(rs.getString("tooltipText"));
				ability.setIconID(rs.getInt("iconID"));
				ability.setTooltipValues(getTooltipValues(abilityID));
				ability.setAbilityRequirements(getAbilityRequirements(abilityID));
			}
		} catch (SQLException e) {
			System.out.println("Could not retrieve records for ability " + abilityID);
			e.printStackTrace();
		}
		return ability;
	}

	@Override
	public Class getAbilitiesForClass(int classID) {
		Class rorclass = new Class();
		
		int bitfieldClassID = (int) Math.pow(2, classID - 1);
		
		String sql1 = "SELECT * FROM Classes WHERE classID=?";
		String sql2 = "SELECT * FROM Abilities WHERE (classID & ?) = ? ORDER BY name";
		
		try (Connection conn = DAOUtilities.getConnection()){
			PreparedStatement stmt1 = conn.prepareStatement(sql1);
			
			stmt1.setInt(1, classID);
			ResultSet rs = stmt1.executeQuery();
			
			while (rs.next()) {
				rorclass.setClassID(classID);
				rorclass.setClassName(rs.getString("name"));
			}
			
			PreparedStatement stmt2 = conn.prepareStatement(sql2);
			stmt2.setInt(1, bitfieldClassID);
			stmt2.setInt(2, bitfieldClassID);
			rs = stmt2.executeQuery();
			
			while (rs.next()) {
				Ability ability = new Ability();
				ability.setAbilityID(rs.getInt("abilityID"));
				ability.setClassID(rs.getInt("classID"));
				ability.setName(rs.getString("name"));
				ability.setType(rs.getString("type"));
				ability.setMasteryPathID(rs.getInt("masteryPathID"));
				ability.setRequiredMasteryRank(rs.getInt("masteryRank"));
				ability.setApCost(rs.getInt("apCost"));
				ability.setChanneled(rs.getBoolean("channeled"));
				ability.setCastTime(rs.getDouble("castTime"));
				ability.setCooldown(rs.getDouble("cooldown"));
				ability.setRange(rs.getInt("range"));
				ability.setBuffType(rs.getString("buffType"));
				ability.setTooltipText(rs.getString("tooltipText"));
				ability.setIconID(rs.getInt("iconID"));
				ability.setTooltipValues(getTooltipValues(ability.getAbilityID()));
				ability.setAbilityRequirements(getAbilityRequirements(ability.getAbilityID()));
				
				rorclass.getAbilities().add(ability);
			}
			
		} catch (SQLException e) {
			System.out.println("Could not retrieve abilities list for class " + classID);
			e.printStackTrace();
		}
		
		return rorclass;
	}

	@Override
	public Class getAbilitiesForClass(int classID, String type) {
		Class rorclass = new Class();

		int bitfieldClassID = (int) Math.pow(2, classID - 1);

		String sql1 = "SELECT * FROM Classes WHERE classID=?";
		String sql2 = "SELECT * FROM Abilities WHERE (classID & ?) = ? AND type=? ORDER BY name";
		
		try (Connection conn = DAOUtilities.getConnection()){
			PreparedStatement stmt1 = conn.prepareStatement(sql1);
			
			stmt1.setInt(1, bitfieldClassID);
			stmt1.setInt(2, bitfieldClassID);
			ResultSet rs = stmt1.executeQuery();
			
			while (rs.next()) {
				rorclass.setClassID(classID);
				rorclass.setClassName(rs.getString("name"));
			}
			
			PreparedStatement stmt2 = conn.prepareStatement(sql2);
			
			stmt2.setInt(1, classID);
			stmt2.setString(2, type);
			rs = stmt2.executeQuery();

			while (rs.next()) {
				Ability ability = new Ability();
				ability.setAbilityID(rs.getInt("abilityID"));
				ability.setClassID(rs.getInt("classID"));
				ability.setName(rs.getString("name"));
				ability.setType(rs.getString("type"));
				ability.setMasteryPathID(rs.getInt("masteryPathID"));
				ability.setRequiredMasteryRank(rs.getInt("masteryRank"));
				ability.setApCost(rs.getInt("apCost"));
				ability.setChanneled(rs.getBoolean("channeled"));
				ability.setCastTime(rs.getDouble("castTime"));
				ability.setCooldown(rs.getDouble("cooldown"));
				ability.setRange(rs.getInt("range"));
				ability.setBuffType(rs.getString("buffType"));
				ability.setTooltipText(rs.getString("tooltipText"));
				ability.setIconID(rs.getInt("iconID"));
				ability.setTooltipValues(getTooltipValues(ability.getAbilityID()));
				ability.setAbilityRequirements(getAbilityRequirements(ability.getAbilityID()));
				
				rorclass.getAbilities().add(ability);
			}
			
		} catch (SQLException e) {
			System.out.println("Could not retrieve abilities list for class " + classID);
			e.printStackTrace();
		}
		
		return rorclass;
	}
	
	
	private TooltipValueList getTooltipValues(int abilityID) {
		TooltipValueList ttvList = new TooltipValueList();
		
		try (Connection conn = DAOUtilities.getConnection()) {
			String sql = "SELECT * FROM Tooltip_Values WHERE abilityID=? ORDER BY position";
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, abilityID);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				TooltipValue ttv = new TooltipValue();
				ttv.setPosition(rs.getInt("position"));
				ttv.setStatID(rs.getInt("statID"));
				ttv.setStatScale(rs.getDouble("statScale"));
				ttv.setWeaponScale(rs.getDouble("weaponScale"));
				ttv.setCastTimeScale(rs.getDouble("castTimeScale"));
				ttv.setLevelOneValue(rs.getInt("levelOneValue"));
				ttv.setLevelPattern(rs.getString("levelPattern"));
				
				ttvList.add(ttv);
			}
		} catch (SQLException e) {
			System.out.println("Could not retrieve tooltip values for ability " + abilityID);
			e.printStackTrace();
		}
		return ttvList;
	}
	
	private AbilityRequirementList getAbilityRequirements(int abilityID) {
		AbilityRequirementList abrList = new AbilityRequirementList();
		
		try (Connection conn = DAOUtilities.getConnection()) {
			String sql = "SELECT * FROM Ability_Requirements WHERE abilityID=? ORDER BY position";
			PreparedStatement stmt = conn.prepareStatement(sql);
			
			stmt.setInt(1, abilityID);
			
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				AbilityRequirement abr = new AbilityRequirement();
				abr.setPosition(rs.getInt("position"));
				abr.setText(rs.getString("text"));
				
				abrList.add(abr);
			}
		} catch (SQLException e) {
			System.out.println("Could not retrieve ability requirements for ability " + abilityID);
			e.printStackTrace();
		}
		return abrList;
	}
}
