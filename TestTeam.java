public class TestTeam {

    public static void main(String[] args) {
// test


        Team team1 = new Team("PCHS", "Basketball", "Cougars");

        System.out.println("team 1: " + team1.getSchool());


    }


    public static Team setTeamData() {
        Scanner input = new Scanner(System.in);
        Team temp;
        String name, sport, mascot;
       System.out.println("Enter school name >>" );
       name = input.nextLine();
        System.out.println("Enter sport >>" );
        sport = input.nextLine();
        System.out.println("Enter mascot >>" );
        mascot = input.nextLine();

        temp = new Team(name, sport, mascot);




        return temp;

    }
public static void display(Team t){

        System.out.println(t.getSchool() + " " + t.getSport() + " team" + t.getMascot() + "\n Our motto is " + t.MOTTO);






}



}




