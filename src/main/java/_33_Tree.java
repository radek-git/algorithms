public class _33_Tree {

    public static void main(String[] args) {
        choinka(8);
    }

    public static void choinka (int wysokosc){

        for(int i=0; i<wysokosc; i++){
            for(int j=0; j<=wysokosc -i; j++){
                System.out.print(" ");
            }


            for(int k=0; k<=2*i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
