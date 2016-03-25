
import java.util.ArrayList;
import java.util.List;

/**
 * Created by RKennington on 3/24/16.
 */
public class KenningtonSolution implements com.radiantblue.homework.RadiantBlueAssignment {

    List<StringBuffer> sbList = null;

    public String[] getLetterPermutationsRecursive(int[] phoneNumber) {

        sbList = new ArrayList<StringBuffer>();
        StringBuffer newSB = new StringBuffer();
        sbList.add(newSB);

        permutePhone(0, phoneNumber, newSB);

        return getStringArray(sbList);
    }

    public void permutePhone(int index, int[] phoneNumber, StringBuffer sb) {

        String sbString = sb.toString();
        StringBuffer newSB;
        int tempLen = sb.length();
        int tempSize = sbList.size();

        if (index < phoneNumber.length) {
            String chars = getChars(phoneNumber[index]);
            int numChars = chars.length();

            String char_ = chars.substring(0, 1);
            sb.append(char_);
            permutePhone(index + 1, phoneNumber, sb);

            for (int j = 1; j < numChars; j++) {
                newSB = new StringBuffer(sbString);
                char_ = chars.substring(j, j + 1);
                newSB.append(char_);
                sbList.add(newSB);
                permutePhone(index + 1, phoneNumber, newSB);
            }

        }
    }

    public String[] getLetterPermutationsIterative(int[] phoneNumber) {

        List<StringBuffer> sbList = new ArrayList<StringBuffer>();
        StringBuffer sb = new StringBuffer();
        sbList.add(sb);

        for (int i = 0; i < phoneNumber.length; i++) {

            String chars = getChars(phoneNumber[i]);
            int numChars = chars.length();

            sbList = expand(sbList, numChars - 1);

            int range = sbList.size() / numChars;
            for (int j = 0; j < numChars; j++) {

                String char_ = chars.substring(j, j + 1);

                int begin = (range * j);
                int end = begin + range;
                for (int k = begin; k < end; k++) {
                    sb = sbList.get(k);
                    sb.append(char_);
                    String temp = char_;
                }
            }
        }
        return getStringArray(sbList);
    }

    private String[] getStringArray(List<StringBuffer> sbList) {

        int size = sbList.size();
        String[] sArray = new String[size];
        for (int i = 0; i < size; i++) {
            sArray[i] = sbList.get(i).toString();
        }
        return sArray;
    }

    private boolean compareSB(StringBuffer sb1, StringBuffer sb2) {
        return sb1.toString().equals(sb2.toString());
    }

    private List<StringBuffer> expand(List<StringBuffer> sbList, int num) {

        StringBuffer sb = null;
        int initSB_Size = sbList.size();

        for (int j = 1; j <= num; j++) {
            for (int i = 0; i < initSB_Size; i++) {
                sb = new StringBuffer(sbList.get(i));
                sbList.add(sb);
            }
        }
        return sbList;
    }

    private String getChars(int digit) {

        String chars = "";
        switch (digit) {
            case 1:
                chars = "1";
                break;
            case 2:
                chars = "ABC";
                break;
            case 3:
                chars = "DEF";
                break;
            case 4:
                chars = "GHI";
                break;
            case 5:
                chars = "JKL";
                break;
            case 6:
                chars = "MNO";
                break;
            case 7:
                chars = "PQRS";
                break;
            case 8:
                chars = "TUV";
                break;
            case 9:
                chars = "WXYZ";
                break;
            case 0:
                chars = "0";
                break;
            default:
                System.out.println("Error: digit '" + digit + "' is not a digit.");
                System.exit(-1);
                break;
        }
        return chars;
    }
}

