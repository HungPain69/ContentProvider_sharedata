package com.example.contentproviderapp2;

import android.net.Uri;

public class AppConst {
    public static final String PROVIDER_NAME = "com.example.cp.MyProvider";
    public static final String URL = "content://" + PROVIDER_NAME +"/notes";
    public static final Uri CONTENT_URI = Uri.parse(URL);
    public static final String DATABASE_NAME = "DatabaseName";
    public  final String TABLE_NAME = "notes";
    public static final String _ID = "_id";
    public static final String TITLE = "title";
    public static final String CONTENT = "content";

}
