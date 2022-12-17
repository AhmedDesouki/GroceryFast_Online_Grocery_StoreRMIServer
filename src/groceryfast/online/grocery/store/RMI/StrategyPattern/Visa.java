/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groceryfast.online.grocery.store.RMI.StrategyPattern;

/**
 *
 * @author patri
 */
import java.util.Scanner;

public class Visa implements PaymentStrategy {

    long CardNumber;
    String ExpireDate;
    String CVV;

    @Override
    public void collectPaymentDetails() {
        // pop up to collect Visa Detials

    }

    public void setCardNumber(long CardNumber) {
        this.CardNumber = CardNumber;
    }

    public void setExpireDate(String ExpireDate) {
        this.ExpireDate = ExpireDate;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    @Override
    public boolean validatePaymentDetails() {
        //
        return (thesize(CardNumber) >= 13 && thesize(CardNumber) <= 16) && (prefixmatch(CardNumber, 4)
                || prefixmatch(CardNumber, 5) || prefixmatch(CardNumber, 37) || prefixmatch(CardNumber, 6))
                && ((sumdoubleeven(CardNumber) + sumodd(CardNumber)) % 10 == 0);
    }

    @Override
    public double pay(double amount) {
        return amount;
    }

    public static int sumdoubleeven(long cnumber) {
        int sum = 0;
        String num = cnumber + "";
        for (int i = thesize(cnumber) - 2; i >= 0; i -= 2) {
            sum += getDigit(Integer.parseInt(num.charAt(i) + "") * 2);
        }
        return sum;
    }
    // Return this cnumber if it is a single digit, otherwise,
    // return the sum of the two digits

    public static int getDigit(int cnumber) {
        if (cnumber < 9) {
            return cnumber;
        }
        return cnumber / 10 + cnumber % 10;
    }
    // Return sum of odd-place digits in cnumber

    public static int sumodd(long cnumber) {
        int sum = 0;
        String num = cnumber + "";
        for (int i = thesize(cnumber) - 1; i >= 0; i -= 2) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        return sum;
    }
    // Return true if the digit d is a prefix for cnumber

    public static boolean prefixmatch(long cnumber, int d) {
        return getprefx(cnumber, thesize(d)) == d;
    }
    // Return the number of digits in d

    public static int thesize(long d) {
        String num = d + "";
        return num.length();
    }
    // Return the first k number of digits from
    // number. If the number of digits in number
    // is less than k, return number.

    public static long getprefx(long cnumber, int k) {
        if (thesize(cnumber) > k) {
            String num = cnumber + "";
            return Long.parseLong(num.substring(0, k));
        }
        return cnumber;
    }
}
