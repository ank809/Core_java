import java.util.ArrayList;
public class maze_obstacles {
    public static void main(String[] args) {
      boolean  board[][]= {
        {true, true,  false},
        {true,true, true},
        {true, true, true}
      };
      path("", board, 0, 0);
      
    }
    static void path(String p,boolean[][] maze, int r, int c){
        if(maze[r][c]==false){
            return;
        }
        if(r<maze.length-1){
            path(p+'D', maze, r+1, c);
        }
        if(c<maze[0].length-1){
            path(p+'R',maze, r, c+1);
        }
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
    }
    
    }

