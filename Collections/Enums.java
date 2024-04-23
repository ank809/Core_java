package Collections;

public class Enums {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enums constant
        // public, static and final
        // since its final you can't create child of enums
        // type is Week

        Week() {
            System.out.println("Constructor called of " + this);
        }
        // This is not public or protected, only private and default
        // As we don't want to create new objects

    }

    public static void main(String[] args) {
        Week week = Week.Sunday;
        for (Week days : Week.values()) {
            System.out.println(days);
        }
        System.out.println(week);
        System.out.println(week.ordinal());
    }

}
