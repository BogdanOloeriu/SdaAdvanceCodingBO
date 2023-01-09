package homework.advance.coding.task6;

import org.omg.CORBA.PRIVATE_MEMBER;

public enum ConversionType {

    METER_TO_YARDS(1.5),
    YARDS_TO_METER(0.5),
    CENTIMETERS_TO_INCHES(0.6),
    INCHES_TO_CENTIMETERS(1.6),
    KILOMETERS_TO_MILES(0.625),
    MILES_TO_KILOMETERS(1.6);

    private double converter;

    ConversionType(double converter) {
        this.converter = converter;
    }

    public double getConverter() {
        return converter;
    }
}
