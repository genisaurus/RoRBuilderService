CREATE TABLE IF NOT EXISTS Classes (
	classID INT,
	name VARCHAR(32),
	PRIMARY KEY(classID)
);


CREATE TABLE IF NOT EXISTS Abilities ( 
	abilityID INT,
	classID INT,
	name VARCHAR(64),
	type VARCHAR(32),
	masteryPathID INT,
	masteryRank INT,
	apCost INT,
	channeled BOOLEAN,
	castTime DECIMAL(6,2),
	cooldown DECIMAL(6,2),
	range INT,
	buffType VARCHAR(32),
	tooltipText VARCHAR(1024),
	iconID INT,
	PRIMARY KEY(abilityID, classID)
	--,FOREIGN KEY(classID) REFERENCES Classes(classID)
);

CREATE TABLE IF NOT EXISTS Tooltip_Values ( 
	abilityID INT,
	position INT,
	statID INT,
	statScale DECIMAL(6,2),
	weaponScale DECIMAL(6,2),
	castTimeScale DECIMAL(6,2),
	levelOneValue INT,
	levelPattern VARCHAR(1024),
	PRIMARY KEY(abilityID, position),
	FOREIGN KEY(abilityID) REFERENCES Abilities(abilityID)
);

CREATE TABLE IF NOT EXISTS Ability_Requirements ( 
	abilityID INT,
	position INT,
	text VARCHAR(64),
	PRIMARY KEY (abilityID, position),
	FOREIGN KEY(abilityID) REFERENCES Abilities(abilityID)
);