package last_example;

import java.util.Scanner;

public class train_ticket {

    // 기차표 좌석 배열
    
    public static boolean[][] trainSeats = new boolean[3][40];


    // 가격 계산 메서드 
    public static int sumPrice(int train_choice, int type_Passenger) {
        int basePrice;
        
        if(train_choice ==1) {
            basePrice = 3000; // 일반인 3,000원 베이스 
        } else if(train_choice ==2) {
            basePrice = 3000; // 일반실
        } else {
            basePrice = 3000; //의자 없는 호차
        }

        
        int price;
        switch (type_Passenger) {
            case 1:
                price = basePrice; // 일반인
                break;
            case 2:
                price = basePrice /2; // 경로, 장애인
                break;
            case 3:
                price = basePrice /3; // 어린이
                break; 
        
            default:
                price = 0; // 그외의 값으로 선택 시 가격을 0으로 출력한다. 
                break;
        }
        
        return price;

    }

    //추가 요금 계산 메서드 
    public static int addFare(int train_choice) {
        int addFare = 0;
        if(train_choice == 1) {
            addFare = 1000; //1호차 추가 요금
        } 
        return addFare;
    }



    public static void main(String[] args) {
        
        // 스캐너 입력
        Scanner sc = new Scanner(System.in);

        while (true) {
            //기차표 예매 여부 확인
            System.out.print("기차표를 예매하시겠습니까? (yes/no): ");
            String train_ask = sc.nextLine();

            // '예' 선택 시 equalsIgnoreCase = 문자열 비교(대,소문자 구분 없음)
            if(train_ask.equalsIgnoreCase("yes")) {
                System.out.println("기차표를 예매합니다");


                // 호차 선택(1~3호차)
                System.out.println("호차를 선택하세요! (1호차, 2호차, 3호차): ");
                int train_choice = sc.nextInt();

                if (train_choice < 1 || train_choice > 3) {
                    System.out.println("잘못된 호차를 선택했습니다. 다시 선택해주세요.");
                    continue;
                }

                // 탑승자 유형 선택
                System.out.println("탑승자 유형을 선택하세요: ");
                System.out.println("1. 일반인: 3,000원");
                System.out.println("2. 경로/장애인: 1,500원");
                System.out.println("3. 어린이: 1,000원");
                System.out.println("유형에 알맞게 번호를 눌려 선택하세요: ");
                int type_Passenger = sc.nextInt();

                // 좌석 선택

                System.out.println("좌석을 선택하세요(1번~40번): ");
                int seatNumber = sc.nextInt();

                // 좌석 상태 확인 및 예매
                if (!trainSeats[train_choice - 1][seatNumber]) {
                    int price = sumPrice(train_choice, type_Passenger);
                    int extraFee = addFare(train_choice); 
                    price += extraFee;
                    System.out.println("선택하신 기차표의 가격은 " + price +"원입니다.");
                    trainSeats[train_choice - 1][seatNumber] = true;
                    System.out.println("예매가 성공하었습니다.");
                } else {
                    System.out.println("이미 예약된 좌석입니다, 다른 좌석을 선택해주세요.");
                }


                sc.nextLine(); // 띄우기

            // 아니오를 선택 시 종료
            
            } else if(train_ask.equalsIgnoreCase("no")) {
                System.out.println("기차표 예매를 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요");
            }
             
        }

    }
}
