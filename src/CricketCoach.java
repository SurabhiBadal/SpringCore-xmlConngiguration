public class CricketCoach implements Coach{

    private FortuneService fortuneService;

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyRoutine() {
        return "Practice Cricket for 120 minutes";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
