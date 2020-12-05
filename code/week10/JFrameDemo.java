
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
public class JFrameDemo extends JFrame
{
    public JFrameDemo()
    {
        setTitle("Java First GUI program");    //设置显示窗口标题
        setSize(400,200);    //设置窗口显示尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        JLabel jl=new JLabel("JFame Window Created");    //创建一个标签
        Container c=getContentPane();    //获取当前窗口的内容窗格
        c.add(jl);    //将标签组件添加到内容窗格上
        setVisible(true);    //设置窗口是否可见
    }
    public static void main(String[] agrs)
    {
        new JFrameDemo();    //创建一个实例化对象
    }
}