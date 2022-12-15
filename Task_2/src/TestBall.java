public class TestBall {
    public static void main(String[] args){
        Ball ball = new Ball(10, 13);
        System.out.println(ball);
        ball.move(5,-12);
        System.out.println(ball);
    }
}
