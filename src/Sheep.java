import java.util.Random;
public class Sheep implements Runnable {
    public static void Sheep() {
        if (Random(0, 8) == 1) {
            System.out.println("绵羊喜欢被人草");
        } else if (Random(0, 8) == 2) {
            System.out.println("绵羊:啊~好舒服~");
        } else if (Random(0, 8) == 3) {
            System.out.println("绵羊怀疑自己是rbp");
        } else if (Random(0, 8) == 5) {
            System.out.println("绵羊:我想被人草，我想被人草。");
        } else if (Random(0, 8) == 6) {
            System.out.println("绵羊:既然你要来刺激的，那就直接最后一步吧。");
        } else if (Random(0, 8) == 7) {
            System.out.println("绵羊:我是RBQ，你能R我吗？");
        } else if (Random(0, 8) == 8) {
            System.out.println("绵羊:谁往某帖子里放我女装照片了，删掉删掉");
        } else if (Random(0, 8) == 0) {
            System.out.println("我是绵羊，你能给我草吗？");
        }
    }
    public static int Random(int Min, int Max) {

        Random R = new Random();
        return R.nextInt(Max - Min + 1) + Min;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(Random(10000, 20000));
                Sheep();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
