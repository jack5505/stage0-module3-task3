package lang.print.gaps.task3;

public class ReassigningValues {
    public static void main(String[] args) {
        //write code here
        int first = 1;
        int second = 10;
        int third  = 100;
        showIt(first, second, third);
        var linkToFirst = first;
        var linkToSecond = second;
        var linkToThird = third;

        first = 15;
        second = 6;
        third = 4;
        showIt(first, second, third);
        showIt(linkToFirst, linkToSecond, linkToThird);
    }
    public static void showIt(int a , int b , int c){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
