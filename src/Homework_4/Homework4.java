package Homework_4;

import java.util.Random;
import java.util.Scanner;

public class Homework4 {

    public static Random random = new Random();
    public static Scanner scanner = new Scanner(System.in);

    //Map
    public static char[][] map;
    public static int mapWidth;
    public static int mapHeight;
    public static int mapSizeMin = 3;
    public static int mapSizeMax = 3;
    public static char empty = '_';
    public static char used = '*';

    //Player
    public static char player = '@';
    public static String playerName = "Ori";
    public static int playerHP = 100;
    public static int playerX;
    public static int playerY;
    public static final int playerMoveUp = 8;
    public static final int playerMoveLeft = 4;
    public static final int playerMoveRight = 6;
    public static final int playerMoveDown = 2;

    //Trap
    public static char trap = 'T';
    public static int trapDamage;
    public static int trapCount;
    public static int trapValueMin = 5;
    public static int trapValueMax = 15;

    public static int levels = 1;

    public static void main(String[] args) {
        // пока игрок живой - переходить на следующий уровень
        while (isPlayerAlive()) {
            createAndFillMap();
            //положение игрока на следующем уровне = исходящему положению на предыдущем уровне
            if (levels == 1) {
                placePlayer();
            }
            else {
                map[playerY][playerX] = player;
            }
            placeTraps();
            showMapConcealTraps();

            while (true) {
                movePlayer();
                showMapConcealTraps();
                if (!isPlayerAlive()) {
                    System.out.println(playerName + " is dead");
                    System.out.println("GAME OVER");
                    break;
                }
                if (isFullMap()) {
                    System.out.println(playerName + " won the map of LEVEL " + levels);
                    levels += 1;
                    System.out.println("NEXT LEVEL: " + levels);
                    System.out.println("Current player's HP = " + playerHP);
                    break;
                }
            }
        }
    }

    public static void createAndFillMap() {
        // Fill the map
        mapWidth = randomValue(mapSizeMin, mapSizeMax);
        mapHeight = randomValue(mapSizeMin, mapSizeMax);
        map = new char[mapHeight][mapWidth];

        for (int i = 0; i < mapHeight; i++) {
            for (int j = 0; j < mapWidth; j++) {
                map[i][j] = empty;
            }
        }
        System.out.println("Map of LEVEL " + levels + " has been created. Map's size is " + mapWidth + "x" + mapHeight);
    }

   /* public static void showMapShowTraps() {
        System.out.println("==========> MAP_LEVEL " + levels + " <==========");
        for (int i = 0; i < mapHeight; i++) {
            for (int j = 0; j < mapWidth; j++) {
                System.out.print(map[i][j] + "|");
            }
            System.out.println();
        }
        System.out.println("===================================");
    }*/

    public static void showMapConcealTraps() {
        System.out.println("==========> MAP_LEVEL " + levels + " <==========");
        for (int i = 0; i < mapHeight; i++) {
            for (int j = 0; j < mapWidth; j++) {
                if (map[i][j] == trap) {
                    System.out.print( "_|");
                }
                else {
                    System.out.print(map[i][j] + "|");
                }
            }
            System.out.println();
        }
        System.out.println("===================================");
    }

    public static void placePlayer() {
        playerX = randomValue(0, mapWidth - 1);
        playerY = randomValue(0, mapHeight - 1);
        map[playerY][playerX] = player;
        System.out.println(playerName + " has been placed in [" + (playerX + 1) + ":" + (playerY + 1) + "]");
    }

    public static void placeTraps() {
        trapDamage = randomValue(trapValueMin, trapValueMax);
        trapCount = (mapWidth + mapHeight) / 2;
        int trapX;
        int trapY;

        for (int i = 0; i < trapCount; i++) {
            do {
                trapX = random.nextInt(mapWidth);
                trapY = random.nextInt(mapHeight);
            } while (!isEmpty(trapX, trapY));
            map[trapY][trapX] = trap;
        }
        System.out.println(trapCount + " traps have been created. Trap causes damage = " + trapDamage);
    }

    public static void movePlayer() {

        int currentPlayerX = playerX;
        int currentPlayerY = playerY;
        int playerDestination;

        do {
            System.out.print("Enter your move: (Up: " + playerMoveUp + " | Down: " + playerMoveDown +
                    " | Left: " + playerMoveLeft + " | Right: " + playerMoveRight + ") >>> ");

            playerDestination = scanner.nextInt();

            switch (playerDestination) {
                case playerMoveUp:
                    playerY -= 1;
                    break;
                case playerMoveDown:
                    playerY += 1;
                    break;
                case playerMoveLeft:
                    playerX -= 1;
                    break;
                case playerMoveRight:
                    playerX += 1;
                    break;
            }

        } while (!checkValidMove(currentPlayerX, currentPlayerY, playerX, playerY));

        playerMoveAction(currentPlayerX, currentPlayerY, playerX, playerY);

    }

    public static boolean checkValidMove(int pastX, int pastY, int nextX, int nextY) {
        if (nextX >= 0 && nextX < mapWidth && nextY >= 0 && nextY < mapHeight) {
            System.out.println(playerName + " successfully moved to [" + (nextX + 1) + ":" + (nextY + 1) + "]");
            return true;
        } else {
            System.out.println(playerName + " can't move there! Please try again!");
            playerX = pastX;
            playerY = pastY;
            return false;
        }
    }

    public static void playerMoveAction(int pastX, int pastY, int nextX, int nextY) {
        if (map[nextY][nextX] == trap) {
            playerHP -= trapDamage;
            trapCount--;
            System.out.println("Alarm! " + playerName + " has been attacked. HP = " + playerHP);
        }

        map[nextY][nextX] = player;
        map[pastY][pastX] = used;

    }

    public static boolean isEmpty(int a, int b) {
        return map[b][a] == empty;
    }

    public static int randomValue(int min, int max) {
        return min + random.nextInt(max - min + 1);
    }

    public static boolean isPlayerAlive() {
        return playerHP > 0;
    }

    public static boolean isFullMap() {
        for (int i = 0; i < mapHeight; i++) {
            for (int j = 0; j < mapWidth; j++) {
                if (map[i][j] == empty || map[i][j] == trap) return false;
            }
        }
        return true;
    }
}
