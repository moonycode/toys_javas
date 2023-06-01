public class PollStatistics {
  public int cnt = 0;

  public String statistic (int Qnum){
    for (this.cnt = 0; cnt < 5; cnt = cnt + 1) {
      System.out.print((cnt + 1) + ".");
      System.out.print("(" + totalAnswers[cnt] + ")");
      if (Qnum != 5 - 1) {
        System.out.print(",  ");
      }

  }
  }
