package com.clubs2win.c2wlibrary;
import java.util.Calendar;
import java.util.Date;

public class LibraryItem
{
    private String itemTitle;
    private Date checkoutDate;
    private Date expirationDate;
    private boolean isCheckedOut;

    public String getItemTitle() {
        return itemTitle;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public LibraryItem(String title)
    {
        itemTitle = title;
        checkoutDate = null;
        expirationDate = null;
        isCheckedOut = false;
    }

    public boolean CheckoutItem ()
    {
        boolean checkOutSuccess = false;
        if (!isCheckedOut)
        {
            Calendar c = Calendar.getInstance();
            checkoutDate = c.getTime();
            c.add(Calendar.DATE,14); // add 14 days
            expirationDate = c.getTime();
            isCheckedOut = true;
            checkOutSuccess = true;
        }

        return checkOutSuccess;
    }

    public boolean CheckinItem ()
    {
        boolean checkInSuccess = false;
        if (isCheckedOut)
        {
            checkoutDate = null;
            expirationDate = null;
            isCheckedOut = false;
            checkInSuccess = true;
        }

        return checkInSuccess;
    }
}
