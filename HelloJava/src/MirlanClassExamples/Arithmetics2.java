package MirlanClassExamples;

public class Arithmetics2 {
    public static void main(String[] args){
        double length = 9.5;
        float lengthInFloat = (float)length;
        int lengthInInt = (int)length;
        int sizeInInt = 11;
        double sizeInDouble = sizeInInt;
        double anExperimemtalDoubleNum = 7896.123456789012345;
        float precisionExperimentNumber = (float)anExperimemtalDoubleNum;
        long someLongNumber = 1234567890965765123l;
        int numberFromLong = (int)someLongNumber;
        int result = 250 / (int)5.11;
        int result1 = (int)(250/5.11);
        System.out.println("I am double length "+length);  // 9.5
        System.out.println("I am converted to int length "+lengthInInt);  // 9
        System.out.println("I am float length "+lengthInFloat);    //  9.5
        System.out.println("----------DOuble to Float experiment------------------");  //
        System.out.println("I am a double with more precision "+anExperimemtalDoubleNum);  //  7896.123456789012
        System.out.println("I am a converted to float from double "+precisionExperimentNumber);  // 7896.1235
        System.out.println("----------Long to Int experiment------------------");  //
        System.out.println("I am a long number "+someLongNumber);  //  1234567890965765123
        System.out.println("I am a converted to int from long "+numberFromLong);  // -1340204029
        System.out.println("----------float double int experiment------------------");  //
        System.out.println("I am a result "+result);  //  50
        System.out.println("I am a result1 "+result1);   //  48

    }
}
