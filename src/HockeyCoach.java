public class HockeyCoach implements Coach {
    private FortuneService fortuneService;
    public HockeyCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyRoutine() {
        return "Practise Hockeey for 2 hrs";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
