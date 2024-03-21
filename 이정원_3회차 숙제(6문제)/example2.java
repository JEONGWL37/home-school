public class example2 {
  
  public static void main(String[] args) {

      double sum =0.0;

      double[] dou = {90, 70.5, 80, 79, 82.5, 50, 70, 90.2, 89.5, 89.7};

      for(int i = 0; i < dou.length; i++) {
        sum += dou[i];
        
      }
        double avr = sum / dou.length ;
      
        System.out.println("합계: " + sum);
        System.out.format("평균: %.2f", avr);


  }
}