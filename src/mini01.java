import java.util.Scanner;

public class mini01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] targetPos = findTargetPosition(map); // 최종 목적지
        label:
        while (true) {
            int[] currentPos = findCurrentPosition(map); // 현재 위치
            if (currentPos[0] == targetPos[0] &&
                    currentPos[1] == targetPos[1]) {
                System.out.println("골인!");
                break label;
            }
            for (int i = 0; i < map.length; i += 1) {
                for (int j = 0; j < map[i].length; j += 1) {
                    if (map[i][j] == 0) System.out.print("  ");
                    else if (map[i][j] == 1) System.out.print("■ ");
                    else if (map[i][j] == 2) {
                        System.out.print("● ");
                    } else if (map[i][j] == 3) {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }

            String s = scan.nextLine();
            switch (s) {
                case "a": // 좌로 한칸
                    if (!isMovingOkay(map, currentPos[0], currentPos[1] - 1)) break;
                    map[currentPos[0]][currentPos[1]] = 0;
                    map[currentPos[0]][currentPos[1] - 1] = 2;
                    break;
                case "d": // 우로 한칸
                    if (!isMovingOkay(map, currentPos[0], currentPos[1] + 1)) break;
                    map[currentPos[0]][currentPos[1]] = 0;
                    map[currentPos[0]][currentPos[1] + 1] = 2;
                    break;
                case "w": // 위로 한칸
                    if (!isMovingOkay(map, currentPos[0] - 1, currentPos[1])) break;
                    map[currentPos[0]][currentPos[1]] = 0;
                    map[currentPos[0] - 1][currentPos[1]] = 2;
                    break;
                case "s": // 아래로 한칸
                    if (!isMovingOkay(map, currentPos[0] + 1, currentPos[1])) break;
                    map[currentPos[0]][currentPos[1]] = 0;
                    map[currentPos[0] + 1][currentPos[1]] = 2;
                    break;
                default:
                    System.out.println("다시");
            }
        }

    }

    static boolean isMovingOkay(int[][] arr, int x, int y) {
        if (arr[x][y] == 1) {
            System.out.println("갈 수 없는 공간입니다.");
            return false;
        }
        return true;
    }

    static public int[] findTargetPosition(int[][] arr) {
        int[] position = new int[2];
        label:
        for (int i = 0; i < arr.length; i += 1) {
            for (int j = 0; j < arr.length; j += 1) {
                if (arr[i][j] == 3) {
                    position[0] = i;
                    position[1] = j;
                    break label;
                }
            }
        }
        return position;
    }

    static public int[] findCurrentPosition(int[][] arr) {
        int[] position = new int[2];
        label:
        for (int i = 0; i < arr.length; i += 1) {
            for (int j = 0; j < arr.length; j += 1) {
                if (arr[i][j] == 2) {
                    position[0] = i;
                    position[1] = j;
                    break label;
                }
            }
        }
        return position;
    }

    // 0:빈칸 1:벽 2:사람 3:골인
    static int[][] map = {
            // map[1][1] = 2  => "d"키입력 =>  map[1][1] = 0, map[1][2] = 2
            //                                   x  y           x  y+1
            // map[1][1] = 2  => "s"키입력 =>  map[1][1] = 0, map[2][1] = 2
            //                                   x  y           x+1 y

            // col 0 1 2
            {1, 1, 1, 1, 1, 1, 1}, // row 0
            {1, 2, 1, 0, 0, 3, 1}, // 1
            {1, 0, 1, 0, 1, 1, 1}, // 2
            {1, 0, 1, 0, 0, 0, 1},
            {1, 0, 1, 1, 1, 0, 1},
            {1, 0, 0, 0, 0, 0, 1},
            {1, 1, 1, 1, 1, 1, 1},

    };
}
