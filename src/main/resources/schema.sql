CREATE TABLE users (
    id IDENTITY,
    name VARCHAR NOT NULL
);

CREATE TABLE matches (
    id IDENTITY,
    user1 VARCHAR,
    user2 VARCHAR,
    user1Hand VARCHAR,
    user2Hand VARCHAR
);
