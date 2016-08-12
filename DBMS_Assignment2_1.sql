USE Library_Information_System;

/*Qu: Write a select command to display all the columns of members table*/

SELECT member_id ,  member_nm , addressline1 , addressline2 , category FROM Members;

/* Qu: Write a select command to display member nm , member id , and category columns*/

SELECT member_id ,  member_nm , category FROM Members;

/*Qu: Write a select command to display member nm , member id , and category where category is F*/

SELECT member_id ,  member_nm , category FROM Members WHERE category='F';

/*Qu: Write a select command to display various categories of members*/

SELECT category FROM Members;

/*Qu: Write a select command to display member nm and category in descending order of member nm*/

SELECT member_nm , category FROM Members ORDER BY member_nm DESC;

/*Qu: Write a select command to display titles and their publishers*/
SELECT title_nm ,  publisher_id FROM titles;

/*Qu:  Write a select command to display the number of members present in each category*/
SELECT category, COUNT(member_id) as Total
FROM members
GROUP BY category;

/*Qu: write a select command to display nm of members who belong to the same category as Keshav Sharma*/
SELECT m.member_nm FROM Members m
INNER JOIN Members e
ON e.member_nm = 'Keshav Sharma' AND m.category=e.category ;

/*Qu: write a select command to display information on all the books issued*/
SELECT issue_dt , accession_no , member_id ,
IFNULL(return_dt,'Book Not Returned') as Return_Date  
FROM book_return;