public class teste {
    public static void main(String[] args) {
        
        int num = 5, count = 1;
        while(count <= 3) {
            ++count;
            num += count;  //c = 4 e num = 14
        }
        System.out.println(num);
    }
}
