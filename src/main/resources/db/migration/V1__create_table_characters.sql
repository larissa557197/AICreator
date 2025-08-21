CREATE TABLE characters (
    id BIGSERIAL PRIMARY KEY,
    name VARCHAR(40) NOT NULL,
    species VARCHAR(20) NOT NULL,
    starting_level SMALLINT NOT NULL,
    special_ability VARCHAR(60),
    bio VARCHAR(280),
    creation_date DATE
);