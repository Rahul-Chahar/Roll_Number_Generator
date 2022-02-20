/*
 *Author Name: Rahul Chahar
 *IDE: IntelliJ IDEA Community Edition
 *Date: 20/02/2022
 */

package rollNumber;

import java.util.Date;

public class RollNumber {
    private static int count = 1;
    private String rollNo;

    RollNumber() {
        rollNo = assignRollNo();
    }

    private String assignRollNo() {
        Date d = new Date();
        String rno = "Univ-" + (d.getYear() + 1900) + "-" + count;
        count++;
        return rno;
    }

    public String getRollNo() {
        return rollNo;
    }
}