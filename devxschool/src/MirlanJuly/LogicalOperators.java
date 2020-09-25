package MirlanJuly;
//Class AboutTruth
public class LogicalOperators {
    public static void main(String []args){
        int apples = 10;
        int peaches = 16;
        boolean isEqual = apples == peaches;
        boolean isNotEqual = apples != peaches;
        boolean isAppleIsGreaterThanPeaches = apples > peaches;
        boolean isAppleIsLessThanPeaches = apples < peaches;
        boolean isAppleIsGreaterThanOrEqualToPeaches = apples >= peaches;
        boolean isAppleIsLessThanOrEqualToPeaches = apples <= peaches;
        System.out.println(apples + " is equal to "+peaches+" = "+isEqual);
        System.out.println(apples + " is not equal to "+peaches+" = "+isNotEqual);
        System.out.println(apples + " is greater than "+peaches+" = " + isAppleIsGreaterThanPeaches);
        System.out.println(apples + " is less than "+peaches+" = " + isAppleIsLessThanPeaches);
        System.out.println(apples + " is greater than or equal to "+peaches +" = "+isAppleIsGreaterThanOrEqualToPeaches);
        System.out.println(apples + " is less than or equal to "+peaches+" = "+isAppleIsLessThanOrEqualToPeaches);

    }
}
/*
          Operators:                       Symbols and examples:
   Post-unary operators               expression++, expression--
   Pre-unary operators                ++expression, --expression
   Other unary operators              + ; - ; ! ;
Multiplication/Division/Modulus       * , / , %
   Addition/Subtraction                   +  ,  -
   Relational operators                < , > , <= , >= , instanceof
   Equal to / not equal to             ==  ;  !=
   Logical operators                    &  ,  ^  , |
Short circuit logical operators         &&  ,  ||
Ternary operators                       boolean expression? , expression1 : expression2
   Assignment operators                 =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=,  >>>=
   Shift operators                      << ; >> ;  >>> ;
   AND --> &&,  OR --> ||,  NOT -->!   (explanation mark)
   0.5 --> fraction; + --> Add;  - --> Substract; !true = False; !false = True;
 */