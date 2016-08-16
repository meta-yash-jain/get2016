USE Library_Information_System;

CREATE VIEW issuedBookDetails AS
(
SELECT m.member_nm,bi.accession_no,b.title_id,t.title_nm 
FROM members m,book_issue bi,books b,titles t
WHERE m.member_id=bi.member_id && bi.accession_no=b.accession_no && b.title_id=t.title_id
);

CREATE VIEW membersView AS
(
SELECT member_id,member_nm,CASE 
WHEN category="F" THEN 'Faculty'
WHEN category="S" THEN 'Student'
ELSE "Others" END AS Full_Description FROM members
);

CREATE VIEW BooksIssueDetails AS (
SELECT s.subject_nm AS Subject,t.title_nm AS Title,m.member_nm AS Member_name,m.category AS Category,bi.issue_dt AS Issue_Date,bi.due_dt AS Due_Dt 
FROM members m,book_issue bi,books b,titles t,subjects s
WHERE m.member_id=bi.member_id && bi.accession_no=b.accession_no && b.title_id=t.title_id && t.subject_id=s.subject_id
);