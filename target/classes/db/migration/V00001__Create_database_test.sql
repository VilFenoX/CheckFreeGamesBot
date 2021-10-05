-- ensure that the table with this name is removed before creating a new one.
DROP TABLE IF EXISTS tg_user;

-- Create tg_user table
CREATE TABLE tg_user (
                         chat_id VARCHAR(100),
                         active BOOLEAN
);
-- add PRIMARY KEY FOR tg_user
ALTER TABLE tg_user ADD PRIMARY KEY (chat_id);

CREATE TABLE posts (
                           id INT,
                           title VARCHAR,
                           href VARCHAR,
                           link_image VARCHAR,
                           user_chat_id INT,
                           PRIMARY KEY (id)
);