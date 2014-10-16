package com.example.waterscrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.ScrollView;

public class WaterScrollView extends ScrollView {

	//水平布局 scrollView的根节点！
	private LinearLayout contenter;
	
	//第一列
	private LinearLayout column0;
	private LinearLayout column1;
	private LinearLayout column2;
	
	public WaterScrollView(Context context) {
		super(context);
		// TODO Auto-generated constructor stub
		init(context, null);
	}

	public WaterScrollView(Context context, AttributeSet attrs) {
		super(context, attrs);
		// TODO Auto-generated constructor stub
		init(context, attrs);
	}

	public WaterScrollView(Context context, AttributeSet attrs, int defStyle) {
		super(context, attrs, defStyle);
		// TODO Auto-generated constructor stub
		init(context, attrs);
	}
	
	
	/**
	 * 初始化
	 * @param context
	 * @param attrs
	 */
	private void init(Context context, AttributeSet attrs)
	{
		
//		1 scrollView 的根节点：
//		  宽度填充 父容器。 	高度 采用  warpContent.
		
		
		
	}

}
