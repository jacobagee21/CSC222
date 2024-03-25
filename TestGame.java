public class TestGame {
    public static void main(String[] args) {
// test
         Scanner input = new Scanner(System.in);
      String time;
       Team team1 = setTeamData();
       Team team2 = setTeamData();
       System.out.print("Enter game time >> ");
       time = input.nextLine();
       Game game = newGame(team1, team2, time);
       display(game);

}

    private static Game newGame(Team team1, Team team2, String time) {
        return null;
    }

    public static Team setTeamData() {
        Scanner input = new Scanner(System.in);
        Team temp;
        String name, sport, mascot;
        System.out.println("Enter school name >>");
        name = input.nextLine();
        System.out.println("Enter sport >>");
        sport = input.nextLine();
        System.out.println("Enter mascot >>");
        mascot = input.nextLine();

        temp = new Team(name, sport, mascot);

        return temp;


    }
public static void display (Game g)
{
    Team t1 = g.getTeam1();
    Team t2 = g.getTeam2();

    System.out.println("The game between" +
            t1.getSchool() + " " + t1.getSport() +
            " " + t1.getMascot());
    System.out.println("and" +
            t2.getSchool() + " " + t2.getSport() +
            " " + t2.getMascot());
System.out.println("   takes place at      " + g.getTime());

}
}
