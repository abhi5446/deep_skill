ALTER TABLE Customers ADD IsVIP CHAR(1) DEFAULT 'N';

DECLARE
    CURSOR cur is select customerid , balance from customers;
    x customers.CUSTOMERID%TYPE;
    y customers.BALANCE%TYPE;

BEGIN
    open cur;
    loop
        fetch cur into x,y;
        exit when cur%notfound;
        if y > 10000 THEN
        UPDATE CUSTOMERS set ISVIP='Y' where CUSTOMERID = x;
        dbms_output.put_line('VIP member '||x || ' balance '||y);
        end if;

    end loop;
end;
/