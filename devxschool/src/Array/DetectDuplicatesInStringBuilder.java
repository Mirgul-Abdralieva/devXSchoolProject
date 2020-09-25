package Array;

public class DetectDuplicatesInStringBuilder {
    public static void main(String[] args) {

        String arrString = "adhfhfhhhhhhhhasjfjfjaaaaaaa";
        StringBuilder strB = new StringBuilder(arrString);
        int duplicateCounter = 0;
        for (int i = 0; i < strB.length()-1; i++ ){
            duplicateCounter = 0;
            for (int j = i + 1; j < strB.length()-1; j++){
                if (strB.charAt(i) == strB.charAt(j)){
                    duplicateCounter++;
                    strB.deleteCharAt(i);
                }
            }
            strB.deleteCharAt(i);
            System.out.println(strB.charAt(i)+ " has "+ duplicateCounter + "of duplicates");
        }
    }
}
