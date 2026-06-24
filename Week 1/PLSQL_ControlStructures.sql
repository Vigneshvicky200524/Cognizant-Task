SET SERVEROUTPUT ON;

DECLARE
    marks NUMBER := 78;
    i NUMBER := 1;
BEGIN
    IF marks >= 90 THEN
        DBMS_OUTPUT.PUT_LINE('Grade A+');
    ELSIF marks >= 75 THEN
        DBMS_OUTPUT.PUT_LINE('Grade A');
    ELSIF marks >= 60 THEN
        DBMS_OUTPUT.PUT_LINE('Grade B');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Grade C');
    END IF;

    DBMS_OUTPUT.PUT_LINE('-------------------');

    FOR j IN 1..5 LOOP
        DBMS_OUTPUT.PUT_LINE('Value = ' || j);
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('-------------------');

    WHILE i <= 5 LOOP
        DBMS_OUTPUT.PUT_LINE('Value = ' || i);
        i := i + 1;
    END LOOP;

    DBMS_OUTPUT.PUT_LINE('-------------------');

    i := 1;
    LOOP
        DBMS_OUTPUT.PUT_LINE('Value = ' || i);
        i := i + 1;
        EXIT WHEN i > 5;
    END LOOP;

END;
/