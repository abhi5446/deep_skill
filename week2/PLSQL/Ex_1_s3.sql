DECLARE
    CURSOR cur IS
    SELECT l.LoanID, l.customerid, l.EndDate, c.Name FROM Loans l JOIN Customers c ON l.customerid=c.customerid
    WHERE l.EndDate <= SYSDATE + 30;
    lid Loans.LoanID%TYPE;
    cid Loans.customerid%TYPE;
    edt Loans.EndDate%TYPE;
    nm Customers.Name%TYPE;
BEGIN
    FOR rec IN cur LOOP
    lid := rec.LoanID;
    cid := rec.customerid;
    edt := rec.EndDate;
    nm := rec.Name;
    dbms_output.put_line('Loan ID '||lid||' customer name '||nm||' cust ID: '||cid||' due date '||TO_CHAR(edt,'YYYY-MM-DD'));
    END LOOP;
END;
/