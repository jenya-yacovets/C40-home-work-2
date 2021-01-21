public class Task_8_2 {
    public static void main(String[] args) {

//      Нарисуется ромб

        int length = 20;
        int start = 1;
        String type = "top";

        for (int i=0; i<length; i++) {

            int space = (length - start) / 2;

            if((space*2+start) != length) {
                System.out.print("  ");
            }

            for (int y=0; y<space; y++ ) {
                System.out.print("    ");
            }

            for (int y=0; y<start; y++ ) {
                System.out.print("   *");
            }

            System.out.println();

            if (start >= length/2) {
                type = "bottom";
            }

            if (type == "top") {
                start++;
            } else {
                start--;
            }
        }
    }
}
