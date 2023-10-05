public class C_Shortest_path {

    public static float shortestpath(String path){          // Time Complexity --> O(n).
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);

            // Towards South
            if(dir=='S'){
                y--;
            }

            // Towards North
            else if(dir=='N'){
                y++;
            }

            // Towards East
            else if(dir=='W'){
                x--;
            } 

            // Towards West
            else{
                x++;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        return (float) Math.sqrt(X2+Y2);        // Typecasting to float
    }

    public static void main(String args[]){
        String path = "WNEENESENNN";
        System.out.print(shortestpath(path));

    }
}
