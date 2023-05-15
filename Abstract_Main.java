public class Abstract_Main {
    public static void main(String[] args) {
        Abstract_Son son= new Abstract_Son();
        Abstract_Daughter daughter= new Abstract_Daughter();
        son.career();
        daughter.partner();
        son.partner();
        daughter.career();
        Abstract_Parent.hello();
       // Parent mom= new  Parent(89);    OBJECT OF ABSTRACT CLASS IS NOT ALLOWED
    }
    
}
