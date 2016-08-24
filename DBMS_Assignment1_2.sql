CREATE DATABASE IF NOT EXISTS Library_Information_System;

USE Library_Information_System;

CREATE TABLE IF NOT EXISTS Members(
    member_id varchar(30) PRIMARY KEY,
    member_nm varchar(100),
    addressline1 varchar(200),
    addressline2 varchar(200),
    category char(15)
);

CREATE TABLE IF NOT EXISTS Subjects(
    subject_id varchar(30) PRIMARY KEY,
    subject_nm varchar(100)
);

CREATE TABLE IF NOT EXISTS Publishers(
    publisher_id varchar(30) PRIMARY KEY,
    publishers_nm varchar(100)
);

CREATE TABLE IF NOT EXISTS Titles(
    title_id varchar(30) PRIMARY KEY,
    title_nm varchar(100),
    subject_id varchar(30),
    publisher_id varchar(30),
    CONSTRAINT fk_titles_subject_id FOREIGN KEY (subject_id)
        REFERENCES subjects (subject_id) ON DELETE CASCADE,
    CONSTRAINT fk_titles_publisher_id FOREIGN KEY  (publisher_id)
        REFERENCES publishers (publisher_id) ON DELETE CASCADE
);

CREATE TABLE IF NOT EXISTS Books(
    purchase_dt varchar(30),
    accession_no varchar(100) PRIMARY KEY,
    title_id varchar(30),
    price varchar(200),
    status varchar(30),
  CONSTRAINT fk_books_title_id FOREIGN KEY (title_id)
        REFERENCES titles (title_id) ON DELETE CASCADE
);


CREATE TABLE IF NOT EXISTS Book_issue(
    issue_dt varchar(30),
    accession_no varchar(100),
    due_dt varchar(200),
    member_id varchar(30),
    PRIMARY KEY (`issue_dt`,`accession_no`,`member_id`),
    FOREIGN KEY fk_member_id (member_id)
        REFERENCES members (member_id) ON DELETE CASCADE,
    FOREIGN KEY (accession_no)
        REFERENCES books (accession_no) ON DELETE CASCADE
);


CREATE TABLE IF NOT EXISTS Author(
    author_id varchar(30) PRIMARY KEY,
    author_nm varchar(100)
);


CREATE TABLE IF NOT EXISTS Title_author(
    title_id varchar(30),
    author_id varchar(30),
    PRIMARY KEY (`title_id`,`author_id`),
    CONSTRAINT fk_title_author_title_id FOREIGN KEY (title_id)
        REFERENCES titles (title_id) ON DELETE CASCADE,
    CONSTRAINT fk_title_author_author_id FOREIGN KEY (author_id)
        REFERENCES author (author_id) ON DELETE CASCADE
);



CREATE TABLE IF NOT EXISTS Book_return(
    return_dt varchar(30),
    accession_no varchar(100),
    member_id varchar(30),
    issue_dt varchar(30),
    PRIMARY KEY (`member_id`,`accession_no`,`return_dt`),
    FOREIGN KEY (issue_dt)
        REFERENCES book_issue (issue_dt) ON DELETE CASCADE
);

SHOW TABLES;
set FOREIGN_KEY_CHECKS=0;

DROP TABLE members;

CREATE TABLE IF NOT EXISTS Members(
    member_id varchar(30) PRIMARY KEY,
    member_nm varchar(100),
    addressline1 varchar(200),
    addressline2 varchar(200),
    category char(15)
);

/* Creating references again for new member table*/
ALTER TABLE book_issue ADD 
CONSTRAINT fk_member_id_book_issue FOREIGN KEY (member_id) REFERENCES members (member_id);

ALTER TABLE book_return ADD 
CONSTRAINT fk_member_id_book_return FOREIGN KEY (member_id) REFERENCES members (member_id);

/* Setting foreign key contraint on */
set FOREIGN_KEY_CHECKS=1; 
