package model;

/**
 * Created by seankang on 4/13/2015.
 */
public enum Command {
    NONE(""),
    ONE("1"), TWO("2"), THREE("3"), FOUR("4"), FIVE("5"), SIX("6"), SEVEN("7"), EIGHT("8"), NINE("9"), ZERO("0"),

    ADD("+"), SUBTRACT("-"), MULTIPLY("*"), DIVIDE("/"), MODULUS("%"),  EQUAL("=");

    private String title;

    Command(String titleInput){
        title = titleInput;
    }
}
