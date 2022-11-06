package basic;

public class FullNavigation {

    void perm(int[] list, int depth){

        if(depth == list.length){
            for(int a = 0; a < list.length; a++){
                System.out.print(list[a]);
            }
            System.out.println();
        }

        for(int a = depth; a < list.length; a++){
            swap(list, depth, a);
            perm(list, depth+1);
            swap(list, a, depth);
        }
    }

    void swap(int []list, int a, int b){
        int temp = list[a];
        list[a] = list[b];
        list[b] = temp;
    }


    public static void main(String[] args) {
        int[] list = { 1, 2, 3 };

        FullNavigation fullNavigation = new FullNavigation();

        fullNavigation.perm(list, 0);

    }
}
