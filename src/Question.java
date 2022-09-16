import java.util.Scanner;
public class Question {

    private static Scanner scan;

    public static void main(String[] args) {






        scan = new Scanner(System.in);
//        문제 1) 점수를 입력받아 점수 및 등급을 출력하는 프로그램을 작성하세요
//        else if문을 사용하여 작성
//        95이상 = A+, 90이상 = A, 85이상 = B+, 80이상 B, 75이상 = C+, 70이상 = C, 60이상 = D, 60미만 = F
//        중첩 if문을 사용하여 각각의 + 대의 점수를 출력
        System.out.println("점수를 입력해 주세요.");
        int grade = scan.nextInt();

        if (grade >= 95){
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 A+ 입니다.");
        } else if (grade >= 90) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 A 입니다.");
        } else if (grade >= 85) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 B+ 입니다.");
        } else if (grade >= 80) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 B 입니다.");
        } else if (grade >= 75) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 C+ 입니다.");
        } else if (grade >= 70) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 C 입니다.");
        } else if (grade >= 60) {
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 D 입니다.");
        } else if (grade < 60){
            System.out.println("당신의 점수는 " + grade + "점이고, 당신의 등급은 F 입니다.");
        }

        System.out.println("돈의 액수를 입력하세요 >>");
        int money = scan.nextInt();
        int money1 = money/50000;
        int money2 = (money%50000)/10000;
        int money3 = (money%10000)/1000;
        int money4 = (money%1000)/500;
        int money5 = (money%500)/100;
        int money6 = (money%100)/10;
        int money7 = (money%10)/1;


        System.out.println("오만원은" + money1 + "개, " + "만원은" + money2 + "개, " + "천원은" + money3 + "개, " + "500원은" + money4 + "개, " + "100원은" + money5 + "개, " + "10원은"
        + money6 + "개, " + "1원은" + money7 + "개");

        System.out.println("\n ----- 연습 문제 9 -----\n");

        System.out.println("숫자를 입력하세요");
        int number = scan.nextInt();
        int first = number / 10; // 10의 자리 숫자를 저장
        int second = number % 10; // 1의 자리 숫자를 저장
        int count = 0; // 3, 6, 9의 수를 저장하기 위한 변수

//        10의 자리 숫자가 3의 배수인지 확인
        if (first % 3 == 0){
            count++; // 3의 배수이면 변수 count의 값 1 증가
        }

//        1의 자리 숫자가 3의 배수인지 확인
        if (second % 3 == 0){
            count++; // 3의 배수이면 변수 count의 값 1 증가
        }

        if (count == 1){
            System.out.println("박수 짝");
        }



    }

}

