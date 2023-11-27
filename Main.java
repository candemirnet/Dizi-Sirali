import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static void siraliListe(int [] arr){
        int gecici;
        for(int k =0; k<arr.length; k++){
            for(int j = k+1; j<arr.length; j++)
                if (arr[j] < arr[k]) {
                    gecici = arr[k];
                    arr[k] = arr[j];
                    arr[j] = gecici;
                }
        }
    }
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Dizinin Uzunluğunu Giriniz:");
        int numb = imp.nextInt();

        int[] list = new int[numb];
        int listEleman;

        System.out.println("Dizi Elemanlarını Giriniz: ");
        for(int i = 0; i<list.length; i++){
            System.out.print(i+1 + "." + " Eleman: ");
            listEleman = imp.nextInt();
            list[i] = listEleman;
        }

        siraliListe(list);
        System.out.println("Sıralı Liste: " + Arrays.toString(list));
    }
}