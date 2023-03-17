package ch06lab2;
/**
 * determines if a part number is valid
 * 2020-04-01
 * @author Matt N.
 * @author Jose G.
 */
public class PartNumber {
    public static final int PN_LENGTH = 6; // the length of a valid part number
    /**
     * checks if a given part number is valid
     * @param partNumber a part number which need to be validated
     */
    public static boolean isValid(String partNumber) {
        boolean isValidPN;      // used as a pass/fail flag when checking if a part number is valid
        String firstTwoLetters; // the first two letters of a part number
        isValidPN = true;


        if (partNumber.length() != PN_LENGTH)
        {
            isValidPN = false;
        }
        else
        {
            firstTwoLetters = partNumber.substring(0, 2);
            switch (firstTwoLetters)
            {
                case "SR":
                case "SD":
                case "TU":
                case "TR":
                    break;
                default:
                    isValidPN = false;
            }

            if (partNumber.charAt(2) != '-')
            {
                isValidPN = false;
            }
            if (!Character.isDigit(partNumber.charAt(3)) ||
                    !Character.isDigit(partNumber.charAt(4)) ||
                    !Character.isDigit(partNumber.charAt(3)))
            {
                isValidPN = false;
            }
        }
        return (isValidPN);
    };
}
