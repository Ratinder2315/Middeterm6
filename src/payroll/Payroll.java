/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package payroll;

/** This code calculates the salary including bonus.
 * bonus is 10% of salary and applied to the employees whose salary is <=3000
 *  If salary is less than or equal to 3000,calculate a new salary with bonus.
 @author srinivsi
 */
public class Payroll 
{
   private double Salary;
   private double bonus;
  private String emp;
 
     /**constructor that takes the salary and employee name
      * 
      */
   public Payroll(double Sal,String givenUser)
        {
            Salary=Sal;
            emp=givenUser;
                 
        }
    /**
     * @return the Salary
     */
    public double getSalary() {
        return Salary;
    }

    /**
     * @param Salary the Salary to set
     */
    public void setSalary(double Salary) {
        this.Salary = Salary;
    }

    /**
     * @return the bonus
     */
    public double getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the emp
     */
    public String getEmp() {
        return emp;
    }

    /**
     * @param emp the emp to set
     */
    public void setEmp(String emp) {
        this.emp = emp;
    }

    public double calaculateSalary()
    {
        if (Salary <= 3000) 
        {
            return  Salary + (0.10 * Salary);
        }
        else
        {
            return Salary;
        }
    }    

}
