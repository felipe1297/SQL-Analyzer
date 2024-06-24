-- Drop tables if they exist
DROP TABLE IF EXISTS characters, jutsus, character_jutsu, clans, villages;

-- Create the tables
CREATE TABLE villages (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL
);

CREATE TABLE clans (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    village_id INT NOT NULL,
    FOREIGN KEY (village_id) REFERENCES villages(id)
);

CREATE TABLE characters (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    clan_id INT,
    village_id INT NOT NULL,
    FOREIGN KEY (clan_id) REFERENCES clans(id),
    FOREIGN KEY (village_id) REFERENCES villages(id)
);

CREATE TABLE jutsus (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    type VARCHAR(50) NOT NULL
);

CREATE TABLE character_jutsu (
    character_id INT NOT NULL,
    jutsu_id INT NOT NULL,
    PRIMARY KEY (character_id, jutsu_id),
    FOREIGN KEY (character_id) REFERENCES characters(id),
    FOREIGN KEY (jutsu_id) REFERENCES jutsus(id)
);

-- Insert data into the tables
INSERT INTO villages (name) VALUES ('Konoha'), ('Suna'), ('Kiri'), ('Kumo'), ('Iwa');

INSERT INTO clans (name, village_id) VALUES 
('Uchiha', 1), 
('Hyuga', 1), 
('Akimichi', 1), 
('Nara', 1),
('Inuzuka', 1),
('Yamanaka', 1);

INSERT INTO characters (name, clan_id, village_id) VALUES 
('Naruto Uzumaki', NULL, 1), 
('Sasuke Uchiha', 1, 1), 
('Sakura Haruno', NULL, 1),
('Kakashi Hatake', NULL, 1),
('Hinata Hyuga', 2, 1),
('Shikamaru Nara', 4, 1),
('Kiba Inuzuka', 5, 1),
('Choji Akimichi', 3, 1);

INSERT INTO jutsus (name, type) VALUES 
('Rasengan', 'Ninjutsu'), 
('Chidori', 'Ninjutsu'), 
('Shadow Clone Technique', 'Ninjutsu'), 
('Amaterasu', 'Ninjutsu'), 
('Byakugan', 'DoJutsu');

INSERT INTO character_jutsu (character_id, jutsu_id) VALUES 
(1, 1), 
(1, 3), 
(2, 2), 
(2, 4), 
(5, 5);

-- Create indexes
CREATE INDEX idx_clan_name ON clans(name);
CREATE INDEX idx_character_name ON characters(name);

-- Create a view
CREATE VIEW character_details AS
SELECT 
    characters.name AS character_name,
    clans.name AS clan_name,
    villages.name AS village_name
FROM 
    characters
LEFT JOIN clans ON characters.clan_id = clans.id
JOIN villages ON characters.village_id = villages.id;

-- Create a stored procedure
CREATE OR REPLACE FUNCTION get_characters_by_village(village_name_param VARCHAR)
RETURNS TABLE(character_name VARCHAR, clan_name VARCHAR, village_name VARCHAR) AS $$
BEGIN
    RETURN QUERY 
    SELECT 
        characters.name, 
        clans.name, 
        villages.name
    FROM 
        characters
    LEFT JOIN clans ON characters.clan_id = clans.id
    JOIN villages ON characters.village_id = villages.id
    WHERE villages.name = village_name_param;
END;
$$ LANGUAGE plpgsql;

-- Create another stored procedure
CREATE OR REPLACE FUNCTION add_jutsu_to_character(character_name VARCHAR, jutsu_name VARCHAR)
RETURNS VOID AS $$
DECLARE
    character_id INT;
    jutsu_id INT;
BEGIN
    SELECT id INTO character_id FROM characters WHERE name = character_name;
    SELECT id INTO jutsu_id FROM jutsus WHERE name = jutsu_name;

    IF character_id IS NULL THEN
        RAISE EXCEPTION 'Character % not found', character_name;
    END IF;

    IF jutsu_id IS NULL THEN
        RAISE EXCEPTION 'Jutsu % not found', jutsu_name;
    END IF;

    INSERT INTO character_jutsu (character_id, jutsu_id) VALUES (character_id, jutsu_id);
END;
$$ LANGUAGE plpgsql;
