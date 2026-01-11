package org.java_tutorials.dsa.algorithm;
import java.util.ArrayList;

import java.util.TreeMap;


public class puzzleMaker {
    static  int []slide_position={0,1};
    static  int [][]puzzle={{0,1,2,3},{4,5,6,7},{8,9,10,11},{12,13,14,15}};
    public static void main(String[] args){
        String initial="";
        for (int i = 0; i< 25600; i++) {
        TreeMap<String, Integer> positions=getPositions(puzzle,slide_position);
        positions.remove(initial);
        String direction= (String) positions.keySet().toArray()[(int) (Math.random()*positions.size())];
        System.out.println(positions);
        System.out.println(direction);
        initial=direction_reversed(direction);
        if (direction.equals("right"))
           move_right((int) (Math.random()*positions.get(direction))+1);
        if (direction.equals("left"))
           move_left((int) (Math.random()*positions.get(direction))+1);
        if (direction.equals("up"))
           move_up((int) (Math.random()*positions.get(direction))+1);
        if (direction.equals("down"))
           move_down((int) (Math.random()*positions.get(direction))+1);
       System.out.println(getPuzzle());
        }
    }

    private static String direction_reversed(String direction) {
        if (direction.equals("up"))
            return "down";
        if (direction.equals("down"))
            return "up";
        if (direction.equals("right"))
            return "left";
        if (direction.equals("left"))
            return "right";
        return direction;
    }

    private static ArrayList<Integer> getPuzzle() {
        ArrayList<Integer> arrayList=new ArrayList<>();
        for (int[] ints : puzzle) {
            for (int j = 0; j < puzzle.length; j++) {
                arrayList.add(ints[j]);
            }
        }
        return arrayList;
    }

    private static void move_down(int end_point) {
        int i;
        for (i = slide_position[0]; i <slide_position[0]+end_point; i++) {
            int tem=puzzle[i+1][slide_position[1]];
            puzzle[i+1][slide_position[1]]=puzzle[i][slide_position[1]];
            puzzle[i][slide_position[1]]=tem;
        }
        slide_position[0]=i;
    }

    private static void move_up(int end_point) {
        int i;
        for ( i = slide_position[0]; i >slide_position[0]-end_point; i--) {
            int  tem=puzzle[i-1][slide_position[1]];
            puzzle[i-1][slide_position[1]]=puzzle[i][slide_position[1]];
            puzzle[i][slide_position[1]]=tem;
        }

        slide_position[0]=i;
    }

    private static void move_left(int end_point) {
        int i;
        for (i = slide_position[1]; i >slide_position[1]-end_point; i--) {
            int  tem=puzzle[slide_position[0]][i-1];
            puzzle[slide_position[0]][i-1]=puzzle[slide_position[0]][i];
            puzzle[slide_position[0]][i]=tem;
        }
        slide_position[1]=i;
    }

    private static void move_right(int end_point) {
        int i;
        for ( i = slide_position[1]; i <slide_position[1]+end_point; i++) {
            int  tem=puzzle[slide_position[0]][i+1];
            puzzle[slide_position[0]][i+1]=puzzle[slide_position[0]][i];
            puzzle[slide_position[0]][i]=tem;
        }
        slide_position[1]=i;
    }

    private static TreeMap<String,Integer> getPositions(int[][] puzzle, int [] pos) {
        TreeMap<String,Integer> locations=new TreeMap<>();
        //for down position
        if (pos[0]!=0)
            locations.put("up",pos[0]);
        //for left position
        if (pos[1]!=0)
            locations.put("left",pos[1]);
        //down position
        if (puzzle.length-1-pos[0]!=0)
            locations.put("down",puzzle.length-1-pos[0]);
        //right position
        if (puzzle.length-1-pos[1]!=0)
            locations.put("right",puzzle.length-1-pos[1]);
        return locations;
    }

    }
