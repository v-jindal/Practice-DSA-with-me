public class LabelledLoops {
    public static void main(String[] args) {
        loop1:
        for (int i = 0; i < 10; i++) {
            //loop2:
            for (int j = 0; j < 10; j++) {
                if (i == 5 && j == 5) {
                    //break loop1;
                    //return do not work with labels as it directly exits from the main function
                    continue loop1;//(acts like break in loop2)
                }
                System.out.println(i + " " + j);
            }
        }
    }
}
