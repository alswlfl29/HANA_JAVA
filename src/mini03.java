import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int kor;
    int eng;
    int math;

    // 필드가 있는 생성자
    public Student(String name, int kor, int eng, int math) {
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
    // 혹은 getter setter 이용
}

public class mini03 {
    public static List<Student> list =
            new ArrayList<Student>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("-----------성적 관리 프로그램-------------");
            System.out.print("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료 :");
            int num = scan.nextInt();
            if (num == 6) {
                System.out.println("종료!!");
                break;
            }
            switch (num) {
                case 1:
                    insert();
                    break;
                case 2:
                    searchAll();
                    break;
                case 3:
                    search();
                    break;
                case 4:
                    update();
                    break;
                case 5:
                    delete();
                    break;
                default:
                    System.out.println("정확한 번호를 입력해주세요!");
            }
        }
        scan.close();
    }

    // ArrayList 관련 함수들: 전체지우기, 추가, 삭제, 검색(직접 코드로)
    private static void insert() {
        Scanner scan = new Scanner(System.in);
        System.out.print("이름 입력: ");
        String name = scan.next();
        System.out.print("국어점수 입력: ");
        int korScore = scan.nextInt();
        System.out.print("영어점수 입력: ");
        int engScore = scan.nextInt();
        System.out.print("수학점수 입력: ");
        int mathScore = scan.nextInt();

        list.add(new Student(name, korScore, engScore, mathScore));
        scan.close();
    }

    private static void searchAll() {
        for (Student student : list) {
            printInfo(student);
        }
    }

    private static void search() {
        Scanner scan = new Scanner(System.in);
        System.out.print("검색할 사람의 이름: ");
        String searchName = scan.nextLine();
        boolean isSearch = false;
        for (Student student : list) {
            if (student.name.equals(searchName)) {
                isSearch = true;
                printInfo(student);
            }
        }
        if (!isSearch) System.out.println("존재하지 않는 이름입니다!");
        scan.close();
    }

    private static void update() {
        Scanner scan = new Scanner(System.in);
        System.out.print("수정할 사람의 이름: ");
        String updateName = scan.nextLine();
        int studentId = -1;
        for (Student student : list) {
            if (student.name.equals(updateName)) {
                studentId = list.indexOf(student);
                break;
            }
        }
        if (studentId == -1) {
            System.out.println("존재하지 않는 이름입니다!");
            return;
        }
        while (true) {
            System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 >>");
            int updateSubject = scan.nextInt();
            if (updateSubject < 1 || updateSubject > 3) {
                System.out.println("존재하지 않는 과목입니다! 다시 입력해주세요!");
                continue;
            } else {
                switch (updateSubject) {
                    case 1:
                        System.out.print("국어점수 수정:");
                        list.get(studentId).kor = scan.nextInt();
                        break;
                    case 2:
                        System.out.print("영어점수 수정:");
                        list.get(studentId).eng = scan.nextInt();
                        break;
                    case 3:
                        System.out.print("수학점수 수정:");
                        list.get(studentId).math = scan.nextInt();
                        break;
                }
                break;
            }
        }
        scan.close();
    }

    private static void delete() {
        Scanner scan = new Scanner(System.in);
        System.out.print("삭제할 사람의 이름: ");
        String deleteName = scan.nextLine();
        boolean findStudent = false;
        for (Student student : list) {
            if (student.name.equals(deleteName)) {
                findStudent = true;
                list.remove(student);
                break;
            }
        }
        if (!findStudent) System.out.println("존재하지 않는 이름입니다.");
        scan.close();
    }

    static void printInfo(Student student) {
        int total = student.kor + student.eng + student.math;
        double avg = (double) total / 3;
        System.out.print("이름: " + student.name + " 국어: " + student.kor
                + " 영어: " + student.eng + " 수학: " + student.math
                + " 총점: " + total);
        System.out.printf(" 평균: %.1f\n", avg);
    }
}
