public class BaseBallCoach implements Coach {

    private FortuneService fortuneService;
    public BaseBallCoach(FortuneService fortuneService){
        this.fortuneService=fortuneService;
    }
    @Override
    public String getDailyRoutine() {
        return "Practise baseball for 90 minutes";
    }
    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
