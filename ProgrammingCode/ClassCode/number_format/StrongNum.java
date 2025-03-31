import java.util.Scanner;

class StrongNum{
	
	int factorial(int n){
		int fact = 1;
		for(int i = 1; i<=n; i++){
			fact = i * fact;
		}
		return fact;
	}
	
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StrongNum sn = new StrongNum();
		
		int sum = 0;
		int temp = n;

		while(n!=0){
			int lastDigit = n % 10;
			
			int fact = 1;
			for(int i = 1; i<=lastDigit; i++){
				fact = i * fact;
			}
			sum = sum + fact;
			n = n / 10;
		}

		System.out.println(sum);

		if(temp == sum){
			System.out.println("strong num");
		}else{
			System.out.println("not strong");
		}
					
	}
}





























declare
emp_sal emp.sal % type;
emp_name emp.ename % type;
begin
select ename,sal into emp_name,emp_sal from emp;
if emp_sal > 3000 then
dbms_output.put_line('name: ' || emp_name || ' ' || 'sal: ' || emp_sal || ' High salary');
else if emp_salary > 2000 and emp_salary < 3000 then
dbms_output.put_line('name: ' || emp_name || ' ' || 'sal: ' || emp_sal || ' medium salary');
else
dbms_output.put_line('name: ' || emp_name || ' ' || 'sal: ' || emp_sal || ' work hard');
end if;
end;

DECLARE
    emp_sal emp.sal%TYPE;
    emp_name emp.ename%TYPE;
BEGIN
    SELECT ename, sal INTO emp_name, emp_sal FROM emp;
    
    IF emp_sal > 3000 THEN
        DBMS_OUTPUT.PUT_LINE('Name: ' || emp_name || ' Sal: ' || emp_sal || ' High salary');
    ELSIF emp_sal > 2000 AND emp_sal <= 3000 THEN
        DBMS_OUTPUT.PUT_LINE('Name: ' || emp_name || ' Sal: ' || emp_sal || ' Medium salary');
    ELSE
        DBMS_OUTPUT.PUT_LINE('Name: ' || emp_name || ' Sal: ' || emp_sal || ' Work hard');
    END IF;
END;
/
