public class LoopProgramming {
    public static void main(String[] args){

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else if(j<=n){
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
