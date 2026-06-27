SET SERVEROUTPUT ON;

-- Create Table
CREATE TABLE Employee (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    salary NUMBER
);

-- Insert Records
INSERT INTO Employee VALUES (101,'Vignesh',25000);
INSERT INTO Employee VALUES (102,'Rahul',30000);
INSERT INTO Employee VALUES (103,'Anitha',40000);

COMMIT;

-- Create Procedure
CREATE OR REPLACE PROCEDURE ShowSalary(
    id IN NUMBER
)
IS
    empSalary NUMBER;
BEGIN
    SELECT salary
    INTO empSalary
    FROM Employee
    WHERE emp_id = id;

    DBMS_OUTPUT.PUT_LINE('Employee Salary = ' || empSalary);
END;
/

-- Execute Procedure
BEGIN
    ShowSalary(102);
END;
/