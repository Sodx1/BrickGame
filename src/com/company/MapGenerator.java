package com.company;
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;

public class MapGenerator {

    //Поля
    public int map[][];
    public int birckWidth;
    public int brickHeight;

    public MapGenerator(int row, int col){
        map = new int[row][col];
        for(int i=0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                map[i][j] = 1;
            }
        }
        brickHeight= 540/col;
        birckWidth = 110/row;
    }
    public void draw(Graphics2D g){
        for(int i= 0; i<map.length; i++){
            for(int j=0; j<map[0].length; j++){
                if(map[i][j] > 0){

                    g.setColor(Color.CYAN);
                    g.fillRect(j*birckWidth+80, i*birckWidth+50,birckWidth,brickHeight);

                    //Что если не будет кирпичика то будет работать без него
                    g.setStroke(new BasicStroke(3));
                    g.setColor(Color.BLACK);
                    g.drawRect(j *birckWidth + 80, i * brickHeight + 50, birckWidth, brickHeight);
                }
            }
        }
    }

    public void setBrickHeight(int value, int row, int col){
        map[row][col] = value;
    }
}
