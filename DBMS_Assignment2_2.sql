USE Library_Information_System;


SELECT b.issue_dt , b.accession_no , b.member_id , m.member_nm , 
IFNULL(return_dt,'Book Not Returned') as Return_Date  
FROM book_return b
LEFT JOIN Members m
ON b.member_id = m.member_id
ORDER BY issue_dt DESC ,member_nm DESC;