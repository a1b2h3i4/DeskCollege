--pLAYING WITH VARIABLES;
DECLARE 
   -- Global variables  
   num1 number := 95;  
   num2 number := 85;  
BEGIN  
   dbms_output.put_line('Outer Variable num1: ' || num1); 
   dbms_output.put_line('Outer Variable num2: ' || num2); 
   DECLARE  
      -- Local variables 
      num1 number := 195;  
      num2 number := 185;  
   BEGIN  
      dbms_output.put_line('Inner Variable num1: ' || num1); 
      dbms_output.put_line('Inner Variable num2: ' || num2); 
   END;
      dbms_output.put_line('Inner Variable num1: ' || num1); 
      dbms_output.put_line('Inner Variable num2: ' || num2);  
END;
--Working with variables
DECLARE 
   pi constant number := 3.14;
   radius number(5,2);
   perimeter number(5,2);
BEGIN  
    radius:=5;
    perimeter:=2*pi*radius;
   dbms_output.put_line('Param is: ' || perimeter);
   END;
   
--Working with Operators

DECLARE 
   a number (2) := 21; 
   b number (2) := 10; 
   PROCEDURE compare (value  varchar2,  pattern varchar2 ) is 
BEGIN 
   IF value LIKE pattern THEN 
      dbms_output.put_line ('True'); 
   ELSE 
      dbms_output.put_line ('False'); 
   END IF; 
END;  
BEGIN  
   dbms_output.put_line( 10 + 5);
    IF (a = b) then 
      dbms_output.put_line('Line 1 - a is equal to b'); 
   ELSE 
      dbms_output.put_line('Line 1 - a is not equal to b'); 
   END IF;  
   IF (a < b) then 
      dbms_output.put_line('Line 2 - a is less than b'); 
   ELSE 
      dbms_output.put_line('Line 2 - a is not less than b'); 
   END IF; 
    
   IF ( a > b ) THEN 
      dbms_output.put_line('Line 3 - a is greater than b'); 
   ELSE 
      dbms_output.put_line('Line 3 - a is not greater than b'); 
   END IF;  
   compare('Zara Ali', 'Z%A_i');
   compare('Zara Ali', 'ZA_i');
END;
--Conditional Operators
DECLARE 
   a number(3) := 100; 
BEGIN 
   IF ( a = 10 ) THEN 
      dbms_output.put_line('Value of a is 10' ); 
   ELSIF ( a = 20 ) THEN 
      dbms_output.put_line('Value of a is 20' ); 
   ELSIF ( a = 30 ) THEN 
      dbms_output.put_line('Value of a is 30' ); 
   ELSE 
       dbms_output.put_line('None of the values is matching'); 
   END IF; 
   dbms_output.put_line('Exact value of a is: '|| a );  
END;

--Case Statments
DECLARE 
   a number(3) := 100; 
BEGIN 
   case a
       when 20 then dbms_output.put_line('Excellent');
       when 40 then dbms_output.put_line('just cross then mark');
       when 60 then dbms_output.put_line('Good');
       else dbms_output.put_line('Excellent');
    end case;
END; 

--Searched casev statments
DECLARE 
   grade char(1) := 'B'; 
BEGIN 
   case  
      when grade = 'A' then dbms_output.put_line('Excellent'); 
      when grade = 'F' then dbms_output.put_line('Better try again'); 
      else dbms_output.put_line('No such grade'); 
   end case; 
END; 

--Looping
DECLARE 
   x number := 10;
   i number := 1;
BEGIN 
   LOOP 
      dbms_output.put_line(x*i); 
      i:=i+1;
     /* IF i > 10 THEN 
         exit;
      END IF;
      */
       exit WHEN i > 10; 
   END LOOP; 
   -- after exit, control resumes here  
   dbms_output.put_line('After Exit x is: ' || x); 
END; 

---Diffrent loops
DECLARE 
   a number(2) := 10; 
BEGIN 
   dbms_output.put_line('Whille Starting...'); 
   WHILE a < 20 LOOP 
      dbms_output.put_line('value of a: ' || a); 
      a := a + 1; 
   END LOOP; 
      dbms_output.put_line('For Starting...'); 
   FOR a in 10 .. 20 LOOP 
      dbms_output.put_line('value of a: ' || a); 
  END LOOP; 
     dbms_output.put_line('Reverse for Starting...'); 
  FOR a IN REVERSE 10 .. 20 LOOP 
      dbms_output.put_line('value of a: ' || a); 
   END LOOP; 
END; 
 WHILE j < 10 LOOP
         dbms_output.put_line(i); 
         j:=j+1
     END LOOP;
--Many MoreDECLARE 
   I number(2) := 1;
   j number(2) := 1;
BEGIN 
   WHILE I < 4 LOOP
       j:=1;
       WHILE j < 10 LOOP
           dbms_output.put_line(I||'  '||j); 
           j:=j+1;
      END LOOP;  
      I := I + 1; 
   END LOOP; 
END; 

--Special One
DECLARE 
   a number(2) := 10; 
BEGIN 
   <<loopstart>> 
   -- while loop execution  
   WHILE a < 20 LOOP
   dbms_output.put_line ('value of a: ' || a); 
      a := a + 1; 
      IF a = 15 THEN 
         a := a + 1; 
         GOTO loopstart; 
      END IF; 
   END LOOP; 
END; 

--Working with Strings
DECLARE 
   name varchar2(20); 
   company varchar2(30); 
   introduction clob; 
   choice char(1); 
BEGIN 
   name := 'John Smith'; 
   company := 'Infotech'; 
   introduction := ' Hello! I''m John Smith from Infotech.'; 
   choice := 'y'; 
   IF choice = 'y' THEN 
      dbms_output.put_line(name); 
      dbms_output.put_line(company); 
      dbms_output.put_line(introduction); 
   END IF; 
END; 
--PL/SQl Arrays
DECLARE 
   type namesarray IS VARRAY(5) OF VARCHAR2(10); 
   type grades IS VARRAY(5) OF INTEGER; 
   names namesarray; 
   marks grades; 
   total integer; 
BEGIN 
   names := namesarray('Kavita', 'Pritam', 'Ayan', 'Rishav', 'Aziz'); 
   marks:= grades(98, 97, 78, 87, 92); 
   total := names.count; 
   dbms_output.put_line('Total '|| total || ' Students'); 
   FOR i in 1 .. total LOOP 
      dbms_output.put_line('Student: ' || names(i) || ' 
      Marks: ' || marks(i)); 
   END LOOP; 
END; 
--Taking data from table and using in pl/sql array
DECLARE 
   CURSOR c_customers is 
   SELECT  name FROM customers; 
   type c_list is varray (6) of customers.name%type; 
   name_list c_list := c_list(); 
   counter integer :=0; 
BEGIN 
   FOR n IN c_customers LOOP 
      counter := counter + 1; 
      name_list.extend; 
      name_list(counter)  := n.name; 
      dbms_output.put_line('Customer('||counter ||'):'||name_list(counter)); 
   END LOOP; 
END; 


--Procedures cal
DECLARE 
   a number; 
   b number; 
   c number;
PROCEDURE findMin(x IN number, y IN number, z OUT number) IS 
BEGIN 
   IF x < y THEN 
      z:= x; 
   ELSE 
      z:= y; 
   END IF; 
END;   
PROCEDURE squareNum(x IN OUT number) IS 
BEGIN 
  x := x * x; 
END;  
BEGIN 
   a:= 23; 
   b:= 45; 
   dbms_output.put_line(' Minimum of (23, 45) : ' || c);
   squareNum(a);
   dbms_output.put_line('Square of 23 : ' || a);
END; 
--Calling methods factorial
DECLARE 
   a number; 
   b number; 
   c number;
Function fact(x number) RETURN number IS 
f number;
BEGIN 
     if x=0 then
     f:=1;
     else
     f:=x*fact(x-1);
     end if;
     return f;
END;   
BEGIN 
   a:= 5; 
   b:= 45;
   c:=fact(a);
   dbms_output.put_line(' Square is 23: ' || c);
END; 

--implicit cursors
DECLARE  
   total_rows number(2); 
BEGIN 
   UPDATE customers 
   SET salary = salary + 500; 
   IF sql%notfound THEN 
      dbms_output.put_line('no customers selected'); 
   ELSIF sql%found THEN 
      total_rows := sql%rowcount;
      dbms_output.put_line( total_rows || ' customers selected '); 
   END IF;  
END; 

--Explicit with select statement
CURSOR c_customers IS SELECT id, name, address FROM customers; 
OPEN c_customers; 
FETCH c_customers INTO appno;
close c_customers;

--------------ONE MORE
DECLARE 
   c_id AAA.APPNO%type; 
   CURSOR c_customers is 
      SELECT APPNO  FROM AAA; 
BEGIN 
   OPEN c_customers; 
   LOOP 
   FETCH c_customers into c_id; 
      EXIT WHEN c_customers%notfound; 
      dbms_output.put_line(c_id); 
   END LOOP; 
   CLOSE c_customers; 
END; 

---RECORDS
DECLARE 
   type books is record 
      (title  varchar(50), 
      author  varchar(50), 
      subject varchar(100), 
      book_id   number); 
   book1 books; 
   book2 books;  
PROCEDURE printbook (book books) IS 
BEGIN 
   dbms_output.put_line ('Book  title :  ' || book.title); 
   dbms_output.put_line('Book  author : ' || book.author); 
   dbms_output.put_line( 'Book  subject : ' || book.subject); 
   dbms_output.put_line( 'Book book_id : ' || book.book_id); 
END; 
   
BEGIN 
   -- Book 1 specification 
   book1.title  := 'C Programming'; 
   book1.author := 'Nuha Ali ';  
   book1.subject := 'C Programming Tutorial'; 
   book1.book_id := 6495407;
   
   -- Book 2 specification 
   book2.title := 'Telecom Billing'; 
   book2.author := 'Zara Ali'; 
   book2.subject := 'Telecom Billing Tutorial'; 
   book2.book_id := 6495700;  
   
   -- Use procedure to print book info 
   printbook(book1); 
   printbook(book2); 
END; 
----Custom Exception
DECLARE 
   a number:=10;
   b number:=20;
   c number;
   pop  EXCEPTION; 
BEGIN 
if b=0 then
raise pop;
end if;
c:=a/b;
dbms_output.put_line(c);
EXCEPTION 
   WHEN pop THEN 
      dbms_output.put_line('Pop exception'); 
END; 
--Most Important Triggers
CREATE OR REPLACE TRIGGER display_salary_changes 
BEFORE DELETE OR INSERT OR UPDATE ON customers 
FOR EACH ROW 
WHEN (NEW.ID > 0) 
DECLARE 
   sal_diff number; 
BEGIN 
   sal_diff := :NEW.salary  - :OLD.salary; 
   dbms_output.put_line('Old salary: ' || :OLD.salary); 
   dbms_output.put_line('New salary: ' || :NEW.salary); 
   dbms_output.put_line('Salary difference: ' || sal_diff); 
END; 

--Packaging
REATE OR REPLACE PACKAGE BODY cust_sal AS  
   
   PROCEDURE find_sal(c_id customers.id%TYPE) IS 
   c_sal customers.salary%TYPE; 
   BEGIN 
      SELECT salary INTO c_sal 
      FROM customers 
      WHERE id = c_id; 
      dbms_output.put_line('Salary: '|| c_sal); 
   END find_sal; 
END cust_sal; 
---Calling Packages
DECLARE 
   code customers.id%type := &cc_id; 
BEGIN 
   cust_sal.find_sal(code); 
END; 

--Index By key-value pair
DECLARE 
   TYPE salary IS TABLE OF NUMBER INDEX BY VARCHAR2(20); 
   salary_list salary; 
   name   VARCHAR2(20); 
BEGIN 
   -- adding elements to the table 
   salary_list('Rajnish') := 62000; 
   salary_list('Minakshi') := 75000; 
   salary_list('Martin') := 100000; 
   salary_list('James') := 78000;  
   
   -- printing the table 
   name := salary_list.FIRST; 
   WHILE name IS NOT null LOOP 
      dbms_output.put_line 
      ('Salary of ' || name || ' is ' || TO_CHAR(salary_list(name))); 
      name := salary_list.NEXT(name); 
   END LOOP; 
END; 
--Transaction Queries in SQL
-------Commit,savepoint,rollback

COMMIT;,ROLLBACK [TO SAVEPOINT < savepoint_name>];
ROLLBACK;SAVEPOINT < savepoint_name >;SET AUTOCOMMIT ON; 

--Object Creation and initialization
CREATE OR REPLACE TYPE customer AS OBJECT 
(code number(5), 
 name varchar2(30), 
 contact_no varchar2(12), 
 addr address, 
 member procedure display 
); 
--Intialization
DECLARE 
   residence address; 
BEGIN 
   residence := address('103A', 'M.G.Road', 'Jaipur', 'Rajasthan','201301'); 
END; 
--Member variable and methods
CREATE OR REPLACE TYPE rectangle AS OBJECT 
(length number, 
 width number, 
 member function enlarge( inc number) return rectangle, 
 member procedure display, 
 map member function measure return number 
); 
CREATE OR REPLACE TYPE BODY rectangle AS 
   MEMBER FUNCTION enlarge(inc number) return rectangle IS 
   BEGIN 
      return rectangle(self.length + inc, self.width + inc); 
   END enlarge;  
   MEMBER PROCEDURE display IS 
   BEGIN  
      dbms_output.put_line('Length: '|| length); 
      dbms_output.put_line('Width: '|| width); 
   END display;  
   MAP MEMBER FUNCTION measure return number IS 
   BEGIN 
      return (sqrt(length*length + width*width)); 
   END measure; 
END; 

--Inheritance
REATE OR REPLACE TYPE tabletop UNDER rectangle 
(   
   material varchar2(20), 
   OVERRIDING member procedure display 
) 
CREATE OR REPLACE TYPE BODY tabletop AS 
OVERRIDING MEMBER PROCEDURE display IS 
BEGIN 
   dbms_output.put_line('Length: '|| length); 
   dbms_output.put_line('Width: '|| width); 
   dbms_output.put_line('Material: '|| material); 
END display; 

--Abstract Objects
CREATE OR REPLACE TYPE rectangle AS OBJECT 
(length number, 
 width number, 
 NOT INSTANTIABLE NOT FINAL MEMBER PROCEDURE display)  
 NOT INSTANTIABLE NOT FINAL 