public class MyApp {
    public static void main(String[] args) {
        Coach bc= new BaseBallCoach();
        System.out.println(bc.getDailyRoutine());

        Coach hc=new HockeyCoach();
        System.out.println(hc.getDailyRoutine());
    }
}
