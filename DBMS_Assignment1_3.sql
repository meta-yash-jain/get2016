USE Library_Information_System;

INSERT INTO Members VALUES ('mid1', 'yash', 'addresss1', 'address2', 'category1');
INSERT INTO Members VALUES ('mid2', 'yash', 'addresss1', 'address2', 'category2');
INSERT INTO Members VALUES ('mid3', 'yash', 'addresss1', 'address2', 'category3');
INSERT INTO Members VALUES ('mid4', 'yash', 'addresss1', 'address2', 'category4');
INSERT INTO Members VALUES ('mid5', 'yash', 'addresss1', 'address2', 'category5');
INSERT INTO Members VALUES ('mid6', 'yash', 'addresss1', 'address2', 'category6');

INSERT INTO Subjects VALUES ('sub_id_1', 'DBMS');
INSERT INTO Subjects VALUES ('sub_id_2', 'DAA');
INSERT INTO Subjects VALUES ('sub_id_3', 'CN');
INSERT INTO Subjects VALUES ('sub_id_4', 'CA');
INSERT INTO Subjects VALUES ('sub_id_5', 'TOC');
INSERT INTO Subjects VALUES ('sub_id_6', 'ADBMS');

INSERT INTO Publishers VALUES ('pub_id_1', 'publisher1');
INSERT INTO Publishers VALUES ('pub_id_2', 'publisher2');
INSERT INTO Publishers VALUES ('pub_id_3', 'publisher3');
INSERT INTO Publishers VALUES ('pub_id_4', 'publisher4');
INSERT INTO Publishers VALUES ('pub_id_5', 'publisher5');
INSERT INTO Publishers VALUES ('pub_id_6', 'publisher6');

INSERT INTO Titles VALUES ('title_id_1', 'title1', 'sub_id_1', 'pub_id_1');
INSERT INTO Titles VALUES ('title_id_2', 'title2', 'sub_id_2', 'pub_id_2');
INSERT INTO Titles VALUES ('title_id_3', 'title3', 'sub_id_3', 'pub_id_3');
INSERT INTO Titles VALUES ('title_id_4', 'title4', 'sub_id_4', 'pub_id_4');
INSERT INTO Titles VALUES ('title_id_5', 'title5', 'sub_id_5', 'pub_id_5');
INSERT INTO Titles VALUES ('title_id_6', 'title6', 'sub_id_6', 'pub_id_6');

INSERT INTO Books VALUES ('22-04-2016', 'ace_no_1', 'title_id_1', '100','Booked');
INSERT INTO Books VALUES ('25-04-2016', 'ace_no_2', 'title_id_2', '200','Booked');
INSERT INTO Books VALUES ('22-05-2016', 'ace_no_3', 'title_id_3', '300','Booked');
INSERT INTO Books VALUES ('21-06-2016', 'ace_no_4', 'title_id_4', '400','Booked');
INSERT INTO Books VALUES ('22-07-2016', 'ace_no_5', 'title_id_5', '500','Booked');
INSERT INTO Books VALUES ('29-09-2016', 'ace_no_6', 'title_id_6', '600','Booked');

INSERT INTO Book_issue VALUES ('10-08-2016', 'ace_no_1', '25-08-2016', 'mid1');
INSERT INTO Book_issue VALUES ('11-08-2016', 'ace_no_2', '26-08-2016', 'mid2');
INSERT INTO Book_issue VALUES ('12-08-2016', 'ace_no_3', '27-08-2016', 'mid3');
INSERT INTO Book_issue VALUES ('13-08-2016', 'ace_no_4', '28-08-2016', 'mid4');
INSERT INTO Book_issue VALUES ('14-08-2016', 'ace_no_5', '29-08-2016', 'mid5');
INSERT INTO Book_issue VALUES ('15-08-2016', 'ace_no_6', '30-08-2016', 'mid6');

INSERT INTO Author VALUES ('author_id_1', 'yash');
INSERT INTO Author VALUES ('author_id_2', 'kritik');
INSERT INTO Author VALUES ('author_id_3', 'ajinkya');
INSERT INTO Author VALUES ('author_id_4', 'rohit');
INSERT INTO Author VALUES ('author_id_5', 'nikhil');
INSERT INTO Author VALUES ('author_id_6', 'rahul');

INSERT INTO Title_author VALUES ('title_id_1', 'author_id_1');
INSERT INTO Title_author VALUES ('title_id_2', 'author_id_2');
INSERT INTO Title_author VALUES ('title_id_3', 'author_id_3');
INSERT INTO Title_author VALUES ('title_id_4', 'author_id_4');
INSERT INTO Title_author VALUES ('title_id_5', 'author_id_5');
INSERT INTO Title_author VALUES ('title_id_6', 'author_id_6');

INSERT INTO Book_return VALUES ('15-08-2016', 'ace_no_1', 'mid1', '25-08-2016');
INSERT INTO Book_return VALUES ('16-08-2016', 'ace_no_2', 'mid2', '26-08-2016');
INSERT INTO Book_return VALUES ('17-08-2016', 'ace_no_3', 'mid3', '27-08-2016');
INSERT INTO Book_return VALUES ('18-08-2016', 'ace_no_4', 'mid4', '28-08-2016');
INSERT INTO Book_return VALUES ('19-08-2016', 'ace_no_5', 'mid5', '29-08-2016');
INSERT INTO Book_return VALUES ('25-08-2016', 'ace_no_6', 'mid6', '30-08-2016');

