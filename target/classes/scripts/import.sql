INSERT INTO Classes VALUES(1, 'Ironbreaker');
INSERT INTO Classes VALUES(2, 'Slayer');
INSERT INTO Classes VALUES(3, 'Runepriest');
INSERT INTO Classes VALUES(4, 'Engineer');
INSERT INTO Classes VALUES(5, 'Black Orc');
INSERT INTO Classes VALUES(6, 'Choppa');
INSERT INTO Classes VALUES(7, 'Shaman');
INSERT INTO Classes VALUES(8, 'Squig Herder');
INSERT INTO Classes VALUES(9, 'Witch Hunter');
INSERT INTO Classes VALUES(10, 'Knight of the Blazing Sun');
INSERT INTO Classes VALUES(11, 'Bright Wizard');
INSERT INTO Classes VALUES(12, 'Warrior Priest');
INSERT INTO Classes VALUES(13, 'Chosen');
INSERT INTO Classes VALUES(14, 'Marauder');
INSERT INTO Classes VALUES(15, 'Zealot');
INSERT INTO Classes VALUES(16, 'Magus');
INSERT INTO Classes VALUES(17, 'Swordmaster');
INSERT INTO Classes VALUES(18, 'Shadow Warrior');
INSERT INTO Classes VALUES(19, 'White Lion');
INSERT INTO Classes VALUES(20, 'Archmage');
INSERT INTO Classes VALUES(21, 'Blackguard');
INSERT INTO Classes VALUES(22, 'Witch Elf');
INSERT INTO Classes VALUES(23, 'Disciple of Khaine');
INSERT INTO Classes VALUES(24, 'Sorceress');



/* *****************************************************
 * 					Import Abilities
 * ***************************************************** */

-- Classes
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/1_IB_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/2_SL_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/4_RP_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/8_EN_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/16_BO_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/32_CH_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/64_SH_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/128_SQ_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/256_WH_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/512_KN_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/1024_BW_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/2048_WP_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/4096_CO_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/8192_MR_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/16384_ZE_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/32768_MA_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/65536_SM_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/131072_SW_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/262144_WL_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/524288_AM_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/1048576_BG_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/2097152_WE_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/4194304_DK_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/8388608_SO_Abilities.csv');

-- Races
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/15_DW_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/48_OR_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/192_GO_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/3840_EM_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/61440_CW_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/983040_HE_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/15728640_DE_Abilities.csv');

-- Archetypes
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/131208_pRDPS_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/270370_MDPS_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/1118737_Tank_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/2097408_Rogue_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/8422400_mRDPS_Abilities.csv');
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/4737092_Healer_Abilities.csv');

-- Globals
INSERT INTO Abilities SELECT * FROM CSVREAD('classpath:data/16777215_Global_Abilities.csv');


/* *****************************************************
 * 					Import Tooltip Values
 * ***************************************************** */

-- Classes
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/1_IB_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/2_SL_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/4_RP_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/8_EN_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/16_BO_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/32_CH_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/64_SH_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/128_SQ_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/256_WH_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/512_KN_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/1024_BW_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/2048_WP_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/4096_CO_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/8192_MR_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/16384_ZE_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/32768_MA_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/65536_SM_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/131072_SW_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/262144_WL_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/524288_AM_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/1048576_BG_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/2097152_WE_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/4194304_DK_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/8388608_SO_TooltipValues.csv');

-- Races
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/15_DW_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/48_OR_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/192_GO_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/3840_EM_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/61440_CW_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/983040_HE_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/15728640_DE_TooltipValues.csv');

-- Archetypes
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/131208_pRDPS_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/270370_MDPS_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/1118737_Tank_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/2097408_Rogue_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/8422400_mRDPS_TooltipValues.csv');
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/4737092_Healer_TooltipValues.csv');

-- Globals
INSERT INTO Tooltip_Values SELECT * FROM CSVREAD('classpath:data/16777215_Global_TooltipValues.csv');


/* *****************************************************
 * 					Import Requirements
 * ***************************************************** */

-- Classes
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/1_IB_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/2_SL_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/4_RP_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/8_EN_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/16_BO_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/32_CH_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/64_SH_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/128_SQ_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/256_WH_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/512_KN_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/1024_BW_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/2048_WP_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/4096_CO_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/8192_MR_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/16384_ZE_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/32768_MA_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/65536_SM_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/131072_SW_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/262144_WL_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/524288_AM_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/1048576_BG_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/2097152_WE_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/4194304_DK_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/8388608_SO_AbilityRequirements.csv');

-- Races
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/15_DW_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/48_OR_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/192_GO_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/3840_EM_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/61440_CW_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/983040_HE_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/15728640_DE_AbilityRequirements.csv');

-- Archetypes
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/131208_pRDPS_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/270370_MDPS_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/1118737_Tank_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/2097408_Rogue_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/8422400_mRDPS_AbilityRequirements.csv');
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/4737092_Healer_AbilityRequirements.csv');

-- Globals
INSERT INTO Ability_Requirements SELECT * FROM CSVREAD('classpath:data/16777215_Global_AbilityRequirements.csv');

-- INSERT INTO Tooltip_Values VALUES(1383, 1, 'Ancestor''s Fury','Ability',1,5,0,false,0,0,0,'Blessing','The memory of your ancestors bolsters your resolve, increasing Strength by [1] and chance to critically hit by 10% for 10 seconds. Your oath friend is affected as well if they are within 50 feet of you.');
-- INSERT INTO Tooltip_Values VALUES(1383,1,0,0,0,3);
-- INSERT INTO Ability_Requirements VALUES(1383,1,'Costs 15 Grudge');
-- INSERT INTO Ability_Requirements VALUES(1383,2,'Requires 5 points in Path of Vengeance');