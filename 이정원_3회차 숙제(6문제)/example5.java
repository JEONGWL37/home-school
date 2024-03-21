public class example5 {
    public static void main(String[] args) throws Exception {
        final int LENGTH = 5;

        
        double[] dnum = new double[LENGTH];

        
        dnum[0] = 101.2;
        dnum[1] = 210.3;
        dnum[2] = 330.4;
        dnum[3] = 460.5;
        dnum[4] = 600.6;

        
        double sum = 0;
        for (int i = 0; i < LENGTH; i++) {
            sum += dnum[i];
        }
        double average = sum / LENGTH;

        
        System.out.println("dnum 배열의 길이: " + LENGTH);
        System.out.print("초기화하지 않은 dnum[]의 값:");
        for (int i = 0; i < LENGTH; i++) {
            System.out.print(" " + dnum[i]);
        }
        System.out.println();
        System.out.println("배열의 합은 " + sum + "입니다.");
        System.out.println("배열값의 평균은 " + average + "입니다.");
    }
}
