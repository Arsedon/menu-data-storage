DROP TABLE IF EXISTS menu;

CREATE TABLE menu (
                    id INT AUTO_INCREMENT  PRIMARY KEY,
                    img_path VARCHAR(250) NOT NULL,
                    alt_imp_name VARCHAR(250) NOT NULL,
                    title VARCHAR(250) NOT NULL,
                    description VARCHAR(250) NOT NULL,
                    price INTEGER(10) NOT NULL NULL
);