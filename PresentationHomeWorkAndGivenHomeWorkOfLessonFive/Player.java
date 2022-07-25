import java.util.jar.Attributes.Name;

class Player {
    String playerName; //"Jeremy"
    int playerAge; //24
    String playergender;  //"Male"
    int numofbrothersandsisters; //4
    boolean married; //false
    boolean weaponHolder; //true

 Player (String name, int age, String gender, int numberofbrothertsandsisters, boolean hasawife, boolean weaponcarrier) {
     playerName = name;
     playerAge = age;
     playergender = gender;
     numofbrothersandsisters = numberofbrothertsandsisters;
     married = hasawife;
     weaponHolder = weaponcarrier;

 }

 Player (String name, String gender) {
    playerName = name;
    playergender = gender;
 }

 public static void run() {
    System.out.println("The player is running.");

}
}

