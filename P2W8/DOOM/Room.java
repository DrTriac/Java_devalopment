package DOOM;

public class Room {
    private static final int WIDTH = 10;
    private static final int HEIGHT = 20;
    Player player;
    char[][] floorplan;

    public Room(Player player){
        floorplan = new char[WIDTH][HEIGHT];
        draw();

    }

    private void createFloorplan(){
            // Fill interior with spaces


            // Top and bottom rows: dashes '-'
            for (int c = 0; c < WIDTH; c++) {
                floorplan[0][c] = '-';              // top
                floorplan[HEIGHT - 1][c] = '-';     // bottom
            }

            // Left and right columns: pipes '|'
            for (int r = 0; r < HEIGHT; r++) {
                floorplan[r][0] = '|';              // left
                floorplan[r][WIDTH - 1] = '|';      // right
            }
    }

    private void draw(){

        for (int r = 0; r < HEIGHT; r++) {
            for (int c = 0; c < WIDTH; c++) {
                System.out.print(floorplan[r][c]);
            }
            System.out.println(); // move to next line after each row
        }
    }

}



