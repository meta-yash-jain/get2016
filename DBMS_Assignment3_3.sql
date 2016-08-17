
SELECT GROUP_CONCAT(DISTINCT m.category) AS Categories, GROUP_CONCAT(m.member_count) AS No_Of_Categories FROM (SELECT category, count(*) AS member_count FROM members GROUP BY category) AS m;

SELECT bi.accession_no, b.title_id, t.title_nm FROM Book_issue bi
INNER JOIN Books b ON b.accession_no = bi.accession_no
INNER JOIN Titles t ON t.title_id = b.title_id
GROUP BY bi.accession_no
HAVING COUNT(bi.accession_no) > 2;

SELECT b.accession_no, b.title_id,  b.purchase_dt, b.price, bi.issue_dt, m.member_id, m.category FROM Book_issue bi 
INNER JOIN Books b ON bi.accession_no = b.accession_no 
INNER JOIN Members m ON m.member_id = bi.member_id
HAVING m.category <> 'F';

SELECT a.author_id, a.author_nm FROM Author a
INNER JOIN Title_Author ta ON ta.author_id = a.author_id
INNER JOIN Books b ON b.title_id = ta.title_id;
