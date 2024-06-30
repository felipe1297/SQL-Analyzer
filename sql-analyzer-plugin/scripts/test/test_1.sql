select abc from ffft;
SELECT * FROM users OFFSET 10;
SELECT COUNT(*), name FROM users;
SELECT * FROM users WHERE name = 'John' OR name = 'Jane';
SELECT distinct a FROM users;
SELECT * FROM users WHERE UPPER(name) = 'JOHN';
select * from (select * from a, b);
SELECT a FROM users, orders where (select distinct a from a);
SELECT a FROM users, orders where 1 = 1;