package rillUKL;

public class soal3mudah {
    public static void main(String[] args) {
        System.out.println("========================");
        for( int i = 1; i <=50; i++) {
            if( i % 3 == 0){
            System.out.println(i +". Saya angkatan 33");
            } else if ( i % 2 == 0) {
                System.out.println( i +". Saya anak Moklet");
            } else if( i == 1) {
                System.out.println(i+". Saya senang");
            } else{
                System.out.println(i+". Saya anak Wikusama");
            }
        }
    }
}
