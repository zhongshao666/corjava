package com.briup.GUI.One;

import javax.swing.JPanel;

//Jpanel不能单独存在 必须嵌套在其他容器里面
public class JPanelTest extends JPanel{
	private static final long serialVersionUID = 7068495917147416592L;
	public JPanelTest(){
		//参数1和2是设置frame的位置,电脑屏幕左上角为(0,0)坐标
		//参数3和4指的是frame显示的大小(长宽)
		this.setBounds(20, 20, 400, 300);
//		this.setSize(400,400);
//		this.setLocation(20,20);
		//设置可见
		this.setVisible(true);
	}
	public static void main(String[] args) {
		
		new JPanelTest();
	}
}
