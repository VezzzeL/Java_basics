package Lesson6.DegreesConverter;

import java.util.Locale;

public interface DegreeConverter {
    static double celsiusConv(double degree, String unitTo){
        if(unitTo.equalsIgnoreCase("K")){
            return degree + 273.15;
        }else if(unitTo.equalsIgnoreCase("F")){
            return degree * 9/5 + 32;
        }else{
            return degree;
        }
    }
    static double fahrenheitConv(double degree, String unitTo){
        if(unitTo.equalsIgnoreCase("C")){
            return (degree - 32)*5/9;
        }else if(unitTo.equalsIgnoreCase("K")){
            return (degree+459.67) * 5/9;
        }else{
            return degree;
        }
    }
    static double kelvinConv(double degree, String unitTo){

        if(unitTo.equalsIgnoreCase("C")){
            return degree - 273.15;
        }else if(unitTo.equalsIgnoreCase("F")){
            return degree * 9/5 - 459.67;
        }else{
            return degree;
        }
    }
    static double convert(String baseUnit, String resultUnit, double baseDegree){

        switch (baseUnit.toUpperCase(Locale.ROOT)){
            case "C":
                return celsiusConv(baseDegree,resultUnit);
            case "K":
                return kelvinConv(baseDegree,resultUnit);
            case "F":
                return  DegreeConverter.fahrenheitConv(baseDegree, resultUnit);
            default:
                return baseDegree;
        }
    }
}
