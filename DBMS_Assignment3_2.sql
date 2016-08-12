SELECT COUNT(*) AS Number_Of_Books_Purchased, s.subject_nm, s.subject_id FROM Subjects s
INNER JOIN Titles t ON t.subject_id = s.subject_id
INNER JOIN Books b ON b.title_id = t.title_id 
GROUP BY s.subject_nm;

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

SELECT b.accession_no, t.title_id, t.title_nm, b.price 
FROM Books b 
LEFT JOIN Titles t ON t.title_id = b.title_id 
HAVING b.price > (SELECT MIN(price) FROM Books); 
