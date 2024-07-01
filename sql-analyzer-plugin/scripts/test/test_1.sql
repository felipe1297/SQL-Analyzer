-- NDB001: Seleccionar todas las columnas
-- ⚠️ Selecting all columns can be inefficient and lead to excessive data retrieval.
SELECT * FROM characters WHERE village_id = 1;
SELECT * FROM clans WHERE name LIKE 'U%';

-- 💡 Select only the necessary columns.
SELECT id, name FROM characters WHERE village_id = 1;
SELECT id, name FROM clans WHERE name LIKE 'U%';

-- NDB002: Subconsultas anidadas
-- ⚠️ Nested subqueries can be inefficient and hard to read.
SELECT * FROM (SELECT * FROM characters WHERE village_id = 1) AS sub WHERE sub.name LIKE 'Naruto%';

-- 💡 Use JOINs when possible.
SELECT characters.id, characters.name FROM characters WHERE village_id = 1 AND name LIKE 'Naruto%';

-- NDB003: JOIN sin condición
-- ⚠️ Performing a JOIN without a condition can result in a Cartesian product.
SELECT * FROM characters, jutsus;

-- 💡 Ensure each JOIN has a proper join condition.
SELECT characters.name, jutsus.name FROM characters 
JOIN character_jutsu ON characters.id = character_jutsu.character_id 
JOIN jutsus ON character_jutsu.jutsu_id = jutsus.id;

-- NDB004: Funciones en cláusulas WHERE
-- ⚠️ Applying functions to columns in WHERE clause can prevent index usage.
SELECT * FROM characters WHERE UPPER(name) = 'NARUTO UZUMAKI';

-- 💡 Avoid using functions in WHERE clause.
SELECT * FROM characters WHERE name = 'Naruto Uzumaki';

-- NDB005: Condiciones siempre falsas o verdaderas
-- ⚠️ Conditions that are always false or true, making the query nonsensical.
SELECT * FROM characters WHERE 1 = 0;

-- 💡 Review the logic of the conditions.
SELECT * FROM characters WHERE village_id = 1;

-- NDB006: Uso excesivo de DISTINCT
-- ⚠️ Using DISTINCT to hide duplicate issues instead of addressing the root cause.
SELECT DISTINCT name FROM characters;

-- 💡 Investigate and solve the cause of duplicates.
SELECT name FROM characters GROUP BY name HAVING COUNT(*) = 1;

-- NDB007: Uso excesivo de OR
-- ⚠️ Excessive use of OR can prevent effective use of indexes.
SELECT * FROM characters WHERE name = 'Naruto Uzumaki' OR name = 'Sasuke Uchiha';

-- 💡 Consider rewriting the query using IN.
SELECT * FROM characters WHERE name IN ('Naruto Uzumaki', 'Sasuke Uchiha');

-- NDB008: Funciones agregadas sin GROUP BY
-- ⚠️ Using aggregate functions without GROUP BY clause can lead to unexpected results.
SELECT COUNT(*), name FROM characters;

-- 💡 Ensure aggregate functions have an appropriate GROUP BY clause.
SELECT COUNT(*), name FROM characters GROUP BY name;

-- NDB009: OFFSET sin LIMIT
-- ⚠️ OFFSET without LIMIT can lead to retrieving large amounts of unnecessary data.
SELECT * FROM characters OFFSET 10;

-- 💡 Always use LIMIT with OFFSET.
SELECT * FROM characters LIMIT 10 OFFSET 10;

-- NDB010: Alias innecesarios o poco claros
-- ⚠️ Using unclear or unnecessary aliases can make the code harder to read.
SELECT c.name FROM characters c;

-- 💡 Use clear aliases only when necessary.
SELECT characters.name FROM characters;

-- DB001: Falta de índices en columnas usadas en JOINs
-- ⚠️ Lack of indexes on columns used in JOINs can lead to performance degradation.
SELECT characters.name, clans.name FROM characters 
JOIN clans ON characters.clan_id = clans.id;

-- 💡 Ensure that indexes exist on columns used in JOINs.
-- Assuming an index exists on characters(clan_id) and clans(id)
SELECT characters.name, clans.name FROM characters 
JOIN clans ON characters.clan_id = clans.id;

-- DB002: Falta de índices en columnas usadas en cláusulas WHERE
-- ⚠️ Lack of indexes on columns used in WHERE clauses can lead to full table scans.
SELECT * FROM characters WHERE name = 'Naruto Uzumaki';

-- 💡 Ensure that indexes exist on columns used in WHERE clauses.
-- Assuming an index exists on characters(name)
SELECT * FROM characters WHERE name = 'Naruto Uzumaki';
