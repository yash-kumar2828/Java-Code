public class ContinueStatement{
    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            if(i==25){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}