CREATE DATABASE blackjack;
USE blackjack;
CREATE TABLE userinfo (
    id INT NOT NULL AUTO_INCREMENT,
    nick VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    pass VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb4_general_ci',
    balance INT NOT NULL,
    PRIMARY KEY (id) USING BTREE
)
COLLATE='utf8mb4_general_ci'
ENGINE=InnoDB
AUTO_INCREMENT=0
;
