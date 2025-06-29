CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE accounts SET balance = balance + (balance * 0.01)
    WHERE accountType = 'Savings';
    COMMIT;
    dbms_output.put_line('monthly interest added to savings acc.');
END;
/
