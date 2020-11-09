package com.company.classgui;

import java.awt.*;
import java.awt.event.*;

/**
 * @ClassName Mouse_events
 * @Description TODO
 * @Author WL
 * @Date 2020/11/7
 **/
public class Mouse_events {
    // 定义该图形所需的组件的引用
    private Frame f;
    private Button but;

    Mouse_events() {

        init();

    }

    /**
     * 对图形用户界面初始化
      */

    public void init() {

        f = new Frame("窗口——by星云");
        // 设置窗口位置和大小
        f.setBounds(300, 100, 600, 500);
        // 默认边界布局方式重置成流式布局
        f.setLayout(new FlowLayout());

        but = new Button("我是按钮");
        f.add(but);

        dealwithEvent();

        f.setVisible(true);
    }

    /**
     *  事件监听器以及处理事件
     */

    private void dealwithEvent()
    {

        //窗体关闭监听
        f.addWindowListener(new WindowAdapter(){
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);

            }

        });

        //按钮活动监听器以及处理事件
        but.addActionListener(new ActionListener()
        {
            private int actioncount=1;
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("按钮被活动"+actioncount+++"次");
            }

        });

        //鼠标进入按钮监听触发事件以及鼠标被双击监听触发事件
        but.addMouseListener(new MouseAdapter(){
            private int count=1;
            private int clickCount=1;
            @Override
            public void mouseEntered(MouseEvent e)
            {
                System.out.println("鼠标进入到该组件"+count+++"次");

            }
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if(e.getClickCount()==2) {
                    System.out.println("双击被执行" + clickCount++ + "次");
                }
            }

        });

    }
    public static void main(String[] args) {

        new Mouse_events();
    }
}
