CREATE OR REPLACE PROCEDURE TransferFunds(srcid IN NUMBER,destid IN NUMBER,amt IN NUMBER) IS
bal Accounts.Balance%TYPE;
srcCid Accounts.CustomerID%TYPE;
destCid Accounts.CustomerID%TYPE;
BEGIN
    IF amt <= 0 THEN
        RAISE_APPLICATION_ERROR(-20001, 'cannot transfer negative amount');
    END IF;
    SELECT balance, CustomerID INTO bal, srcCid FROM Accounts WHERE AccountID = srcid;
    SELECT CustomerID INTO destCid FROM Accounts WHERE AccountID = destid;
    IF bal < amt THEN
        RAISE_APPLICATION_ERROR(-20002, 'Insufficient funds');
    END IF;
    IF srcCid <> destCid THEN
        UPDATE Customers SET balance = balance - amt  WHERE CustomerID = srcCid;
        UPDATE Customers SET balance = balance + amt WHERE CustomerID = destCid;
    END IF;
    COMMIT;
    DBMS_OUTPUT.PUT_LINE('Transferred '||amt||' from '||srcid||' to '||destid);

EXCEPTION
    WHEN NO_DATA_FOUND THEN
        RAISE_APPLICATION_ERROR(-20003, 'Invalid account provided.');
    WHEN OTHERS THEN
        ROLLBACK;
    RAISE;
END;
/