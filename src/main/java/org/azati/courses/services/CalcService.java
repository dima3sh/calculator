package org.azati.courses.services;

public class CalcService{
    public static Number add(Number num1, Number num2) {
        if (num1 instanceof Integer) {
            return add((Integer)num1, num2);
        } else if (num1 instanceof Double) {
            return add((Double)num1, num2);
        }
        throw new UnsupportedOperationException("Type " + num1 + " and " + num2 + " are not supported");
    }

    private static Number add(Integer num1, Number num2) {
        if (num2 instanceof Integer) {
            return num1 + (Integer)num2;
        } else if (num2 instanceof Double) {
            return num1 + (Double)num2;
        }
        throw new UnsupportedOperationException("Type " + num1 + " and " + num2 + " are not supported");
    }

    private static Number add(Double num1, Number num2) {
        if (num2 instanceof Integer) {
            return num1 + (Integer)num2;
        } else if (num2 instanceof Double) {
            return num1 + (Double)num2;
        }
        throw new UnsupportedOperationException("Type " + num1 + " and " + num2 + " are not supported");
    }
}
