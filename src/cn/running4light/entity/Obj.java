package cn.running4light.entity;

import java.math.BigDecimal;

/**
 * @author running4light
 * @description
 * @createTime 2021/6/24 16:02
 */
public class Obj {
    private Integer intVal;
    private String strVal;
    private Double doubleVal;
    private BigDecimal decimalVal;
    private Integer[] intArr;
    private String[] strArr;
    private Double[] doubleArr;
    private BigDecimal[] decimalArr;
    private ObjInner objInner;

    public Obj() {
    }

    public Obj(Integer intVal, String strVal, Double doubleVal, BigDecimal decimalVal) {
        this.intVal = intVal;
        this.strVal = strVal;
        this.doubleVal = doubleVal;
        this.decimalVal = decimalVal;
    }

    public Obj(Integer[] intArr, String[] strArr, Double[] doubleArr, BigDecimal[] decimalArr) {
        this.intArr = intArr;
        this.strArr = strArr;
        this.doubleArr = doubleArr;
        this.decimalArr = decimalArr;
    }

    public Integer getIntVal() {
        return intVal;
    }

    public void setIntVal(Integer intVal) {
        this.intVal = intVal;
    }

    public String getStrVal() {
        return strVal;
    }

    public void setStrVal(String strVal) {
        this.strVal = strVal;
    }

    public Double getDoubleVal() {
        return doubleVal;
    }

    public void setDoubleVal(Double doubleVal) {
        this.doubleVal = doubleVal;
    }

    public BigDecimal getDecimalVal() {
        return decimalVal;
    }

    public void setDecimalVal(BigDecimal decimalVal) {
        this.decimalVal = decimalVal;
    }

    public Integer[] getIntArr() {
        return intArr;
    }

    public void setIntArr(Integer[] intArr) {
        this.intArr = intArr;
    }

    public String[] getStrArr() {
        return strArr;
    }

    public void setStrArr(String[] strArr) {
        this.strArr = strArr;
    }

    public Double[] getDoubleArr() {
        return doubleArr;
    }

    public void setDoubleArr(Double[] doubleArr) {
        this.doubleArr = doubleArr;
    }

    public BigDecimal[] getDecimalArr() {
        return decimalArr;
    }

    public void setDecimalArr(BigDecimal[] decimalArr) {
        this.decimalArr = decimalArr;
    }

    public ObjInner getObjInner() {
        return objInner;
    }

    public void setObjInner(ObjInner objInner) {
        this.objInner = objInner;
    }
}
