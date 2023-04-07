package baseball;

public class BaseBallTeam {

    private String baseballteamName;
    private int win;
    private  int lose;
    private int draw;

    public BaseBallTeam(String baseballteamName, int win, int lose, int draw) {
        this.baseballteamName = baseballteamName;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public double getRate() {
        return (double) win / (win + lose);
    }

    public void report() {
        System.out.println(baseballteamName+"の2022年の成績は"+win+"勝"+lose+"敗"+draw+"分、勝率は"+getRate()+"です。");
    }
}