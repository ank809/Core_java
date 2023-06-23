package OOPS_JAVA;

public class abstract_main {
    public static void main(String[] args) {
        abstract_Parent  daughter= new abstract_Daughter();
        daughter.career();
        abstract_Parent son= new abstract_Son();
        son.partner();
    }
    
}
