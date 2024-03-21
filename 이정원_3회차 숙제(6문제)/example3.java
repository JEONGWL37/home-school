public class example3 {

  public static void main(String[] args) {
    
    // double[][] score = {
    //   {90, 80},
    //   {70, 80}
    // };

    // for(int i= 0; i < score.length; i++) {
    //   double guk = score[i][0];
    //   double math = score[i][1];
    //   double avr = (guk+math) / 2.0;
    //   System.out.println("학생번호"+(i+1));
    //   System.out.println("국어점수"+score[i][0]);
    //   System.out.println("수학점수"+score[i][1]);
    //   System.out.println("");
    //   System.out.println("학생번호" + (i+1) + " 국어: "+ guk + " 수학: " + math + " 평균: " +avr);
    //   System.out.println("");
    // }

    double[][] scores = new double[2][2]; 

      
        scores[0][0] = 90; 
        scores[0][1] = 80; 
        scores[1][0] = 70; 
        scores[1][1] = 80; 

        
        System.out.println("학생번호1");
        System.out.println("국어점수: " + scores[0][0]);
        System.out.println("수학점수: " + scores[0][1]);

        System.out.println("학생번호2");
        System.out.println("국어점수: " + scores[1][0]);
        System.out.println("수학점수: " + scores[1][1]);

        // 각 학생의 평균 계산 및 출력
        double average1 = (scores[0][0] + scores[0][1]) / 2;
        double average2 = (scores[1][0] + scores[1][1]) / 2;

        System.out.println("학생번호1");
        System.out.println("국어: " + scores[0][0] + " 수학: " + scores[0][1] + " 평균: " + average1);

        System.out.println("학생번호2");
        System.out.println("국어: " + scores[1][0] + " 수학: " + scores[1][1] + " 평균: " + average2);


  }
}
