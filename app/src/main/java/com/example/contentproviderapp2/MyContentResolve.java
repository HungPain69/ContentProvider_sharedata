package com.example.contentproviderapp2;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.net.Uri;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MyContentResolve extends ContentResolver {

    Context mContext;
    ContentResolver contentResolver;

    public MyContentResolve(@Nullable Context context, Context mContext, ContentResolver contentResolver) {
        super(context);
        this.mContext = mContext;
        this.contentResolver = contentResolver;
    }

    public void insertContact(String title, String content)
    {


        ContentValues contentValues = new ContentValues();
        contentValues.put(AppConst.TITLE,title);
        contentValues.put(AppConst.CONTENT,content);
        Uri uri=contentResolver.insert(AppConst.CONTENT_URI,contentValues);

        if (uri !=null)
        {
            Toast.makeText(mContext,"Insert Record successfully",Toast.LENGTH_SHORT).show();
        }
    }



}
