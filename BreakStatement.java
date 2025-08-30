public class BreakStatement{
    public static void main(String[] args) {
        for(int i=0;i<1000;i++){
            if(i==101){
                break;
            }
            System.out.print(i+" ");
        }
    }
}