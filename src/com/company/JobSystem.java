package com.company;

public class JobSystem
{


    private String admin_check;
    private String employee_check;
    private Rate sysRate;


    public JobSystem()
    {
        admin_check = "000043210";
        employee_check ="000045972";
    }

    public void isAdmin(String checkID)

    {
        boolean c = false;

        if (admin_check.equals(checkID))
        {
            c = true;
            sysRate.setCanEdit(true);
        }

        else if(employee_check.equals(checkID))
        {
            isEmployee(checkID);
        }
        else
        {
            c = false;
            System.out.println("Invalid Login");
        }
    }

    public void isEmployee(String checkID2)

    {
        boolean c = false;

        if (employee_check.equals(checkID2))
        {
             c = true;
             sysRate.setCanEdit(false);
        }
            else if(admin_check.equals(checkID2))
            {
                isAdmin(checkID2);
            }
            else
                {
                    c = false;
                    System.out.println("Invalid Login");
                }
    }
}
