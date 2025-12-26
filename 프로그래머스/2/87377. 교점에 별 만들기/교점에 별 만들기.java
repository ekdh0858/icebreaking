import java.util.*;
class Solution {
    private static class Point{
            public final long x,y;
            public Point(long x,long y){
                this.x = x;
                this.y = y;
            }
        
        @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
        }
        
    private Point intersaction(int[] lineA,int[] lineB){
          long A1 = lineA[0];
    long B1 = lineA[1];
    long C1 = lineA[2];

    long A2 = lineB[0];
    long B2 = lineB[1];
    long C2 = lineB[2];

    long det = A1 * B2 - B1 * A2;
    if (det == 0) return null; // 평행/일치

    long xNum = B1 * C2 - C1 * B2;
    long yNum = C1 * A2 - A1 * C2;

    // 정수 교점만
    if (xNum % det != 0 || yNum % det != 0) return null;

    long x = xNum / det;
    long y = yNum / det;

    return new Point(x, y);
    }
    
    private Point getMinimumPoint(List<Point> points){
        long x = Long.MAX_VALUE;
        long y = Long.MAX_VALUE;
        
        for(Point p : points){
            if (p.x<x) x=p.x;
            if (p.y<y) y=p.y;
        }
        return new Point(x,y);
    }
    
    private Point getMaximumPoint(List<Point> points){
        long x = Long.MIN_VALUE;
        long y = Long.MIN_VALUE;
        
        for(Point p : points){
            if (p.x>x) x=p.x;
            if (p.y>y) y=p.y;
        }
        return new Point(x,y);
    }
        
    public String[] solution(int[][] line) {
        List<Point> points = new ArrayList<>();
        
        for(int i=0;i<line.length;i++){
            for(int j=i+1;j<line.length;j++){
                Point intersection = intersaction(line[i],line[j]);
                if(intersection!=null){
                    points.add(intersection);
                }
            }
        }
        
        Point maximum = getMaximumPoint(points);
        Point minimum = getMinimumPoint(points);
        
        int width = (int) (maximum.x-minimum.x+1);
        int height = (int) (maximum.y - minimum.y +1);
        
        char[][] arr = new char[height][width];
        for (char[] row:arr){
            Arrays.fill(row,'.');
        }
        
        for (Point p : points){
            int x = (int) (p.x-minimum.x);
            int y = (int) (maximum.y - p.y);
            arr[y][x] = '*';
        }
        
               
        String[] answer = new String[arr.length];
        for(int i =0;i<answer.length;i++){
            answer[i] = new String(arr[i]);
        }
        return answer;
    }
}