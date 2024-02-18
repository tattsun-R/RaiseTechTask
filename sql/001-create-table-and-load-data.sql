DROP TABLE IF EXISTS pokemon_index;

CREATE TABLE pokemon_index (
  id int unsigned AUTO_INCREMENT,
  name VARCHAR(20) NOT NULL,
  type1 VARCHAR(20) NOT NULL,
  type2 VARCHAR(20),
  PRIMARY KEY(id)
);

INSERT INTO pokemon_index(name, type1, type2) VALUES ("フシギダネ", "くさ","どく");
INSERT INTO pokemon_index(name, type1, type2) VALUES ("フシギソウ", "くさ","どく");
INSERT INTO pokemon_index(name, type1, type2) VALUES ("フシギバナ", "くさ","どく");
INSERT INTO pokemon_index(name, type1, type2) VALUES ("ヒトカゲ", "ほのお","");
INSERT INTO pokemon_index(name, type1, type2) VALUES ("リザード", "ほのお","");
INSERT INTO pokemon_index(name, type1, type2) VALUES ("リザードン", "ほのお","ひこう");
INSERT INTO pokemon_index(name, type1, type2) VALUES ("ゼニガメ", "みず","");
INSERT INTO pokemon_index(name, type1, type2) VALUES ("カメール", "みず","");
INSERT INTO pokemon_index(name, type1, type2) VALUES ("カメックス", "みず","");

