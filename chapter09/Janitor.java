/**
 * Write a class HarvardLawyer to accompany the other law firm classes 
 * described in this chapter. Harvard lawyers are like normal lawyers, but 
 * they make 20% more money than a normal lawyer, they get 3 days more 
 * vacation, and they have to fill out four of the lawyer's forms to go on 
 * vacation.
 */

public class Janitor extends Employee {    
    public void clean() {
        System.out.print("Workin' for the man.");
    }
    
    public double getSalary() {
        return super.getSalary() - 10000.0;
    }
    
    public int getHours() {
        return super.getHours() * 2;
    }
    
    public int getVacationDays() {
        return super.getVacationDays() / 2;
    }
}