SELECT m.member_nm, m.member_id, t.title_nm, b.accession_no, bi.issue_dt, bi.due_dt, FLOOR(DATEDIFF (due_dt, issue_dt ) / 24 ) AS Duration_In_Months
FROM Book_Issue bi 
INNER JOIN Members m 
ON bi.member_id = m.member_id
INNER JOIN Books b
ON bi.accession_no = b.accession_no
INNER JOIN Titles t
ON b.title_id = t.title_id
WHERE ( DATEDIFF (due_dt , issue_dt) / 24 > 2 )
ORDER BY member_nm, title_nm; 

SELECT member_nm, LENGTH(member_nm) AS Maximum_Length 
FROM Members 
HAVING LENGTH(member_nm) = MAX(LENGTH(member_nm));	

SELECT COUNT(issue_dt) AS Books_Issued FROM book_issue;