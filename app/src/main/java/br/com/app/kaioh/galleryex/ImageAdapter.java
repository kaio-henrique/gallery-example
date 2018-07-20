package br.com.app.kaioh.galleryex;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

/**
 * Created by @autor Kaio Henrique on 19/07/2018.
 */
public class ImageAdapter extends BaseAdapter {
    private Context context;
    private int itemBackground;
    private Integer[] images;

    public ImageAdapter(Context ctx, Integer[] imagesID) {
        context = ctx;
        images = imagesID;
        TypedArray a = ctx.obtainStyledAttributes(R.styleable.GalleryCustom);
        itemBackground = a.getResourceId(R.styleable.GalleryCustom_android_galleryItemBackground, 0);
        a.recycle();
    }

    @Override
    public int getCount() {
        return images.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[position]);
        imageView.setLayoutParams(new Gallery.LayoutParams(100, 100));
        imageView.setBackgroundResource(itemBackground);
        return imageView;
    }
}
