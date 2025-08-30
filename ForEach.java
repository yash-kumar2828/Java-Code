public class ForEach{
    public static void main(String[] args) {
        String[] arr=new String[]{
            "Ram","Shyam","Mohan","Sohan"
        };
        printArray(arr);
    }
    public static void printArray(String[] array){
        for(String name:array){
            System.out.println(name);
        }
    }
}