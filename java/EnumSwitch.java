// enum Day {
//     MON, TUE, WED, THU, FRI, SAT, SUN
// }

// public class EnumExample {
//     public static void main(String[] args) {

//         Day today = Day.FRI;

//         System.out.println("Today is: " + today);
//     }
// }


//2 method

enum Direction {
    NORTH, SOUTH, EAST, WEST
}

public class EnumSwitch {
    public static void main(String[] args) {

        Direction d = Direction.EAST;

        switch (d) {
            case NORTH:
                System.out.println("Moving North");
                break;
            case SOUTH:
                System.out.println("Moving South");
                break;
            case EAST:
                System.out.println("Moving East");
                break;
            case WEST:
                System.out.println("Moving West");
                break;
        }
    }
}
