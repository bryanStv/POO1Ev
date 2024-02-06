package maquinaExpendedora;

import javax.management.InvalidAttributeValueException;

public class MainMaquinaExpendedora {
    public static void main(String[] args) throws InvalidAttributeValueException {
        MaquinaExpendedora m1 = new MaquinaExpendedora("01",500);
        m1.setPagado(620);
        System.out.println(m1);
    }
}
