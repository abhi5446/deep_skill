DECLARE
cursor cur is select customerid, trunc(months_between(sysdate,dob)/12) as age from customers;
x Loans.customerid%type;
y number;

BEGIN
    open cur;
    LOOP
        FETCH cur into x,y;
        EXIT WHEN cur%NOTFOUND;        
        if y>60 then
            update loans set interestrate=interestrate-1 where customerid=x;
            dbms_output.put_line('Intrest rate for '||x||' is decreased by 1% as age is '||y);
        end if;
    end loop;

end;
/