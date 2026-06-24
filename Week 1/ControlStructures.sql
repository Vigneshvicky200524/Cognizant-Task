SET SERVEROUTPUT ON;

DECLARE
    marks NUMBER := 75;
BEGIN
    -- ELSIF Example
    IF marks >= 90 THEN
        DBMS_OUTPUT.PUT_LINE('Grade A');
    ELSIF marks >= 75 THEN
        DBMS_OUTPUT.PUT_LINE('Grade B');
    ELSIF marks >= 50 THEN
        DBMS_OUTPUT.PUT_LINE('Grade C');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Fail');
    END IF;

    DBMS_OUTPUT.PUT_LINE('----------------');

    -- FOR LOOP with IF-ELSE Example
    FOR i IN 1..5 LOOP

        IF MOD(i,2) = 0 THEN
            DBMS_OUTPUT.PUT_LINE(i || ' is Even');
        ELSE
            DBMS_OUTPUT.PUT_LINE(i || ' is Odd');
        END IF;

    END LOOP;

END;
/