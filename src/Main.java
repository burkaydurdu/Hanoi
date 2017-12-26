public class Main {
    /*
    *
    * @param n  halka sayisi
    * @param l1, l2, l3 cubuklar
    *
    * */
    public static void main(String[] args) {
       // hanoi1(3, '1', '2', '3');
        hanoi2(3, '1', '2', '3');
    }
    /*
    *
    * Hanoi1
    *        |             |           |            |          |          |
    *        |             |           |            |          |          |
    *       ___            |           |        =>  |          |         ___
    *      _____           |           |            |          |       _______
    *     _______          |           |            |          |     ___________
    *        |             |           |            |          |          |
    *   _____________   _______   __________     ________   _______   ________
    * */
    private static void hanoi1(int n, char l1, char l2, char l3) {
        if(n == 1) {
            System.out.format("%c 'den %c tasindi..\n", l1, l3);
            return;
        }
        hanoi1(n-1, l1, l3, l2);
        hanoi1(1, l1, l2, l3);
        hanoi1(n-1, l2, l1, l3);
    }
    /*
    *
    * Hanoi2
    *        |             |           |            |          |           |
    *        |             |           |            |          |           |
    *       ___            |           |        =>  |         ___          |
    *      _____           |           |            |       _______        |
    *     _______          |           |            |     ___________      |
    *        |             |           |            |          |           |
    *   _____________   _______   __________     ________  __________  _________
    * */
    private static void hanoi2(int n, char l1, char l2, char l3) {
        if(n == 1) {
            System.out.format("%c 'den %c tasindi..\n", l1, l2);
            return;
        }
        hanoi2(n-1, l1, l3, l2);
        hanoi2(1, l1, l2, l3);
        hanoi2(n-1, l3, l2, l1);
    }
}
