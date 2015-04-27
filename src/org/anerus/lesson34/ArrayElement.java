package org.anerus.lesson34;

public class ArrayElement {
    private String elementName;
    private int elementValue;

    public String getElementName() {
        return elementName;
    }

    public void setElementName(String elementName) {
        this.elementName = elementName;
    }

    public int getElementValue() {
        return elementValue;
    }

    public void setElementValue(int elementValue) {
        this.elementValue = elementValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ArrayElement that = (ArrayElement) o;

        if (getElementValue() != that.getElementValue()) return false;
        return getElementName().equals(that.getElementName());

    }

    @Override
    public int hashCode() {
        int result = getElementName().hashCode();
        result = 31 * result + getElementValue();
        return result;
    }

}
