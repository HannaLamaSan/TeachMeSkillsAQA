import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        //Task 1
        //getCube();
        //Task 2
        //paintArray();
    }
    //Task 1
    public static void getCube() {
        int[][][] cube = new int[][][] {//трех мерный массив состит из двумерных
                {
                        {1, -2, 3},
                        {2, 3, 4}
                },
                {
                        {-4, -5, 6, 9},
                        {1},
                        {2, 3}
                }
        };
        for (int j = 0; j < cube.length; j++) {
            for (int y = 0; y < cube[j].length; y++) {
                for (int z = 0; z < cube[j][y].length; z++) {
                    System.out.print(cube[j][y][z] + " ");
                }
                System.out.println();
            }
        }
        Scanner enter = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int increment = enter.nextInt();
        for (int j = 0; j < cube.length; j++) {
            for (int y = 0; y < cube[j].length; y++) {
                for (int z = 0; z < cube[j][y].length; z++) {
                    cube[j][y][z] += increment;
                }
            }
        }
        System.out.println("Your new array: ");
        for (int j = 0; j < cube.length; j++) {
            for (int y = 0; y < cube[j].length; y++) {
                for (int z = 0; z < cube[j][y].length; z++) {
                    System.out.print(cube[j][y][z] + " - ");
                }
                {
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
    // Task 2
    public static void paintArray () {
        String[][] array = new String[8][8];//создаем массив 8 на 8
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if ((i + j) % 2 == 0) array[i][j] = "W";
                else array[i][j] = "B";
                System.out.print(" " + array[i][j]);
            }
            System.out.println();
        }
    }
}


