package com.example.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class TitleWithIcon  extends RelativeLayout {
    private String mTextTitle;
    private int mDrawableImage;
    private TextView mTextView;
    private ImageView mImg;

    public TitleWithIcon(Context context) {
        super(context);
        initView(context, null);
    }

    public TitleWithIcon(Context context, AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public TitleWithIcon(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    public void initView(Context context, AttributeSet attributeSet){
        if (attributeSet != null && context != null){
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = layoutInflater.inflate(R.layout.layout_title_with_icon, this, true);
            TypedArray typedArray= context.obtainStyledAttributes(attributeSet, R.styleable.TitleWithIcon);
            mTextTitle = typedArray.getString(R.styleable.TitleWithIcon_text_title);
            mDrawableImage = typedArray.getResourceId(R.styleable.TitleWithIcon_drawable_icon,0);
            typedArray.recycle();
            
            mapView(view);
        }
    }

    private void mapView(View v) {

        mImg = v.findViewById(R.id.imageIcon);
        mTextView = v.findViewById(R.id.textViewTitle);

        if (mTextTitle.isEmpty()) {
            mTextView.setText("");
        }else {
             mTextView.setText(mTextTitle);
            }
        mImg.setImageResource(mDrawableImage);

    }
}
