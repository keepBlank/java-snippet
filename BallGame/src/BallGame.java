/**
 * (温馨提示：仅作为提高学习兴趣，照着代码一样敲一遍就行，不懂没关系，很多知识还没学)
 * 第一步: 创建项目和窗口
 * 第二步：加载两个图片
 * 第三步： 实现动画，小球沿着水平方向移动并做边界检测
 * 第四步： 实现小球沿着任意角度飞行(会用到三角函数)
 */

import java.awt.*;
import javax.swing.*;
public class BallGame extends JFrame{
    //加载图片
    Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.jpg");

    double x = 200;
    double y = 200;

    double degree = 3.14 / 3;  // 弧度  3.14 = 180º   60º

    //绘制窗口
    public void paint(Graphics g){
        System.out.println("窗口被画了一次");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        // 控制小球移动
        x = x + 10 * Math.cos(degree);
        y = y + 10 * Math.sin(degree);

        // 改变小球撞击后的方向
        //小球撞上下边界的时候，反射角等于负的入射角；小球撞左右边界的时候，反射角度等于180度 - 小球入射角
        // 碰到上下边界
        if(y > 501 - 40 - 30 || y < 40 + 30){  // 前面的：40是桌边的高度 30是小球的直径；后面的： 一个40是标题栏的高度、一个40是桌边的高度
            degree = -degree;
        }
        // 碰到左右边界
        if(x > 856 -40 - 30 || x < 40){        // 40是边的宽度 30是小球的直径
            degree = 3.14 - degree;
        }

    }

    //创建窗口
    void launchFrame(){
        setSize(856,501);
        // 弹窗相对于窗口左上角原点的坐标
        setLocation(100,100);
        setVisible(true);

        // 实现动画，每秒绘制窗口25次
        while (true){
            repaint();

            try {
                Thread.sleep(40); // 1s = 1000ms;大约1秒绘制1000/40 = 25次。
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
    public static void main(String[] args){
        System.out.println("我的小游戏开始了！");

        BallGame game = new BallGame();
        game.launchFrame();
    }
}
