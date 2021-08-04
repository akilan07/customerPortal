CREATE TABLE customer(cust_id INT PRIMARY KEY AUTO_INCREMENT,
    cust_username VARCHAR(255), cust_name INT);
CREATE TABLE customer_password(cust_id INT,
    password VARCHAR(255), FOREIGN KEY (cust_id) REFERENCES customer(cust_id));
