package com.company;

public class Rate implements Price
{

    int number_of_boxes;
    int numberoftruckloads;
    int numberofpeople;

    Double boxPrice;
    Double truckPrice;
    Double peoplePrice;
    boolean CanEdit;

     public Rate()
    {

        number_of_boxes = 0;
        numberoftruckloads = 0;
        numberofpeople =0;
        boxPrice = 0.00;
        truckPrice= 0.00;
        peoplePrice= 0.00;
        CanEdit= false;
    }

    public void setCanEdit(boolean canEditValue)
    {
        CanEdit = canEditValue;
    }

    public void setNumberofboxes(int box_num)
    {
        number_of_boxes = box_num;
    }

   public void setNumberoftruckloads( int truck_num)
    {
        numberoftruckloads = truck_num;
    }

    public void setNumberofpeople( int people_num)
    {
        numberofpeople = people_num;
    }


     private void setBoxPrice( double aPrice)
    {
        if (CanEdit==true)
        boxPrice = aPrice;
    }

    private void setTruckPrice( double aTruckPrice)
    {
        if (CanEdit==true)
        truckPrice = aTruckPrice;
    }
    private void setPeoplePrice( double aPersonPrice)
    {
        if (CanEdit==true)
        peoplePrice = aPersonPrice;
    }

    @Override
    public double getPrice()
    {
        double total_Price;
        total_Price = (number_of_boxes*boxPrice) + (numberoftruckloads*truckPrice) + (numberofpeople* peoplePrice);
        return total_Price;
    }
}

